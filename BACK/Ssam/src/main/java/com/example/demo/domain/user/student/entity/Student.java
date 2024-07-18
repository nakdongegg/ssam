package com.example.demo.domain.user.student.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.Date;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date birth;

    @Column
    @Size(min = 11, max = 11)
    private String studentPhone;

    @Column(length = 22)
    private String studentName;

    @Column
    private String studentImg;

    @Column
    @Size(min = 11, max = 11)
    private String parentPhone;

    @Column(length = 22)
    private String parentName;

    @Column(length = 1)
    private String parentRelation;

    @Column(nullable = false, unique = true, length = 20)
    private String username;

    @Column(nullable = false)
    private String password;
}
