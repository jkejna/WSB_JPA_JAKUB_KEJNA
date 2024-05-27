package com.capgemini.wsb.persistence.dao;

import com.capgemini.wsb.persistence.entity.PatientEntity;

import java.util.List;

public interface PatientDAO extends Dao<PatientEntity, Long> {

    List<PatientEntity> znajdzPacjentaPoNazwisku(final String lastName);

    List<PatientEntity> znajdzPacjentaOWzroscieWiekszymNiz(final double height);

    List<PatientEntity> znajdzPacjentaZLiczbaWizytWiekszaNiz(int visitsNumber);
}
