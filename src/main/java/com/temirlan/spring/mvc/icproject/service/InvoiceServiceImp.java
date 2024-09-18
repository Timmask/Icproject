package com.temirlan.spring.mvc.icproject.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.temirlan.spring.mvc.icproject.Operations;
import com.temirlan.spring.mvc.icproject.entity.*;
import com.temirlan.spring.mvc.icproject.oneC.Consignee;
import com.temirlan.spring.mvc.icproject.oneC.Consignor;
import com.temirlan.spring.mvc.icproject.oneC.Invoice;
import com.temirlan.spring.mvc.icproject.oneC.Service;
import com.temirlan.spring.mvc.icproject.pojo.*;
import com.temirlan.spring.mvc.icproject.repository.*;
import com.temirlan.spring.mvc.icproject.restclient.Communication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.HttpServerErrorException;
import java.util.*;
import java.util.concurrent.CompletableFuture;

@org.springframework.stereotype.Service
public class InvoiceServiceImp implements InvoiceService {

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

    @Autowired
    private ExpenditureRepository expenditureRepository;

    @Autowired
    private IncomeRepository incomeRepository;

    @Autowired
    private PaymentRepository paymentRepository;

    @Transactional
    public Map createInvoice(String message) throws HttpServerErrorException {
        HashMap<String,Object> map = new HashMap<>();
        String id = operations.extractId(message);
        Map<String, Object> deal = communication.getDealById(id);
        Map<String, Object> dealres = (Map<String, Object>) deal.get("result");
        Map<String, Object> companiesMap = jdbcRepository.getCompaniesInfo();
        String dealCompany = dealres.get("UF_CRM_1707120091678").toString();
        Invoice invoice = new Invoice();
        map.put("result", "invoice not created");
        if (dealres.get("STAGE_ID").equals("C69:UC_MLMLU7") && dealres.get("CATEGORY_ID").equals("69") && companiesMap.containsKey(dealCompany)) {
            System.err.println(companiesMap.get(dealCompany));
            Consignor consignor = null;
            Consignee consignee = null;
            Service service=null;
            try{
                service= jdbcRepository.getServiceInfo(id);
                consignor=jdbcRepository.getConsignorInfo(id);
                consignee=jdbcRepository.getConsigneeInfo(id);
            }catch (Exception e){
                String serviceName=jdbcRepository.getDealService(dealres.get("UF_CRM_1724236125").toString());
                String description=serviceName +" \n " +dealres.get("UF_CRM_1725356067981").toString() + " за "+ operations.getCalendarMonth(dealres.get("UF_CRM_1711371065591").toString());
                String isNds= dealres.get("UF_CRM_1708595011927").toString().equals("28039") ? "НДС": "без НДС";
                service=new Service(dealres.get("UF_CRM_1724236242").toString()
                        ,dealres.get("UF_CRM_1709622025399").toString()
                        ,dealres.get("UF_CRM_1707724024179").toString()
                        ,description,isNds,serviceName);
                consignee=new Consignee(dealres.get("UF_CRM_1707149878937").toString(),dealres.get("UF_CRM_1707119819982").toString());
                consignor=new Consignor(dealres.get("UF_CRM_1707120091678").toString(),dealres.get("UF_CRM_1723444589386").toString());
            }

            serviceRepository.save(service);
            invoice.setConsignee(consignee);
            invoice.setConsignor(consignor);
            invoice.getItems().getServices().add(service);
            System.out.println(invoice);
            String invoiceRes = communication.createInvoice(invoice);
            map.put("result", invoiceRes);
        }
        return map;
    }



    @Transactional
    public String getDeal(String message) {
        String id = operations.extractId(message);
        Map<String, Object> dealMap = communication.getDeal(id);
        ObjectMapper mapper = new ObjectMapper();
        Deal deal = mapper.convertValue(dealMap.get("result"), Deal.class);
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


    @Override
    @Async("asyncExecutor")
    public CompletableFuture<Map> addExpenditureIncome(Map<String, Object> objectMap) {
        long startTime = System.nanoTime();
        ObjectMapper mapper = new ObjectMapper();
        List<Map> incomeMap = mapper.convertValue(objectMap.get("planned_income"), List.class);
        List<Map> expenditureMap = mapper.convertValue(objectMap.get("planned_expenditure"), List.class);
        String docDate = (String) objectMap.get("document_date");
        String objectConstruction = (String) objectMap.get("object_construction");
        String organization = (String) objectMap.get("organization");
        ArrayList<PlannedIncome> plannedIncomes = new ArrayList<>();
        ArrayList<PlannedExpenditure> plannedExpenditures = new ArrayList<>();
        for (Map i : incomeMap) {
            PlannedIncome income = mapper.convertValue(i, PlannedIncome.class);
            income.setDocument_date(docDate);
            income.setObject_construction(objectConstruction);
            income.setOrganization(organization);
            plannedIncomes.add(income);
        }
        for (Map i : expenditureMap) {
            PlannedExpenditure expenditure = mapper.convertValue(i, PlannedExpenditure.class);
            expenditure.setDocument_date(docDate);
            expenditure.setObject_construction(objectConstruction);
            expenditure.setOrganization(organization);
            plannedExpenditures.add(expenditure);
        }
        incomeRepository.saveAll(plannedIncomes);
        expenditureRepository.saveAll(plannedExpenditures);
        objectMap.put("planned_income", plannedIncomes);
        objectMap.put("planned_expenditure", plannedExpenditures);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.err.println(duration);
        return CompletableFuture.completedFuture(objectMap);
    }


    @Override
    @Async("asyncExecutor")
    public CompletableFuture<Map> delExpenditureIncome(Map<String, Object> objectMap) {
        ObjectMapper mapper = new ObjectMapper();
        List<Map> incomeMap = mapper.convertValue(objectMap.get("planned_income"), List.class);
        List<Map> expenditureMap = mapper.convertValue(objectMap.get("planned_expenditure"), List.class);
        String docDate = (String) objectMap.get("document_date");
        String objectConstruction = (String) objectMap.get("object_construction");
        String organization = (String) objectMap.get("organization");
        ArrayList<PlannedIncome> plannedIncomes = new ArrayList<>();
        ArrayList<PlannedExpenditure> plannedExpenditures = new ArrayList<>();

        for (Map i : incomeMap) {
            PlannedIncome income = mapper.convertValue(i, PlannedIncome.class);
            income.setDocument_date(docDate);
            income.setObject_construction(objectConstruction);
            income.setOrganization(organization);
            plannedIncomes.add(income);
        }
        for (Map i : expenditureMap) {
            PlannedExpenditure expenditure = mapper.convertValue(i, PlannedExpenditure.class);
            expenditure.setDocument_date(docDate);
            expenditure.setObject_construction(objectConstruction);
            expenditure.setOrganization(organization);
            plannedExpenditures.add(expenditure);
        }
        incomeRepository.deleteAll(plannedIncomes);
        expenditureRepository.deleteAll(plannedExpenditures);
        objectMap.put("planned_income", plannedIncomes);
        objectMap.put("planned_expenditure", plannedExpenditures);
        return CompletableFuture.completedFuture(objectMap);
    }

    @Transactional
    @Override
    public List<Payment> addPayments(List<Payment> paymentList) {
        return paymentRepository.saveAll(paymentList);
    }


    @Transactional(rollbackFor = Exception.class)
    @Override
    public List<Payment> deletePayments(List<String> paymentList) {
        List<Payment> payments=new ArrayList<>();
        for(String uid:paymentList){
            payments.addAll(paymentRepository.deleteAllByPaymentOrderUid(uid));
        }
        return payments;
    }

    @Transactional
    public Map<String, Object> getDealFields() {
        return communication.getDealFields();
    }

    @Transactional
    public void saveAccounting(Accounting accounting) {
        accountingRepository.save(accounting);
    }


    @Override
    @Async("asyncExecutor")
    public void saveBankPayment(ArrayList<BankPayment> bankPayment) {
        bankPaymentRepository.saveAll(bankPayment);
    }


    @Override
    @Async("asyncExecutor")
    public CompletableFuture<Void> deteleBankPayments(ArrayList<BankPayment> bankPayment) {
        bankPaymentRepository.deleteAllInBatch(bankPayment);

        return CompletableFuture.completedFuture(null);
    }

    @Transactional
    public void saveDeal(Deal deal) {
        dealRepository.save(deal);
    }

    @Transactional
    public List<ImplementationBi> getImplementationsList(Integer count) {
        return jdbcRepository.getAllImplementation(count);
    }

    @Transactional
    public List<PayrollFundBi> getPayrollFundList(Integer count) {
        return jdbcRepository.getPayrollFundList(count);
    }

    @Transactional
    @Override
    public List<InvoiceBi> getInvoicesList(Integer count) {
        return jdbcRepository.getInvoicesList(count);
    }

    @Override
    @Async("asyncExecutor")
    public CompletableFuture<List<BankPayment>> deleteBankPaymentByUids(List<Map> bankPaymentUids) {
        List<BankPayment> bankPaymentList = new ArrayList<>();

        for (Map<String, String> uid : bankPaymentUids) {

            List<BankPayment> bankPaymentListByUid = bankPaymentRepository.getBankPaymentsByBankStatementUid(uid.get("bank_statement_uid"));
            bankPaymentRepository.deleteAllInBatch(bankPaymentListByUid);
            bankPaymentList.addAll(bankPaymentListByUid);
        }
        return CompletableFuture.completedFuture(bankPaymentList);
    }

    @Transactional
    @Override
    public void deleteBankPaymentsByUid(String bankPaymentUid) {
        bankPaymentRepository.deleteBankPaymentsByBankStatementUid(bankPaymentUid);
    }


}