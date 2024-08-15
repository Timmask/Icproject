package com.temirlan.spring.mvc.icproject.oneC;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

@AllArgsConstructor
public class Invoice {
    private String invoiceType;
    private String ver;
    private String created_at;
    private String num;
    private String operatorFullname;
    private String currencyCode;
    private String сomments;
    private Consignee consignee;
    private Consignor consignor;
    private Customer customer;
    private DeliveryTerm deliveryTerm;
    private Seller seller;
    private Items items;

    public Invoice() {
        this.invoiceType="ORDINARY_INVOICE";
        this.ver="v2.0";
        this.created_at=new Date().toString();
        this.num="00000013807";
        this.currencyCode="KZT";
        this.items=new Items();
        this.customer=new Customer();
        this.deliveryTerm=new DeliveryTerm();
        this.seller=new Seller();

    }
}
