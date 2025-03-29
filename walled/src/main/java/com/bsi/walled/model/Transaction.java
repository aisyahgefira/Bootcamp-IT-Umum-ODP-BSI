package com.bsi.walled.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "transactions")
@Data
public class Transaction {
    public enum TransactionType { TOP_UP, TRANSFER }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "wallet_id", nullable = false)
    private Walled wallet;

    @Enumerated(EnumType.STRING)
    @Column(name = "transaction_type", nullable = false)
    private TransactionType transactionType;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "recipient_wallet_id")
    private Walled recipientWallet;

    @Column(name = "transaction_date")
    private LocalDateTime transactionDate = LocalDateTime.now();

    private String description;
}
