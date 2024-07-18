package com.example.demo.domain.user.teacher.entity;


import com.example.demo.domain.classroom.school.entity.School;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id")
    private int teacherId;

    @NotNull
    @Column(nullable = false, length = 22)
    private String name;

    @NotNull
    @Size(min = 11, max = 11)
    @Column(nullable = false, length = 11)
    private String phone;

    @NotNull
    @Column(nullable = false, length = 45)
    private String email;

    @Column(name = "teacher_img", length = 220)
    private String teacherImg;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "school_id")
    private School school;

    @NotNull
    @Column(nullable = false, unique = true, length = 20)
    private String username;

    @NotNull
    @Column(nullable = false)
    private String password;

    @NotNull
    @Convert(converter = UserRoleConverter.class)
    @Column(nullable = false)
    private String role;

}
