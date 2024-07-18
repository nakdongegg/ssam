package com.example.demo.domain.server.loginLog.entity;

import com.example.demo.domain.server.activityLog.entity.UserType;
import com.example.demo.domain.server.activityLog.entity.UserTypeConverter;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;

@Entity
public class LoginLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int login_log_id;

    @Column(nullable = false)
    private int user_id;

    @Convert(converter = UserTypeConverter.class)
    @NotNull
    private UserType user_type;

    @Column(nullable = false)
    @CreatedDate
    private Timestamp login_time;

    @Column(nullable = false, length = 15)
    private String ip_address;

    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private int success;

}
