package com.ssafy.ssam.notification.entity;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum AlarmType {

    ANSWER("ANSWER", "1"),
    QUESTION("QUESTION", "2"),
    REGISTRATION("REGISTRATION", "3"),
    ACCEPT("ACCEPT", "4");

    private String desc;
    private String legacyCode;

    AlarmType(String desc, String legacyCode) {
        this.desc = desc;
        this.legacyCode = legacyCode;
    }

    public static AlarmType ofLegacyCode(String legacyCode) {

        return Arrays.stream(AlarmType.values())
                .filter(v -> v.getLegacyCode().equals(legacyCode))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(String.format("상태코드에 legacyCode=[%s]가 존재하지 않습니다.", legacyCode)));
    }

}
