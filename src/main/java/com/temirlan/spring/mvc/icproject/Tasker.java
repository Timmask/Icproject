package com.temirlan.spring.mvc.icproject;

import com.temirlan.spring.mvc.icproject.pojo.ImplementationBi;
import com.temirlan.spring.mvc.icproject.repository.JDBCRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Tasker {

    @Autowired
    private JDBCRepository jdbcRepository;

    @SneakyThrows
//    @Scheduled(cron = "0 * * * * *")
    public void getDeal(){
        List<ImplementationBi> implementations=jdbcRepository.getAllImplementation(10);
        System.out.println(implementations);


    }
}
