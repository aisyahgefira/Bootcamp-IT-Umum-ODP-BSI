package com.bsi.walled.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bsi.walled.model.Walled;

public interface WalledRepository extends JpaRepository<Walled, Long> {
    Optional<Walled> findByAccountNumber(String accountNumber);
    boolean existByByAccountNumber(String accountNumber);
    
}
