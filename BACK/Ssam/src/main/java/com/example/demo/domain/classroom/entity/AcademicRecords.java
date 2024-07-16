package com.example.demo.domain.classroom.entity;

import com.example.demo.domain.user.entity.Student;
import com.example.demo.domain.user.entity.Teacher;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "academic_records")
public class AcademicRecords {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int record_id;

    @Column
    @Temporal(TemporalType.DATE)
    private Date yymm;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "school_id", nullable = false)
    private School school;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher;

    @Column
    private int grade;

    @Column
    private int classroom;
}
