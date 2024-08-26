package com.temirlan.spring.mvc.icproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

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
    private Integer ID;

    @Column(name = "deleted")
    private Boolean DELETED;

    @Column(name = "title")
    private String TITLE;

    @Column(name = "type_id")
    private String TYPE_ID;

    @Column(name = "category_id")
    private String CATEGORY_ID;

    @Column(name = "stage_id")
    private String STAGE_ID;

    @Column(name = "stage_semantic_id")
    private String STAGE_SEMANTIC_ID;

    @Column(name = "is_new")
    private String IS_NEW;


    @Column(name = "is_recurring")
    private String IS_RECURRING;


    @Column(name = "is_return_customer")
    private String IS_RETURN_CUSTOMER;

    @Column(name = "is_repeated_approach")
    private String IS_REPEATED_APPROACH;

    @Column(name = "probability")
    private Double PROBABILITY;

    
    
    @Column(name = "currency_id")
    private String CURRENCY_ID;

    @Column(name = "opportunity")
    private Double OPPORTUNITY;

    
    
    @Column(name = "is_manual_opportunity")
    private String IS_MANUAL_OPPORTUNITY;

    @Column(name = "tax_value")
    private Double TAX_VALUE;

    
    
    @Column(name = "company_id")
    private String COMPANY_ID;

    
    
    @Column(name = "contact_id")
    private String CONTACT_ID;



    
    
    @Column(name = "quote_id")
    private String QUOTE_ID;

    @Column(name = "begindate")
    private Instant BEGINDATE;

    @Column(name = "closedate")
    private Instant CLOSEDATE;

    
    
    @Column(name = "opened")
    private String OPENED;

    
    
    @Column(name = "closed")
    private String CLOSED;

    
    
    @Column(name = "comments")
    private String COMMENTS;

    
    
    @Column(name = "assigned_by_id")
    private String ASSIGNED_BY_ID;

    
    
    @Column(name = "created_by_id")
    private String CREATED_BY_ID;

    
    
    @Column(name = "modify_by_id")
    private String MODIFY_BY_ID;

    
    
    @Column(name = "moved_by_id")
    private String MOVED_BY_ID;

    @Column(name = "date_create")
    private Instant DATE_CREATE;

    @Column(name = "date_modify")
    private Instant DATE_MODIFY;

    @Column(name = "moved_time")
    private Instant MOVED_TIME;

    
    
    @Column(name = "source_id")
    private String SOURCE_ID;

    
    
    @Column(name = "source_description")
    private String SOURCE_DESCRIPTION;

    
    
    @Column(name = "lead_id")
    private String LEAD_ID;

    
    
    @Column(name = "additional_info")
    private String ADDITIONAL_INFO;

    
    
    @Column(name = "location_id")
    private String LOCATION_ID;

    
    
    @Column(name = "originator_id")
    private String ORIGINATOR_ID;

    
    
    @Column(name = "origin_id")
    private String ORIGIN_ID;

    
    
    @Column(name = "utm_source")
    private String UTM_SOURCE;

    
    
    @Column(name = "utm_medium")
    private String UTM_MEDIUM;

    
    
    @Column(name = "utm_campaign")
    private String UTM_CAMPAIGN;

    
    
    @Column(name = "utm_content")
    private String UTM_CONTENT;

    
    
    @Column(name = "utm_term")
    private String UTM_TERM;

    @Column(name = "last_activity_time")
    private Instant LAST_ACTIVITY_TIME;

    
    
    @Column(name = "last_activity_by")
    private String LAST_ACTIVITY_BY;

    
    
    @Column(name = "parent_id_132")
    private String PARENT_ID_132;

    
    
    @Column(name = "uf_crm_1712228470")
    private String UF_CRM_1712228470;

    
    
    @Column(name = "uf_crm_1713357357")
    private String UF_CRM_1713357357;

    
    
    @Column(name = "uf_crm_1707143286")
    private String UF_CRM_1707143286;

    
    
    @Column(name = "uf_crm_1708515537")
    private String UF_CRM_1708515537;

    
    
    @Column(name = "uf_crm_1630408732647")
    private String UF_CRM_1630408732647;

    
    
    @Column(name = "uf_crm_1659931017")
    private String UF_CRM_1659931017;

    
    
    @Column(name = "uf_crm_1665576409095")
    private String UF_CRM_1665576409095;

    @Column(name = "uf_crm_1695724850752")
    private Instant UF_CRM_1695724850752;

    
    
    @Column(name = "uf_crm_1705309507766")
    private String UF_CRM_1705309507766;

    
    
    @Column(name = "uf_crm_1707119719817")
    private String UF_CRM_1707119719817;

    
    
    @Column(name = "uf_crm_1707119819982")
    private String UF_CRM_1707119819982;

    
    
    @Column(name = "uf_crm_1707119880366")
    private String UF_CRM_1707119880366;

    
    
    @Column(name = "uf_crm_1707120091678")
    private String UF_CRM_1707120091678;

    @Column(name = "uf_crm_1707127406194")
    private Instant UF_CRM_1707127406194;

    @Column(name = "uf_crm_1707128138863")
    private Instant UF_CRM_1707128138863;

    
    
    @Column(name = "uf_crm_1707145101392")
    private String UF_CRM_1707145101392;

    
    
    @Column(name = "uf_crm_1707145189813")
    private String UF_CRM_1707145189813;

    
    
    @Column(name = "uf_crm_1707145268405")
    private String UF_CRM_1707145268405;

    
    
    @Column(name = "uf_crm_1707145551")
    private String UF_CRM_1707145551;

    
    
    @Column(name = "uf_crm_1707145811011")
    private String UF_CRM_1707145811011;

    
    
    @Column(name = "uf_crm_1707145947108")
    private String UF_CRM_1707145947108;

    
    
    @Column(name = "uf_crm_1707146079310")
    private String UF_CRM_1707146079310;

    @Column(name = "uf_crm_1707146135461")
    private Instant UF_CRM_1707146135461;

    @Column(name = "uf_crm_1707146163970")
    private Instant UF_CRM_1707146163970;

    
    
    @Column(name = "uf_crm_1707146242324")
    private String UF_CRM_1707146242324;

    @Column(name = "uf_crm_1707147038325")
    private Double UF_CRM_1707147038325;

    
    
    @Column(name = "uf_crm_1707147104917")
    private String UF_CRM_1707147104917;

    
    
    @Column(name = "uf_crm_1707149878937")
    private String UF_CRM_1707149878937;

    
    
    @Column(name = "uf_crm_1707150031009")
    private String UF_CRM_1707150031009;

    
    
    @Column(name = "uf_crm_1707152276017")
    private String UF_CRM_1707152276017;

    @Column(name = "uf_crm_1707152367859")
    private Double UF_CRM_1707152367859;

    @Column(name = "uf_crm_1707152404406")
    private Instant UF_CRM_1707152404406;

    
    
    @Column(name = "uf_crm_1707153216673")
    private String UF_CRM_1707153216673;

    
    
    @Column(name = "uf_crm_1707153235011")
    private String UF_CRM_1707153235011;

    
    
    @Column(name = "uf_crm_1707153439")
    private String UF_CRM_1707153439;

    
    
    @Column(name = "uf_crm_1707153679546")
    private String UF_CRM_1707153679546;

    @Column(name = "uf_crm_1707153772096")
    private Double UF_CRM_1707153772096;

    
    
    @Column(name = "uf_crm_1707154575")
    private String UF_CRM_1707154575;

    @Column(name = "uf_crm_1707155031500")
    private Instant UF_CRM_1707155031500;

    @Column(name = "uf_crm_1707156037963")
    private Double UF_CRM_1707156037963;

    
    
    @Column(name = "uf_crm_1707156069398")
    private String UF_CRM_1707156069398;

    
    
    @Column(name = "uf_crm_1707297535")
    private String UF_CRM_1707297535;

    
    
    @Column(name = "uf_crm_1707382738")
    private String UF_CRM_1707382738;

    
    
    @Column(name = "uf_crm_1707384877989")
    private String UF_CRM_1707384877989;

    
    
    @Column(name = "uf_crm_1707385028092")
    private String UF_CRM_1707385028092;

    
    
    @Column(name = "uf_crm_1707451667")
    private String UF_CRM_1707451667;

    
    
    @Column(name = "uf_crm_1707452385")
    private String UF_CRM_1707452385;

    
    
    @Column(name = "uf_crm_1707476888923")
    private String UF_CRM_1707476888923;

    
    
    @Column(name = "uf_crm_1707723919930")
    private String UF_CRM_1707723919930;

    @Column(name = "uf_crm_1707724024179")
    private Double UF_CRM_1707724024179;

    
    
    @Column(name = "uf_crm_1707728528")
    private String UF_CRM_1707728528;

    
    
    @Column(name = "uf_crm_1707800037114")
    private String UF_CRM_1707800037114;

    
    
    @Column(name = "uf_crm_1707895852370")
    private String UF_CRM_1707895852370;

    
    
    @Column(name = "uf_crm_1707895967501")
    private String UF_CRM_1707895967501;

    @Column(name = "uf_crm_1708313343142")
    private Double UF_CRM_1708313343142;

    @Column(name = "uf_crm_1708321214833")
    private Double UF_CRM_1708321214833;

    @Column(name = "uf_crm_1708334626443")
    private Double UF_CRM_1708334626443;

    
    
    @Column(name = "uf_crm_1708349381")
    private String UF_CRM_1708349381;

    @Column(name = "uf_crm_1708516243819")
    private Boolean UF_CRM_1708516243819;

    
    
    @Column(name = "uf_crm_1708516309036")
    private String UF_CRM_1708516309036;

    @Column(name = "uf_crm_1708517051530")
    private Double UF_CRM_1708517051530;

    
    
    @Column(name = "uf_crm_1708518301")
    private String UF_CRM_1708518301;

    
    
    @Column(name = "uf_crm_1708595011927")
    private String UF_CRM_1708595011927;

    
    
    @Column(name = "uf_crm_1709011170300")
    private String UF_CRM_1709011170300;

    @Column(name = "uf_crm_1709622025399")
    private Double UF_CRM_1709622025399;

    @Column(name = "uf_crm_1709731780880")
    private Double UF_CRM_1709731780880;

    @Column(name = "uf_crm_1710223597123")
    private Double UF_CRM_1710223597123;

    
    
    @Column(name = "uf_crm_1710224893957")
    private String UF_CRM_1710224893957;

    @Column(name = "uf_crm_1711371065591")
    private Instant UF_CRM_1711371065591;

    
    
    @Column(name = "uf_crm_1711523487508")
    private String UF_CRM_1711523487508;

    @Column(name = "uf_crm_1711711756588")
    private Instant UF_CRM_1711711756588;

    
    
    @Column(name = "uf_crm_1712228861")
    private String UF_CRM_1712228861;

    
    
    @Column(name = "uf_crm_a_w_group_id")
    private String UF_CRM_AWGroupId;

    
    
    @Column(name = "uf_crm_a_t_group_id")
    private String UF_CRM_ATGroupId;

    @Column(name = "uf_crm_1712577743589")
    private Double UF_CRM_1712577743589;

    @Column(name = "uf_crm_1712743989071")
    private Double UF_CRM_1712743989071;

    @Column(name = "uf_crm_1712812589150")
    private Boolean UF_CRM_1712812589150;

    @Column(name = "uf_crm_1713336354101")
    private Double UF_CRM_1713336354101;

    @Column(name = "uf_crm_1713356145130")
    private Double UF_CRM_1713356145130;

    
    
    @Column(name = "uf_crm_1713935333604")
    private String UF_CRM_1713935333604;

    
    
    @Column(name = "uf_crm_1714037495819")
    private String UF_CRM_1714037495819;

    @Column(name = "uf_crm_1714037563801")
    private Instant UF_CRM_1714037563801;

    @Column(name = "uf_crm_1714981505052")
    private Instant UF_CRM_1714981505052;

    
    
    @Column(name = "uf_crm_1715750633024")
    private String UF_CRM_1715750633024;

    @Column(name = "uf_crm_1715751455743")
    private Instant UF_CRM_1715751455743;

    
    
    @Column(name = "uf_crm_1715751549293")
    private String UF_CRM_1715751549293;

    
    
    @Column(name = "uf_crm_1716804439763")
    private String UF_CRM_1716804439763;

    
    
    @Column(name = "uf_crm_1716804677915")
    private String UF_CRM_1716804677915;

    
    
    @Column(name = "uf_crm_1716891180821")
    private String UF_CRM_1716891180821;

    
    
    @Column(name = "uf_crm_1716980441923")
    private String UF_CRM_1716980441923;

    
    
    @Column(name = "uf_crm_1717411114268")
    private String UF_CRM_1717411114268;

    
    
    @Column(name = "uf_crm_6661639123b1e")
    private String UF_CRM_6661639123b1e;

    
    
    @Column(name = "uf_crm_666163914abe1")
    private String UF_CRM_666163914abe1;

    
    
    @Column(name = "uf_crm_666163924e9ba")
    private String UF_CRM_666163924e9ba;

    
    
    @Column(name = "uf_crm_666163925df88")
    private String UF_CRM_666163925df88;

    
    
    @Column(name = "uf_crm_666163926ae05")
    private String UF_CRM_666163926ae05;

    
    
    @Column(name = "uf_crm_6661639277ed4")
    private String UF_CRM_6661639277ed4;

    
    
    @Column(name = "uf_crm_66616392862d5")
    private String UF_CRM_66616392862d5;


    
    
    @Column(name = "uf_crm_1718885974")
    private String UF_CRM_1718885974;

    
    
    @Column(name = "uf_crm_1719824872888")
    private String UF_CRM_1719824872888;
    @Column(name = "uf_crm_66a4f05551e8e", length = Integer.MAX_VALUE)
    private String UF_CRM_66a4f05551e8e;

    @Column(name = "uf_crm_1722327474834", length = Integer.MAX_VALUE)
    private String UF_CRM_1722327474834;

    @Column(name = "uf_crm_1722921968", length = Integer.MAX_VALUE)
    private String UF_CRM_1722921968;

    @Column(name = "uf_crm_1723179741523", length = Integer.MAX_VALUE)
    private String UF_CRM_1723179741523;

    @Column(name = "uf_crm_1723444589386", length = Integer.MAX_VALUE)
    private String UF_CRM_1723444589386;

    @Column(name = "parent_id_1036", length = Integer.MAX_VALUE)
    private String PARENT_ID_1036;

    @Column(name = "uf_crm_1723523640792", length = Integer.MAX_VALUE)
    private String UF_CRM_1723523640792;

    @Column(name = "uf_crm_1723548196932", length = Integer.MAX_VALUE)
    private String UF_CRM_1723548196932;

    @Column(name = "uf_crm_1723548203920", length = Integer.MAX_VALUE)
    private String UF_CRM_1723548203920;

    @Column(name = "uf_crm_1723548212779", length = Integer.MAX_VALUE)
    private String UF_CRM_1723548212779;

    @Column(name = "uf_crm_19_1712141587575", length = Integer.MAX_VALUE)
    private String UF_CRM_191712141587575;

    @Column(name = "uf_crm_1712732100959", length = Integer.MAX_VALUE)
    private String UF_CRM_1712732100959;

    @Column(name = "uf_crm_19_1712833019208", length = Integer.MAX_VALUE)
    private String UF_CRM_191712833019208;

    @Column(name = "uf_crm_probability", length = Integer.MAX_VALUE)
    private String UF_CRM_PROBABILITY;

    @Column(name = "uf_crm_19_1712141507808", length = Integer.MAX_VALUE)
    private String UF_CRM_191712141507808;

    @Column(name = "uf_crm_xml_id", length = Integer.MAX_VALUE)
    private String UF_CRM_XML_ID;

    @Column(name = "uf_crm_19_1712141643098")
    private Instant UF_CRM_191712141643098;

    @Column(name = "uf_crm_19_1712142270090")
    private Instant UF_CRM_191712142270090;

    @Column(name = "uf_crm_date_modify")
    private Instant UF_CRM_DATE_MODIFY;

    @Column(name = "uf_crm_event_date")
    private Instant UF_CRM_EVENT_DATE;

    @Column(name = "uf_crm_date_create")
    private Instant UF_CRM_DATE_CREATE;

    @Column(name = "uf_crm_19_1712141810001", length = Integer.MAX_VALUE)
    private String UF_CRM_191712141810001;

    @Column(name = "uf_crm_1708060379106", length = Integer.MAX_VALUE)
    private String UF_CRM_1708060379106;

    @Column(name = "uf_crm_source_description", length = Integer.MAX_VALUE)
    private String UF_CRM_SOURCE_DESCRIPTION;

    @Column(name = "uf_crm_order_ids")
    private Double UF_CRM_ORDER_IDS;

    @Column(name = "uf_crm_19_1712142579982", length = Integer.MAX_VALUE)
    private String UF_CRM_191712142579982;

    @Column(name = "uf_crm_source_id", length = Integer.MAX_VALUE)
    private String UF_CRM_SOURCE_ID;

    @Column(name = "uf_crm_tracking_source_id", length = Integer.MAX_VALUE)
    private String UF_CRM_TRACKING_SOURCE_ID;

    @Column(name = "uf_crm_1708060584", length = Integer.MAX_VALUE)
    private String UF_CRM_1708060584;

    @Column(name = "uf_crm_1708060567", length = Integer.MAX_VALUE)
    private String UF_CRM_1708060567;

    @Column(name = "uf_crm_modify_by_id", length = Integer.MAX_VALUE)
    private String UF_CRM_MODIFY_BY_ID;

    @Column(name = "uf_crm_updated_by", length = Integer.MAX_VALUE)
    private String UF_CRM_UPDATED_BY;

    @Column(name = "uf_crm_last_activity_by", length = Integer.MAX_VALUE)
    private String UF_CRM_LAST_ACTIVITY_BY;

    @Column(name = "uf_crm_moved_by", length = Integer.MAX_VALUE)
    private String UF_CRM_MOVED_BY;

    @Column(name = "uf_crm_created_by", length = Integer.MAX_VALUE)
    private String UF_CRM_CREATED_BY;

    @Column(name = "uf_crm_updated_time")
    private Instant UF_CRM_UPDATED_TIME;

    @Column(name = "uf_crm_moved_time")
    private Instant UF_CRM_MOVED_TIME;

    @Column(name = "uf_crm_created_time")
    private Instant UF_CRM_CREATED_TIME;

    @Column(name = "uf_crm_originator_id", length = Integer.MAX_VALUE)
    private String UF_CRM_ORIGINATOR_ID;

    @Column(name = "uf_crm_1710487916092")
    private Double UF_CRM_1710487916092;

    @Column(name = "uf_crm_19_1712141660", length = Integer.MAX_VALUE)
    private String UF_CRM_191712141660;

    @Column(name = "uf_crm_19_1712141754", length = Integer.MAX_VALUE)
    private String UF_CRM_191712141754;

    @Column(name = "uf_crm_comments", length = Integer.MAX_VALUE)
    private String UF_CRM_COMMENTS;

    @Column(name = "uf_crm_19_1712217371209", length = Integer.MAX_VALUE)
    private String UF_CRM_191712217371209;

    @Column(name = "uf_crm_19_1712142547310", length = Integer.MAX_VALUE)
    private String UF_CRM_191712142547310;

    @Column(name = "uf_crm_lead_id")
    private Double UF_CRM_LEAD_ID;

    @Column(name = "uf_crm_19_1712141559041", length = Integer.MAX_VALUE)
    private String UF_CRM_191712141559041;

    @Column(name = "uf_crm_19_1712142455246", length = Integer.MAX_VALUE)
    private String UF_CRM_191712142455246;

    @Column(name = "uf_crm_1708669679267", length = Integer.MAX_VALUE)
    private String UF_CRM_1708669679267;

    @Column(name = "uf_crm_19_1712141831046", length = Integer.MAX_VALUE)
    private String UF_CRM_191712141831046;

    @Column(name = "uf_crm_19_1712141845465", length = Integer.MAX_VALUE)
    private String UF_CRM_191712141845465;

    @Column(name = "uf_crm_19_1714638886241", length = Integer.MAX_VALUE)
    private String UF_CRM_191714638886241;

    @Column(name = "uf_crm_event_description", length = Integer.MAX_VALUE)
    private String UF_CRM_EVENT_DESCRIPTION;

    @Column(name = "uf_crm_19_1712145419", length = Integer.MAX_VALUE)
    private String UF_CRM_191712145419;

    @Column(name = "uf_crm_is_return_customer")
    private Boolean UF_CRM_IS_RETURN_CUSTOMER;

    @Column(name = "uf_crm_is_repeated_approach")
    private Boolean UF_CRM_IS_REPEATED_APPROACH;

    @Column(name = "uf_crm_origin_id", length = Integer.MAX_VALUE)
    private String UF_CRM_ORIGIN_ID;

    @Column(name = "uf_crm_last_activity_time")
    private Instant UF_CRM_LAST_ACTIVITY_TIME;

    @Column(name = "uf_crm_previous_stage_id", length = Integer.MAX_VALUE)
    private String UF_CRM_PREVIOUS_STAGE_ID;

    @Column(name = "uf_crm_19_1712142493117", length = Integer.MAX_VALUE)
    private String UF_CRM_191712142493117;

    @Column(name = "uf_crm_mycompany_id", length = Integer.MAX_VALUE)
    private String UF_CRM_MYCOMPANY_ID;

    @Column(name = "uf_crm_19_1712141726104", length = Integer.MAX_VALUE)
    private String UF_CRM_191712141726104;

    @Column(name = "uf_crm_is_manual_opportunity")
    private Boolean UF_CRM_IS_MANUAL_OPPORTUNITY;

    @Column(name = "uf_crm_parent_id_2", length = Integer.MAX_VALUE)
    private String UF_CRM_PARENT_ID_2;

    @Column(name = "uf_crm_closed")
    private Boolean UF_CRM_CLOSED;

    @Column(name = "uf_crm_created_by_id", length = Integer.MAX_VALUE)
    private String UF_CRM_CREATED_BY_ID;

    @Column(name = "uf_crm_19_1712141624452")
    private Double UF_CRM_191712141624452;

    @Column(name = "uf_crm_tax_value")
    private Double UF_CRM_TAX_VALUE;

    @Column(name = "uf_crm_tax_value_account")
    private Double UF_CRM_TAX_VALUE_ACCOUNT;

    @Column(name = "uf_crm_1710488751776")
    private Double UF_CRM_1710488751776;

    @Column(name = "uf_crm_type_id", length = Integer.MAX_VALUE)
    private String UF_CRM_TYPE_ID;

    @Column(name = "uf_crm_19_1712062072500", length = Integer.MAX_VALUE)
    private String UF_CRM_191712062072500;

    @Column(name = "uf_crm_event_id", length = Integer.MAX_VALUE)
    private String UF_CRM_EVENT_ID;

    @Column(name = "uf_crm_1708060603", length = Integer.MAX_VALUE)
    private String UF_CRM_1708060603;

    @Column(name = "uf_crm_1708061198", length = Integer.MAX_VALUE)
    private String UF_CRM_1708061198;

    @Column(name = "uf_crm_1708061134", length = Integer.MAX_VALUE)
    private String UF_CRM_1708061134;

    @Column(name = "uf_crm_1708060868", length = Integer.MAX_VALUE)
    private String UF_CRM_1708060868;

    @Column(name = "uf_crm_19_1712160694051")
    private Double UF_CRM_191712160694051;

    @Column(name = "uf_crm_19_1712825479173", length = Integer.MAX_VALUE)
    private String UF_CRM_191712825479173;

    @Column(name = "uf_crm_1708060445", length = Integer.MAX_VALUE)
    private String UF_CRM_1708060445;

    @Column(name = "uf_crm_1708060402635", length = Integer.MAX_VALUE)
    private String UF_CRM_1708060402635;

    @Column(name = "uf_crm_1711473165", length = Integer.MAX_VALUE)
    private String UF_CRM_1711473165;

    @Column(name = "parent_id_1040", length = Integer.MAX_VALUE)
    private String PARENT_ID_1040;

    @Column(name = "uf_crm_1724061685586")
    private Instant UF_CRM_1724061685586;

    @Column(name = "uf_crm_1724062401335", length = Integer.MAX_VALUE)
    private String UF_CRM_1724062401335;

    @Column(name = "uf_crm_1724064846472", length = Integer.MAX_VALUE)
    private String UF_CRM_1724064846472;

    @Column(name = "uf_crm_1724065301336", length = Integer.MAX_VALUE)
    private String UF_CRM_1724065301336;

    @Column(name = "uf_crm_1724065337559", length = Integer.MAX_VALUE)
    private String UF_CRM_1724065337559;

    @Column(name = "uf_crm_1724065469381", length = Integer.MAX_VALUE)
    private String UF_CRM_1724065469381;

    @Column(name = "uf_crm_1724137625749", length = Integer.MAX_VALUE)
    private String UF_CRM_1724137625749;

    @Column(name = "uf_crm_rfev23870", length = Integer.MAX_VALUE)
    private String UF_CRM_Rfev23870;

    @Column(name = "uf_crm_rfev26206", length = Integer.MAX_VALUE)
    private String UF_CRM_Rfev26206;

    @Column(name = "uf_crm_rfev231222", length = Integer.MAX_VALUE)
    private String UF_CRM_Rfev231222;

    @Column(name = "uf_crm_1724154610834", length = Integer.MAX_VALUE)
    private String UF_CRM_1724154610834;

    @Column(name = "uf_crm_1724154709", length = Integer.MAX_VALUE)
    private String UF_CRM_1724154709;

    @Column(name = "uf_crm_1724157882231", length = Integer.MAX_VALUE)
    private String UF_CRM_1724157882231;

    @Column(name = "uf_crm_1724157898767", length = Integer.MAX_VALUE)
    private String UF_CRM_1724157898767;

}