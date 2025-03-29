package com.example.demo2.service;

import com.example.demo2.exception.DuplicateEmailException; 
import com.example.demo2.exception.ResourceNotFoundException; 
import com.example.demo2.dto.UserDto; 
import com.example.demo2.mapper.UserMapper; 
import com.example.demo2.model.User; 
import com.example.demo2.repository.UserRepository; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
            .map(UserMapper.INSTANCE::toDto)
            .collect(Collectors.toList());
    }

    public UserDto getUserById(Long id) {
        User user = userRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException(null));
        return UserMapper.INSTANCE.toDto(user);
    }


}
