package com.example.demo.domain.classroom.entity;

import com.example.demo.domain.user.entity.Student;
import com.example.demo.domain.user.entity.Teacher;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class Follow {
    // 관계 설정 관련 추가해야함
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
    @Column
    private LocalDateTime follow_date = LocalDateTime.now();

    // private enum status;

}


