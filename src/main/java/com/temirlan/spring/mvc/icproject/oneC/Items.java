package com.temirlan.spring.mvc.icproject.oneC;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor

public class Items {
    private ArrayList<Product> products;
    private ArrayList<Service> services;
    public Items(){
        this.products = new ArrayList<>();
        this.services = new ArrayList<>();
    }
}
