package com.temirlan.spring.mvc.icproject.pojo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ImplementationBi {
    private Integer id;
    private String stage;
    private Double opportunity;
    private String currency;
    private String userName;
    private String companyName;
    private String ipName;
    private String address;
    private String companyExecutor;
    private Double percentRate;
    private String city;
    private Double area;
    private Double sumContract;
    private Double salesForIp;
    private Double fine;
    private String ndsIcCompany;
    private String ndsIpCompany;
    private Long salesFact;
    private Double addWork;
    private String monthOfAccruals;
    private String responsiblePerson;
    private Integer countOpu;
    private Double returnDuty;
    private String clientCategory;

    public ImplementationBi(Integer id, String stage, Double opportunity, String currency, String userName, String companyName, String ipName, String address, String companyExecutor, Double percentRate, String city, Double area, Double sumContract, Double salesForIp, Double fine, String ndsIcCompany, String ndsIpCompany, Long salesFact, Double addWork, String monthOfAccruals, String responsiblePerson, Integer countOpu, Double returnDuty, String clientCategory) {
        this.id = id;
        this.stage = stage;
        this.opportunity = opportunity;
        this.currency = currency;
        this.userName = userName;
        this.companyName = companyName;
        this.ipName = ipName;
        this.address = address;
        this.companyExecutor = companyExecutor;
        this.percentRate = percentRate;
        this.city = city;
        this.area = area;
        this.sumContract = sumContract;
        this.salesForIp = salesForIp;
        this.fine = fine;
        this.ndsIcCompany = ndsIcCompany;
        this.ndsIpCompany = ndsIpCompany;
        this.salesFact = salesFact;
        this.addWork = addWork;
        this.monthOfAccruals = monthOfAccruals;
        this.responsiblePerson = responsiblePerson;
        this.countOpu = countOpu;
        this.returnDuty = returnDuty;
        this.clientCategory = clientCategory;
    }
}