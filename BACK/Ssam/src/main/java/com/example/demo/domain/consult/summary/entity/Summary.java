package com.example.demo.domain.consult.summary.entity;

import com.example.demo.domain.consult.consult.entity.Consult;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

@Entity
public class Summary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "summary_id")
    private int summaryId;

    @NotNull
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "consult_id", nullable = false)
    private Consult consult;

    @NotNull
    @Column(name = "key_point", nullable = false)
    private String keyPoint;

    @NotNull
    @Column(name = "profanity_count", nullable = false)
    private int profanityCount;

    // 변수 타입 논의 필요
    @NotNull
    @Column(name = "profanity_level", nullable = false, length = 10)
    private int profanityLevel;

    @Column(name = "parent_concern")
    private String parentConcern;

    @Column(name = "teacher_recommendation")
    private String teacherRecommendation;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "follow_up_date")
    private Date followUpDate;
}
