package com.example.demo.domain.classroom.entity;

import lombok.Getter;

@Getter
public enum FollowStatus {
    // 구현 필요
    WAITING("WAITING", "1"),
    ACCEPTED("ACCEPTED", "2");

    FollowStatus(String accepted, String number) {

    }
}
