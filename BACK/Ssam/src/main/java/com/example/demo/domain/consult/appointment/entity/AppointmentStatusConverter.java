package com.example.demo.domain.consult.appointment.entity;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class AppointmentStatusConverter implements AttributeConverter<AppointmentStatus, String> {

    @Override
    public String convertToDatabaseColumn(AppointmentStatus status) {

        return status.getLegacyCode();
    }

    @Override
    public AppointmentStatus convertToEntityAttribute(String dbData) {

        return AppointmentStatus.ofLegacyCode(dbData);
    }
}
