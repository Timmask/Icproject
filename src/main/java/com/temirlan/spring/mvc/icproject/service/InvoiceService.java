package com.temirlan.spring.mvc.icproject.service;

import com.temirlan.spring.mvc.icproject.entity.Accounting;
import com.temirlan.spring.mvc.icproject.entity.BankPayment;
import com.temirlan.spring.mvc.icproject.entity.PlannedPayment;
import com.temirlan.spring.mvc.icproject.oneC.Invoice;
import com.temirlan.spring.mvc.icproject.pojo.ImplementationBi;
import com.temirlan.spring.mvc.icproject.pojo.InvoiceBi;
import com.temirlan.spring.mvc.icproject.pojo.PayrollFundBi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface InvoiceService {
    public Invoice createInvoice(String message);
    public Map<String,Object> getDealFields();
    public void saveAccounting(Accounting accounting);
    public ArrayList<BankPayment> saveBankPayment(ArrayList<BankPayment> bankPayment);
    public ArrayList<BankPayment> deteleBankPayments(ArrayList<BankPayment> bankPayment);
    public List<ImplementationBi> getImplementationsList(Integer count);
    public List<PayrollFundBi> getPayrollFundList(Integer count );
    public List<InvoiceBi> getInvoicesList(Integer count);
    public List<BankPayment> deleteBankPaymentByUids(List<Map> bankPaymentUids);
    public void deleteBankPaymentsByUid(String bankPaymentUid);
    public String getDeal(String message);
    public ArrayList<PlannedPayment> savePlannedPayments(ArrayList<PlannedPayment> plannedPayments);
    public void deletePlannedPayments(ArrayList<PlannedPayment> plannedPayments);

}
