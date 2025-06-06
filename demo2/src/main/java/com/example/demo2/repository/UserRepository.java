package com.example.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo2.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query method (if needed)
    User findByEmail(String email);
    boolean existsByEmail(String email);   

    User deleteByName(String name);
}
