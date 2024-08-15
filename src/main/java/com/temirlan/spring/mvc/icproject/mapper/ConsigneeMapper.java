package com.temirlan.spring.mvc.icproject.mapper;


import com.temirlan.spring.mvc.icproject.oneC.Consignee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsigneeMapper implements RowMapper<Consignee> {

    @Override
    public Consignee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Consignee consignee=new Consignee();
        consignee.setName(rs.getString("name"));
        consignee.setTin(rs.getString("tin"));
        return consignee;
    }
}
