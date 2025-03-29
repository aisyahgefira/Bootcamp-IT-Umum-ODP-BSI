package com.bsi.walled.dto;

import java.math.BigDecimal;

import com.bsi.walled.model.Transaction.TransactionType;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TransactionRequest {
    @NotNull
    private Long walletId;
    @NotNull
    private TransactionType transactionType;
    @DecimalMin("0.01") @NotNull
    private BigDecimal amount;
    private String recipientAccountNumber;
    private String description;
}
