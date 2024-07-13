package com.example.demo.dto;

import com.example.demo.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginResponse {
    private String token;
    private String refreshToken;
    private User user;

    // Constructor, getters and setters
}