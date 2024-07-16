package com.example.demo.domain.consult.entity;

import com.example.demo.domain.user.entity.Student;
import com.example.demo.domain.user.entity.Teacher;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appointment_id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher;

    @Column
    private String access_code;

    @Column
    private LocalDateTime start_time;

    @Column
    private LocalDateTime end_time;

    // status enum 추가 필요
    // private int status;
}
