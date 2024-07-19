package com.ssafy.ssam.user.converter;

import com.ssafy.ssam.user.entity.UserRole;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class UserRoleConverter implements AttributeConverter<UserRole, String> {

    @Override
    public String convertToDatabaseColumn(UserRole status) {

        return status.getLegacyCode();
    }

    @Override
    public UserRole convertToEntityAttribute(String dbData) {

        return UserRole.ofLegacyCode(dbData);
    }

}
