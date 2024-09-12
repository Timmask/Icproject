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
                "on convert(varchar(10),dl.external_id) = d.UF_CRM_1707120091678 " +
                "where d.external_id=%s ",id);
        Consignor consignor= jdbcTemplate.queryForObject(script, new ConsignorMapper());

        return consignor;
    }


    public List<ImplementationBi> getAllImplementation(Integer count ) {
        String sql = "select ds.\"name\" as \"Стадия сделки\" , d.opportunity  \"Сумма\"  , d.currency_id as \"Валюта\" , u.last_name || '' || u.\"name\" as \"Ответственный\"  , c.title as \"Компания\" , d1.value \"Наименование ИП обновленный\" , d2.value \"Адрес объекта\" , d3.value as \"Компания исполнитель IC\" ,\n" +
                "d4.value as \"Город\" , d.UF_CRM_1707724024179 as \"Площадь\" , d.UF_CRM_1708313343142 as \"Сумма договора по объекту\", d.UF_CRM_1708321214833 as \"Реализация для ИП\"  , d.UF_CRM_1708334626443 \"Сумма штрафа\", d5.value as \"Процентная ставка ИП Список\" , d6.value \"Компания IC НДС/без НДС\" , d7.value as \"ИП НДС/Без НДС\" , d.UF_CRM_19_1712160694051 as \"Факт реализации\" , d.UF_CRM_1709731780880 as \"Доп. работы\" ,\n" +
                " d.UF_CRM_1711371065591 as \"Месяц начисления\" , d.UF_CRM_1707153235011 as \"Ответственное лицо ИП обновленное\" , d.UF_CRM_1712577743589  as \"Кол-во ОПУ\" , d.UF_CRM_1712743989071  \"Возврат долга\" ,c1.value \"Компания: Категория клиента\", d.external_id as \"Id\" from deal d  \n" +
                "                left join dealcategory_stage ds\n" +
                "                on d.stage_id = ds.status_id  \n" +
                "               left join \"user\" u \n" +
                "                on d.assigned_by_id = u.external_id::varchar\n" +
                "                left join company c \n" +
                "                on c.external_id::varchar = d.company_id \n" +
                "                left join deal_enum_UF_CRM_1712228470 d1\n" +
                "                on d1.external_id::varchar =d.uf_crm_1712228470\n" +
                "                left join deal_enum_UF_CRM_1708515537 d2\n" +
                "                on d2.external_id::varchar=d.UF_CRM_1708515537 \n" +
                "                left join deal_enum_UF_CRM_1707120091678 d3\n" +
                "                on d3.external_id::varchar=d.UF_CRM_1707120091678\n" +
                "                left join deal_enum_UF_CRM_1707153439 d4\n" +
                "                on d4.external_id::varchar=d.UF_CRM_1707153439\n" +
                "                left join deal_enum_UF_CRM_1708349381 d5 \n" +
                "               on d5.external_id::varchar = d.UF_CRM_1708349381\n" +
                "                left join deal_enum_UF_CRM_1708595011927 d6 \n" +
                "                on d6.external_id::varchar = d.UF_CRM_1708595011927\n" +
                "                left join deal_enum_UF_CRM_19_1712142579982 d7 \n" +
                "                on d7.external_id::varchar=d.UF_CRM_19_1712142579982\n" +
                "                left join company_enum_UF_CRM_1719220165391 c1\n" +
                "                on c1.external_id::varchar=c.UF_CRM_1719220165391\n";
        if ( count > 0) {
            sql += " limit " + count.toString();
        }
        return jdbcTemplate.query(
                sql,
                (rs, rowNum) ->
                        new ImplementationBi(
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
                                rs.getLong("Факт реализации"),
                                rs.getDouble("Доп. работы"),

                                rs.getString("Месяц начисления"),
                                rs.getString("Ответственное лицо ИП обновленное"),
                                rs.getInt("Кол-во ОПУ"),
                                rs.getDouble("Возврат долга"),
                                rs.getString("Компания: Категория клиента")
                        )
        );
    }

    public List<PayrollFundBi> getPayrollFundList(Integer count ) {

        String sql="select d.external_id  \"Id\",d.title \"Название сделки\", ds.\"name\" \"Стадия сделки\" , d.OPPORTUNITY  \"Сумма\" , d.currency_id \"Валюта\" , d.UF_CRM_1707146163970  \"Период начисления расхода\" ,\n" +
                "d1.value   \"Статья ФОТ\" , d2.value \"Подразделение\" from deal d\n" +
                "left join dealcategory_stage ds \n" +
                "on ds.status_id ::varchar= d.stage_id \n" +
                "left join deal_enum_UF_CRM_1707384877989 d1\n" +
                "on d1.external_id::varchar=d.UF_CRM_1707384877989\n" +
                "left join deal_enum_UF_CRM_1707385028092 d2 \n" +
                "on d2.external_id::varchar=d.UF_CRM_1707385028092 \n" +
                "where ds.\"name\" like '%Согласование%'";
        if ( count > 0) {
            sql += " limit " + count.toString();
        }
        return jdbcTemplate.query(sql,(rs, rowNum) ->
                new PayrollFundBi(rs.getInt("Id"),
                                rs.getString("Название сделки"),
                                rs.getString("Стадия сделки"),
                                rs.getDouble("Сумма"),
                                rs.getString("Валюта"),
                                rs.getString("Период начисления расхода"),
                                rs.getString("Статья ФОТ"),
                                rs.getString("Подразделение")
                ));

    }

    public List<InvoiceBi> getInvoicesList(Integer count) {
        String sql ="select d.external_id \"id\", d.title \"title\" , dt.value \"type\" , ds.\"name\" \"stage\",opportunity \"sum\" , d.currency_id \"cur\", concat(u.last_name , ' ' , u.\"name\") as  \"responsible\" , concat(u.last_name , ' ' , u.\"name\") as  \"author\" ,d.\"comments\" \"comment\" , d1.value \"expence_item\" \n" +
                ",d2.value \"ic_company\" ,d.UF_CRM_1707145101392 \"check\", d3.value \"type_product\" , d4.value \"accrual_article\" , d5.value \"in_budget\" , d6.value \"document\",\n" +
                "d.UF_CRM_1707146079310 \"supplier\" , d.UF_CRM_1707146135461 \"estimated_payment_date\" , d.UF_CRM_1707146163970 \"accrual_date\" , d.UF_CRM_1707452385 \"pay_for\" , d7.value \"project\" from deal d \n" +
                "left join deal_enum_uf_crm_type_id dt \n" +
                "on dt.external_id::varchar=d.uf_crm_type_id \n" +
                "left join dealcategory_stage ds \n" +
                "on ds.status_id::varchar= d.stage_id \n" +
                "left join \"user\" u \n" +
                "on d.assigned_by_id = u.external_id::varchar\n" +
                "left join deal_enum_UF_CRM_1713357357 d1\n" +
                "on d1.external_id::varchar =d.UF_CRM_1713357357\n" +
                "left join deal_enum_UF_CRM_1707120091678 d2 \n" +
                "on d2.external_id::varchar=d.UF_CRM_1707120091678\n" +
                "left join deal_enum_UF_CRM_1707145189813 d3\n" +
                "on d3.external_id::varchar=d.UF_CRM_1707145189813 \n" +
                "left join deal_enum_UF_CRM_1707145268405 d4 \n" +
                "on d4.external_id::varchar=d.UF_CRM_1707145268405\n" +
                "left join deal_enum_UF_CRM_1707145811011 d5 \n" +
                "on d5.external_id ::varchar=d.UF_CRM_1707145811011\n" +
                "left join deal_enum_UF_CRM_1707145947108 d6 \n" +
                "on d6.external_id ::varchar=d.UF_CRM_1707145947108\n" +
                "left join deal_enum_UF_CRM_1722921968 d7\n" +
                "on d7.external_id::varchar=d.UF_CRM_1722921968";
        if ( count > 0) {
            sql += " limit " + count.toString();
        }

        return jdbcTemplate.query(sql,(rs, rowNum) ->
                new InvoiceBi(rs.getInt(1),
                              rs.getString(2),
                              rs.getString(3),
                            rs.getString(4),
                            rs.getDouble(5),
                            rs.getString(6),
                            rs.getString(7),
                            rs.getString(8),
                            rs.getString(9),
                            rs.getString(10),
                            rs.getString(11),
                            rs.getString(12),
                            rs.getString(13),
                            rs.getString(14),
                            rs.getString(15),
                            rs.getString(16),
                            rs.getString(17),
                            rs.getString(18),
                            rs.getString(19),
                            rs.getString(20),
                            rs.getString(21)));
    }

    public String getDealAddress(String id){
        String sql="SELECT value as \"address\" FROM deal_enum_uf_crm_1708515537 where external_id="+id;
        String address=jdbcTemplate.queryForObject(sql,String.class);
        return address;
    }

    public Service getServiceInfo(String id ) throws EmptyResultDataAccessException {
        String sql="SELECT d.UF_CRM_1724236242 \"article\" , d.UF_CRM_1707724024179 as \"square\" ,d.UF_CRM_1709622025399 \"sum\", d2.value as \"nds\" , d3.value \"address\" from deal d \n" +
                "left join deal_enum_UF_CRM_1708595011927 d2\n" +
                "on convert(varchar(10),d2.external_id)=d.UF_CRM_1708595011927\n" +
                "left join deal_enum_uf_crm_1708515537 d3\n" +
                "on convert(varchar(10),d3.external_id)=d.uf_crm_1708515537\n" +
                "where d.external_id= "+id;
        System.out.println(sql);
        Service service= jdbcTemplate.queryForObject(sql, new ServiceMapper());
        return service;
    }

    public Map<String,Object> getCompaniesInfo() {
        String sql = "SELECT cast( dl.external_id as varchar) as external_id,ic.url FROM deal_enum_UF_CRM_1707120091678 dl \n" +
                " inner join ic_company_list ic \n" +
                " on dl.value =ic.company_name ";
        List<Map<String, Object>> mapList = jdbcTemplate.queryForList(sql);
        return mapList.stream().collect(Collectors.toMap(k -> (String) k.get("external_id"), k -> (String) k.get("url")));

    }
}



