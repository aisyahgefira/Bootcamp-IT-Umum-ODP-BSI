package com.bsi.walled.service;

import org.springframework.stereotype.Service;

import com.bsi.walled.dto.UserRequest;
import com.bsi.walled.dto.UserResponse;
import com.bsi.walled.exception.DuplicateException;
import com.bsi.walled.mapper.UserMapper;
import com.bsi.walled.model.User;
import com.bsi.walled.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserResponse createUser(UserRequest request) {
        if (request.getPhoneNumber() != null &&
        userRepository.existsByPhoneNumber(request.getPhoneNumber())) {
            throw new DuplicateException("Phone number already in use");
        }
        if (userRepository.existsByEmail(request.getEmail()))
            throw new DuplicateException("Email already exists");
        if (userRepository.existsByUsername(request.getUsername()))
            throw new DuplicateException("Username already exists");
        User user = userMapper.toEntity(request);
        return userMapper.toResponse(userRepository.save(user));
        }
    }
