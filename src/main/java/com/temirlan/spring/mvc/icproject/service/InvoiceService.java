package com.temirlan.spring.mvc.icproject.service;

import com.temirlan.spring.mvc.icproject.entity.Accounting;
import com.temirlan.spring.mvc.icproject.oneC.Consignee;
import com.temirlan.spring.mvc.icproject.oneC.Consignor;
import com.temirlan.spring.mvc.icproject.oneC.Invoice;
import com.temirlan.spring.mvc.icproject.pojo.Implementation;

import java.util.List;
import java.util.Map;

public interface InvoiceService {
    public Invoice createInvoice(String message);
    public Map<String,Object> getDealFields();
    public void saveAccounting(Accounting accounting);
    public List<Implementation> getImplementationsList(Integer count);
}
