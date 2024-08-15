package com.temirlan.spring.mvc.icproject.service;

import com.temirlan.spring.mvc.icproject.oneC.Consignee;
import com.temirlan.spring.mvc.icproject.oneC.Consignor;
import com.temirlan.spring.mvc.icproject.oneC.Invoice;

public interface InvoiceService {
    public Invoice createInvoice(String message);
    public String getDealFields();
}
