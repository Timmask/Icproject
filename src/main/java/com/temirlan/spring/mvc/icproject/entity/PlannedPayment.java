package com.temirlan.spring.mvc.icproject.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "planned_payment")
public class   PlannedPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @JsonProperty(value = "cost_item")
    @Column(name = "cost_item")
    private String costItem;

    @JsonProperty(value = "receiver_counterparty")
    @Column(name = "receiver_counterparty")
    private String receiverCounterparty;

    @JsonProperty(value = "debit_plan")
    @Column(name = "debit_plan", nullable = false)
    private String debitPlan;

    @JsonProperty(value = "credit_plan")
    @Column(name = "credit_plan", nullable = false)
    private String creditPlan;

    @JsonProperty(value = "construction_site")
    @Column(name = "construction_site")
    private String constructionSite;

    @JsonProperty(value = "document_date")
    @Column(name = "document_date", nullable = false)
    private String documentDate;

}