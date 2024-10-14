package com.temirlan.spring.mvc.icproject.repository;

import com.temirlan.spring.mvc.icproject.mapper.ConsigneeMapper;
import com.temirlan.spring.mvc.icproject.mapper.ConsignorMapper;
import com.temirlan.spring.mvc.icproject.mapper.ServiceMapper;
import com.temirlan.spring.mvc.icproject.oneC.Consignee;
import com.temirlan.spring.mvc.icproject.oneC.Consignor;
import com.temirlan.spring.mvc.icproject.oneC.Service;
import com.temirlan.spring.mvc.icproject.pojo.ImplementationBi;
import com.temirlan.spring.mvc.icproject.pojo.InvoiceBi;
import com.temirlan.spring.mvc.icproject.pojo.PayrollFundBi;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class JDBCRepositoryImpl implements JDBCRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @SneakyThrows
    @Override
    public Consignee getConsigneeInfo(String id) throws EmptyResultDataAccessException{
        String script =String.format("select uf_Crm_1707149878937 as name , uf_Crm_1707119819982 as  tin  from deal d where external_id = %s",id);
        Consignee consignee= jdbcTemplate.queryForObject(script, new ConsigneeMapper());

        return consignee;
    }

    @SneakyThrows
    @Override
    public Consignor getConsignorInfo(String id) throws EmptyResultDataAccessException  {

        String script=String.format("select  dl.value  as name , d.UF_CRM_1723444589386 as tin  from deal d " +
                "left join deal_enum_UF_CRM_1707120091678 dl " +
                "on  dl.external_id  = d.UF_CRM_1707120091678 " +
                "where d.external_id=%s ",id);
        Consignor consignor= jdbcTemplate.queryForObject(script, new ConsignorMapper());

        return consignor;
    }



    public String getDealService(String external_id){
        String sql="SELECT value FROM deal_enum_uf_crm_1724236125 deuc " +
                "where external_id= "+external_id;
        String serviceName=jdbcTemplate.queryForObject(sql,String.class);
        return serviceName;
    }

    public Service getServiceInfo(String id ) throws EmptyResultDataAccessException {
        String sql="SELECT coalesce(d.UF_CRM_1724236242  , '002') as  \"article\" , \n" +
                "coalesce(d.UF_CRM_1707724024179 , '1') as \"square\",\n" +
                "coalesce(d.UF_CRM_1709622025399  ,'1') as \"sum\",\n" +
                "coalesce(d2.value , '1') as \"nds\" , \n" +
                "d.UF_CRM_1725356067981 \"address\" ,\n" +
                "d4.value \"service_name\",\n" +
                "d.UF_CRM_1711371065591 \"month\"\n" +
                "from deal d \n" +
                "left join deal_enum_UF_CRM_1708595011927 d2\n" +
                "on convert(varchar(10),d2.external_id)=d.UF_CRM_1708595011927\n" +
                "left join deal_enum_UF_CRM_1724236125 d4\n" +
                "on convert(varchar(10),d4.external_id)=UF_CRM_1724236125\n" +
                "where d.external_id= "+id;
        System.out.println(sql);
        Service service= jdbcTemplate.queryForObject(sql, new ServiceMapper());
        return service;
    }

    public Map<String,Object> getCompaniesInfo() {
        String sql = "SELECT  cast( dl.external_id as char) as external_id,ic.url FROM deal_enum_uf_crm_1707120091678 dl \n" +
                " inner join ic_company_list ic \n" +
                " on dl.value =ic.company_name ";
        List<Map<String, Object>> mapList = jdbcTemplate.queryForList(sql);
        return mapList.stream().collect(Collectors.toMap(k -> (String) k.get("external_id"), k -> (String) k.get("url")));

    }
}



