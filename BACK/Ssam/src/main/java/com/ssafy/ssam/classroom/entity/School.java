package com.ssafy.ssam.classroom.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "school_id")
    private int schoolId;

    @NotNull
    @Column(nullable = false, length = 21)
    private String name;

}
