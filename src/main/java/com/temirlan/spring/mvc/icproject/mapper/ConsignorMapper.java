package com.temirlan.spring.mvc.icproject.mapper;

import com.temirlan.spring.mvc.icproject.oneC.Consignor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsignorMapper implements RowMapper<Consignor> {

    @Override
    public Consignor mapRow(ResultSet rs, int rowNum) throws SQLException {
        Consignor consignor=new Consignor();
        consignor.setName(rs.getString("name"));
        consignor.setTin(rs.getString("tin"));
        return consignor;
    }
}
