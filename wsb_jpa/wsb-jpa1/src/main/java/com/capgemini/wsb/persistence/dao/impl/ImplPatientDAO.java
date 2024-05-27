package com.capgemini.wsb.persistence.dao.impl;

import com.capgemini.wsb.persistence.dao.PatientDAO;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ImplPatientDAO extends AbstractDao<PatientEntity, Long> implements PatientDAO {

    @Override
    public List<PatientEntity> znajdzPacjentaPoNazwisku(String lastName) {
        return entityManager.createQuery("select p from PatientEntity p where lower(p.lastName) = lower(:nazwisko)")
                .setParameter("last_name", lastName).getResultList();
    }

    @Override
    public List<PatientEntity> znajdzPacjentaOWzroscieWiekszymNiz(double height) {
        return entityManager.createQuery("select p from PatientEntity p where p.height > :height").setParameter("height", height).getResultList();
    }

    @Override
    public List<PatientEntity> znajdzPacjentaZLiczbaWizytWiekszaNiz(int visitsNumber) {
        TypedQuery<PatientEntity> query = entityManager.createQuery("select p from PatientEntity where size(p.visits) > :visitsNumber", PatientEntity.class).setParameter("visitsNumber", visitsNumber);
        return query.getResultList();
    }
}
