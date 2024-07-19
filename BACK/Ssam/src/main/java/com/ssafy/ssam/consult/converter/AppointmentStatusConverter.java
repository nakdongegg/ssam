package com.ssafy.ssam.consult.converter;

import com.ssafy.ssam.consult.entity.AppointmentStatus;
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
