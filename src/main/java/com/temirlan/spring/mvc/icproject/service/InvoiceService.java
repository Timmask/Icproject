package com.temirlan.spring.mvc.icproject.service;

import com.temirlan.spring.mvc.icproject.entity.*;
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
    public  CompletableFuture<List<BankPayment>> deleteBankPaymentByUids(List<Map> bankPaymentUids);
    public void deleteBankPaymentsByUid(String bankPaymentUid);
    public String getDeal(String message);
    public ArrayList<PlannedPayment> savePlannedPayments(ArrayList<PlannedPayment> plannedPayments);
    public void deletePlannedPayments(ArrayList<PlannedPayment> plannedPayments);
    public CompletableFuture<Map> addExpenditureIncome(Map<String,Object> objectMap);
    public CompletableFuture<Map> delExpenditureIncome(Map<String, Object> objectMap);
    public Payment savePayment(Payment payment);
    public List<Payment> deletePayment(Map<String,Object> paymentUid);
    public List<Payment> getPayments(List<Map<String,Object>> paymentUidList);
    public List<Payment> getPaymentsByStartEndDate(String startDate,String endDate,String organizationBin);
    public List<Payment> deletePaymentsByUid(Payment paymentUids);
    public PaymentsOfIp addPaymentsOfIp(PaymentsOfIp paymentsOfIp);
    public List<PaymentsOfIp> deletePaymentsOfIp(Map<String,Object> paymentUid);
    public PaymentsOfIp updatePaymentsOfIp(PaymentsOfIp paymentsOfIp);

    public CashOrder addCashOrder(CashOrder cashOrder);
    public List<CashOrder> deleteCashOrder(Map<String,Object> paymentUid);
    public CashOrder updateCashOrder(CashOrder cashOrder);
}
