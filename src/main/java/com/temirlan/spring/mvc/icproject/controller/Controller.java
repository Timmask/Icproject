package com.temirlan.spring.mvc.icproject.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.temirlan.spring.mvc.icproject.oneC.Consignee;
import com.temirlan.spring.mvc.icproject.oneC.Consignor;
import com.temirlan.spring.mvc.icproject.oneC.Invoice;
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
    public Map addNewEmployee(@RequestBody String message){
        Map<String,Object> map = new HashMap<>();
        map.put("result",invoiceService.createInvoice(message));
        return map;
    }

    @GetMapping("/fields")
    public String getFields() {

        return invoiceService.getDealFields();
    }




}
