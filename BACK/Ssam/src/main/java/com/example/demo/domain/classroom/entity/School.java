package com.example.demo.domain.classroom.entity;

import jakarta.persistence.*;

@Entity
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int school_id;

    @Column
    private String name;

}
