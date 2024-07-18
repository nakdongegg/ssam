package com.example.demo.domain.consult.consult.entity;

import com.example.demo.domain.consult.appointment.entity.Appointment;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
public class Consult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int consultId;

    @Column
    private String consultUrl;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "appointment_id", nullable = false)
    private Appointment appointment;

    @Column
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualDate;

    @Column(nullable = false)
    private int runningTime;

    @Column(columnDefinition = "MEDIUMTEXT")
    private String content;

    @Column
    private String videoUrl;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "topic_id", nullable = true)
//    private Topic topic;

    @Convert(converter = ConsultTopicConverter.class)
    private ConsultTopic topic;

    @Column(length = 100)
    private String webrtcSessionId;

    @Column
    private String accessCode;

}
