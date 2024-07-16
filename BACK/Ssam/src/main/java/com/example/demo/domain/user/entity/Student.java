package com.example.demo.domain.user.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_id;

    @Column
    private Date birth;

    @Column
    private String student_phone;

    @Column
    private String studnet_name;

    @Column
    private String student_img;

    @Column
    private String parent_phone;

    @Column
    private String parent_name;

    @Column
    private String parent_relation;

    @Column(nullable = false, unique = true)
    private String username;

    @Column
    private String password;
}
