package com.temirlan.spring.mvc.icproject.oneC;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Consignor {
    private String address;
    private String countryCode;
    private String name;
    private String tin;

    public Consignor(String name, String tin) {
        this.name = name;
        this.tin = tin;
    }
}
