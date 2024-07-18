package com.example.demo.domain.classroom.AcademicRecords.entity;

import com.example.demo.domain.classroom.school.entity.School;
import com.example.demo.domain.user.student.entity.Student;
import com.example.demo.domain.user.teacher.entity.Teacher;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.Date;

@Entity
@Table(name = "academic_records")
public class AcademicRecords {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int record_id;

    @Column
    @Size(min = 4, max = 4)
    private String yymm;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "school_id", nullable = false)
//    private School school;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "student_id", nullable = false)
//    private Student student;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "teacher_id", nullable = false)
//    private Teacher teacher;

    @Column
    private int school_id;

    @Column
    private int student_id;

    @Column
    private int teacher_id;

    @Column
    private int grade;

    @Column
    private int classroom;
}
