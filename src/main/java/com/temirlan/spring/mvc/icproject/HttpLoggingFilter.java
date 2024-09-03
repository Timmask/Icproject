package com.temirlan.spring.mvc.icproject;

import jakarta.servlet.http.HttpServletRequest;
import lombok.SneakyThrows;
import org.springframework.web.filter.AbstractRequestLoggingFilter;

import java.net.Inet4Address;

public class HttpLoggingFilter extends AbstractRequestLoggingFilter {


    @SneakyThrows
    @Override
    protected void beforeRequest(HttpServletRequest request, String message) {
        System.out.println(request.getRequestURL());
        System.out.println(message);
        System.out.println(Inet4Address.getLocalHost().getHostAddress());
    }

    @Override
    protected void afterRequest(HttpServletRequest request, String message) {
        System.out.println(message);
    }
}
