package com.temirlan.spring.mvc.icproject;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@Component
public class Operations {

    public String extractId(String message){
        int lastIndx =message.indexOf("&ts");
        int firstInx = message.lastIndexOf("ID%5D")+6;
        return message.substring(firstInx, lastIndx);
    }

    public String getCalendarMonth(String dateInString){
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
        String month=null;
        Date date=null;
        try {
            date = sdf1.parse(dateInString);

        }catch (Exception e){
            try {
                date = sdf2.parse(dateInString);
            }catch (Exception ex){

            }
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        month= new SimpleDateFormat("MMMM yyyy", new Locale("ru")).format(cal.getTime());

        return month + " г.";
    }

}
