package com.example.demo.domain.classroom.follow.entity;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class FollowStatusConverter implements AttributeConverter<FollowStatus, String> {


    @Override
    public String convertToDatabaseColumn(FollowStatus status) {

        return status.getLegacyCode();
    }

    @Override
    public FollowStatus convertToEntityAttribute(String dbData) {

        return FollowStatus.ofLegacyCode(dbData);
    }
}
