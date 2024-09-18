package com.temirlan.spring.mvc.icproject.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "payment_order_uid", nullable = false, length = 50)
    @JsonProperty(value="paymentOrderUID")
    private String paymentOrderUid;

    @Column(name = "organization_bin", nullable = false)
    @JsonProperty(value="OrganizationBIN")
    private String organizationBin;

    @Column(name = "counterparty_bin", nullable = false)
    @JsonProperty(value="CounterpartyBIN")
    private String counterpartyBin;

    @Column(name = "payment_order_date", nullable = false, length = 30)
    @JsonProperty(value="paymentOrderDate")
    private String paymentOrderDate;

    @Column(name = "payment_order_number", nullable = false, length = 10)
    @JsonProperty(value="paymentOrderNumber")
    private String paymentOrderNumber;

    @Column(name = "sender_name", nullable = false, length = 30)
    @JsonProperty(value="senderName")
    private String senderName;

    @Column(name = "sender_bin", nullable = false)
    @JsonProperty(value="senderBIN")
    private String senderBin;

    @Column(name = "sender_iik", nullable = false)
    @JsonProperty(value="senderIIk")
    private String senderIik;

    @Column(name = "sender_bik", nullable = false, length = 30)
    @JsonProperty(value="senderBIK")
    private String senderBik;

    @Column(name = "receiver_name", nullable = false, length = 20)
    @JsonProperty(value="receiverName")
    private String receiverName;

    @Column(name = "receiver_bin", nullable = false)
    @JsonProperty(value="receiverBIN")
    private String receiverBin;

    @Column(name = "receiver_iik", nullable = false)
    @JsonProperty(value="receiverIIK")
    private String receiverIik;

    @Column(name = "receiver_bik", nullable = false, length = 20)
    @JsonProperty(value="receiverBIK")
    private String receiverBik;

    @Column(name = "debit", length = 50)
    @JsonProperty(value="debit")
    private String debit;

    @Column(name = "credit" )
    @JsonProperty(value="credit")
    private Integer credit;

    @Column(name = "purpose_of_payment", length = 30)
    @JsonProperty(value="purposeOfPayment")
    private String purposeOfPayment;

    @Column(name = "rate" )
    @JsonProperty(value="rate")
    private Integer rate;

    @Column(name = "cost_items", length = 30)
    @JsonProperty(value="cost_items")
    private String costItems;

    @Column(name = "tru", length = 30)
    @JsonProperty(value="tru")
    private String tru;

    @Column(name = "object", length = 30)
    @JsonProperty(value="object")
    private String object;

}