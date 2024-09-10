package com.temirlan.spring.mvc.icproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableAsync
@SpringBootApplication
public class IcprojectApplication {
    public static void main(String[] args) {
        SpringApplication.run(IcprojectApplication.class, args);


    }

}


