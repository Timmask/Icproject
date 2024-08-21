package com.temirlan.spring.mvc.icproject.repository;

import com.temirlan.spring.mvc.icproject.entity.BankPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankPaymentRepository extends JpaRepository<BankPayment, Integer> {
}
