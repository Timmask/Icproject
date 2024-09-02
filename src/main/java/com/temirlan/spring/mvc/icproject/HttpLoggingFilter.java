package com.temirlan.spring.mvc.icproject;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.filter.AbstractRequestLoggingFilter;

public class HttpLoggingFilter extends AbstractRequestLoggingFilter {


    @Override
    protected void beforeRequest(HttpServletRequest request, String message) {
        System.out.println(request.getRequestURL());
        System.out.println(message);
    }

    @Override
    protected void afterRequest(HttpServletRequest request, String message) {
        System.out.println(message);
    }
}
