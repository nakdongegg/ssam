package com.example.demo.domain.consult.appointment.entity;

import com.example.demo.domain.user.student.entity.Student;
import com.example.demo.domain.user.teacher.entity.Teacher;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appointment_id;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher;

    @Column(length = 50)
    private String content;

    @Column
    private String access_code;

    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date start_time;

    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date end_time;

    @Convert(converter = AppointmentStatusConverter.class)
    private AppointmentStatus status;
}
