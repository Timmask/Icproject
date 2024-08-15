package com.temirlan.spring.mvc.icproject.repository;

import com.temirlan.spring.mvc.icproject.oneC.Consignee;
import com.temirlan.spring.mvc.icproject.oneC.ConsigneeData;
import com.temirlan.spring.mvc.icproject.oneC.Consignor;

import java.util.List;
import java.util.Map;

public interface JDBCRepository {

    public Consignee getConsigneeInfo(String id);

    public Consignor getConsignorInfo(String id);
}
