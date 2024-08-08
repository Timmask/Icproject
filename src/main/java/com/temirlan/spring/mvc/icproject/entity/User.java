package com.temirlan.spring.mvc.icproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "\"user\"")
public class User {
    @Id
    @Column(name = "external_id")
    private Integer externalId;

    @Column(name = "deleted")
    private Boolean deleted;

    
    
    @Column(name = "xml_id")
    private String xmlId;

    
    
    @Column(name = "active")
    private String active;

    
    
    @Column(name = "name")
    private String name;

    
    
    @Column(name = "last_name")
    private String lastName;

    
    
    @Column(name = "second_name")
    private String secondName;

    
    
    @Column(name = "title")
    private String title;

    
    
    @Column(name = "email")
    private String email;

    
    
    @Column(name = "last_login")
    private String lastLogin;

    
    
    @Column(name = "date_register")
    private String dateRegister;

    
    
    @Column(name = "time_zone")
    private String timeZone;

    
    
    @Column(name = "is_online")
    private String isOnline;

    
    
    @Column(name = "time_zone_offset")
    private String timeZoneOffset;

    
    
    @Column(name = "timestamp_x")
    private String timestampX;

    
    
    @Column(name = "last_activity_date")
    private String lastActivityDate;

    
    
    @Column(name = "personal_gender")
    private String personalGender;

    
    
    @Column(name = "personal_profession")
    private String personalProfession;

    
    
    @Column(name = "personal_www")
    private String personalWww;

    
    
    @Column(name = "personal_birthday")
    private String personalBirthday;

    
    
    @Column(name = "personal_photo")
    private String personalPhoto;

    
    
    @Column(name = "personal_icq")
    private String personalIcq;

    
    
    @Column(name = "personal_phone")
    private String personalPhone;

    
    
    @Column(name = "personal_fax")
    private String personalFax;

    
    
    @Column(name = "personal_mobile")
    private String personalMobile;

    
    
    @Column(name = "personal_pager")
    private String personalPager;

    
    
    @Column(name = "personal_street")
    private String personalStreet;

    
    
    @Column(name = "personal_city")
    private String personalCity;

    
    
    @Column(name = "personal_state")
    private String personalState;

    
    
    @Column(name = "personal_zip")
    private String personalZip;

    
    
    @Column(name = "personal_country")
    private String personalCountry;

    
    
    @Column(name = "personal_mailbox")
    private String personalMailbox;

    
    
    @Column(name = "personal_notes")
    private String personalNotes;

    
    
    @Column(name = "work_phone")
    private String workPhone;

    
    
    @Column(name = "work_company")
    private String workCompany;

    
    
    @Column(name = "work_position")
    private String workPosition;

    
    
    @Column(name = "work_department")
    private String workDepartment;

    
    
    @Column(name = "work_www")
    private String workWww;

    
    
    @Column(name = "work_fax")
    private String workFax;

    
    
    @Column(name = "work_pager")
    private String workPager;

    
    
    @Column(name = "work_street")
    private String workStreet;

    
    
    @Column(name = "work_mailbox")
    private String workMailbox;

    
    
    @Column(name = "work_city")
    private String workCity;

    
    
    @Column(name = "work_state")
    private String workState;

    
    
    @Column(name = "work_zip")
    private String workZip;

    
    
    @Column(name = "work_country")
    private String workCountry;

    
    
    @Column(name = "work_profile")
    private String workProfile;

    
    
    @Column(name = "work_logo")
    private String workLogo;

    
    
    @Column(name = "work_notes")
    private String workNotes;

    
    
    @Column(name = "uf_skype_link")
    private String ufSkypeLink;

    
    
    @Column(name = "uf_zoom")
    private String ufZoom;

    
    
    @Column(name = "uf_employment_date")
    private String ufEmploymentDate;

    
    
    @Column(name = "uf_timeman")
    private String ufTimeman;

    
    
    @Column(name = "uf_department")
    private String ufDepartment;

    
    
    @Column(name = "uf_interests")
    private String ufInterests;

    
    
    @Column(name = "uf_skills")
    private String ufSkills;

    
    
    @Column(name = "uf_web_sites")
    private String ufWebSites;

    
    
    @Column(name = "uf_xing")
    private String ufXing;

    
    
    @Column(name = "uf_linkedin")
    private String ufLinkedin;

    
    
    @Column(name = "uf_facebook")
    private String ufFacebook;

    
    
    @Column(name = "uf_twitter")
    private String ufTwitter;

    
    
    @Column(name = "uf_skype")
    private String ufSkype;

    
    
    @Column(name = "uf_district")
    private String ufDistrict;

    
    
    @Column(name = "uf_phone_inner")
    private String ufPhoneInner;

    
    
    @Column(name = "user_type")
    private String userType;

}