package com.temirlan.spring.mvc.icproject.service;

import com.temirlan.spring.mvc.icproject.Operations;
import com.temirlan.spring.mvc.icproject.entity.Accounting;
import com.temirlan.spring.mvc.icproject.entity.BankPayment;
import com.temirlan.spring.mvc.icproject.entity.Deal;
import com.temirlan.spring.mvc.icproject.oneC.Consignee;
import com.temirlan.spring.mvc.icproject.oneC.Consignor;
import com.temirlan.spring.mvc.icproject.oneC.Invoice;
import com.temirlan.spring.mvc.icproject.pojo.ImplementationBi;
import com.temirlan.spring.mvc.icproject.pojo.InvoiceBi;
import com.temirlan.spring.mvc.icproject.pojo.PayrollFundBi;
import com.temirlan.spring.mvc.icproject.repository.AccountingRepository;
import com.temirlan.spring.mvc.icproject.repository.BankPaymentRepository;
import com.temirlan.spring.mvc.icproject.repository.DealRepository;
import com.temirlan.spring.mvc.icproject.repository.JDBCRepository;
import com.temirlan.spring.mvc.icproject.restclient.Communication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class InvoiceServiceImp implements InvoiceService{
    @Autowired
    public Operations operations;
    @Autowired
    public Communication communication;

    @Autowired
    private JDBCRepository jdbcRepository;

    @Autowired
    public DealRepository dealRepository;

    @Autowired
    private AccountingRepository accountingRepository;

    @Autowired
    private BankPaymentRepository bankPaymentRepository;

    public Invoice createInvoice(String message) throws HttpServerErrorException {
        String id=operations.extractId(message);
        Map<String,Object> deal=communication.getDealById(id);
        Map<String,Object> dealres = (Map<String, Object>) deal.get("result");
        Invoice invoice=new Invoice();
        if ( dealres.get("STAGE_ID") == "C69:UC_MLMLU7" && dealres.get("CATEGORY_ID")=="69"){
            Consignor consignor =jdbcRepository.getConsignorInfo(id);
            Consignee consignee=jdbcRepository.getConsigneeInfo(id);
            invoice.setConsignee(consignee);
            invoice.setConsignor(consignor);
            String invoiceRes= communication.createInvoice(invoice);
            System.out.println(invoiceRes);
        }
         return invoice;
    }
    public Map<String, Object> getDealFields(){
        return  communication.getDealFields();
    }

    public void saveAccounting(Accounting accounting){
        accountingRepository.save(accounting);
    }

    @Override
    public ArrayList<BankPayment> saveBankPayment(ArrayList<BankPayment> bankPayment) {
            bankPaymentRepository.saveAll(bankPayment);
            return bankPayment;

    }

    @Override
    public ArrayList<BankPayment> deteleBankPayments(ArrayList<BankPayment> bankPayment) {
        bankPaymentRepository.deleteAllInBatch(bankPayment);
        return bankPayment;
    }


    public void saveDeal(Deal deal){
        dealRepository.save(deal);
    }

    public List<ImplementationBi> getImplementationsList(Integer count){
       return jdbcRepository.getAllImplementation(count);
    }
    public List<PayrollFundBi> getPayrollFundList(Integer count ){
        return jdbcRepository.getPayrollFundList(count);
    }

    @Override
    public List<InvoiceBi> getInvoicesList(Integer count) {
        return jdbcRepository.getInvoicesList(count);
    }


}
