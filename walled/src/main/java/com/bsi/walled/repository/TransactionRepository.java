package com.bsi.walled.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bsi.walled.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    @Query("SELECT t FROM Transaction t WHERE t.wallet.id = :walletId OR t.recipientWallet.id = :walletId")
    List<Transaction> findAllByWalletIdOrRecipientWalletId(@Param("walletId") Long WalletId);
    
}
