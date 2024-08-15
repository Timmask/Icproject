package com.temirlan.spring.mvc.icproject.oneC;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryTerm{
    public String contractDate="";
    public String contractNum="";
    public String contractName="";
    public String deliveryConditionCode="";
    public String destination="";
    public boolean hasContract=false;
    public String term="";
    public String transportTypeCode="";
}
