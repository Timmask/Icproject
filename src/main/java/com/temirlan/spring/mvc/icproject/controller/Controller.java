package com.temirlan.spring.mvc.icproject.controller;

import com.temirlan.spring.mvc.icproject.entity.*;
import com.temirlan.spring.mvc.icproject.exception_handling.IncorrectPaymentException;
import com.temirlan.spring.mvc.icproject.pojo.RunId;
import com.temirlan.spring.mvc.icproject.service.InvoiceService;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;


@RestController
@RequestMapping("/api")
public class Controller {
    private static final Logger log = LoggerFactory.getLogger(Controller.class);
    @Autowired
    private InvoiceService invoiceService;

    @Autowired
    private RunId runId;

    @SneakyThrows
    @GetMapping("/")
    public String index() {
        return Inet4Address.getLocalHost().getHostAddress();
    }

    @PostMapping("/webhook")
    public Map apiWebhook(@RequestBody String message) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", invoiceService.createInvoice(message));
        return map;
    }


    @PostMapping("/get-deal")
    public String getDeal(@RequestBody String message) {

        return invoiceService.getDeal(message);
    }

    @GetMapping("/fields")
    public Map<String, Object> apiFields() {

        return invoiceService.getDealFields();
    }

    @PostMapping("/managment-accounting")
    public Accounting managmentAccounting(@RequestBody Accounting accounting) {
        String message = "";
        try {
            invoiceService.saveAccounting(accounting);
            message = "Ok";
        } catch (Exception e) {
            message = e.toString();
        }
        return accounting;
    }

    @PostMapping("/bank-payments")
    public Map<String, Object> bankPaymentsAdd(@RequestBody ArrayList<BankPayment> bankPayments) {
        Map<String, Object> message = new HashMap<>();
        try {
            String uid = bankPayments.get(0).getBankStatementUid();
            invoiceService.deleteBankPaymentsByUid(uid);
            invoiceService.saveBankPayment(bankPayments);
            message.put("result", bankPayments);
//            message.put("async",response);
        } catch (Exception e) {
            message.put("result", e.toString());
        }
        return message;
    }

    @PutMapping("/bank-payments")
    public Map<String, Object> bankPaymentsUpd(@RequestBody ArrayList<BankPayment> bankPayments) {
        Map<String, Object> message = new HashMap<>();
        try {
            invoiceService.saveBankPayment(bankPayments);
            message.put("result", bankPayments);
//            message.put("async",response);
        } catch (Exception e) {
            message.put("result", e.toString());
        }
        return message;
    }

    @DeleteMapping("/bank-payments")
    public Map<String, Object> bankPaymentsDlt(@RequestBody ArrayList<Map> bankPaymentsUid) {
        Map<String, Object> message = new HashMap<>();
        try {
            CompletableFuture<List<BankPayment>> bankPaymentList = invoiceService.deleteBankPaymentByUids(bankPaymentsUid);
            message.put("result", bankPaymentsUid);
            message.put("async", bankPaymentList);
        } catch (Exception e) {
            message.put("result", e.toString());
        }
        return message;
    }

    @PostMapping("/planned-payments")
    public Map<String, Object> plannedPaymentsAdd(@RequestBody ArrayList<PlannedPayment> plannedPayments) {
        Map<String, Object> message = new HashMap<>();
        try {
            List<PlannedPayment> plannedPaymentArrayList = invoiceService.savePlannedPayments(plannedPayments);
            message.put("result", plannedPaymentArrayList);
        } catch (Exception e) {
            message.put("result", e.toString());
        }
        return message;
    }

    @PutMapping("/planned-payments")
    public Map<String, Object> plannedPaymentsUpdate(@RequestBody ArrayList<PlannedPayment> plannedPayments) {
        Map<String, Object> message = new HashMap<>();
        try {
            List<PlannedPayment> plannedPaymentArrayList = invoiceService.savePlannedPayments(plannedPayments);
            message.put("result", plannedPaymentArrayList);
        } catch (Exception e) {
            message.put("result", e.toString());
        }
        return message;
    }

    @DeleteMapping("/planned-payments")
    public Map<String, Object> plannedPaymentsdate(@RequestBody ArrayList<PlannedPayment> plannedPayments) {
        Map<String, Object> message = new HashMap<>();
        try {
            invoiceService.deletePlannedPayments(plannedPayments);
            message.put("result", plannedPayments);
        } catch (Exception e) {
            message.put("result", e.toString());
        }
        return message;
    }

    @PostMapping("/income-expenditure")
    public Map incomeExpenditureAdd(@RequestBody Map<String, Object> objectMap) {
        HashMap<String, Object> map = new HashMap<>();
        CompletableFuture response = invoiceService.addExpenditureIncome(objectMap);
        map.put("result", objectMap);
        map.put("async", response);
        return map;
    }

    @PutMapping("/income-expenditure")
    public Map incomeExpenditureUpd(@RequestBody Map<String, Object> objectMap) {
        HashMap<String, Object> map = new HashMap<>();
        CompletableFuture response = invoiceService.addExpenditureIncome(objectMap);
        map.put("result", objectMap);
        map.put("async", response);
        return map;
    }

    @DeleteMapping("/income-expenditure")
    public Map incomeExpenditureDel(@RequestBody Map<String, Object> objectMap) {
        HashMap<String, Object> map = new HashMap<>();
        CompletableFuture response = invoiceService.delExpenditureIncome(objectMap);
        map.put("result", objectMap);
        map.put("async", response);
        return map;
    }


    @PostMapping("/payments")
    public ResponseEntity<Map> addPayments(@RequestBody Payment payment) {
        ResponseEntity<Map> response = null;
        try {
            invoiceService.deletePaymentsByUid(payment);
            Payment paymentRes = invoiceService.savePayment(payment);
            Map<String, Object> resultMap = new HashMap<>();
            resultMap.put("result", paymentRes);
            response = new ResponseEntity<>(resultMap, HttpStatus.OK);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw new IncorrectPaymentException(e.getMessage());
        }

        return response;
    }

    @PutMapping("/payments")
    public ResponseEntity<Map> putPayments(@RequestBody Payment payment) {
        ResponseEntity<Map> response = null;
        try {
            Payment paymentRes = invoiceService.savePayment(payment);
            Map<String, Object> resultMap = new HashMap<>();
            resultMap.put("result", paymentRes);
            response = new ResponseEntity<>(resultMap, HttpStatus.OK);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw new IncorrectPaymentException(e.getMessage());
        }

        return response;
    }

    @DeleteMapping("/payments")
    public ResponseEntity<Map> deletePayments(@RequestBody Map<String, Object> paymentUid) {
        ResponseEntity<Map> response = null;
        try {
            List<Payment> paymentRes = invoiceService.deletePayment(paymentUid);
            Map<String, Object> resultMap = new HashMap<>();
            resultMap.put("result", paymentRes);
            response = new ResponseEntity<>(resultMap, HttpStatus.OK);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw new IncorrectPaymentException(e.getMessage());
        }

        return response;
    }


    @PostMapping("/get-payments")
    public ResponseEntity<Map> getPayments(@RequestBody List<Map<String, Object>> paymentUidList) {
        ResponseEntity<Map> response = null;
        try {
            List<Payment> paymentRes = invoiceService.getPayments(paymentUidList);
            Map<String, Object> resultMap = new HashMap<>();
            resultMap.put("result", paymentRes);
            response = new ResponseEntity<>(resultMap, HttpStatus.OK);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw new IncorrectPaymentException(e.getMessage());
        }

        return response;
    }

    @PostMapping("/get-payments-by-date")
    public ResponseEntity<Map> getPaymentsByDate(@RequestBody Map<String, Object> request) {
        ResponseEntity<Map> response = null;
        try {
            List<Payment> paymentRes = invoiceService.getPaymentsByStartEndDate(request.get("start_date").toString(), request.get("end_date").toString(), request.get("organization_BIN").toString());
            Map<String, Object> resultMap = new HashMap<>();
            resultMap.put("result", paymentRes);
            response = new ResponseEntity<>(resultMap, HttpStatus.OK);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw new IncorrectPaymentException(e.getMessage());
        }

        return response;
    }
}

