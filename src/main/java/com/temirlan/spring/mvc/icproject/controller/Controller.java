package com.temirlan.spring.mvc.icproject.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.temirlan.spring.mvc.icproject.entity.Accounting;
import com.temirlan.spring.mvc.icproject.entity.BankPayment;
import com.temirlan.spring.mvc.icproject.oneC.Consignee;
import com.temirlan.spring.mvc.icproject.oneC.Consignor;
import com.temirlan.spring.mvc.icproject.oneC.Invoice;
import com.temirlan.spring.mvc.icproject.pojo.Implementation;
import com.temirlan.spring.mvc.icproject.repository.AccountingRepository;
import com.temirlan.spring.mvc.icproject.repository.BankPaymentRepository;
import com.temirlan.spring.mvc.icproject.service.InvoiceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    BankPaymentRepository bankPaymentRepository;

    @GetMapping("/")
    public String index() {
        return "Welcome  Temirlan";
    }
    @PostMapping("/webhook")
    public Map apiWebhook(@RequestBody String message){
        Map<String,Object> map = new HashMap<>();
        map.put("result",invoiceService.createInvoice(message));
        return map;
    }

    @GetMapping("/fields")
    public Map<String,Object> apiFields() {

        return invoiceService.getDealFields();
    }

    @PostMapping("/managment-accounting")
    public Accounting managmentAccounting(@RequestBody Accounting accounting) {
        String message="";
        try {
            invoiceService.saveAccounting(accounting);
            message="Ok";
        }catch (Exception e){
            message=e.toString();
        }
        return accounting;
    }

    @GetMapping("/bank-pay")
    public List<BankPayment> getBankPayment() {

        return bankPaymentRepository.findAll();
    }

    @GetMapping("/all-implementation")
    public List<Implementation> getAllImplementation(@RequestParam Integer count) {

        return invoiceService.getImplementationsList(count);
    }

    @GetMapping("/all-implementations")
    public List<Implementation> getAllImplementation() {
        return invoiceService.getImplementationsList(0);
        }
}
