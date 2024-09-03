package com.temirlan.spring.mvc.icproject;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;
import java.time.Instant;

@Getter
@Setter
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

    
    
    @Column(name = "parent_id_132")
    private String parentId132;

    
    
    @Column(name = "parent_id_1036")
    private String parentId1036;

    
    
    @Column(name = "parent_id_1040")
    private String parentId1040;

    
    
    @Column(name = "parent_id_1046")
    private String parentId1046;

    @Column(name = "last_activity_time")
    private Instant lastActivityTime;

    
    
    @Column(name = "last_activity_by")
    private String lastActivityBy;

    
    
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

    
    
    @Column(name = "uf_crm_1707153439")
    private String ufCrm1707153439;

    @Column(name = "uf_crm_1707153772096")
    private Double ufCrm1707153772096;

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

    
    
    @Column(name = "uf_crm_1717411114268")
    private String ufCrm1717411114268;

    
    
    @Column(name = "uf_crm_1719824872888")
    private String ufCrm1719824872888;

    
    
    @Column(name = "uf_crm_1722921968")
    private String ufCrm1722921968;

    
    
    @Column(name = "uf_crm_1723179741523")
    private String ufCrm1723179741523;

    
    
    @Column(name = "uf_crm_1723444589386")
    private String ufCrm1723444589386;

    
    
    @Column(name = "uf_crm_1723523640792")
    private String ufCrm1723523640792;

    
    
    @Column(name = "uf_crm_1724137625749")
    private String ufCrm1724137625749;

    
    
    @Column(name = "uf_crm_1724236125")
    private String ufCrm1724236125;

    
    
    @Column(name = "uf_crm_1724236164")
    private String ufCrm1724236164;

    
    
    @Column(name = "uf_crm_1724236242")
    private String ufCrm1724236242;

    
    
    @Column(name = "uf_crm_1724323006867")
    private String ufCrm1724323006867;

    
    
    @Column(name = "uf_crm_1724323019212")
    private String ufCrm1724323019212;

    @Column(name = "uf_crm_1724323806918")
    private Instant ufCrm1724323806918;

    @Column(name = "uf_crm_1724324415114")
    private Instant ufCrm1724324415114;

    
    
    @Column(name = "uf_crm_1724330187490")
    private String ufCrm1724330187490;

    
    
    @Column(name = "uf_crm_1724330205937")
    private String ufCrm1724330205937;

    
    
    @Column(name = "uf_crm_1724330225119")
    private String ufCrm1724330225119;

    
    
    @Column(name = "uf_crm_1724330236979")
    private String ufCrm1724330236979;

    
    
    @Column(name = "uf_crm_1724330701844")
    private String ufCrm1724330701844;

    
    
    @Column(name = "uf_crm_1724330724347")
    private String ufCrm1724330724347;

    
    
    @Column(name = "uf_crm_1724330743168")
    private String ufCrm1724330743168;

    
    
    @Column(name = "uf_crm_1724330780077")
    private String ufCrm1724330780077;

    
    
    @Column(name = "uf_crm_1724330794391")
    private String ufCrm1724330794391;

    
    
    @Column(name = "uf_crm_1724330813063")
    private String ufCrm1724330813063;

    
    
    @Column(name = "uf_crm_1724390180065")
    private String ufCrm1724390180065;

    
    
    @Column(name = "uf_crm_1724390195048")
    private String ufCrm1724390195048;

    
    
    @Column(name = "uf_crm_1724390209226")
    private String ufCrm1724390209226;

    
    
    @Column(name = "uf_crm_1724390605256")
    private String ufCrm1724390605256;

    
    
    @Column(name = "uf_crm_1724406178687")
    private String ufCrm1724406178687;

    
    
    @Column(name = "uf_crm_1724406480918")
    private String ufCrm1724406480918;

    
    
    @Column(name = "uf_crm_1724695164561")
    private String ufCrm1724695164561;

    
    
    @Column(name = "uf_crm_1724821296881")
    private String ufCrm1724821296881;

    
    
    @Column(name = "uf_crm_1724930009099")
    private String ufCrm1724930009099;

    
    
    @Column(name = "uf_crm_19_1712141587575")
    private String ufCrm191712141587575;

    
    
    @Column(name = "uf_crm_a_t_group_id")
    private String ufCrmATGroupId;

    
    
    @Column(name = "uf_crm_probability")
    private String ufCrmProbability;

    
    
    @Column(name = "uf_crm_19_1712141507808")
    private String ufCrm191712141507808;

    
    
    @Column(name = "uf_crm_xml_id")
    private String ufCrmXmlId;

    @Column(name = "uf_crm_19_1712141643098")
    private Instant ufCrm191712141643098;

    @Column(name = "uf_crm_19_1712142270090")
    private Instant ufCrm191712142270090;

    @Column(name = "uf_crm_date_modify")
    private Instant ufCrmDateModify;

    @Column(name = "uf_crm_event_date")
    private Instant ufCrmEventDate;

    @Column(name = "uf_crm_date_create")
    private Instant ufCrmDateCreate;

    
    
    @Column(name = "uf_crm_19_1712141810001")
    private String ufCrm191712141810001;

    
    
    @Column(name = "uf_crm_1708060379106")
    private String ufCrm1708060379106;

    
    
    @Column(name = "uf_crm_source_description")
    private String ufCrmSourceDescription;

    @Column(name = "uf_crm_order_ids")
    private Double ufCrmOrderIds;

    
    
    @Column(name = "uf_crm_19_1712142579982")
    private String ufCrm191712142579982;

    
    
    @Column(name = "uf_crm_source_id")
    private String ufCrmSourceId;

    
    
    @Column(name = "uf_crm_tracking_source_id")
    private String ufCrmTrackingSourceId;

    
    
    @Column(name = "uf_crm_modify_by_id")
    private String ufCrmModifyById;

    
    
    @Column(name = "uf_crm_updated_by")
    private String ufCrmUpdatedBy;

    
    
    @Column(name = "uf_crm_last_activity_by")
    private String ufCrmLastActivityBy;

    
    
    @Column(name = "uf_crm_moved_by")
    private String ufCrmMovedBy;

    
    
    @Column(name = "uf_crm_created_by")
    private String ufCrmCreatedBy;

    @Column(name = "uf_crm_updated_time")
    private Instant ufCrmUpdatedTime;

    @Column(name = "uf_crm_moved_time")
    private Instant ufCrmMovedTime;

    @Column(name = "uf_crm_created_time")
    private Instant ufCrmCreatedTime;

    
    
    @Column(name = "uf_crm_originator_id")
    private String ufCrmOriginatorId;

    @Column(name = "uf_crm_1710487916092")
    private Double ufCrm1710487916092;

    
    
    @Column(name = "uf_crm_19_1712141660")
    private String ufCrm191712141660;

    
    
    @Column(name = "uf_crm_19_1712141754")
    private String ufCrm191712141754;

    
    
    @Column(name = "uf_crm_comments")
    private String ufCrmComments;

    
    
    @Column(name = "uf_crm_19_1712217371209")
    private String ufCrm191712217371209;

    
    
    @Column(name = "uf_crm_19_1712142547310")
    private String ufCrm191712142547310;

    @Column(name = "uf_crm_lead_id")
    private Double ufCrmLeadId;

    
    
    @Column(name = "uf_crm_19_1712141559041")
    private String ufCrm191712141559041;

    
    
    @Column(name = "uf_crm_1707153679546")
    private String ufCrm1707153679546;

    
    
    @Column(name = "uf_crm_1708669679267")
    private String ufCrm1708669679267;

    
    
    @Column(name = "uf_crm_19_1712141831046")
    private String ufCrm191712141831046;

    
    
    @Column(name = "uf_crm_19_1712141845465")
    private String ufCrm191712141845465;

    
    
    @Column(name = "uf_crm_19_1714638886241")
    private String ufCrm191714638886241;

    
    
    @Column(name = "uf_crm_event_description")
    private String ufCrmEventDescription;

    @Column(name = "uf_crm_is_return_customer")
    private Boolean ufCrmIsReturnCustomer;

    @Column(name = "uf_crm_is_repeated_approach")
    private Boolean ufCrmIsRepeatedApproach;

    
    
    @Column(name = "uf_crm_origin_id")
    private String ufCrmOriginId;

    @Column(name = "uf_crm_last_activity_time")
    private Instant ufCrmLastActivityTime;

    
    
    @Column(name = "uf_crm_previous_stage_id")
    private String ufCrmPreviousStageId;

    
    
    @Column(name = "uf_crm_1707145551")
    private String ufCrm1707145551;

    
    
    @Column(name = "uf_crm_19_1712142493117")
    private String ufCrm191712142493117;

    
    
    @Column(name = "uf_crm_mycompany_id")
    private String ufCrmMycompanyId;

    
    
    @Column(name = "uf_crm_19_1712141726104")
    private String ufCrm191712141726104;

    @Column(name = "uf_crm_is_manual_opportunity")
    private Boolean ufCrmIsManualOpportunity;

    
    
    @Column(name = "uf_crm_parent_id_2")
    private String ufCrmParentId2;

    @Column(name = "uf_crm_closed")
    private Boolean ufCrmClosed;

    
    
    @Column(name = "uf_crm_created_by_id")
    private String ufCrmCreatedById;

    @Column(name = "uf_crm_19_1712141624452")
    private Double ufCrm191712141624452;

    @Column(name = "uf_crm_tax_value")
    private Double ufCrmTaxValue;

    @Column(name = "uf_crm_tax_value_account")
    private Double ufCrmTaxValueAccount;

    @Column(name = "uf_crm_1710488751776")
    private Double ufCrm1710488751776;

    
    
    @Column(name = "uf_crm_type_id")
    private String ufCrmTypeId;

    
    
    @Column(name = "uf_crm_19_1712062072500")
    private String ufCrm191712062072500;

    
    
    @Column(name = "uf_crm_event_id")
    private String ufCrmEventId;

    
    
    @Column(name = "uf_crm_1708061198")
    private String ufCrm1708061198;

    
    
    @Column(name = "uf_crm_1708061134")
    private String ufCrm1708061134;

    
    
    @Column(name = "uf_crm_1708060868")
    private String ufCrm1708060868;

    
    
    @Column(name = "uf_crm_19_1712825479173")
    private String ufCrm191712825479173;

    
    
    @Column(name = "uf_crm_1708060402635")
    private String ufCrm1708060402635;

    
    
    @Column(name = "uf_crm_qwe")
    private String ufCrmQwe;

    
    
    @Column(name = "uf_crm_asd2131")
    private String ufCrmAsd2131;

}