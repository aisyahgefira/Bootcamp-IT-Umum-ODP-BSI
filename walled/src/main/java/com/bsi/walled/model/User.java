package com.bsi.walled.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 255)
    private String email;

    @Column(nullable = false, length = 20)
    private String username;

    @Column(nullable = false, length = 70)
    private String fullname;

    @Column(nullable = false)
    private String password;

    @Column(name = "avatar_url")
    private String avatarUrl;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;

}
