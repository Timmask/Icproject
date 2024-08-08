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
@Table(name = "deal_enum_uf_crm_1708595011927")
public class DealEnumUfCrm1708595011927 {
    @Id
    @Column(name = "external_id")
    private Integer externalId;

    @Column(name = "value")
    private String value;

}