package com.temirlan.spring.mvc.icproject.mapper;

import com.temirlan.spring.mvc.icproject.oneC.Consignor;
import com.temirlan.spring.mvc.icproject.oneC.Service;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceMapper implements RowMapper<Service> {
    @Override
    public Service mapRow(ResultSet rs, int rowNum) throws SQLException {
        String art=rs.getString("article") != null ? rs.getString("article") : "0002";
        String isNds=rs.getString("nds") != null ? rs.getString("nds") : "НДС";
        String sumStr=rs.getString("sum") != null ? rs.getString("sum") : "1";
        String squareStr=rs.getString("square") != null ? rs.getString("square") : "1";
        String address=rs.getString("address");

        return new Service(art ,sumStr,squareStr,address,isNds);
    }
}
