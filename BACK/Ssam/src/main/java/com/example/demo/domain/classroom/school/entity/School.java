package com.example.demo.domain.classroom.school.entity;

import jakarta.persistence.*;

@Entity
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int schoolId;

    @Column(nullable = false, length = 21)
    private String name;

}
