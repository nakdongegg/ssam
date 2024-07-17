package com.example.demo.domain.user.teacher.entity;


import com.example.demo.domain.classroom.school.entity.School;
import jakarta.persistence.*;

@Entity
public class Teacher {
    // Teacher Entity(Table)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teacher_id;

    @Column
    private String name;

    @Column
    private String phone;

    @Column
    private String email;

    @Column
    private String teacher_img;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "school_id", nullable = false)
    private School school;

    @Column(nullable = false, unique = true)
    private String username;

    @Column
    private String password;

    @Convert(converter = UserRoleConverter.class)
    private String role;

}
