package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private String email;
    private Long schoolId;
    private Long classId;

    // Constructor, getters and setters
}