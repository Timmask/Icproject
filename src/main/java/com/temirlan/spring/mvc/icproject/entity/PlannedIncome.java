package com.temirlan.spring.mvc.icproject.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PlannedIncome {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @JsonProperty(value = "doc_type")
    private String docType;

    @JsonProperty(value = "receiver_counterparty")
    private String receiverCounterparty;

    @JsonProperty(value = "sum_income")
    private String sumIncome;

    @JsonProperty(value = "document_date")
    private String documentDate;

}
