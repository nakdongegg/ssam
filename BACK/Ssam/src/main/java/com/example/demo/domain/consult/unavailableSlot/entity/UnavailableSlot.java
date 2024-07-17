package com.example.demo.domain.consult.unavailableSlot.entity;

import com.example.demo.domain.user.teacher.entity.Teacher;
import jakarta.persistence.*;

import java.sql.Timestamp;

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
    private Timestamp start_time;

    @Column
    private Timestamp end_time;

}
