package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.TOPatient;
import com.capgemini.wsb.dto.TOShortenPatient;
import com.capgemini.wsb.persistence.entity.PatientEntity;

import java.util.stream.Collectors;

public final class TOPatientMapper {

    public static TOPatient mapToTO(PatientEntity patient) {
        if(patient == null) {
            return null;
        }
        return new TOPatient(patient.getId(),
                patient.getFirstName(),
                patient.getLastName(),
                patient.getEmail(),
                patient.getHeight(),
                patient.getVisits().stream().map(TOVisitMapper::mapToTO).collect(Collectors.toList()));
    }

    public static TOShortenPatient mapToSimpleTO(PatientEntity patient) {
        if (patient == null) {
            return null;
        }
        return new TOShortenPatient(patient.getFirstName(),
                patient.getLastName());
    }
}
