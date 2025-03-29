package com.example.demo2.exception;

public class DuplicateEmailException extends RuntimeException {
    public DuplicateEmailException(String message) {
        super(message);
    }
}
