package com.example.demo.domain.server.activityLog.entity;

import com.example.demo.domain.classroom.follow.entity.FollowStatus;
import lombok.Getter;

import java.util.Arrays;

@Getter
public enum UserType {

    STUDENT("STUDENT", "1"),
    TEACHER("TEACHER", "2");

    private String desc;
    private String legacyCode;

    UserType(String desc, String legacyCode) {
        this.desc = desc;
        this.legacyCode = legacyCode;
    }

    public static UserType ofLegacyCode(String legacyCode) {

        return Arrays.stream(UserType.values())
                .filter(v -> v.getLegacyCode().equals(legacyCode))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(String.format("상태코드에 legacyCode=[%s]가 존재하지 않습니다.", legacyCode)));
    }

}
