package com.capgemini.wsb.service;

import com.capgemini.wsb.dto.TOPatient;
import com.capgemini.wsb.dto.TOShortenPatient;

import java.util.List;

public interface ServicePatient {
    TOPatient findPatientById(Long patientId);

    TOPatient deletePatient(Long patientId);

    List<TOShortenPatient> getPatientBySurname(String surname);

    List<TOPatient> getByCount(int visitCount);

    List<TOPatient> getPatientsTallerThan(double weight);
}
