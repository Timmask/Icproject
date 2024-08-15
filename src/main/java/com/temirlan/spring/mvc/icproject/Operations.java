package com.temirlan.spring.mvc.icproject;

import org.springframework.stereotype.Component;

@Component
public class Operations {

    public String extractId(String message){
        int lastIndx =message.indexOf("&ts");
        int firstInx = message.lastIndexOf("ID%5D")+6;
        return message.substring(firstInx, lastIndx);
    }


}
