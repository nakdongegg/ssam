package com.example.demo.domain.consult.consult.entity;

import com.example.demo.domain.consult.appointment.entity.Appointment;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
public class Consult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "consult_id")
    private int consultId;

    @Column(name = "consult_url")
    private String consultUrl;

    @NotNull
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "appointment_id", nullable = false)
    private Appointment appointment;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "actual_date")
    private Date actualDate;

    @NotNull
    @Column(name = "running_time", nullable = false)
    private int runningTime;

    @Column(columnDefinition = "MEDIUMTEXT")
    private String content;

    @Column(name = "video_url")
    private String videoUrl;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "topic_id", nullable = true)
//    private Topic topic;

    @Convert(converter = ConsultTopicConverter.class)
    private ConsultTopic topic;

    @Column(name = "webrtc_session_id", length = 100)
    private String webrtcSessionId;

    @Column(name = "access_code")
    private String accessCode;

}
