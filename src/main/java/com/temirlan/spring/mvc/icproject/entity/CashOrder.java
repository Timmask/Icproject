package com.temirlan.spring.mvc.icproject.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "cash_order")
@ToString
public class CashOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Integer id;

    @JsonProperty(value="paymentOrderUID")
    @Column(name = "payment_order_uid")
    private String paymentOrderUid;

    @JsonProperty(value="operationType")
    @Column(name = "operation_type")
    private String operationType;

    @JsonProperty(value="OrganizationBIN")
    @Column(name = "organization_bin")
    private String organizationBin;

    @JsonProperty(value="CounterpartyBIN")
    @Column(name = "counterparty_bin")
    private String counterpartyBin;

    @JsonProperty(value="paymentOrderDate")
    @Column(name = "payment_order_date", length = 50)
    private String paymentOrderDate;

    @JsonProperty(value="paymentOrderNumber")
    @Column(name = "payment_order_number")
    private String paymentOrderNumber;

    @JsonProperty(value="cashRegisterName")
    @Column(name = "cash_register_name")
    private String cashRegisterName;

    @JsonProperty(value="KKMCheckNumber")
    @Column(name = "kkm_check_number")
    private Integer kKMCheckNumber;

    @JsonProperty(value="senderName")
    @Column(name = "sender_name")
    private String senderName;

    @JsonProperty(value="senderBIN")
    @Column(name = "sender_bin")
    private String senderBin;

    @JsonProperty(value="receiverName")
    @Column(name = "receiver_name")
    private String receiverName;

    @JsonProperty(value="receiverBIN")
    @Column(name = "receiver_bin")
    private String receiverBin;

    @JsonProperty(value="debit")
    @Column(name = "debit")
    private BigDecimal debit;

    @JsonProperty(value="credit")
    @Column(name = "credit")
    private BigDecimal credit;

    @JsonProperty(value="purposeOfPayment")
    @Column(name = "purpose_of_payment")
    private String purposeOfPayment;

    @JsonProperty(value="rate")
    @Column(name = "rate")
    private Float rate;

    @JsonProperty(value="cost_items")
    @Column(name = "cost_items")
    private String costItems;

    @JsonProperty(value="tru")
    @Column(name = "tru")
    private String tru;

    @JsonProperty(value="object")
    @Column(name = "object")
    private String object;


}