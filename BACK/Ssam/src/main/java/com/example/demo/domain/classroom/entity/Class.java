package com.example.demo.domain.classroom.entity;

import com.example.demo.domain.user.entity.Teacher;
import jakarta.persistence.*;

@Entity
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int class_id;

    @Column
    private String pin;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher;

    @Column
    private String banner;

    @Column
    private String banner_img;

    @Column
    private String notice;

    @Column
    private int grade;

    @Column
    private int classroom;
}
