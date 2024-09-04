package com.temirlan.spring.mvc.icproject.controller;

import com.temirlan.spring.mvc.icproject.entity.Accounting;
import com.temirlan.spring.mvc.icproject.entity.BankPayment;
import com.temirlan.spring.mvc.icproject.pojo.ImplementationBi;
import com.temirlan.spring.mvc.icproject.pojo.InvoiceBi;
import com.temirlan.spring.mvc.icproject.pojo.PayrollFundBi;
import com.temirlan.spring.mvc.icproject.pojo.RunId;
import com.temirlan.spring.mvc.icproject.repository.BankPaymentRepository;
import com.temirlan.spring.mvc.icproject.service.InvoiceService;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api")
public class Controller {
    private static final Logger log = LoggerFactory.getLogger(Controller.class);
    @Autowired
    private InvoiceService invoiceService;

    @Autowired
    private  RunId runId;

    @SneakyThrows
    @GetMapping("/")
    public String index() {
        return Inet4Address.getLocalHost().getHostAddress();
    }
    @PostMapping("/webhook")
    public Map apiWebhook(@RequestBody String message){
        Map<String,Object> map = new HashMap<>();
        map.put("result",invoiceService.createInvoice(message));
        System.out.println("controller: " + runId.value);
        return map;
    }

    @GetMapping("/fields")
    public Map<String,Object> apiFields() {

        return invoiceService.getDealFields();
    }

    @PostMapping("/managment-accounting")
    public Accounting managmentAccounting(@RequestBody  Accounting accounting) {
        String message="";
        try {
            invoiceService.saveAccounting(accounting);
            message="Ok";
        }catch (Exception e){
            message=e.toString();
        }
        return accounting;
    }

    @PostMapping("/bank-payments")
    public Map<String,Object> bankPaymentsAdd(@RequestBody ArrayList<BankPayment> bankPayments) {
        Map<String,Object> message = new HashMap<>();
        try {
            ArrayList<BankPayment> response= invoiceService.saveBankPayment(bankPayments);
            message.put("result",response);
        }catch (Exception e){
            message.put("result",e.toString());
        }
        return message;
    }

    @PutMapping("/bank-payments")
    public Map<String,Object> bankPaymentsUpd(@RequestBody ArrayList<BankPayment> bankPayments) {
        Map<String,Object> message = new HashMap<>();
        try {
            ArrayList<BankPayment> response= invoiceService.saveBankPayment(bankPayments);
            message.put("result",response);
        }catch (Exception e){
            message.put("result",e.toString());
        }
        return message;
    }
    @DeleteMapping("/bank-payments")
    public Map<String,Object> bankPaymentsDlt(@RequestBody ArrayList<Map> bankPaymentsUid) {
        Map<String,Object> message = new HashMap<>();
        try {
            List<BankPayment> bankPaymentList= invoiceService.deleteBankPaymentByUid(bankPaymentsUid);
            message.put("result",bankPaymentList);
        }catch (Exception e){
            message.put("result",e.toString());
        }
        return message;
    }

    @GetMapping("/all-implementation")
    public List<ImplementationBi> getAllImplementation(@RequestParam(required = false) Integer count) {

        return invoiceService.getImplementationsList(count);
    }

    @GetMapping("/all-implementations")
    public List<ImplementationBi> getAllImplementation() {
        return invoiceService.getImplementationsList(0);
        }
    @GetMapping("/fot-projects")
    public List<PayrollFundBi> getFotProjects(){
        return invoiceService.getPayrollFundList(0);
    }
    @GetMapping("/invoices-bi")
    public List<InvoiceBi> getInvoicesList(){
        return invoiceService.getInvoicesList(0);
    }
}

