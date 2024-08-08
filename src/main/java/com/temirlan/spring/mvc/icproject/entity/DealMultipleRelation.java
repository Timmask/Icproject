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
@Table(name = "deal_multiple_relations")
public class DealMultipleRelation {
    @Id
    @Column(name = "field")
    private String field;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "is_external_id")
    private Short isExternalId;

    @Column(name = "is_json")
    private Short isJson;

    @Column(name = "value", length = Integer.MAX_VALUE)
    private String value;

}