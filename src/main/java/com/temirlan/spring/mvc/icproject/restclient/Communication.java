package com.temirlan.spring.mvc.icproject.restclient;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.Gson;
import com.temirlan.spring.mvc.icproject.oneC.Invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.*;

@Component
public class Communication {

    @Autowired
    private RestTemplate restTemplate;
    private final String dealUrl="https://tootopbrass.bitrix24.kz/rest/351/g6klktx7s201zd4j/crm.deal.get.json?id=";
    private final String oneCUrl="https://icgroup.itsg.kz/webserver_ic_line_test/hs/invoice";

    public  Map<String,Object> getDealById(String id) {
        Map<String,Object> response =restTemplate.getForObject(dealUrl+id,Map.class);
        return response;
    }

    public String createInvoice(Invoice invoice) throws HttpServerErrorException {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Basic QWRtaW46cXdlcnR5");
        headers.set("Content-Type", "application/json;charset=utf-8");
        HttpEntity<Invoice> entity = new HttpEntity<Invoice>(invoice, headers);

        ResponseEntity<String> responseEntity = restTemplate.postForEntity(oneCUrl, entity, String.class);
        System.out.println(responseEntity.getBody());
        return responseEntity.getBody();

    }
    public Map<String, Object> getDealFields(){
        ResponseEntity<Map<String,Object>> responseEntity  = restTemplate.exchange("https://tootopbrass.bitrix24.kz/rest/351/8tsactrruh8wfx2k/crm.deal.fields.json", HttpMethod.GET, null, new ParameterizedTypeReference<Map<String,Object>>() {});

        return responseEntity.getBody();
    }


}


