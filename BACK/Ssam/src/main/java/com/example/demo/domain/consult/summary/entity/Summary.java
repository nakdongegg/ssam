package com.example.demo.domain.consult.summary.entity;

import com.example.demo.domain.consult.consult.entity.Consult;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Summary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int summaryId;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "consult_id", nullable = false)
    private Consult consult;

    @Column(nullable = false)
    private String keyPoints;

    @Column(nullable = false)
    private int profanityCount;

    // 변수 타입 논의 필요
    @Column(nullable = false, length = 10)
    private int profanityLevel;

    @Column
    private String parentConcerns;

    @Column
    private String teacherRecommendations;

    @Column
    private Date followUpDate;
}
