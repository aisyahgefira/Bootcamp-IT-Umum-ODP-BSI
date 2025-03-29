package com.bsi.walled.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class WalletResponse {
    private Long id;
    private Long userId;
    private String accountNumber;
    private BigDecimal balance;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
