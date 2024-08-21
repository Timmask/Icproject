package com.temirlan.spring.mvc.icproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "bank_payment")
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

    @Column(name = "sender", length = 200)
    private String sender;

    @Column(name = "receiver", length = 200)
    private String receiver;

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