package com.temirlan.spring.mvc.icproject.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.temirlan.spring.mvc.icproject.Operations;
import com.temirlan.spring.mvc.icproject.entity.Accounting;
import com.temirlan.spring.mvc.icproject.entity.BankPayment;
import com.temirlan.spring.mvc.icproject.entity.Deal;
import com.temirlan.spring.mvc.icproject.entity.PlannedPayment;
import com.temirlan.spring.mvc.icproject.oneC.Consignee;
import com.temirlan.spring.mvc.icproject.oneC.Consignor;
import com.temirlan.spring.mvc.icproject.oneC.Invoice;
import com.temirlan.spring.mvc.icproject.oneC.Service;
import com.temirlan.spring.mvc.icproject.pojo.*;
import com.temirlan.spring.mvc.icproject.repository.*;
import com.temirlan.spring.mvc.icproject.restclient.Communication;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.HttpServerErrorException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Service
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

    @Autowired
    private ServiceRepository serviceRepository;

    @Autowired
    private PlannedPaymentRepository plannedPaymentRepository;

    @Transactional
    public Invoice createInvoice(String message) throws HttpServerErrorException {
        Deal newDeal=new Deal();
        dealRepository.save(newDeal);
        System.out.println(newDeal);

        String id=operations.extractId(message);
        Map<String,Object> deal=communication.getDealById(id);
        Map<String,Object> dealres = (Map<String, Object>) deal.get("result");
//        ObjectMapper mapper=new ObjectMapper();
//        mapper.enable(DeserializationFeature.ACCEPT_FLOAT_AS_INT);
//        Deal deal1= mapper.convertValue(dealres,Deal.class);
//        dealRepository.save(deal1);
//        System.err.println(deal1);
        Invoice invoice=new Invoice();
        if ( dealres.get("STAGE_ID") == "C69:UC_MLMLU7" && dealres.get("CATEGORY_ID")=="69"){
            Consignor consignor =jdbcRepository.getConsignorInfo(id);
            Consignee consignee=jdbcRepository.getConsigneeInfo(id);
            Service service=jdbcRepository.getServiceInfo(id);
            serviceRepository.save(service);
            invoice.setConsignee(consignee);
            invoice.setConsignor(consignor);
            invoice.getItems().getServices().add(service);
            String invoiceRes= communication.createInvoice(invoice);
        }
         return invoice;
    }

    @Transactional
    public String getDeal(String message){
        String id=operations.extractId(message);
        Map<String,Object> dealMap=communication.getDeal(id);
        ObjectMapper mapper=new ObjectMapper();
        Deal deal= mapper.convertValue(dealMap.get("result"),Deal.class);
        System.err.println(deal);
        return "Ok";
    }

    @Transactional
    @Override
    public ArrayList<PlannedPayment> savePlannedPayments(ArrayList<PlannedPayment> plannedPayments) {
        plannedPaymentRepository.saveAll(plannedPayments);
        return plannedPayments;
    }

    @Override
    public void deletePlannedPayments(ArrayList<PlannedPayment> plannedPayments) {
        plannedPaymentRepository.deleteAll(plannedPayments);
    }

    @Transactional
    public Map<String, Object> getDealFields(){
        return  communication.getDealFields();
    }
    @Transactional
    public void saveAccounting(Accounting accounting){
        accountingRepository.save(accounting);
    }
    @Transactional
    @Override
    public ArrayList<BankPayment> saveBankPayment(ArrayList<BankPayment> bankPayment) {
            bankPaymentRepository.saveAll(bankPayment);
            return bankPayment;

    }
    @Transactional
    @Override
    public ArrayList<BankPayment> deteleBankPayments(ArrayList<BankPayment> bankPayment) {
        bankPaymentRepository.deleteAllInBatch(bankPayment);
        return bankPayment;
    }

    @Transactional
    public void saveDeal(Deal deal){
        dealRepository.save(deal);
    }
    @Transactional
    public List<ImplementationBi> getImplementationsList(Integer count){
       return jdbcRepository.getAllImplementation(count);
    }
    @Transactional
    public List<PayrollFundBi> getPayrollFundList(Integer count ){
        return jdbcRepository.getPayrollFundList(count);
    }

    @Transactional
    @Override
    public List<InvoiceBi> getInvoicesList(Integer count) {
        return jdbcRepository.getInvoicesList(count);
    }

    @Transactional
    @Override
    public List<BankPayment> deleteBankPaymentByUids(List<Map> bankPaymentUids) {
        List<BankPayment> bankPaymentList=new ArrayList<>();

        for (Map<String,String> uid:bankPaymentUids){

            List<BankPayment> bankPaymentListByUid=bankPaymentRepository.getBankPaymentsByBankStatementUid(uid.get("bank_statement_uid"));
            bankPaymentRepository.deleteAllInBatch(bankPaymentListByUid);
            bankPaymentList.addAll(bankPaymentListByUid);
        }
        return bankPaymentList;
    }
    @Transactional
    @Override
    public void deleteBankPaymentsByUid(String bankPaymentUid) {
        bankPaymentRepository.deleteBankPaymentsByBankStatementUid(bankPaymentUid);
    }


}
