package com.temirlan.spring.mvc.icproject.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.temirlan.spring.mvc.icproject.entity.Accounting;
import com.temirlan.spring.mvc.icproject.oneC.Consignee;
import com.temirlan.spring.mvc.icproject.oneC.Consignor;
import com.temirlan.spring.mvc.icproject.oneC.Invoice;
import com.temirlan.spring.mvc.icproject.repository.AccountingRepository;
import com.temirlan.spring.mvc.icproject.service.InvoiceService;
import com.temirlan.spring.mvc.icproject.service.InvoiceServiceImp;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private InvoiceService invoiceService;

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


}
