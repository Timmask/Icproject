package com.temirlan.spring.mvc.icproject.repository;

import com.temirlan.spring.mvc.icproject.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
    public List<Payment> deleteAllByPaymentOrderUid(String paymentOrderUid);
    public Payment deletePaymentByPaymentOrderUid(String paymentOrderUid);
    public List<Payment> findAllByPaymentOrderUid(String paymentOrderUid);

}
