package com.ssafy.ssam.consult.entity;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum AppointmentStatus {

    BEFORE("BEFORE", "1"),
    DONE("DONE", "2"),
    CANCEL("CANCEL", "3");

    private String desc;
    private String legacyCode;

    AppointmentStatus(String desc, String legacyCode) {
        this.desc = desc;
        this.legacyCode = legacyCode;
    }

    public static AppointmentStatus ofLegacyCode(String legacyCode) {

        return Arrays.stream(AppointmentStatus.values())
                .filter(v -> v.getLegacyCode().equals(legacyCode))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(String.format("상태코드에 legacyCode=[%s]가 존재하지 않습니다.", legacyCode)));
    }
}
