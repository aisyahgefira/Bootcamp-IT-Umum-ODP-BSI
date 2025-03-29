package com.example.demo2.exception;

import org.springframework.http.HttpStatus; 
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.ControllerAdvice; 

import org.springframework.web.bind.annotation.ExceptionHandler;
import java.sql.SQLIntegrityConstraintViolationException; 
import java.time.LocalDateTime; 
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String, Object>>
    handleResourceNotFoundException(ResourceNotFoundException ex) {
        Map<String, Object> response = new HashMap<>();
        response.put("timestamp", LocalDateTime.now());
        response.put("message", ex.getMessage());
        response.put("status", HttpStatus.NOT_FOUND.value());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
}
