package com.temirlan.spring.mvc.icproject.repository;

import com.temirlan.spring.mvc.icproject.mapper.ConsigneeMapper;
import com.temirlan.spring.mvc.icproject.mapper.ConsignorMapper;
import com.temirlan.spring.mvc.icproject.oneC.Consignee;
import com.temirlan.spring.mvc.icproject.oneC.ConsigneeData;
import com.temirlan.spring.mvc.icproject.oneC.Consignor;
import com.temirlan.spring.mvc.icproject.pojo.Implementation;
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


    public List<Implementation> getAllImplementation(Integer count ) {
        String sql = "select ds.\"name\" as \"Стадия сделки\" , d.opportunity  \"Сумма\"  , d.currency_id as \"Валюта\" , u.last_name || '' || u.\"name\" as \"Ответственный\"  ,\n" +
                "c.title as \"Компания\" , d1.value \"Наименование ИП обновленный\" , d2.value \"Адрес объекта\" , d3.value as \"Компания исполнитель IC\" ,\n" +
                " d4.value as \"Город\" , d.UF_CRM_1707724024179 as \"Площадь\" , d.UF_CRM_1708313343142 as \"Сумма договора по объекту\", d.UF_CRM_1708321214833 as \"Реализация для ИП\"  , d.UF_CRM_1708334626443 \"Сумма штрафа\",\n" +
                "d5.value as \"Процентная ставка ИП Список\" , d6.value \"Компания IC НДС/без НДС\" , d7.value as \"ИП НДС/Без НДС\" , d.UF_CRM_19_1712160694051 as \"Факт реализации\" , d.UF_CRM_1709731780880 as \"Доп. работы\" ,\n" +
                "d.UF_CRM_1711371065591 as \"Месяц начисления\" , d.UF_CRM_1707153235011 as \"Ответственное лицо ИП обновленное\" , d.UF_CRM_1712577743589  as \"Кол-во ОПУ\" , d.UF_CRM_1712743989071  \"Возврат долга\" ,c1.value \"Компания: Категория клиента\", d.external_id as \"Id\" from deal d  \n" +
                "left join dealcategory_stage ds\n" +
                "on d.stage_id = ds.status_id \n" +
                "left join \"user\" u\n" +
                "on d.assigned_by_id = u.external_id::varchar\n" +
                "left join company c\n" +
                "on c.external_id::varchar = d.company_id \n" +
                "left join deal_enum_UF_CRM_1712228470 d1\n" +
                "on d1.external_id::varchar =uf_crm_1712228470\n" +
                "left join deal_enum_UF_CRM_1708515537 d2\n" +
                "on d2.external_id::varchar=d.UF_CRM_1708515537 \n" +
                "left join deal_enum_UF_CRM_1707120091678 d3\n" +
                "on d3.external_id::varchar=UF_CRM_1707120091678\n" +
                "left join deal_enum_UF_CRM_1707153439 d4\n" +
                "on d4.external_id::varchar=UF_CRM_1707153439\n" +
                "left join deal_enum_UF_CRM_1708349381 d5 \n" +
                "on d5.external_id::varchar = d.UF_CRM_1708349381\n" +
                "left join deal_enum_UF_CRM_1708595011927 d6 \n" +
                "on d6.external_id::varchar = d.UF_CRM_1708595011927\n" +
                "left join deal_enum_UF_CRM_19_1712142579982 d7 \n" +
                "on d7.external_id::varchar=d.UF_CRM_19_1712142579982\n" +
                "left join company_enum_UF_CRM_1719220165391 c1\n" +
                "on c1.external_id::varchar=UF_CRM_1719220165391\n" +
                "order by ds.\"name\"";
        if ( count > 0) {
            sql += " limit " + count.toString();
        }
        return jdbcTemplate.query(
                sql,
                (rs, rowNum) ->
                        new Implementation(
                                rs.getInt("id"),
                                rs.getString("Стадия сделки"),
                                rs.getDouble("Сумма"),
                                rs.getString("Валюта"),
                                rs.getString("Ответственный"),
                                rs.getString("Компания"),
                                rs.getString("Наименование ИП обновленный"),
                                rs.getString("Адрес объекта"),
                                rs.getString("Компания исполнитель IC"),
                                rs.getDouble("Процентная ставка ИП Список"),
                                rs.getString("Город"),
                                rs.getDouble("Площадь"),
                                rs.getDouble("Сумма договора по объекту"),
                                rs.getDouble("Реализация для ИП"),
                                rs.getDouble("Сумма штрафа"),
                                rs.getString("Компания IC НДС/без НДС"),
                                rs.getString("ИП НДС/Без НДС"),
                                rs.getInt("Факт реализации"),
                                rs.getDouble("Доп. работы"),

                                rs.getString("Месяц начисления"),
                                rs.getString("Ответственное лицо ИП обновленное"),
                                rs.getInt("Кол-во ОПУ"),
                                rs.getDouble("Возврат долга"),
                                rs.getString("Компания: Категория клиента")
                        )
        );
    }


    }
