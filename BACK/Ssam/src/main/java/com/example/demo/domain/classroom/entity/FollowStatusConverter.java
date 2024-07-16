package com.example.demo.domain.classroom.entity;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class FollowStatusConverter implements AttributeConverter<FollowStatus, String> {


    @Override
    public String convertToDatabaseColumn(FollowStatus followStatus) {
        return "";
    }

    @Override
    public FollowStatus convertToEntityAttribute(String dbData) {
        return null;
    }
}
