package com.temirlan.spring.mvc.icproject.service;

import com.temirlan.spring.mvc.icproject.entity.Accounting;
import com.temirlan.spring.mvc.icproject.oneC.Consignee;
import com.temirlan.spring.mvc.icproject.oneC.Consignor;
import com.temirlan.spring.mvc.icproject.oneC.Invoice;

import java.util.Map;

public interface InvoiceService {
    public Invoice createInvoice(String message);
    public Map<String,Object> getDealFields();
    public void saveAccounting(Accounting accounting);
}
