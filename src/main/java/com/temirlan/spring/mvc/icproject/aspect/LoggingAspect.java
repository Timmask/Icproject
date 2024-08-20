package com.temirlan.spring.mvc.icproject.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Objects;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* com.temirlan.spring.mvc.icproject.controller.Controller.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        MethodSignature methodSignature= (MethodSignature) joinPoint.getSignature();
        PostMapping post =methodSignature.getMethod().getAnnotation(PostMapping.class);
        System.out.println( "url:" + post.value()[0].toString() );
        System.out.println(methodName);
        for (Object arg : args) {
            System.out.println(arg.toString());
        }

    }
}
