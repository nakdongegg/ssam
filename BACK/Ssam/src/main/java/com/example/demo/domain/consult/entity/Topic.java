package com.example.demo.domain.consult.entity;

import jakarta.persistence.*;

@Entity
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int topic_id;

    @Column
    private String name;
}
