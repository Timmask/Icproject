package com.temirlan.spring.mvc.icproject.exception_handling;

public class IncorrectPaymentException extends RuntimeException{
    public IncorrectPaymentException(String message) {
        super(message);
    }
}
