package com.example.demo.domain.server.activityLog.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;

@Entity
public class ActivityLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int activity_log_id;

    @Column(nullable = false, length = 4)
    private String activity_type;

    @Column(nullable = false)
    private int user_id;

    @Convert(converter = UserTypeConverter.class)
    @NotNull
    private UserType user_type;

    @Column(nullable = false)
    @CreatedDate
    private Timestamp act_time;

    @Column(nullable = false, length = 15)
    private String ip_address;


}
