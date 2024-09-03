package com.temirlan.spring.mvc.icproject.repository;

import com.temirlan.spring.mvc.icproject.Deal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DealRepository  extends JpaRepository<Deal, Integer> {
}
