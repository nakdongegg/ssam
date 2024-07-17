package com.example.demo.domain.user.teacher.entity;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum UserRole {

    USER("USER", "1"),
    ADMIN("ADMIN", "2");

    private String desc;
    private String legacyCode;

    UserRole(String desc, String legacyCode) {
        this.desc = desc;
        this.legacyCode = legacyCode;
    }

    public static UserRole ofLegacyCode(String legacyCode) {

        return Arrays.stream(UserRole.values())
                .filter(v -> v.getLegacyCode().equals(legacyCode))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(String.format("상태코드에 legacyCode=[%s]가 존재하지 않습니다.", legacyCode)));
    }
}
