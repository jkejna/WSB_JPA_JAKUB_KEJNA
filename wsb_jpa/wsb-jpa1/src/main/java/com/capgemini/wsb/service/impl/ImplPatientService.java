package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.dto.TOPatient;
import com.capgemini.wsb.dto.TOShortenPatient;
import com.capgemini.wsb.mapper.TOPatientMapper;
import com.capgemini.wsb.persistence.dao.PatientDAO;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.rest.exception.EntityNotFoundException;
import com.capgemini.wsb.service.ServicePatient;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.capgemini.wsb.mapper.TOPatientMapper.mapToTO;
import static java.util.stream.Collectors.toList;

@Service
@Transactional
public class ImplPatientService implements ServicePatient {
    private final PatientDAO daoPatient;

    public ImplPatientService(PatientDAO daoPatient, TOPatientMapper mapper) {
        this.daoPatient = daoPatient;
    }

    @Override
    public TOPatient findPatientById(Long patientId) {
        final PatientEntity dbPatient = daoPatient.findOne(patientId);
        return mapToTO(dbPatient);
    }

    @Override
    public TOPatient deletePatient(Long patientId) {
        final PatientEntity dbPatient = daoPatient.findOne(patientId);
        if (dbPatient != null) {
            daoPatient.delete(dbPatient);
            return mapToTO(dbPatient);
        }
        throw new EntityNotFoundException(patientId);
    }

    @Override
    public List<TOShortenPatient> getPatientBySurname(String surname) {
        List<TOShortenPatient> lista = new ArrayList<>();
        for(PatientEntity pacjent : daoPatient.znajdzPacjentaPoNazwisku(surname)) {
            lista.add(TOPatientMapper.mapToSimpleTO(pacjent));
        }
        return lista;
    }

    @Override
    public List<TOPatient> getByCount(int visitCount) {
        final List<TOPatient> resultList = new ArrayList<>();
        final List<PatientEntity> patients = daoPatient.znajdzPacjentaZLiczbaWizytWiekszaNiz(visitCount);
        if (!patients.isEmpty()) {
            resultList.addAll(patients.stream().map(TOPatientMapper::mapToTO).collect(toList()));
        }
        return resultList;
    }

    @Override
    public List<TOPatient> getPatientsTallerThan(double weight) {
        final List<TOPatient> result = new ArrayList<>();
        final List<PatientEntity> patients = daoPatient.znajdzPacjentaOWzroscieWiekszymNiz(weight);
        if (!patients.isEmpty()) {
            result.addAll(patients.stream().map(TOPatientMapper::mapToTO).collect(toList()));
        }
        return result;
    }
}


