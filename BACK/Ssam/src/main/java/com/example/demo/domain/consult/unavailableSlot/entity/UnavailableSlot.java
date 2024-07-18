package com.example.demo.domain.consult.unavailableSlot.entity;

import com.example.demo.domain.user.teacher.entity.Teacher;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "teacher_unavailable_slots")
public class UnavailableSlot{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teacher_unavailable_slot_id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher;

    @Column
    private LocalDateTime start_time;

    @Column
    private LocalDateTime end_time;

}
