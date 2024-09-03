package com.temirlan.spring.mvc.icproject.mapper;

import com.temirlan.spring.mvc.icproject.oneC.Consignor;
import com.temirlan.spring.mvc.icproject.oneC.Service;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceMapper implements RowMapper<Service> {
    @Override
    public Service mapRow(ResultSet rs, int rowNum) throws SQLException {
        Service service=new Service();
        service.setArticle(rs.getString("article"));
        String isNds=rs.getString("nds");
        Double sum= Double.valueOf(rs.getString("sum"));
        Double square  = Double.valueOf(rs.getString("square"));
        Double unitPrice=sum/square;
        Double sumtax=sum;
        String nds="0";
        Double ndsAmount=0.0;
        if(isNds.equals("НДС")){
            sumtax=sum*0.88;
            nds="12";
            ndsAmount=sum*0.12;
        }
        service.setPriceWithTax(sum.toString());
        service.setPriceWithoutTax(sumtax.toString() );
        service.setQuantity(square.toString());
        service.setNdsAmount(ndsAmount.toString());
        service.setNdsRate(nds);
        service.setPriceWithTax(sum.toString());
        service.setTurnoverSize(sumtax.toString());
        service.setUnitCode("6208601100");
        service.setUnitNomenclature("услуга");
        service.setUnitPrice(unitPrice.toString());
        service.setDescription(rs.getString("address"));
        return service;
    }
}
