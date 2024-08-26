package com.temirlan.spring.mvc.icproject.pojo;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class InvoiceBi {
    private Integer id;
    private String title;
    private String type;
    private String stage;
    private Double sum;
    private String currency;
    private String responsible;
    private String author;
    private String comment;
    private String expenceItem;
    private String icCompany;
    private String check;
    private String typeProduct;
    private String accrualArticle;
    private String inBudget;
    private String document;
    private String supplier;
    private String estimatedPaymentDate;
    private String accrualDate;
    private String payFor;
    private String project;

    public InvoiceBi(Integer id, String title, String type, String stage, Double sum, String currency, String responsible, String author, String comment, String expenceItem, String icCompany, String check, String typeProduct, String accrualArticle, String inBudget, String document, String supplier, String estimatedPaymentDate, String accrualDate, String payFor, String project) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.stage = stage;
        this.sum = sum;
        this.currency = currency;
        this.responsible = responsible;
        this.author = author;
        this.comment = comment;
        this.expenceItem = expenceItem;
        this.icCompany = icCompany;
        this.check = check;
        this.typeProduct = typeProduct;
        this.accrualArticle = accrualArticle;
        this.inBudget = inBudget;
        this.document = document;
        this.supplier = supplier;
        this.estimatedPaymentDate = estimatedPaymentDate;
        this.accrualDate = accrualDate;
        this.payFor = payFor;
        this.project = project;
    }
}
