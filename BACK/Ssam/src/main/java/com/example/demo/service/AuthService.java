package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.LoginResponse;
import com.example.demo.model.User;

@Service
public class AuthService {

    public LoginResponse login(LoginRequest loginRequest) {
        // 실제 인증 로직 대신 더미 데이터 반환
    	
        if ("root".equals(loginRequest.getUsername()) && 
            "4321".equals(loginRequest.getPassword())) {
            User user = new User(1L, "SSAM", "ssam@example.com", 5L, 10L);
            String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9";
            String refreshToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9";
            return new LoginResponse(token, refreshToken, user);
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }
}