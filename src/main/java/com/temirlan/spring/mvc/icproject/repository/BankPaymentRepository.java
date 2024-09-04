package com.temirlan.spring.mvc.icproject.repository;

import com.temirlan.spring.mvc.icproject.entity.BankPayment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankPaymentRepository extends JpaRepository<BankPayment, Integer> {
    public List<BankPayment> getBankPaymentsByBankStatementUid(String bankStatementUid);
    public void deleteBankPaymentsByBankStatementUid(String bankStatementUid);
}
