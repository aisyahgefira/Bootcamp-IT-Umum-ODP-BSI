package com.bsi.walled.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bsi.walled.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
    boolean existsByUsername(String username);
    boolean existsByPhoneNumber(String phoneNumber);
    
}
