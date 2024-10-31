package com.temirlan.spring.mvc.icproject.repository;

import com.temirlan.spring.mvc.icproject.entity.Payment;
import com.temirlan.spring.mvc.icproject.entity.PaymentsOfIp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentsOfIPRepository extends JpaRepository<PaymentsOfIp,Integer> {
    public List<PaymentsOfIp> deleteAllByPaymentOrderUid(String paymentOrderUid);
    public List<PaymentsOfIp> findAllByPaymentOrderUid(String paymentOrderUid);
    public List<PaymentsOfIp> findAllByPaymentOrderDateAfterAndPaymentOrderDateBeforeAndOrganizationBin(String startDate,String endDate,String organizationBin);
    public List<PaymentsOfIp> deletePaymentsByPaymentOrderUid(String paymentOrderUid);
}
