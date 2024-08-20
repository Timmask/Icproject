package com.temirlan.spring.mvc.icproject.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="accounting")
public class Accounting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="date")
    private String date;

    @Column(name="number")
    private String number;

    @Column(name="organization")
    private String organization;

    @Column(name="bank_account")
    private String bankAccount;

    @Column(name="income")
    private double income;

    @Column(name="consumption")
    private double consumption;

    @Column(name="author")
    private String author;

    @Column(name="comment")
    private String comment;
}
