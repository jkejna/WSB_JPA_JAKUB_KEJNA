package com.capgemini.wsb.rest;

import com.capgemini.wsb.dto.TOVisitDetails;
import com.capgemini.wsb.rest.exception.EntityNotFoundException;
import com.capgemini.wsb.service.ServiceVisit;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class ControllerVisit {
    private final ServiceVisit serwisWizyt;

    public ControllerVisit(ServiceVisit serwisWizyt) {
        this.serwisWizyt = serwisWizyt;
    }

    @GetMapping("/visit/{patientId}")
    public ResponseEntity<List<TOVisitDetails>> znajdzWizytyWedlugIdPacjenta(@PathVariable Long patientId) {
        final List<TOVisitDetails> listaWizyt = serwisWizyt.getVisitsForPatient(patientId);
        if (listaWizyt.isEmpty()) {
            throw new EntityNotFoundException(patientId);
        }
        return ok(listaWizyt);
    }
}

