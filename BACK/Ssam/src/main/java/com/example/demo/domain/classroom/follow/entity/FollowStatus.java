package com.example.demo.domain.classroom.follow.entity;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum FollowStatus {
    // 구현 필요
    WAITING("WAITING", "1"),
    ACCEPTED("ACCEPTED", "2");

    private String desc;
    private String legacyCode;

    FollowStatus(String desc, String legacyCode) {
        this.desc = desc;
        this.legacyCode = legacyCode;
    }

    public static FollowStatus ofLegacyCode(String legacyCode) {

        return Arrays.stream(FollowStatus.values())
                .filter(v -> v.getLegacyCode().equals(legacyCode))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(String.format("상태코드에 legacyCode=[%s]가 존재하지 않습니다.", legacyCode)));
    }
}
