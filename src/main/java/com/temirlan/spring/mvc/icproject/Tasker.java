package com.temirlan.spring.mvc.icproject;

import com.temirlan.spring.mvc.icproject.entity.Deal;
import com.temirlan.spring.mvc.icproject.pojo.ImplementationBi;
import com.temirlan.spring.mvc.icproject.repository.DealRepository;
import com.temirlan.spring.mvc.icproject.repository.JDBCRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Tasker {

    @Autowired
    private JDBCRepository jdbcRepository;

    @Autowired
    private DealRepository dealRepository;

//    @SneakyThrows
//    @Scheduled(cron = "0 * * * * *")
//    public void getDeal(){
//        Deal deal=dealRepository.getReferenceById(162143);
////        System.out.println(deal.getUF_CRM_1712228470());
////        System.out.println(deal.getIpName());
//
//    }
}
