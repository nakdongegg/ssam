package com.example.demo.domain.server.activityLog.entity;

import com.example.demo.domain.classroom.follow.entity.FollowStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;


@Converter
public class UserTypeConverter implements AttributeConverter<UserType, String> {

    @Override
    public String convertToDatabaseColumn(UserType userType) {

        return userType.getLegacyCode();
    }

    @Override
    public UserType convertToEntityAttribute(String dbData) {

        return UserType.ofLegacyCode(dbData);
    }
}
