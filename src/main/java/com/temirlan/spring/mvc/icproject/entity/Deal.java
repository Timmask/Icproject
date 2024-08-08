package com.temirlan.spring.mvc.icproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "deal")
public class Deal {
    @Id
    @Column(name = "external_id")
    private Integer externalId;

    @Column(name = "deleted")
    private Boolean deleted;

    @Column(name = "title")
    private String title;

    @Column(name = "type_id")
    private String typeId;

    @Column(name = "category_id")
    private String categoryId;

    @Column(name = "stage_id")
    private String stageId;

    @Column(name = "stage_semantic_id")
    private String stageSemanticId;

    @Column(name = "is_new")
    private String isNew;


    @Column(name = "is_recurring")
    private String isRecurring;


    @Column(name = "is_return_customer")
    private String isReturnCustomer;

    @Column(name = "is_repeated_approach")
    private String isRepeatedApproach;

    @Column(name = "probability")
    private Double probability;

    
    
    @Column(name = "currency_id")
    private String currencyId;

    @Column(name = "opportunity")
    private Double opportunity;

    
    
    @Column(name = "is_manual_opportunity")
    private String isManualOpportunity;

    @Column(name = "tax_value")
    private Double taxValue;

    
    
    @Column(name = "company_id")
    private String companyId;

    
    
    @Column(name = "contact_id")
    private String contactId;

    
    
    @Column(name = "contact_ids")
    private String contactIds;

    
    
    @Column(name = "quote_id")
    private String quoteId;

    @Column(name = "begindate")
    private Instant begindate;

    @Column(name = "closedate")
    private Instant closedate;

    
    
    @Column(name = "opened")
    private String opened;

    
    
    @Column(name = "closed")
    private String closed;

    
    
    @Column(name = "comments")
    private String comments;

    
    
    @Column(name = "assigned_by_id")
    private String assignedById;

    
    
    @Column(name = "created_by_id")
    private String createdById;

    
    
    @Column(name = "modify_by_id")
    private String modifyById;

    
    
    @Column(name = "moved_by_id")
    private String movedById;

    @Column(name = "date_create")
    private Instant dateCreate;

    @Column(name = "date_modify")
    private Instant dateModify;

    @Column(name = "moved_time")
    private Instant movedTime;

    
    
    @Column(name = "source_id")
    private String sourceId;

    
    
    @Column(name = "source_description")
    private String sourceDescription;

    
    
    @Column(name = "lead_id")
    private String leadId;

    
    
    @Column(name = "additional_info")
    private String additionalInfo;

    
    
    @Column(name = "location_id")
    private String locationId;

    
    
    @Column(name = "originator_id")
    private String originatorId;

    
    
    @Column(name = "origin_id")
    private String originId;

    
    
    @Column(name = "utm_source")
    private String utmSource;

    
    
    @Column(name = "utm_medium")
    private String utmMedium;

    
    
    @Column(name = "utm_campaign")
    private String utmCampaign;

    
    
    @Column(name = "utm_content")
    private String utmContent;

    
    
    @Column(name = "utm_term")
    private String utmTerm;

    @Column(name = "last_activity_time")
    private Instant lastActivityTime;

    
    
    @Column(name = "last_activity_by")
    private String lastActivityBy;

    
    
    @Column(name = "parent_id_132")
    private String parentId132;

    
    
    @Column(name = "uf_crm_1712228470")
    private String ufCrm1712228470;

    
    
    @Column(name = "uf_crm_1713357357")
    private String ufCrm1713357357;

    
    
    @Column(name = "uf_crm_1707143286")
    private String ufCrm1707143286;

    
    
    @Column(name = "uf_crm_1708515537")
    private String ufCrm1708515537;

    
    
    @Column(name = "uf_crm_1630408732647")
    private String ufCrm1630408732647;

    
    
    @Column(name = "uf_crm_1659931017")
    private String ufCrm1659931017;

    
    
    @Column(name = "uf_crm_1665576409095")
    private String ufCrm1665576409095;

    @Column(name = "uf_crm_1695724850752")
    private Instant ufCrm1695724850752;

    
    
    @Column(name = "uf_crm_1705309507766")
    private String ufCrm1705309507766;

    
    
    @Column(name = "uf_crm_1707119719817")
    private String ufCrm1707119719817;

    
    
    @Column(name = "uf_crm_1707119819982")
    private String ufCrm1707119819982;

    
    
    @Column(name = "uf_crm_1707119880366")
    private String ufCrm1707119880366;

    
    
    @Column(name = "uf_crm_1707120091678")
    private String ufCrm1707120091678;

    @Column(name = "uf_crm_1707127406194")
    private Instant ufCrm1707127406194;

    @Column(name = "uf_crm_1707128138863")
    private Instant ufCrm1707128138863;

    
    
    @Column(name = "uf_crm_1707145101392")
    private String ufCrm1707145101392;

    
    
    @Column(name = "uf_crm_1707145189813")
    private String ufCrm1707145189813;

    
    
    @Column(name = "uf_crm_1707145268405")
    private String ufCrm1707145268405;

    
    
    @Column(name = "uf_crm_1707145551")
    private String ufCrm1707145551;

    
    
    @Column(name = "uf_crm_1707145811011")
    private String ufCrm1707145811011;

    
    
    @Column(name = "uf_crm_1707145947108")
    private String ufCrm1707145947108;

    
    
    @Column(name = "uf_crm_1707146079310")
    private String ufCrm1707146079310;

    @Column(name = "uf_crm_1707146135461")
    private Instant ufCrm1707146135461;

    @Column(name = "uf_crm_1707146163970")
    private Instant ufCrm1707146163970;

    
    
    @Column(name = "uf_crm_1707146242324")
    private String ufCrm1707146242324;

    @Column(name = "uf_crm_1707147038325")
    private Double ufCrm1707147038325;

    
    
    @Column(name = "uf_crm_1707147104917")
    private String ufCrm1707147104917;

    
    
    @Column(name = "uf_crm_1707149878937")
    private String ufCrm1707149878937;

    
    
    @Column(name = "uf_crm_1707150031009")
    private String ufCrm1707150031009;

    
    
    @Column(name = "uf_crm_1707152276017")
    private String ufCrm1707152276017;

    @Column(name = "uf_crm_1707152367859")
    private Double ufCrm1707152367859;

    @Column(name = "uf_crm_1707152404406")
    private Instant ufCrm1707152404406;

    
    
    @Column(name = "uf_crm_1707153216673")
    private String ufCrm1707153216673;

    
    
    @Column(name = "uf_crm_1707153235011")
    private String ufCrm1707153235011;

    
    
    @Column(name = "uf_crm_1707153439")
    private String ufCrm1707153439;

    
    
    @Column(name = "uf_crm_1707153679546")
    private String ufCrm1707153679546;

    @Column(name = "uf_crm_1707153772096")
    private Double ufCrm1707153772096;

    
    
    @Column(name = "uf_crm_1707154575")
    private String ufCrm1707154575;

    @Column(name = "uf_crm_1707155031500")
    private Instant ufCrm1707155031500;

    @Column(name = "uf_crm_1707156037963")
    private Double ufCrm1707156037963;

    
    
    @Column(name = "uf_crm_1707156069398")
    private String ufCrm1707156069398;

    
    
    @Column(name = "uf_crm_1707297535")
    private String ufCrm1707297535;

    
    
    @Column(name = "uf_crm_1707382738")
    private String ufCrm1707382738;

    
    
    @Column(name = "uf_crm_1707384877989")
    private String ufCrm1707384877989;

    
    
    @Column(name = "uf_crm_1707385028092")
    private String ufCrm1707385028092;

    
    
    @Column(name = "uf_crm_1707451667")
    private String ufCrm1707451667;

    
    
    @Column(name = "uf_crm_1707452385")
    private String ufCrm1707452385;

    
    
    @Column(name = "uf_crm_1707476888923")
    private String ufCrm1707476888923;

    
    
    @Column(name = "uf_crm_1707723919930")
    private String ufCrm1707723919930;

    @Column(name = "uf_crm_1707724024179")
    private Double ufCrm1707724024179;

    
    
    @Column(name = "uf_crm_1707728528")
    private String ufCrm1707728528;

    
    
    @Column(name = "uf_crm_1707800037114")
    private String ufCrm1707800037114;

    
    
    @Column(name = "uf_crm_1707895852370")
    private String ufCrm1707895852370;

    
    
    @Column(name = "uf_crm_1707895967501")
    private String ufCrm1707895967501;

    @Column(name = "uf_crm_1708313343142")
    private Double ufCrm1708313343142;

    @Column(name = "uf_crm_1708321214833")
    private Double ufCrm1708321214833;

    @Column(name = "uf_crm_1708334626443")
    private Double ufCrm1708334626443;

    
    
    @Column(name = "uf_crm_1708349381")
    private String ufCrm1708349381;

    @Column(name = "uf_crm_1708516243819")
    private Boolean ufCrm1708516243819;

    
    
    @Column(name = "uf_crm_1708516309036")
    private String ufCrm1708516309036;

    @Column(name = "uf_crm_1708517051530")
    private Double ufCrm1708517051530;

    
    
    @Column(name = "uf_crm_1708518301")
    private String ufCrm1708518301;

    
    
    @Column(name = "uf_crm_1708595011927")
    private String ufCrm1708595011927;

    
    
    @Column(name = "uf_crm_1709011170300")
    private String ufCrm1709011170300;

    @Column(name = "uf_crm_1709622025399")
    private Double ufCrm1709622025399;

    @Column(name = "uf_crm_1709731780880")
    private Double ufCrm1709731780880;

    @Column(name = "uf_crm_1710223597123")
    private Double ufCrm1710223597123;

    
    
    @Column(name = "uf_crm_1710224893957")
    private String ufCrm1710224893957;

    @Column(name = "uf_crm_1711371065591")
    private Instant ufCrm1711371065591;

    
    
    @Column(name = "uf_crm_1711523487508")
    private String ufCrm1711523487508;

    @Column(name = "uf_crm_1711711756588")
    private Instant ufCrm1711711756588;

    
    
    @Column(name = "uf_crm_1712228861")
    private String ufCrm1712228861;

    
    
    @Column(name = "uf_crm_a_w_group_id")
    private String ufCrmAWGroupId;

    
    
    @Column(name = "uf_crm_a_t_group_id")
    private String ufCrmATGroupId;

    @Column(name = "uf_crm_1712577743589")
    private Double ufCrm1712577743589;

    @Column(name = "uf_crm_1712743989071")
    private Double ufCrm1712743989071;

    @Column(name = "uf_crm_1712812589150")
    private Boolean ufCrm1712812589150;

    @Column(name = "uf_crm_1713336354101")
    private Double ufCrm1713336354101;

    @Column(name = "uf_crm_1713356145130")
    private Double ufCrm1713356145130;

    
    
    @Column(name = "uf_crm_1713935333604")
    private String ufCrm1713935333604;

    
    
    @Column(name = "uf_crm_1714037495819")
    private String ufCrm1714037495819;

    @Column(name = "uf_crm_1714037563801")
    private Instant ufCrm1714037563801;

    @Column(name = "uf_crm_1714981505052")
    private Instant ufCrm1714981505052;

    
    
    @Column(name = "uf_crm_1715750633024")
    private String ufCrm1715750633024;

    @Column(name = "uf_crm_1715751455743")
    private Instant ufCrm1715751455743;

    
    
    @Column(name = "uf_crm_1715751549293")
    private String ufCrm1715751549293;

    
    
    @Column(name = "uf_crm_1716804439763")
    private String ufCrm1716804439763;

    
    
    @Column(name = "uf_crm_1716804677915")
    private String ufCrm1716804677915;

    
    
    @Column(name = "uf_crm_1716891180821")
    private String ufCrm1716891180821;

    
    
    @Column(name = "uf_crm_1716980441923")
    private String ufCrm1716980441923;

    
    
    @Column(name = "uf_crm_1717411114268")
    private String ufCrm1717411114268;

    
    
    @Column(name = "uf_crm_6661639123b1e")
    private String ufCrm6661639123b1e;

    
    
    @Column(name = "uf_crm_666163914abe1")
    private String ufCrm666163914abe1;

    
    
    @Column(name = "uf_crm_666163924e9ba")
    private String ufCrm666163924e9ba;

    
    
    @Column(name = "uf_crm_666163925df88")
    private String ufCrm666163925df88;

    
    
    @Column(name = "uf_crm_666163926ae05")
    private String ufCrm666163926ae05;

    
    
    @Column(name = "uf_crm_6661639277ed4")
    private String ufCrm6661639277ed4;

    
    
    @Column(name = "uf_crm_66616392862d5")
    private String ufCrm66616392862d5;

    
    
    @Column(name = "parent_id_1032")
    private String parentId1032;

    
    
    @Column(name = "uf_crm_1718885974")
    private String ufCrm1718885974;

    
    
    @Column(name = "uf_crm_1719824872888")
    private String ufCrm1719824872888;

}