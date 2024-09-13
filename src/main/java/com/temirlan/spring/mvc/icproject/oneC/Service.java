package com.temirlan.spring.mvc.icproject.oneC;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="service")
public class Service {
    @Id
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public Integer id;

    @Column(name="article")
    public String article;
    @Column(name="name")
    public String name;
    @Column(name="description")
    public String description;
    @Column(name="nds_amount")
    public String ndsAmount;
    @Column(name="nds_rate")
    public String ndsRate;
    @Column(name="price_with_tax")
    public String priceWithTax;
    @Column(name="price_without_tax")
    public String priceWithoutTax;
    @Column(name="quantity")
    public String quantity;
    @Column(name="turnover_size")
    public String turnoverSize;
    @Column(name="unit_code")
    public String unitCode;
    @Column(name="unit_nomenclature")
    public String unitNomenclature;
    @Column(name="unit_price")
    public String unitPrice;

    public Service(String article, String priceWithoutTax, String quantity, String description,String isNds,String name) {
        Double sum= Double.valueOf(priceWithoutTax);
        Double square  = Double.valueOf(quantity);
        Double unitPrice=sum/square;
        Double sumtax=sum;
        String nds="0";
        Double ndsAmount=0.0;
        if(isNds.equals("НДС")){
            sumtax=sum*0.88;
            nds="12";
            ndsAmount=sum*0.12;
        }
        this.article = article;
        this.priceWithTax=sum.toString();
        this.priceWithoutTax=sumtax.toString();
        this.quantity = quantity;
        this.ndsAmount=ndsAmount.toString();
        this.ndsRate=nds;
        this.turnoverSize=sumtax.toString();
        this.unitCode="6208601100";
        this.unitNomenclature="услуга";
        this.unitPrice=unitPrice.toString();
        this.description = description;

    }
}
