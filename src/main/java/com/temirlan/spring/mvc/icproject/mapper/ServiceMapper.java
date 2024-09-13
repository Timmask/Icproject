package com.temirlan.spring.mvc.icproject.mapper;

import com.temirlan.spring.mvc.icproject.Operations;
import com.temirlan.spring.mvc.icproject.oneC.Service;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceMapper implements RowMapper<Service> {


    private Operations operations=new Operations();

    @Override
    public Service mapRow(ResultSet rs, int rowNum) throws SQLException {
        String art=rs.getString("article") != null ? rs.getString("article") : "0002";
        String isNds=rs.getString("nds") != null ? rs.getString("nds") : "НДС";
        String sumStr=rs.getString("sum") != null ? rs.getString("sum") : "1";
        String squareStr=rs.getString("square") != null ? rs.getString("square") : "1";
        String address=rs.getString("address");
        String service=rs.getString("service_name");
        String month=rs.getString("month");
        String description=service+" \n "+address + " за "+ operations.getCalendarMonth(month);
        return new Service(art ,sumStr,squareStr,description,isNds,service);
    }
}
