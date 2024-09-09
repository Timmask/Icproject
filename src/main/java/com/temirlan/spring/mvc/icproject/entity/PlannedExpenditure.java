package com.temirlan.spring.mvc.icproject.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PlannedExpenditure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @JsonProperty(value = "doc_type")
    private String doc_type;

    @JsonProperty(value = "cost_item")
    private String cost_item;

    @JsonProperty(value = "sum_expenditure")
    private String sum_expenditure;

    @JsonProperty(value = "document_date")
    private String document_date;

}
