package com.temirlan.spring.mvc.icproject;

import com.temirlan.spring.mvc.icproject.entity.Deal;
import com.temirlan.spring.mvc.icproject.repository.DealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class IcprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(IcprojectApplication.class, args);


    }

}


