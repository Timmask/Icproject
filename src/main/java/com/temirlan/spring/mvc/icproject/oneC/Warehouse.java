package com.temirlan.spring.mvc.icproject.oneC;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Warehouse {
    private String id;
    private String name;
    public Warehouse(){
        this.id="";
        this.name="";
    }
}
