package com.temirlan.spring.mvc.icproject.repository;

import com.temirlan.spring.mvc.icproject.entity.CashOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CashOrderRepository extends JpaRepository<CashOrder, Integer> {
    public List<CashOrder> deleteCashOrdersByPaymentOrderUid(String paymentOrderUid);
}
