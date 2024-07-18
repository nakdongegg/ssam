package com.example.demo.domain.user.teacher.entity;


import com.example.demo.domain.classroom.school.entity.School;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teacherId;

    @Column(nullable = false, length = 22)
    private String name;

    @Column(nullable = false, length = 11)
    @Size(min = 11, max = 11)
    private String phone;

    @Column(nullable = false, length = 45)
    private String email;

    @Column(length = 220)
    private String teacherImg;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "school_id")
    private School school;

    @Column(nullable = false, unique = true, length = 20)
    private String username;

    @Column(nullable = false)
    private String password;

    @Convert(converter = UserRoleConverter.class)
    @Column(nullable = false)
    private String role;

}
