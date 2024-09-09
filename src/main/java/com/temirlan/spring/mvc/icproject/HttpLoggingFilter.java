package com.temirlan.spring.mvc.icproject;

import com.temirlan.spring.mvc.icproject.entity.RequestLog;
import com.temirlan.spring.mvc.icproject.pojo.RunId;
import com.temirlan.spring.mvc.icproject.repository.RequestLogRepository;
import jakarta.servlet.http.HttpServletRequest;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import org.springframework.web.filter.AbstractRequestLoggingFilter;

@Getter
@Setter
public class HttpLoggingFilter extends AbstractRequestLoggingFilter {


    private RequestLogRepository requestLogRepository;

    private RunId runId;

    @SneakyThrows
    @Override
    protected void beforeRequest(HttpServletRequest request, String message) {
        RequestLog requestLog=new RequestLog();
        requestLog.setRun_id(runId.getValue());
        requestLog.setMethod(request.getMethod());
        requestLog.setEndpoint(request.getRequestURL().toString());
        requestLog.setBody(message);
        requestLogRepository.save(requestLog);
    }

    @Override
    protected void afterRequest(HttpServletRequest request, String message) {

    }
}
