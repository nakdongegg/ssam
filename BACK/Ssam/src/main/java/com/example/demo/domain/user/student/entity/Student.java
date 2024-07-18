package com.example.demo.domain.user.student.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Date;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int studentId;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date birth;

    @Size(min = 11, max = 11)
    @Column(name = "student_phone")
    private String studentPhone;

    @Column(name = "student_name", length = 22)
    private String studentName;

    @Column(name = "student_img")
    private String studentImg;

    @Size(min = 11, max = 11)
    @Column(name = "parent_phone")
    private String parentPhone;

    @Column(name = "parent_name",length = 22)
    private String parentName;

    @Column(name = "parent_relation",length = 1)
    private String parentRelation;

    @NotNull
    @Column(nullable = false, unique = true, length = 20)
    private String username;

    @NotNull
    @Column(nullable = false)
    private String password;
}
