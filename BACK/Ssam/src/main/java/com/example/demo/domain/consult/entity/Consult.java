package com.example.demo.domain.consult.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Consult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int consult_id;

    @Column
    private String consult_url;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "appointment_id", nullable = false)
    private Appointment appointment;

    @Column
    private Timestamp actual_date;

    @Column
    private int running_time;

    @Column
    private String content;

    @Column
    private String video_url;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "topic_id", nullable = true)
    private Topic topic;

    @Column
    private String webrtc_session_id;

}
