package com.capgemini.wsb.service;

import com.capgemini.wsb.dto.TOVisitDetails;

import java.util.List;

public interface ServiceVisit {
    List<TOVisitDetails> getVisitsForPatient(Long patientId);
}
