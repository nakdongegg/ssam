package com.example.demo.domain.classroom.follow.entity;

import com.example.demo.domain.user.student.entity.Student;
import com.example.demo.domain.user.teacher.entity.Teacher;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
public class Follow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int follow_id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date followDate;

    @Convert(converter = FollowStatusConverter.class)
    private FollowStatus status;

}