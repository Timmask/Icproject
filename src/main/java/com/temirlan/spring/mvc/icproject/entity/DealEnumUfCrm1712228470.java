package com.temirlan.spring.mvc.icproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnTransformer;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "deal_enum_uf_crm_1712228470")
public class DealEnumUfCrm1712228470 {
    @Id
//    @ColumnTransformer(forColumn = "external_id", read = "cast(external_id as varchar)")
    @Column(name = "external_id")
    private Integer externalId;

    @Column(name = "value")
    private String value;

}