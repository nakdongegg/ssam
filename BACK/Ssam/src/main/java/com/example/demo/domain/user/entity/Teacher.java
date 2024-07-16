package com.example.demo.domain.user.entity;


import com.example.demo.domain.classroom.entity.School;
import jakarta.persistence.*;
import org.hibernate.mapping.Join;

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

    @Column
    private String role;

}
