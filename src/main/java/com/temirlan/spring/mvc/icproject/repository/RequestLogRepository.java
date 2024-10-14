package com.temirlan.spring.mvc.icproject.repository;

import com.temirlan.spring.mvc.icproject.entity.RequestLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestLogRepository extends JpaRepository<RequestLog, Integer> {
    public RequestLog getRequestLogByRunId(String runId);
}





