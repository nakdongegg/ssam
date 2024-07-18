package com.example.demo.domain.consult.unavailableSlot.entity;

import com.example.demo.domain.user.teacher.entity.Teacher;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "teacher_unavailable_slots")
public class UnavailableSlot{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teacherUnavailableSlotId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;

}
