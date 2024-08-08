package com.temirlan.spring.mvc.icproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "deal_enum_uf_crm_1713935333604")
public class DealEnumUfCrm1713935333604 {
    @Id
    @Column(name = "external_id")
    private Integer externalId;

    @Column(name = "value")
    private String value;

}