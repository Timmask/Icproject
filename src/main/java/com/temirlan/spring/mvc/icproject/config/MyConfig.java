package com.temirlan.spring.mvc.icproject.config;

import com.temirlan.spring.mvc.icproject.HttpLoggingFilter;
import com.temirlan.spring.mvc.icproject.pojo.RunId;
import org.springframework.context.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import java.util.UUID;

@Configuration
@ComponentScan("com.temirlan.spring.mvc.icproject")
public class MyConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    @Bean
    public HttpLoggingFilter requestLoggingFilter() {
        HttpLoggingFilter loggingFilter = new HttpLoggingFilter();
        loggingFilter.setIncludeClientInfo(true);
        loggingFilter.setIncludeQueryString(true);
        loggingFilter.setIncludePayload(true);
        loggingFilter.setMaxPayloadLength(64000);
        loggingFilter.setIncludeHeaders(true);
        return loggingFilter;

    }

    @Bean
    @Scope(value="request", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public RunId runId(){
        RunId runId=new RunId();
        runId.setValue(UUID.randomUUID().toString());
        return runId;
    }
}
