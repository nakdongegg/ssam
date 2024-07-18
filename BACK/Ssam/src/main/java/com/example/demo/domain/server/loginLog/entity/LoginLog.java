package com.example.demo.domain.server.loginLog.entity;

import com.example.demo.domain.server.activityLog.entity.UserType;
import com.example.demo.domain.server.activityLog.entity.UserTypeConverter;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
public class LoginLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loginLogId;

    @Column(nullable = false)
    private int userId;

    @Convert(converter = UserTypeConverter.class)
    @NotNull
    private UserType userType;

    @Column(nullable = false)
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date loginTime;

    @Column(nullable = false, length = 15)
    private String ipAddress;

    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private int success;

}
