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
@Table(name = "bank_payment")
@ToString
public class BankPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bank_payment_id_gen")
    @SequenceGenerator(name = "bank_payment_id_gen", sequenceName = "bank_payment_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "date", length = Integer.MAX_VALUE)
    private String date;

    @Column(name = "number_document", length = 50)
    private String numberDocument;

    @Column(name = "sender_name", length = 200)
    private String senderName;

    @Column(name = "sender_bin", length = 200)
    private String senderBIN;

    @Column(name = "sender_iik", length = 200)
    private String senderIIK;

    @Column(name = "sender_bik", length = 200)
    private String senderBIK;

    @Column(name = "receiver_name", length = 200)
    private String receiverName;

    @Column(name = "receiver_bin", length = 200)
    private String receiverBIN;

    @Column(name = "receiver_iik", length = 200)
    private String receiverIIK;

    @Column(name = "receiver_bik", length = 200)
    private String receiverBIK;

    @Column(name = "debit")
    private BigDecimal debit;

    @Column(name = "credit")
    private BigDecimal credit;

    @Column(name = "purpose_of_payment", length = 200)
    private String purposeOfPayment;

    @Column(name = "rate")
    private BigDecimal rate;

    @Column(name = "article", length = 30)
    private String cost_items;

    @Column(name = "tru", length = 300)
    private String tru;

    @Column(name = "object", length = 100)
    private String object;

}