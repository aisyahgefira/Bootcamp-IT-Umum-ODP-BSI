package com.example.demo2.controller;

import com.example.demo2.dto.UserDto;
import com.example.demo2.service.UserService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping
    public ResponseEntity<UserDto> getUserById(@PathVariable) {
        return ResponseEntity.ok(userService.getUserById(id));
    }
    
}
