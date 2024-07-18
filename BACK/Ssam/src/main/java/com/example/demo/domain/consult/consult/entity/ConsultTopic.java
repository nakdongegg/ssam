package com.example.demo.domain.consult.consult.entity;

import com.example.demo.domain.classroom.follow.entity.FollowStatus;
import lombok.Getter;

import java.util.Arrays;

@Getter
public enum ConsultTopic {

    FRIEND("FRIEND", "1"),
    BULLYING("BULLYING", "2"),
    SCORE("SCORE", "3"),
    CAREER("CAREER", "4"),
    ATTITUDE("ATTITUDE", "5"),
    OTHER("OTHER", "6");

    private String desc;
    private String legacyCode;

    ConsultTopic(String desc, String legacyCode) {
        this.desc = desc;
        this.legacyCode = legacyCode;
    }

    public static ConsultTopic ofLegacyCode(String legacyCode) {

        return Arrays.stream(ConsultTopic.values())
                .filter(v -> v.getLegacyCode().equals(legacyCode))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(String.format("상태코드에 legacyCode=[%s]가 존재하지 않습니다.", legacyCode)));
    }

}
