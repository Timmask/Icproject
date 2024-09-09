package com.temirlan.spring.mvc.icproject.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="planned_income")
public class PlannedIncome {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;


    @JsonProperty(value = "document_date")
    private String document_date;

    @JsonProperty(value = "object_construction")
    private String object_construction;

    @JsonProperty(value = "organization")
    private String organization;

    @JsonProperty(value = "receiver_counterparty")
    private String receiverCounterparty;

    @JsonProperty(value = "sum_income")
    private String sumIncome;


}
