package com.temirlan.spring.mvc.icproject.pojo;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class PayrollFundBi {
    private Integer id;
    private String title;
    private String stage;
    private Double realization;
    private String currency;
    private String periodOfAccrual;
    private String payrollFundArticle;
    private String subdivision;

    public PayrollFundBi(Integer id, String title, String stage, Double realization, String currency, String periodOfAccrual, String payrollFundArticle, String subdivision) {
        this.id = id;
        this.title = title;
        this.stage = stage;
        this.realization = realization;
        this.currency = currency;
        this.periodOfAccrual = periodOfAccrual;
        this.payrollFundArticle = payrollFundArticle;
        this.subdivision = subdivision;
    }
}
