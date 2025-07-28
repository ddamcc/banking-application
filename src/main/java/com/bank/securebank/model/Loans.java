package com.bank.securebank.model;

import jakarta.persistence.*;
import lombok.*;


import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "loans")
public class Loans {

    @Id
    @Column(name = "loan_number")
    private Long loanNumber;

    @Column(name = "customer_id")
    private long customerId;

    @Column(name = "start_dt")
    private Date startDt;

    @Column(name = "loan_type")
    private String loanType;

    @Column(name = "total_loan")
    private int totalLoan;

    @Column(name = "amount_paid")
    private int amountPaid;

    @Column(name = "outstanding_amount")
    private int outstandingAmount;

    @Column(name = "create_dt")
    private Date createDt;
}
