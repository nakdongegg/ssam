package com.ssafy.ssam.notification.entity;

import com.ssafy.ssam.notification.converter.AlarmTypeConverter;
import com.ssafy.ssam.user.entity.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
public class Alarm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alarm_id")
    private int alarmId;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Convert(converter = AlarmTypeConverter.class)
    @Column(name = "alarm_type", nullable = false)
    private AlarmType alarmType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @NotNull
    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private int state;

    @NotNull
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "alarm_time", nullable = false)
    private Date alarmTime;
}
