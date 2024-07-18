package com.example.demo.domain.server.activityLog.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
public class ActivityLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int activityLogId;

    @Column(nullable = false, length = 4)
    private String activityType;

    @Column(nullable = false)
    private int userId;

    @Convert(converter = UserTypeConverter.class)
    @NotNull
    private UserType userType;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date actTime;

    @Column(nullable = false, length = 15)
    private String ipAddress;


}
