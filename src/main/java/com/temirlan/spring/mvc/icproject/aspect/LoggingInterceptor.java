package com.temirlan.spring.mvc.icproject.aspect;

import com.temirlan.spring.mvc.icproject.entity.WebLog;
import com.temirlan.spring.mvc.icproject.pojo.RunId;
import com.temirlan.spring.mvc.icproject.repository.WebLogRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

@Getter
@Setter
public class LoggingInterceptor implements ClientHttpRequestInterceptor {


    private WebLogRepository webLogRepository;

    private RunId runId;

    @Override
    public ClientHttpResponse intercept(
            HttpRequest req, byte[] reqBody, ClientHttpRequestExecution ex) throws IOException {
        String requestBody =new String(reqBody, StandardCharsets.UTF_8);
        ClientHttpResponse response = ex.execute(req, reqBody);
        InputStreamReader isr = new InputStreamReader(
                response.getBody(), StandardCharsets.UTF_8);
        String body = new BufferedReader(isr).lines()
                .collect(Collectors.joining("\n"));
        WebLog webLog=new WebLog();
        webLog.setMethod(req.getMethod().toString());
        webLog.setUrl(req.getURI().toString());
        webLog.setReqBody(requestBody);
        webLog.setResBody(body);
        webLog.setRun_id(runId.getValue());
        webLog.setReqInfo(req.getHeaders().toString());
        webLogRepository.save(webLog);

        return response;
    }

}