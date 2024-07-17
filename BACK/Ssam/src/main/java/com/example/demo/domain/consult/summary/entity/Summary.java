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

    @Column
    private String key_points;

    @Column
    private int profanity_count;

    @Column
    private int profanity_level;

    @Column
    private String parent_concerns;

    @Column
    private String teacher_recommendations;

    @Column
    private Date follow_up_date;
}
