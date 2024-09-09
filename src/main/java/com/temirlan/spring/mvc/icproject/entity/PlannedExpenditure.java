package com.temirlan.spring.mvc.icproject.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="planned_expenditure")
public class PlannedExpenditure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @JsonProperty(value = "document_date")
    @Column(name = "document_date")
    private String document_date;

    @JsonProperty(value = "object_construction")
    @Column(name = "object_construction")
    private String object_construction;

    @JsonProperty(value = "organization")
    @Column(name = "organization")
    private String organization;

    @JsonProperty(value = "cost_item")
    @Column(name = "cost_item")
    private String cost_item;

    @JsonProperty(value = "sum_expenditure")
    @Column(name = "sum_expenditure")
    private String sum_expenditure;



}
