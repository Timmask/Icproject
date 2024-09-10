package com.temirlan.spring.mvc.icproject.aspect;

import com.temirlan.spring.mvc.icproject.entity.RequestLog;
import com.temirlan.spring.mvc.icproject.repository.RequestLogRepository;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;


@Component
@Aspect
public class LoggingAspect {

    @Autowired
    private RequestLogRepository requestLogRepository;

    @Before("@annotation(org.springframework.web.bind.annotation.PostMapping)")
    public void logBefore(JoinPoint joinPoint) {

        MethodSignature methodSignature= (MethodSignature) joinPoint.getSignature();
        RequestLog requestLog = new RequestLog();
        Object[] args = joinPoint.getArgs();
        requestLog.setBody(args[0].toString());
        PostMapping post =methodSignature.getMethod().getAnnotation(PostMapping.class);
        requestLog.setEndpoint( "http://localhost:8080" + post.value()[0].toString());
        Object object=new Object();
        requestLog.setRunId( String.valueOf(object.hashCode()));
//        long now = System.currentTimeMillis();
//        Date date = new Date(now);
//        requestLog.setTimestamp(date.toInstant());
        requestLogRepository.save(requestLog);
    }
}
