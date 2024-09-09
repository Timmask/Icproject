package com.temirlan.spring.mvc.icproject.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnTransformer;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "deal")
@ToString
public class Deal {

        @Id
        @Column(name = "external_id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @JsonProperty(value = "ID")
        private Integer ID; // изменено с externalId на ID

        @JsonProperty(value = "TITLE")
        @Column(name = "title")
        private String TITLE; // изменено с title на TITLE

        @JsonProperty(value = "TYPE_ID")
        @Column(name = "type_id")
        private String TYPE_ID; // изменено с typeId на TYPE_ID

        @JsonProperty(value = "STAGE_ID")
        @Column(name = "stage_id")
        private String STAGE_ID; // изменено с stageId на STAGE_ID

        @JsonProperty(value = "PROBABILITY")
        @Column(name = "probability")
        private Double PROBABILITY; // изменено с probability на PROBABILITY

        @JsonProperty(value = "CURRENCY_ID")
        @Column(name = "currency_id")
        private String CURRENCY_ID; // изменено с currencyId на CURRENCY_ID

        @JsonProperty(value= "PARENT_ID_132")
        private String PARENT_ID_132; // изменено с currencyId на CURRENCY_ID

        @JsonProperty(value= "PARENT_ID_1036")
        private String PARENT_ID_1036; // изменено с currencyId на CURRENCY_ID

        @JsonProperty(value= "PARENT_ID_1040")
        private String PARENT_ID_1040; // изменено с currencyId на CURRENCY_ID

        @JsonProperty(value= "PARENT_ID_1046")
        private String PARENT_ID_1046; // изменено с currencyId на CURRENCY_ID


        @JsonProperty(value = "OPPORTUNITY")
        @Column(name = "opportunity")
        private Double OPPORTUNITY; // изменено с opportunity на OPPORTUNITY

        @JsonProperty(value = "IS_MANUAL_OPPORTUNITY")
        @Column(name = "is_manual_opportunity")
        private String IS_MANUAL_OPPORTUNITY;

        @JsonProperty(value = "TAX_VALUE")
        @Column(name = "tax_value")
        private Double TAX_VALUE; // изменено с taxValue на TAX_VALUE

        @JsonProperty(value = "DELETED")
        @Column(name = "deleted")
        private String DELETED; // изменено с deleted на DELETED

        @JsonProperty(value = "CATEGORY_ID")
        @Column(name = "category_id")
        private String CATEGORY_ID; // изменено с categoryId на CATEGORY_ID

        @JsonProperty(value = "STAGE_SEMANTIC_ID")
        @Column(name = "stage_semantic_id")
        private String STAGE_SEMANTIC_ID; // изменено с stageSemanticId на STAGE_SEMANTIC_ID

        @JsonProperty(value = "IS_NEW")
        @Column(name = "is_new")
        private String IS_NEW; // изменено с isNew на IS_NEW

        @JsonProperty(value = "IS_RECURRING")
        @Column(name = "is_recurring")
        private String IS_RECURRING; // изменено с isRecurring на IS_RECURRING

        @JsonProperty(value = "IS_RETURN_CUSTOMER")
        @Column(name = "is_return_customer")
        private String IS_RETURN_CUSTOMER; // изменено с isReturnCustomer на IS_RETURN_CUSTOMER

        @JsonProperty(value = "IS_REPEATED_APPROACH")
        @Column(name = "is_repeated_approach")
        private String IS_REPEATED_APPROACH; // изменено с isRepeatedApproach на IS_REPEATED_APPROACH

        @JsonProperty(value = "COMPANY_ID")
        @Column(name = "company_id")
        private String COMPANY_ID; // изменено с companyId на COMPANY_ID

        @JsonProperty(value = "CONTACT_ID")
        @Column(name = "contact_id")
        private String CONTACT_ID; // изменено с contactId на CONTACT_ID

        @JsonProperty(value = "CONTACT_IDS")
        @Column(name = "contact_ids")
        private String CONTACT_IDS; // изменено с contactIds на CONTACT_IDS

        @JsonProperty(value = "QUOTE_ID")
        @Column(name = "quote_id")
        private String QUOTE_ID; // изменено с quoteId на QUOTE_ID

        @JsonProperty(value = "BEGINDATE")
        @Column(name = "begindate")
        private String BEGINDATE; // изменено с begindate на BEGINDATE

        @JsonProperty(value = "CLOSEDATE")
        @Column(name = "closedate")
        private String CLOSEDATE; // изменено с closedate на CLOSEDATE

        @JsonProperty(value = "OPENED")
        @Column(name = "opened")
        private String OPENED; // изменено с opened на OPENED

        @JsonProperty(value = "CLOSED")
        @Column(name = "closed")
        private String CLOSED; // изменено с closed на CLOSED

        @JsonProperty(value = "COMMENTS")
        @Column(name = "comments")
        private String COMMENTS; // изменено с comments на COMMENTS

        @JsonProperty(value = "ASSIGNED_BY_ID")
        @Column(name = "assigned_by_id")
        private String ASSIGNED_BY_ID; // изменено с assignedById на ASSIGNED_BY_ID

        @JsonProperty(value = "CREATED_BY_ID")
        @Column(name = "created_by_id")
        private String CREATED_BY_ID; // изменено с createdById на CREATED_BY_ID

        @JsonProperty(value = "MODIFY_BY_ID")
        @Column(name = "modify_by_id")
        private String MODIFY_BY_ID; // изменено с modifyById на MODIFY_BY_ID

        @JsonProperty(value = "MOVED_BY_ID")
        @Column(name = "moved_by_id")
        private String MOVED_BY_ID; // изменено с movedById на MOVED_BY_ID

        @JsonProperty(value = "DATE_CREATE")
        @Column(name = "date_create")
        private String DATE_CREATE; // изменено с dateCreate на DATE_CREATE

        @JsonProperty(value = "DATE_MODIFY")
        @Column(name = "date_modify")
        private String DATE_MODIFY; // изменено с dateModify на DATE_MODIFY

        @JsonProperty(value = "MOVED_TIME")
        @Column(name = "moved_time")
        private String MOVED_TIME; // изменено с movedTime на MOVED_TIME

        @JsonProperty(value = "SOURCE_ID")
        @Column(name = "source_id")
        private String SOURCE_ID; // изменено с sourceId на SOURCE_ID

        @JsonProperty(value = "SOURCE_DESCRIPTION")
        @Column(name = "source_description")
        private String SOURCE_DESCRIPTION; // изменено с sourceDescription на SOURCE_DESCRIPTION

        @JsonProperty(value = "LEAD_ID")
        @Column(name = "lead_id")
        private String LEAD_ID; // изменено с leadId на LEAD_ID

        @JsonProperty(value = "ADDITIONAL_INFO")
        @Column(name = "additional_info")
        private String ADDITIONAL_INFO; // изменено с additionalInfo на ADDITIONAL_INFO

        @JsonProperty(value = "LOCATION_ID")
        @Column(name = "location_id")
        private String LOCATION_ID; // изменено с locationId на LOCATION_ID

        @JsonProperty(value = "ORIGINATOR_ID")
        @Column(name = "originator_id")
        private String ORIGINATOR_ID; // изменено с originatorId на ORIGINATOR_ID

        @JsonProperty(value = "ORIGIN_ID")
        @Column(name = "origin_id")
        private String ORIGIN_ID; // изменено с originId на ORIGIN_ID

        @JsonProperty(value = "UTM_SOURCE")
        @Column(name = "utm_source")
        private String UTM_SOURCE; // изменено с utmSource на UTM_SOURCE

        @JsonProperty(value = "UTM_MEDIUM")
        @Column(name = "utm_medium")
        private String UTM_MEDIUM; // изменено с utmMedium на UTM_MEDIUM

        @JsonProperty(value = "UTM_CAMPAIGN")
        @Column(name = "utm_campaign")
        private String UTM_CAMPAIGN; // изменено с utmCampaign на UTM_CAMPAIGN

        @JsonProperty(value = "UTM_CONTENT")
        @Column(name = "utm_content")
        private String UTM_CONTENT; // изменено

//------------------------------------------------------------------------


        @JsonProperty(value = "UTM_TERM")
        @Column(name = "utm_term")
        private String UTM_TERM; // изменено с utmTerm на UTM_TERM


        @JsonProperty(value = "LAST_ACTIVITY_TIME")
        @Column(name = "last_activity_time")
        private String LAST_ACTIVITY_TIME; // изменено с lastActivityTime на LAST_ACTIVITY_TIME

        @JsonProperty(value = "LAST_ACTIVITY_BY")
        @Column(name = "last_activity_by")
        private String LAST_ACTIVITY_BY; // изменено с lastActivityBy на LAST_ACTIVITY_BY

        @JsonProperty(value = "UF_CRM_1712228470")
        @Column(name = "uf_crm_1712228470")
        private String UF_CRM_1712228470; // изменено с ufCrm1712228470 на UF_CRM_1712228470

        @JsonProperty(value = "UF_CRM_1713357357")
        @Column(name = "uf_crm_1713357357")
        private String UF_CRM_1713357357; // изменено с ufCrm1713357357 на UF_CRM_1713357357

        @JsonProperty(value = "UF_CRM_1707143286")
        @Column(name = "uf_crm_1707143286")
        private String UF_CRM_1707143286; // изменено с ufCrm1707143286 на UF_CRM_1707143286

        @JsonProperty(value = "UF_CRM_1708515537")
        @Column(name = "uf_crm_1708515537")
        private String UF_CRM_1708515537; // изменено с ufCrm1708515537 на UF_CRM_1708515537

        @JsonProperty(value = "UF_CRM_1630408732647")
        @Column(name = "uf_crm_1630408732647")
        private String UF_CRM_1630408732647; // изменено с ufCrm1630408732647 на UF_CRM_1630408732647

        @JsonProperty(value = "UF_CRM_1659931017")
        @Column(name = "uf_crm_1659931017")
        private String UF_CRM_1659931017; // изменено с ufCrm1659931017 на UF_CRM_1659931017

        @JsonProperty(value = "UF_CRM_1665576409095")
        @Column(name = "uf_crm_1665576409095")
        private String UF_CRM_1665576409095; // изменено с ufCrm1665576409095 на UF_CRM_1665576409095

        @JsonProperty(value = "UF_CRM_1695724850752")
        @Column(name = "uf_crm_1695724850752")
        private String UF_CRM_1695724850752; // изменено с ufCrm1695724850752 на UF_CRM_1695724850752

        @JsonProperty(value = "UF_CRM_1705309507766")
        @Column(name = "uf_crm_1705309507766")
        private String UF_CRM_1705309507766; // изменено с ufCrm1705309507766 на UF_CRM_1705309507766

        @JsonProperty(value = "UF_CRM_1707119719817")
        @Column(name = "uf_crm_1707119719817")
        private String UF_CRM_1707119719817; // изменено с ufCrm1707119719817 на UF_CRM_1707119719817

        @JsonProperty(value = "UF_CRM_1707119819982")
        @Column(name = "uf_crm_1707119819982")
        private String UF_CRM_1707119819982; // изменено с ufCrm1707119819982 на UF_CRM_1707119819982

        @JsonProperty(value = "UF_CRM_1707119880366")
        @Column(name = "uf_crm_1707119880366")
        private String UF_CRM_1707119880366; // изменено с ufCrm1707119880366 на UF_CRM_1707119880366

        @JsonProperty(value = "UF_CRM_1707120091678")
        @Column(name = "uf_crm_1707120091678")
        private String UF_CRM_1707120091678; // изменено с ufCrm1707120091678 на UF_CRM_1707120091678

        @JsonProperty(value = "UF_CRM_1707127406194")
        @Column(name = "uf_crm_1707127406194")
        private String UF_CRM_1707127406194; // изменено с ufCrm1707127406194 на UF_CRM_1707127406194

        @JsonProperty(value = "UF_CRM_1707128138863")
        @Column(name = "uf_crm_1707128138863")
        private String UF_CRM_1707128138863; // изменено с ufCrm1707128138863 на UF_CRM_1707128138863

        @JsonProperty(value = "UF_CRM_1707145101392")
        @Column(name = "uf_crm_1707145101392")
        private String UF_CRM_1707145101392; // изменено с ufCrm1707145101392 на UF_CRM_1707145101392

        @JsonProperty(value = "UF_CRM_1707145189813")
        @Column(name = "uf_crm_1707145189813")
        private String UF_CRM_1707145189813; // изменено с ufCrm1707145189813 на UF_CRM_1707145189813

        @JsonProperty(value = "UF_CRM_1707145268405")
        @Column(name = "uf_crm_1707145268405")
        private String UF_CRM_1707145268405; // изменено с ufCrm1707145268405 на UF_CRM_1707145268405

        @JsonProperty(value = "UF_CRM_1707145811011")
        @Column(name = "uf_crm_1707145811011")
        private String UF_CRM_1707145811011; // изменено с ufCrm1707145811011 на UF_CRM_1707145811011

        @JsonProperty(value = "UF_CRM_1707145947108")
        @Column(name = "uf_crm_1707145947108")
        private String UF_CRM_1707145947108; // изменено с ufCrm1707145947108 на UF_CRM_1707145947108

        @JsonProperty(value = "UF_CRM_1707146079310")
        @Column(name = "uf_crm_1707146079310")
        private String UF_CRM_1707146079310; // изменено с ufCrm1707146079310 на UF_CRM_1707146079310

        @JsonProperty(value = "UF_CRM_1707146135461")
        @Column(name = "uf_crm_1707146135461")
        private String UF_CRM_1707146135461; // изменено с ufCrm1707146135461 на UF_CRM_1707146135461

        @JsonProperty(value = "UF_CRM_1707146163970")
        @Column(name = "uf_crm_1707146163970")
        private String UF_CRM_1707146163970; // изменено с ufCrm1707146163970 на UF_CRM_1707146163970

        @JsonProperty(value = "UF_CRM_1707146242324")
//        @Column(name = "uf_crm_1707146242324")
//        @ColumnTransformer(write = "CAST( ? AS float)")
        private List<Object> UF_CRM_1707146242324;

        @JsonProperty(value = "UF_CRM_1707147038325")
//        @ColumnTransformer(write = "CAST( ? AS float)")
//        @Column(name = "uf_crm_1707147038325")
        private List<Object> UF_CRM_1707147038325;

//        @Column(name = "uf_crm_1707147038325")
//        private Double D_UF_CRM_1707147038325;

    //    ---------------------------------------
//    @ColumnTransformer(write = "CAST( ? AS float)")
    @JsonProperty(value = "UF_CRM_1707147104917")
//    @Column(name = "uf_crm_1707147104917")
    private List<Object> UF_CRM_1707147104917;

    @JsonProperty(value = "UF_CRM_1707149878937")
    @Column(name = "uf_crm_1707149878937")
    private String UF_CRM_1707149878937;

    @JsonProperty(value = "UF_CRM_1707150031009")
//    @Column(name = "uf_crm_1707150031009")
//    @ColumnTransformer(write = "CAST( ? AS float)")
    private List<Object> UF_CRM_1707150031009;

    @JsonProperty(value = "UF_CRM_1707152276017")
    @Column(name = "uf_crm_1707152276017")
    private String UF_CRM_1707152276017;

    @JsonProperty(value = "UF_CRM_1707152367859")
    @Column(name = "uf_crm_1707152367859")
    private Double UF_CRM_1707152367859;

    @JsonProperty(value = "UF_CRM_1707152404406")
    @Column(name = "uf_crm_1707152404406")
    private String UF_CRM_1707152404406;

    @JsonProperty(value = "UF_CRM_1707153439")
    @Column(name = "uf_crm_1707153439")
    private String UF_CRM_1707153439;

    @JsonProperty(value = "UF_CRM_1707153772096")
    @Column(name = "uf_crm_1707153772096")
    private Double UF_CRM_1707153772096;

    @JsonProperty(value = "UF_CRM_1707155031500")
    @Column(name = "uf_crm_1707155031500")
    private String UF_CRM_1707155031500;

    @JsonProperty(value = "UF_CRM_1707156037963")
    @Column(name = "uf_crm_1707156037963")
    private Double UF_CRM_1707156037963;

    @JsonProperty(value = "UF_CRM_1707156069398")
    @Column(name = "uf_crm_1707156069398")
    private String UF_CRM_1707156069398;

    @JsonProperty(value = "UF_CRM_1707297535")
//    @ColumnTransformer(write = "CAST( ? AS float)")
//    @Column(name = "uf_crm_1707297535")
    private List<Object> UF_CRM_1707297535;

    @JsonProperty(value = "UF_CRM_1707382738")
    @Column(name = "uf_crm_1707382738")
    private String UF_CRM_1707382738;

    @JsonProperty(value = "UF_CRM_1707384877989")
    @Column(name = "uf_crm_1707384877989")
    private String UF_CRM_1707384877989;

    @JsonProperty(value = "UF_CRM_1707385028092")
    @Column(name = "uf_crm_1707385028092")
    private String UF_CRM_1707385028092;

    @JsonProperty(value = "UF_CRM_1707451667")
    @Column(name = "uf_crm_1707451667")
    private String UF_CRM_1707451667;

    @JsonProperty(value = "UF_CRM_1707452385")
    @Column(name = "uf_crm_1707452385")
    private String UF_CRM_1707452385;

    @JsonProperty(value = "UF_CRM_1707476888923")
    @Column(name = "uf_crm_1707476888923")
    private String UF_CRM_1707476888923;

    @JsonProperty(value = "UF_CRM_1707723919930")
    @Column(name = "uf_crm_1707723919930")
    private String UF_CRM_1707723919930;

    @JsonProperty(value = "UF_CRM_1707724024179")
    @Column(name = "uf_crm_1707724024179")
    private Double UF_CRM_1707724024179;

    @JsonProperty(value = "UF_CRM_1707728528")
    @Column(name = "uf_crm_1707728528")
    private String UF_CRM_1707728528;

    @JsonProperty(value = "UF_CRM_1707800037114")
//    @ColumnTransformer(write = "CAST( ? AS float)")
//    @Column(name = "uf_crm_1707800037114")
    private List<Object> UF_CRM_1707800037114;

    @JsonProperty(value = "UF_CRM_1707895852370")
    @Column(name = "uf_crm_1707895852370")
    private String UF_CRM_1707895852370;

    @JsonProperty(value = "UF_CRM_1707895967501")
    @Column(name = "uf_crm_1707895967501")
    private String UF_CRM_1707895967501;

    @JsonProperty(value = "UF_CRM_1708313343142")
    @Column(name = "uf_crm_1708313343142")
    private Double UF_CRM_1708313343142;

    @JsonProperty(value = "UF_CRM_1708321214833")
    @Column(name = "uf_crm_1708321214833")
    private Double UF_CRM_1708321214833;

    @JsonProperty(value = "UF_CRM_1708334626443")
    @Column(name = "uf_crm_1708334626443")
    private Double UF_CRM_1708334626443;

    @JsonProperty(value = "UF_CRM_1708349381")
    @Column(name = "uf_crm_1708349381")
    private String UF_CRM_1708349381;

    @JsonProperty(value = "UF_CRM_1708516243819")
    @Column(name = "uf_crm_1708516243819")
    private String UF_CRM_1708516243819;

    @JsonProperty(value = "UF_CRM_1708516309036")
    @Column(name = "uf_crm_1708516309036")
    private String UF_CRM_1708516309036;

    @JsonProperty(value = "UF_CRM_1708517051530")
    @Column(name = "uf_crm_1708517051530")
    private Double UF_CRM_1708517051530;

    @JsonProperty(value = "UF_CRM_1708518301")
    @Column(name = "uf_crm_1708518301")
    private String UF_CRM_1708518301;

    @JsonProperty(value = "UF_CRM_1708595011927")
    @Column(name = "uf_crm_1708595011927")
    private String UF_CRM_1708595011927;

    @JsonProperty(value = "UF_CRM_1709011170300")
    @Column(name = "uf_crm_1709011170300")
    private String UF_CRM_1709011170300;

    @JsonProperty(value = "UF_CRM_1709622025399")
    @Column(name = "uf_crm_1709622025399")
    private Double UF_CRM_1709622025399;

    @JsonProperty(value = "UF_CRM_1709731780880")
    @Column(name = "uf_crm_1709731780880")
    private Double UF_CRM_1709731780880;


// -----------------------------------------------------

    @JsonProperty(value = "UF_CRM_1710223597123")
    @Column(name = "uf_crm_1710223597123")
    private Double UF_CRM_1710223597123;

    @JsonProperty(value = "UF_CRM_1710224893957")
    @Column(name = "uf_crm_1710224893957")
    private String UF_CRM_1710224893957;

    @JsonProperty(value = "UF_CRM_1711371065591")
    @Column(name = "uf_crm_1711371065591")
    private String UF_CRM_1711371065591;

    @JsonProperty(value = "UF_CRM_1711523487508")
//    @ColumnTransformer(write = "CAST( ? AS float)")
//    @Column(name = "uf_crm_1711523487508")
    private List<Object> UF_CRM_1711523487508;

    @JsonProperty(value = "UF_CRM_1711711756588")
    @Column(name = "uf_crm_1711711756588")
    private String UF_CRM_1711711756588;

    @JsonProperty(value = "UF_CRM_1712228861")
    @Column(name = "uf_crm_1712228861")
    private String UF_CRM_1712228861;

    @JsonProperty(value = "UF_CRM_A_W_GROUP_ID")
    @Column(name = "uf_crm_a_w_group_id")
    private String UF_CRM_A_W_GROUP_ID;

    @JsonProperty(value = "UF_CRM_1712577743589")
    @Column(name = "uf_crm_1712577743589")
    private Double UF_CRM_1712577743589;

    @JsonProperty(value = "UF_CRM_1712743989071")
    @Column(name = "uf_crm_1712743989071")
    private Double UF_CRM_1712743989071;

    @JsonProperty(value = "UF_CRM_1712812589150")
    @Column(name = "uf_crm_1712812589150")
    private String  UF_CRM_1712812589150;

    @JsonProperty(value = "UF_CRM_1713336354101")
    @Column(name = "uf_crm_1713336354101")
    private Double UF_CRM_1713336354101;

    @JsonProperty(value = "UF_CRM_1713356145130")
    @Column(name = "uf_crm_1713356145130")
    private Double UF_CRM_1713356145130;

    @JsonProperty(value = "UF_CRM_1713935333604")
    @Column(name = "uf_crm_1713935333604")
    private String UF_CRM_1713935333604;

    @JsonProperty(value = "UF_CRM_1714037495819")
//    @ColumnTransformer(write = "CAST( ? AS float)")
//    @Column(name = "uf_crm_1714037495819")
    private List<Object> UF_CRM_1714037495819;

    @JsonProperty(value = "UF_CRM_1714037563801")
    @Column(name = "uf_crm_1714037563801")
    private String UF_CRM_1714037563801;

    @JsonProperty(value = "UF_CRM_1714981505052")
    @Column(name = "uf_crm_1714981505052")
    private String UF_CRM_1714981505052;

    @JsonProperty(value = "UF_CRM_1715751455743")
    @Column(name = "uf_crm_1715751455743")
    private String UF_CRM_1715751455743;

    @JsonProperty(value = "UF_CRM_1715751549293")
    @Column(name = "uf_crm_1715751549293")
    private String UF_CRM_1715751549293;

    @JsonProperty(value = "UF_CRM_1716804439763")
//    @ColumnTransformer(write = "CAST( ? AS float)")
//    @Column(name = "uf_crm_1716804439763")
    private List<Object> UF_CRM_1716804439763;

    @JsonProperty(value = "UF_CRM_1716804677915")
//    @ColumnTransformer(write = "CAST( ? AS float)")
//    @Column(name = "uf_crm_1716804677915")
    private List<Object> UF_CRM_1716804677915;

    @JsonProperty(value = "UF_CRM_1716891180821")
    @Column(name = "uf_crm_1716891180821")
    private String UF_CRM_1716891180821;

    @JsonProperty(value = "UF_CRM_1717411114268")
    @Column(name = "uf_crm_1717411114268")
    private String UF_CRM_1717411114268;

    @JsonProperty(value = "UF_CRM_1719824872888")
    @Column(name = "uf_crm_1719824872888")
    private String UF_CRM_1719824872888;

    @JsonProperty(value = "UF_CRM_1722921968")
    @Column(name = "uf_crm_1722921968")
    private String UF_CRM_1722921968;

    @JsonProperty(value = "UF_CRM_1723179741523")
    @Column(name = "uf_crm_1723179741523")
    private String UF_CRM_1723179741523;

    @JsonProperty(value = "UF_CRM_1723444589386")
    @Column(name = "uf_crm_1723444589386")
    private String UF_CRM_1723444589386;

    @JsonProperty(value = "UF_CRM_1723523640792")
//    @ColumnTransformer(write = "CAST( ? AS float)")
//    @Column(name = "uf_crm_1723523640792")
    private List<Object> UF_CRM_1723523640792;

    @JsonProperty(value = "UF_CRM_1724137625749")
    @Column(name = "uf_crm_1724137625749")
    private String UF_CRM_1724137625749;

    @JsonProperty(value = "UF_CRM_1724236125")
    @Column(name = "uf_crm_1724236125")
    private String UF_CRM_1724236125;

    @JsonProperty(value = "UF_CRM_1724236164")
    @Column(name = "uf_crm_1724236164")
    private String UF_CRM_1724236164;

    @JsonProperty(value = "UF_CRM_1724236242")
    @Column(name = "uf_crm_1724236242")
    private String UF_CRM_1724236242;

    @JsonProperty(value = "UF_CRM_1724323006867")
    @Column(name = "uf_crm_1724323006867")
    private String UF_CRM_1724323006867;

    @JsonProperty(value = "UF_CRM_1724323019212")
    @Column(name = "uf_crm_1724323019212")
    private String UF_CRM_1724323019212;

    @JsonProperty(value = "UF_CRM_1724323806918")
//    @ColumnTransformer(write = "CAST( ? AS float)")
//    @Column(name = "uf_crm_1724323806918")
    private List<Object> UF_CRM_1724323806918;

    @JsonProperty(value = "UF_CRM_1724324415114")
    @Column(name = "uf_crm_1724324415114")
    private String UF_CRM_1724324415114;

    @JsonProperty(value = "UF_CRM_1724330187490")
    @Column(name = "uf_crm_1724330187490")
    private String UF_CRM_1724330187490;


    @JsonProperty(value = "UF_CRM_1724330205937")
    @Column(name = "uf_crm_1724330205937")
    private String UF_CRM_1724330205937;


    @JsonProperty(value = "UF_CRM_1724330225119")
    @Column(name = "uf_crm_1724330225119")
    private String UF_CRM_1724330225119;


    @JsonProperty(value = "UF_CRM_1724330236979")
    @Column(name = "uf_crm_1724330236979")
    private String UF_CRM_1724330236979;


    @JsonProperty(value = "UF_CRM_1724330701844")
    @Column(name = "uf_crm_1724330701844")
    private String UF_CRM_1724330701844;


    @JsonProperty(value = "UF_CRM_1724330724347")
    @Column(name = "uf_crm_1724330724347")
    private String UF_CRM_1724330724347;


    @JsonProperty(value = "UF_CRM_1724330743168")
    @Column(name = "uf_crm_1724330743168")
    private String UF_CRM_1724330743168;


    @JsonProperty(value = "UF_CRM_1724330780077")
    @Column(name = "uf_crm_1724330780077")
    private String UF_CRM_1724330780077;


    @JsonProperty(value = "UF_CRM_1724330794391")
    @Column(name = "uf_crm_1724330794391")
    private String UF_CRM_1724330794391;


    @JsonProperty(value = "UF_CRM_1724330813063")
    @Column(name = "uf_crm_1724330813063")
    private String UF_CRM_1724330813063;


    @JsonProperty(value = "UF_CRM_1724390180065")
    @Column(name = "uf_crm_1724390180065")
    private String UF_CRM_1724390180065;


    @JsonProperty(value = "UF_CRM_1724390195048")
    @Column(name = "uf_crm_1724390195048")
    private String UF_CRM_1724390195048;


    @JsonProperty(value = "UF_CRM_1724390209226")
    @Column(name = "uf_crm_1724390209226")
    private String UF_CRM_1724390209226;


    @JsonProperty(value = "UF_CRM_1724390605256")
    @Column(name = "uf_crm_1724390605256")
    private String UF_CRM_1724390605256;

    @JsonProperty(value = "UF_CRM_1724406178687")
    @Column(name = "uf_crm_1724406178687")
    private String UF_CRM_1724406178687;


    @JsonProperty(value = "UF_CRM_1724406480918")
    @Column(name = "uf_crm_1724406480918")
    private String UF_CRM_1724406480918;


    @JsonProperty(value = "UF_CRM_1724695164561")
    @Column(name = "uf_crm_1724695164561")
    private String UF_CRM_1724695164561;


    @JsonProperty(value = "UF_CRM_1724821296881")
//    @ColumnTransformer(write = "CAST( ? AS float)")
//    @Column(name = "uf_crm_1724821296881")
    private boolean UF_CRM_1724821296881;

    @JsonProperty(value = "UF_CRM_1725875928466")
//    @ColumnTransformer(write = "CAST( ? AS float)")
//    @Column(name = "uf_crm_1724821296881")
    private String UF_CRM_1725875928466;



    @JsonProperty(value = "UF_CRM_1724930009099")
    @Column(name = "uf_crm_1724930009099")
    private String UF_CRM_1724930009099;


    @JsonProperty(value = "UF_CRM_19_1712141587575")
    @Column(name = "uf_crm_19_1712141587575")
    private String UF_CRM_191712141587575;


    @JsonProperty(value = "UF_CRM_A_T_GROUP_ID")
    @Column(name = "uf_crm_a_t_group_id")
    private String UF_CRM_A_T_GROUP_ID;


    @JsonProperty(value = "UF_CRM_PROBABILITY")
    @Column(name = "uf_crm_probability")
    private String UF_CRM_PROBABILITY;


    @JsonProperty(value = "UF_CRM_19_1712141507808")
    @Column(name = "uf_crm_19_1712141507808")
    private String UF_CRM_191712141507808;


    @JsonProperty(value = "UF_CRM_XML_ID")
    @Column(name = "uf_crm_xml_id")
    private String UF_CRM_XML_ID;

    @JsonProperty(value = "UF_CRM_19_1712141643098")
    @Column(name = "uf_crm_19_1712141643098")
    private String UF_CRM_191712141643098;

    @JsonProperty(value = "UF_CRM_19_1712142270090")
//    @ColumnTransformer(write = "CAST( ? AS float)")
//    @Column(name = "uf_crm_19_1712142270090")
    private List<Object> UF_CRM_191712142270090;

    @JsonProperty(value = "UF_CRM_DATE_MODIFY")
    @Column(name = "uf_crm_date_modify")
    private String UF_CRM_DATE_MODIFY;

    @JsonProperty(value = "UF_CRM_EVENT_DATE")
    @Column(name = "uf_crm_event_date")
    private String UF_CRM_EVENT_DATE;

    @JsonProperty(value = "UF_CRM_DATE_CREATE")
    @Column(name = "uf_crm_date_create")
    private String UF_CRM_DATE_CREATE;


    @JsonProperty(value = "UF_CRM_19_1712141810001")
//    @ColumnTransformer(write = "CAST( ? AS float)")
//    @Column(name = "uf_crm_19_1712141810001")
    private List<Object> UF_CRM_191712141810001;

    @JsonProperty(value = "UF_CRM_1708060379106")
    @Column(name = "uf_crm_1708060379106")
    private String UF_CRM_1708060379106;


    @JsonProperty(value = "UF_CRM_SOURCE_DESCRIPTION")
    @Column(name = "uf_crm_source_description")
    private String UF_CRM_SOURCE_DESCRIPTION;

    @JsonProperty(value = "UF_CRM_ORDER_IDS")
//    @ColumnTransformer(write = "CAST( ? AS float)")
//    @Column(name = "uf_crm_order_ids")
    private List<Object> UF_CRM_ORDER_IDS;

    @JsonProperty(value = "UF_CRM_19_1712142579982")
    @Column(name = "uf_crm_19_1712142579982")
    private String UF_CRM_191712142579982;


    @JsonProperty(value = "UF_CRM_SOURCE_ID")
    @Column(name = "uf_crm_source_id")
    private String UF_CRM_SOURCE_ID;


    @JsonProperty(value = "UF_CRM_TRACKING_SOURCE_ID")
    @Column(name = "uf_crm_tracking_source_id")
    private String UF_CRM_TRACKING_SOURCE_ID;


    @JsonProperty(value = "UF_CRM_MODIFY_BY_ID")
    @Column(name = "uf_crm_modify_by_id")
    private String UF_CRM_MODIFY_BY_ID;


    @JsonProperty(value = "UF_CRM_UPDATED_BY")
    @Column(name = "uf_crm_updated_by")
    private String UF_CRM_UPDATED_BY;


    @JsonProperty(value = "UF_CRM_LAST_ACTIVITY_BY")
    @Column(name = "uf_crm_last_activity_by")
    private String UF_CRM_LAST_ACTIVITY_BY;


    @JsonProperty(value = "UF_CRM_MOVED_BY")
    @Column(name = "uf_crm_moved_by")
    private String UF_CRM_MOVED_BY;


    @JsonProperty(value = "UF_CRM_CREATED_BY")
    @Column(name = "uf_crm_created_by")
    private String UF_CRM_CREATED_BY;

    @JsonProperty(value = "UF_CRM_UPDATED_TIME")
    @Column(name = "uf_crm_updated_time")
    private String UF_CRM_UPDATED_TIME;

    @JsonProperty(value = "UF_CRM_MOVED_TIME")
    @Column(name = "uf_crm_moved_time")
    private String UF_CRM_MOVED_TIME;

    @JsonProperty(value = "UF_CRM_CREATED_TIME")
    @Column(name = "uf_crm_created_time")
    private String UF_CRM_CREATED_TIME;


    @JsonProperty(value = "UF_CRM_ORIGINATOR_ID")
    @Column(name = "uf_crm_originator_id")
    private String UF_CRM_ORIGINATOR_ID;

    @JsonProperty(value = "UF_CRM_1710487916092")
    @Column(name = "uf_crm_1710487916092")
    private Double UF_CRM_1710487916092;


    @JsonProperty(value = "UF_CRM_19_1712141660")
    @Column(name = "uf_crm_19_1712141660")
    private String UF_CRM_191712141660;


    @JsonProperty(value = "UF_CRM_19_1712141754")
    @Column(name = "uf_crm_19_1712141754")
    private String UF_CRM_191712141754;


    @JsonProperty(value = "UF_CRM_COMMENTS")
    @Column(name = "uf_crm_comments")
    private String UF_CRM_COMMENTS;


    @JsonProperty(value = "UF_CRM_19_1712217371209")
    @Column(name = "uf_crm_19_1712217371209")
    private String UF_CRM_191712217371209;


    @JsonProperty(value = "UF_CRM_19_1712142547310")
    @Column(name = "uf_crm_19_1712142547310")
    private String UF_CRM_191712142547310;

    @JsonProperty(value = "UF_CRM_LEAD_ID")
    @Column(name = "uf_crm_lead_id")
    private Double UF_CRM_LEAD_ID;


    @JsonProperty(value = "UF_CRM_19_1712141559041")
    @Column(name = "uf_crm_19_1712141559041")
    private String UF_CRM_191712141559041;


    @JsonProperty(value = "UF_CRM_1707153679546")
//    @ColumnTransformer(write = "CAST( ? AS float)")
//    @Column(name = "uf_crm_1707153679546")
    private List<Object> UF_CRM_1707153679546;


    @JsonProperty(value = "UF_CRM_1708669679267")
    @Column(name = "uf_crm_1708669679267")
    private String UF_CRM_1708669679267;


    @JsonProperty(value = "UF_CRM_19_1712141831046")
    @Column(name = "uf_crm_19_1712141831046")
    private String UF_CRM_191712141831046;


    @JsonProperty(value = "UF_CRM_19_1712141845465")
    @Column(name = "uf_crm_19_1712141845465")
    private String UF_CRM_191712141845465;


    @JsonProperty(value = "UF_CRM_19_1714638886241")
    @Column(name = "uf_crm_19_1714638886241")
    private String UF_CRM_191714638886241;


    @JsonProperty(value = "UF_CRM_EVENT_DESCRIPTION")
    @Column(name = "uf_crm_event_description")
    private String UF_CRM_EVENT_DESCRIPTION;

    @JsonProperty(value = "UF_CRM_IS_RETURN_CUSTOMER")
    @Column(name = "uf_crm_is_return_customer")
    private String UF_CRM_IS_RETURN_CUSTOMER;

    @JsonProperty(value = "UF_CRM_IS_REPEATED_APPROACH")
    @Column(name = "uf_crm_is_repeated_approach")
    private String UF_CRM_IS_REPEATED_APPROACH;


    @JsonProperty(value = "UF_CRM_ORIGIN_ID")
    @Column(name = "uf_crm_origin_id")
    private String UF_CRM_ORIGIN_ID;

    @JsonProperty(value = "UF_CRM_LAST_ACTIVITY_TIME")
    @Column(name = "uf_crm_last_activity_time")
    private String UF_CRM_LAST_ACTIVITY_TIME;


    @JsonProperty(value = "UF_CRM_PREVIOUS_STAGE_ID")
    @Column(name = "uf_crm_previous_stage_id")
    private String UF_CRM_PREVIOUS_STAGE_ID;


    @JsonProperty(value = "UF_CRM_1707145551")
    @Column(name = "uf_crm_1707145551")
    private String UF_CRM_1707145551;


    @JsonProperty(value = "UF_CRM_19_1712142493117")
    @Column(name = "uf_crm_19_1712142493117")
    private String UF_CRM_191712142493117;


    @JsonProperty(value = "UF_CRM_MYCOMPANY_ID")
    @Column(name = "uf_crm_mycompany_id")
    private String UF_CRM_MYCOMPANY_ID;


    @JsonProperty(value = "UF_CRM_19_1712141726104")
    @ColumnTransformer(write = "CAST( ? AS nvarchar)")
    @Column(name = "uf_crm_19_1712141726104")
    private List<Object> UF_CRM_191712141726104;

    @JsonProperty(value = "UF_CRM_IS_MANUAL_OPPORTUNITY")
    @Column(name = "uf_crm_is_manual_opportunity")
    private String UF_CRM_IS_MANUAL_OPPORTUNITY;


    @JsonProperty(value = "UF_CRM_PARENT_ID_2")
    @Column(name = "uf_crm_parent_id_2")
    private String UF_CRM_PARENT_ID_2;

    @JsonProperty(value = "UF_CRM_CLOSED")
    @Column(name = "uf_crm_closed")
    private String UF_CRM_CLOSED;


    @JsonProperty(value = "UF_CRM_CREATED_BY_ID")
    @Column(name = "uf_crm_created_by_id")
    private String UF_CRM_CREATED_BY_ID;

    @JsonProperty(value = "UF_CRM_19_1712141624452")
    @Column(name = "uf_crm_19_1712141624452")
    private Double UF_CRM_191712141624452;

    @JsonProperty(value = "UF_CRM_TAX_VALUE")
    @Column(name = "uf_crm_tax_value")
    private Double UF_CRM_TAX_VALUE;

    @JsonProperty(value = "UF_CRM_TAX_VALUE_ACCOUNT")
    @Column(name = "uf_crm_tax_value_account")
    private Double UF_CRM_TAX_VALUE_ACCOUNT;

    @JsonProperty(value = "UF_CRM_1710488751776")
    @Column(name = "uf_crm_1710488751776")
    private Double UF_CRM_1710488751776;


    @JsonProperty(value = "UF_CRM_TYPE_ID")
    @Column(name = "uf_crm_type_id")
    private String UF_CRM_TYPE_ID;


    @JsonProperty(value = "UF_CRM_19_1712062072500")
    @Column(name = "uf_crm_19_1712062072500")
    private String UF_CRM_191712062072500;


    @JsonProperty(value = "UF_CRM_EVENT_ID")
    @Column(name = "uf_crm_event_id")
    private String UF_CRM_EVENT_ID;


    @JsonProperty(value = "UF_CRM_1708061198")
    @Column(name = "uf_crm_1708061198")
    private String UF_CRM_1708061198;


    @JsonProperty(value = "UF_CRM_1708061134")
    @Column(name = "uf_crm_1708061134")
    private String UF_CRM_1708061134;


    @JsonProperty(value = "UF_CRM_1708060868")
    @Column(name = "uf_crm_1708060868")
    private String UF_CRM_1708060868;


    @JsonProperty(value = "UF_CRM_19_1712825479173")
    @Column(name = "uf_crm_19_1712825479173")
    private String UF_CRM_191712825479173;


    @JsonProperty(value = "UF_CRM_1708060402635")
    @Column(name = "uf_crm_1708060402635")
    private String UF_CRM_1708060402635;


    @JsonProperty(value = "UF_CRM_QWE")
    @Column(name = "uf_crm_qwe")
    private String UF_CRM_QWE;


    @JsonProperty(value = "UF_CRM_ASD2131")
    @Column(name = "uf_crm_asd2131")
    private String UF_CRM_ASD2131;

    @JsonProperty(value = "UF_CRM_1725356067981")
    @Column(name = "uf_crm_1725356067981")
    private String UF_CRM_1725356067981;


    @JsonProperty(value = "UF_CRM_1725360180023")
    @Column(name = "uf_crm_1725360180023")
    private String UF_CRM_1725360180023;


    @JsonProperty(value = "UF_CRM_1725361192")
    @Column(name = "uf_crm_1725361192")
    private String UF_CRM_1725361192;


    @JsonProperty(value = "UF_CRM_1725433521")
    @Column(name = "uf_crm_1725433521")
    private String UF_CRM_1725433521;

    @JsonProperty(value = "UF_CRM_1725530901724")
    @Column(name = "uf_crm_1725530901724")
    private String UF_CRM_1725530901724;


}