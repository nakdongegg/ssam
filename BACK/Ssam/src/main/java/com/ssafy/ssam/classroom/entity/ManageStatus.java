package com.ssafy.ssam.classroom.entity;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum ManageStatus {
    // 구현 필요
    WAITING("WAITING", "1"),
    ACCEPTED("ACCEPTED", "2"),
    BLOCKED("BLOCKED", "3");

    private String desc;
    private String legacyCode;

    ManageStatus(String desc, String legacyCode) {
        this.desc = desc;
        this.legacyCode = legacyCode;
    }

    public static ManageStatus ofLegacyCode(String legacyCode) {

        return Arrays.stream(ManageStatus.values())
                .filter(v -> v.getLegacyCode().equals(legacyCode))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(String.format("상태코드에 legacyCode=[%s]가 존재하지 않습니다.", legacyCode)));
    }
}
