package com.example.demo.domain.server.alarm.entity;

import com.example.demo.domain.server.activityLog.entity.UserType;
import com.example.demo.domain.server.activityLog.entity.UserTypeConverter;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;

@Entity
public class Alarm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int alarm_id;

    @Convert(converter = AlarmTypeConverter.class)
    @NotNull
    private AlarmType alarm_type;

    @Column(nullable = false)
    private int user_id;

    @Convert(converter = UserTypeConverter.class)
    @NotNull
    private UserType user_type;

    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private int state;

    @Column
    @CreatedDate
    private Timestamp alarm_time;
}
