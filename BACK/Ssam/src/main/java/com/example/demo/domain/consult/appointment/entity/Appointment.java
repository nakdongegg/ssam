package com.example.demo.domain.consult.appointment.entity;

import com.example.demo.domain.user.student.entity.Student;
import com.example.demo.domain.user.teacher.entity.Teacher;
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

    @Column(length = 50)
    private String content;

    @Column
    private String access_code;

    @Column
    private LocalDateTime start_time;

    @Column
    private LocalDateTime end_time;

    @Convert(converter = AppointmentStatusConverter.class)
    private AppointmentStatus status;
}
