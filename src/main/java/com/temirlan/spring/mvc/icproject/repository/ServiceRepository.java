package com.temirlan.spring.mvc.icproject.repository;

import com.temirlan.spring.mvc.icproject.oneC.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Integer> {
}
