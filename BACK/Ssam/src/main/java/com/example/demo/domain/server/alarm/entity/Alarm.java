package com.example.demo.domain.server.alarm.entity;

import com.example.demo.domain.server.activityLog.entity.UserType;
import com.example.demo.domain.server.activityLog.entity.UserTypeConverter;
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
    @Convert(converter = AlarmTypeConverter.class)
    @Column(name = "alarm_type", nullable = false)
    private AlarmType alarmType;

    @NotNull
    @Column(name = "user_id", nullable = false)
    private int userId;

    @NotNull
    @Convert(converter = UserTypeConverter.class)
    @Column(name = "user_type", nullable = false)
    private UserType userType;

    @NotNull
    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private int state;

    @NotNull
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "alarm_time", nullable = false)
    private Date alarmTime;
}
