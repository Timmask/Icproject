package com.temirlan.spring.mvc.icproject.config;

import com.temirlan.spring.mvc.icproject.HttpLoggingFilter;
import com.temirlan.spring.mvc.icproject.aspect.LoggingInterceptor;
import com.temirlan.spring.mvc.icproject.pojo.RunId;
import com.temirlan.spring.mvc.icproject.repository.RequestLogRepository;
import com.temirlan.spring.mvc.icproject.repository.WebLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("com.temirlan.spring.mvc.icproject")
@EnableAsync
public class MyConfig {



    @Autowired
    private RunId runId;

    @Autowired
    private RequestLogRepository requestLogRepository;

    @Autowired
    private WebLogRepository webLogRepository;


    @Bean
    public ClientHttpRequestFactory clientHttpRequestFactory(){
        ClientHttpRequestFactory clientHttpRequestFactory =new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory());

        return clientHttpRequestFactory;
    }
    @Bean("asyncExecutor")
    public ThreadPoolTaskExecutor taskExecutor() {

        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2);
        executor.setMaxPoolSize(2);
        executor.setQueueCapacity(500);
        executor.setThreadNamePrefix("MyAsyncThread-");
        executor.setRejectedExecutionHandler((r, executor1) -> System.err.println("Task rejected, thread pool is full and queue is also full"));
        executor.initialize();
        return executor;
    }
    @Bean
    public RestTemplate restTemplate(){
        RestTemplate restTemplate=new RestTemplate(clientHttpRequestFactory());
        List<ClientHttpRequestInterceptor> interceptors = restTemplate.getInterceptors();
        if (CollectionUtils.isEmpty(interceptors)) {
            interceptors = new ArrayList<>();
        }
        LoggingInterceptor interceptor=new LoggingInterceptor();
        interceptor.setRunId(runId);
        interceptor.setWebLogRepository(webLogRepository);
        interceptors.add(interceptor);
        restTemplate.setInterceptors(interceptors);
        return restTemplate ;
    }
    @Bean
    public HttpLoggingFilter requestLoggingFilter() {
        HttpLoggingFilter loggingFilter = new HttpLoggingFilter();
        loggingFilter.setIncludeClientInfo(true);
        loggingFilter.setIncludeQueryString(true);
        loggingFilter.setIncludePayload(true);
        loggingFilter.setMaxPayloadLength(64000);
        loggingFilter.setIncludeHeaders(true);
        loggingFilter.setRequestLogRepository(requestLogRepository);
        loggingFilter.setRunId(runId);
        return loggingFilter;
    }
    }

//    @Bean
//    public RunId runId(){
//        RunId runId=new RunId();
//        runId.setValue(UUID.randomUUID().toString());
//        return runId;
//    }

