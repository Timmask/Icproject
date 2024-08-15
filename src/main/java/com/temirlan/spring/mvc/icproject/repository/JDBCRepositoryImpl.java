package com.temirlan.spring.mvc.icproject.repository;

import com.temirlan.spring.mvc.icproject.mapper.ConsigneeMapper;
import com.temirlan.spring.mvc.icproject.mapper.ConsignorMapper;
import com.temirlan.spring.mvc.icproject.oneC.Consignee;
import com.temirlan.spring.mvc.icproject.oneC.ConsigneeData;
import com.temirlan.spring.mvc.icproject.oneC.Consignor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Repository
public class JDBCRepositoryImpl implements JDBCRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @SneakyThrows
    @Override
    public Consignee getConsigneeInfo(String id){
        String script =String.format("select uf_Crm_1707149878937 as name , uf_Crm_1707119819982 as  tin  from deal d where external_id = %s",id);
        Consignee consignee= jdbcTemplate.queryForObject(script, new ConsigneeMapper());

        return consignee;
    }

    @SneakyThrows
    @Override
    public Consignor getConsignorInfo(String id) {

        String script=String.format("select  dl.value  as name , d.UF_CRM_1723444589386 as tin  from deal d " +
                "left join deal_enum_UF_CRM_1707120091678 dl " +
                "on dl.external_id::varchar = d.UF_CRM_1707120091678 " +
                "where d.external_id=%s ",id);
        Consignor consignor= jdbcTemplate.queryForObject(script, new ConsignorMapper());

        return consignor;
    }


}
