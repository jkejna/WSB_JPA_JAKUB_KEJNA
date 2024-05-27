package com.capgemini.wsb.rest;

import com.capgemini.wsb.dto.TOPatient;
import com.capgemini.wsb.dto.TOShortenPatient;
import com.capgemini.wsb.rest.exception.EntityNotFoundException;
import com.capgemini.wsb.service.ServicePatient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.ResponseEntity.ok;

@RestController
public class ControllerPatient {

    private final ServicePatient servicePatient;

    public ControllerPatient(ServicePatient servicePatient) {this.servicePatient = servicePatient;}

    @GetMapping("/patient/{id}")
    public ResponseEntity<TOPatient> znajdzPacjentaPoId(@PathVariable final Long id) {
        final TOPatient patient = servicePatient.findPatientById(id);
        if(patient != null) {
            return ok(patient);
        }
        throw new EntityNotFoundException(id);
    }

    @PostMapping("/patient/remove/{id}")
    public ResponseEntity<TOPatient> usunPacjentaPoId(@PathVariable final Long id) {
        final TOPatient removedPatient = servicePatient.deletePatient(id);
        return new ResponseEntity<>(removedPatient, NO_CONTENT);
    }

        @GetMapping("/patient/lastName/{lastName}")
                public ResponseEntity<List<TOShortenPatient>> znajdzPacjentaPoNazwisku(@PathVariable final String lastName) {
            final List<TOShortenPatient> patients = servicePatient.getPatientBySurname(lastName);
            if (patients.isEmpty()) {
                throw new EntityNotFoundException(lastName);
            }
            return ok(patients);
        }

        @GetMapping("/patient/visits/{count}")
                public ResponseEntity<List<TOPatient>> znajdzPacjentaPoIlosciWizyt(@PathVariable int count) {
            final List<TOPatient> patients = servicePatient.getByCount(count);
            if (patients.isEmpty()) {
                throw new EntityNotFoundException(count);
            }
            return ok(patients);
        }

        @GetMapping("/patient/height/{value}")
                public ResponseEntity<List<TOPatient>> znajdzPacjentaPoWzroscie(@PathVariable double value) {
            final List<TOPatient> patients = servicePatient.getPatientsTallerThan(value);
            if (patients.isEmpty()) {
                throw new EntityNotFoundException(value);
            }
            return ok(patients);
        }
    }
