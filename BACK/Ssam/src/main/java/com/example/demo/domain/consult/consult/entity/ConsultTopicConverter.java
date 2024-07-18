package com.example.demo.domain.consult.consult.entity;

import com.example.demo.domain.classroom.follow.entity.FollowStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class ConsultTopicConverter implements AttributeConverter<ConsultTopic, String> {

    @Override
    public String convertToDatabaseColumn(ConsultTopic consultTopic) {
        return consultTopic.getLegacyCode();
    }

    @Override
    public ConsultTopic convertToEntityAttribute(String dbData) {
        return ConsultTopic.ofLegacyCode(dbData);
    }
}
