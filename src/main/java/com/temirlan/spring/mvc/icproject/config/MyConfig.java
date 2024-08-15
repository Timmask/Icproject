package com.temirlan.spring.mvc.icproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.temirlan.spring.mvc.icproject")
public class MyConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
