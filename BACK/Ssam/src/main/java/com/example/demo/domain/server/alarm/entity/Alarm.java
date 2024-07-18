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
    private int alarmId;

    @Convert(converter = AlarmTypeConverter.class)
    @NotNull
    private AlarmType alarmType;

    @Column(nullable = false)
    private int userId;

    @Convert(converter = UserTypeConverter.class)
    @NotNull
    private UserType userType;

    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private int state;

    @Column
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date alarmTime;
}
