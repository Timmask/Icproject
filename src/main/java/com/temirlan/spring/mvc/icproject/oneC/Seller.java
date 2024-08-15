package com.temirlan.spring.mvc.icproject.oneC;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Seller{
    public String address="";
    public String countryCode="";
    public String bank="";
    public String bik="";
    public String certificateNum="";
    public String certificateSeries="";
    public String iik;
    public boolean isBranchNonResident=false;
    public String kbe="";
    public String name="";
    public String tin="";

}
