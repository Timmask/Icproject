package com.temirlan.spring.mvc.icproject.repository;

import com.temirlan.spring.mvc.icproject.oneC.Consignee;
import com.temirlan.spring.mvc.icproject.oneC.Consignor;
import com.temirlan.spring.mvc.icproject.oneC.Service;
import java.util.Map;

public interface JDBCRepository {
    public Consignee getConsigneeInfo(String id);
    public Consignor getConsignorInfo(String id);
    public Service getServiceInfo(String id );
    public Map<String,Object> getCompaniesInfo();
    public String getDealService(String id);
}
