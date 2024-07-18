package com.example.demo.domain.classroom.classroom.entity;

import com.example.demo.domain.user.teacher.entity.Teacher;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int class_id;

    @NotNull
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher;

    @Column(length = 45)
    private String pin;

    @Column
    private String banner;

    @Column
    private String banner_img;

    @Column
    private String notice;

    @Column(columnDefinition = "TINYINT CHECK (grade BETWEEN 1 AND 6)")
    private int grade;

    @Column
    private int classroom;
}
