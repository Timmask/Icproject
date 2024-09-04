package com.temirlan.spring.mvc.icproject.repository;

import com.temirlan.spring.mvc.icproject.oneC.Consignee;
import com.temirlan.spring.mvc.icproject.oneC.Consignor;
import com.temirlan.spring.mvc.icproject.oneC.Service;
import com.temirlan.spring.mvc.icproject.pojo.ImplementationBi;
import com.temirlan.spring.mvc.icproject.pojo.InvoiceBi;
import com.temirlan.spring.mvc.icproject.pojo.PayrollFundBi;

import java.util.List;
import java.util.Map;

public interface JDBCRepository {

    public Consignee getConsigneeInfo(String id);

    public Consignor getConsignorInfo(String id);
    public List<ImplementationBi> getAllImplementation(Integer count );
    public List<PayrollFundBi> getPayrollFundList(Integer count );
    public List<InvoiceBi> getInvoicesList(Integer count);
    public Service getServiceInfo(String id );

}
