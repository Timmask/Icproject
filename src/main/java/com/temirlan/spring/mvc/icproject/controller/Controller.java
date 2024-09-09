package com.temirlan.spring.mvc.icproject.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.temirlan.spring.mvc.icproject.entity.*;
import com.temirlan.spring.mvc.icproject.pojo.ImplementationBi;
import com.temirlan.spring.mvc.icproject.pojo.InvoiceBi;
import com.temirlan.spring.mvc.icproject.pojo.PayrollFundBi;
import com.temirlan.spring.mvc.icproject.pojo.RunId;
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
        return map;
    }


    @PostMapping("/get-deal")
    public String getDeal(@RequestBody String message){

        return invoiceService.getDeal(message);
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
            String uid=bankPayments.get(0).getBankStatementUid();
            invoiceService.deleteBankPaymentsByUid(uid);
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
            List<BankPayment> bankPaymentList= invoiceService.deleteBankPaymentByUids(bankPaymentsUid);
            message.put("result",bankPaymentList);
        }catch (Exception e){
            message.put("result",e.toString());
        }
        return message;
    }

    @PostMapping("/planned-payments")
    public Map<String,Object> plannedPaymentsAdd(@RequestBody ArrayList<PlannedPayment> plannedPayments){
        Map<String,Object> message = new HashMap<>();
        try {
            List<PlannedPayment> plannedPaymentArrayList= invoiceService.savePlannedPayments(plannedPayments);
            message.put("result",plannedPaymentArrayList);
        }catch (Exception e){
            message.put("result",e.toString());
        }
        return message;
    }

    @PutMapping("/planned-payments")
    public Map<String,Object> plannedPaymentsUpdate(@RequestBody ArrayList<PlannedPayment> plannedPayments){
        Map<String,Object> message = new HashMap<>();
        try {
            List<PlannedPayment> plannedPaymentArrayList= invoiceService.savePlannedPayments(plannedPayments);
            message.put("result",plannedPaymentArrayList);
        }catch (Exception e){
            message.put("result",e.toString());
        }
        return message;
    }
    @DeleteMapping("/planned-payments")
    public Map<String,Object> plannedPaymentsdate(@RequestBody ArrayList<PlannedPayment> plannedPayments){
        Map<String,Object> message = new HashMap<>();
        try {
            invoiceService.deletePlannedPayments(plannedPayments);
            message.put("result",plannedPayments);
        }catch (Exception e){
            message.put("result",e.toString());
        }
        return message;
    }

    @PostMapping("/income-expenditure")
    public String incomeExpenditureAdd(@RequestBody Map<String,Object> objectMap){

        ObjectMapper mapper=new ObjectMapper();
        PlannedExpenditure plannedExpenditure=mapper.convertValue(objectMap.get("planned_expenditure"),PlannedExpenditure.class);
        System.out.println(plannedExpenditure);

        return "Ok";
    }
}

