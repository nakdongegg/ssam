package com.ssafy.ssam.analytics.entity;

import com.example.demo.domain.server.activityLog.entity.UserType;
import com.example.demo.domain.server.activityLog.entity.UserTypeConverter;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Table(name = "activity_log")
public class ActivityLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "activity_log_id")
    private int activityLogId;

    @NotNull
    @Column(name = "activity_type", nullable = false, length = 45)
    private String activityType;

    @NotNull
    @Column(name = "user_id", nullable = false)
    private int userId;

    @NotNull
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "act_time", nullable = false)
    private Date actTime;

    @Column(nullable = false, length = 15)
    private String ipAddress;

}
