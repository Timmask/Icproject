package com.temirlan.spring.mvc.icproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "deal_enum_uf_crm_1712228470")
public class DealEnumUfCrm1712228470 {
    @Id
    @Column(name = "external_id")
    private Integer externalId;

    @OneToMany(mappedBy = "ipName",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<Deal> deals;

    @Column(name = "value")
    private String value;

}