package com.temirlan.spring.mvc.icproject;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.temirlan.spring.mvc.icproject.entity.Deal;
import com.temirlan.spring.mvc.icproject.pojo.Implementation;
import com.temirlan.spring.mvc.icproject.repository.JDBCRepository;
import com.temirlan.spring.mvc.icproject.repository.JDBCRepositoryImpl;
import com.temirlan.spring.mvc.icproject.restclient.Communication;
import com.temirlan.spring.mvc.icproject.test.ResponseDeal;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Tasker {

    @Autowired
    private JDBCRepository jdbcRepository;

    @SneakyThrows
//    @Scheduled(cron = "0 * * * * *")
    public void getDeal(){
        List<Implementation> implementations=jdbcRepository.getAllImplementation(10);
        System.out.println(implementations);


    }
}
