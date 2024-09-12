package com.temirlan.spring.mvc.icproject.mapper;


import com.temirlan.spring.mvc.icproject.oneC.Consignee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsigneeMapper implements RowMapper<Consignee> {

    @Override
    public Consignee mapRow(ResultSet rs, int rowNum) throws SQLException {
        String name =rs.getString("name");
        String tin=rs.getString("tin");
        return new Consignee(name,tin);
    }
}
