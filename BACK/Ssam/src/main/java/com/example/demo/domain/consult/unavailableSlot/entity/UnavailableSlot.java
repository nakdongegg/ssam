package com.example.demo.domain.consult.unavailableSlot.entity;

import com.example.demo.domain.user.teacher.entity.Teacher;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

@Entity
@Table(name = "teacher_unavailable_slot")
public class UnavailableSlot{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_unavailable_slot_id")
    private int teacherUnavailableSlotId;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "start_time", nullable = false)
    private Date startTime;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "end_time", nullable = false)
    private Date endTime;

}
