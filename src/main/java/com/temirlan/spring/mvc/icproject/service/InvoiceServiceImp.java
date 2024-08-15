package com.temirlan.spring.mvc.icproject.service;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.temirlan.spring.mvc.icproject.Operations;
import com.temirlan.spring.mvc.icproject.oneC.Consignee;
import com.temirlan.spring.mvc.icproject.oneC.Consignor;
import com.temirlan.spring.mvc.icproject.oneC.Invoice;
import com.temirlan.spring.mvc.icproject.repository.JDBCRepository;
import com.temirlan.spring.mvc.icproject.restclient.Communication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InvoiceServiceImp implements InvoiceService{
    @Autowired
    public Operations operations;

    @Autowired
    public Communication communication;

    @Autowired
    private JDBCRepository jdbcRepository;

    public Invoice createInvoice(String message){
        String id=operations.extractId(message);
        String deal=communication.getDealById(id);

        Consignor consignor =jdbcRepository.getConsignorInfo(id);
        Consignee consignee=jdbcRepository.getConsigneeInfo(id);
        Invoice invoice=new Invoice();
        invoice.setConsignee(consignee);
        invoice.setConsignor(consignor);
        try {
            String invoiceRes= communication.createInvoice(invoice);
            System.out.println(invoiceRes);
        }catch (Exception e){
        }


         return invoice;
    }
    public String getDealFields(){
        return  communication.getDealFields();
    }

}
