package com.temirlan.spring.mvc.icproject.service;

import com.temirlan.spring.mvc.icproject.entity.Accounting;
import com.temirlan.spring.mvc.icproject.entity.BankPayment;
import com.temirlan.spring.mvc.icproject.entity.Payment;
import com.temirlan.spring.mvc.icproject.entity.PlannedPayment;
import com.temirlan.spring.mvc.icproject.oneC.Invoice;
import com.temirlan.spring.mvc.icproject.pojo.ImplementationBi;
import com.temirlan.spring.mvc.icproject.pojo.InvoiceBi;
import com.temirlan.spring.mvc.icproject.pojo.PayrollFundBi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public interface InvoiceService {
    public Map createInvoice(String message);
    public Map<String,Object> getDealFields();
    public void saveAccounting(Accounting accounting);
    public void saveBankPayment(ArrayList<BankPayment> bankPayment);
    public CompletableFuture<Void> deteleBankPayments(ArrayList<BankPayment> bankPayment);
    public List<ImplementationBi> getImplementationsList(Integer count);
    public List<PayrollFundBi> getPayrollFundList(Integer count );
    public List<InvoiceBi> getInvoicesList(Integer count);
    public  CompletableFuture<List<BankPayment>> deleteBankPaymentByUids(List<Map> bankPaymentUids);
    public void deleteBankPaymentsByUid(String bankPaymentUid);
    public String getDeal(String message);
    public ArrayList<PlannedPayment> savePlannedPayments(ArrayList<PlannedPayment> plannedPayments);
    public void deletePlannedPayments(ArrayList<PlannedPayment> plannedPayments);
    public CompletableFuture<Map> addExpenditureIncome(Map<String,Object> objectMap);
    public CompletableFuture<Map> delExpenditureIncome(Map<String, Object> objectMap);
    public List<Payment> addPayments(List<Payment> paymentList);
    public List<Payment> deletePayments(List<String> paymentList);
}
