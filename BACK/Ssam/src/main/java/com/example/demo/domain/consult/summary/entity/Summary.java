package com.example.demo.domain.consult.summary.entity;

import com.example.demo.domain.consult.consult.entity.Consult;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Summary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int summary_id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "consult_id", nullable = false)
    private Consult consult;

    @Column(nullable = false)
    private String key_points;

    @Column(nullable = false)
    private int profanity_count;

    // 변수 타입 논의 필요
    @Column(nullable = false, length = 10)
    private int profanity_level;

    @Column
    private String parent_concerns;

    @Column
    private String teacher_recommendations;

    @Column
    private Date follow_up_date;
}
