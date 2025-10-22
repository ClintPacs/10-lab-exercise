package com.appdev.furluv.pacanag3.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tblTransaction")
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionID;

    private LocalDate date;

    private Double amount;

    @Enumerated(EnumType.STRING)
    private Status status;

    public enum Status {
        PENDING, COMPLETED, CANCELLED
    }

    // Getters and Setters
    public Long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Long transactionID) {
        this.transactionID = transactionID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
