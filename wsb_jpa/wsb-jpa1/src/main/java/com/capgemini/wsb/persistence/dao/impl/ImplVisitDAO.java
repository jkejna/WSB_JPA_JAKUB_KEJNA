package com.capgemini.wsb.persistence.dao.impl;

import com.capgemini.wsb.persistence.dao.VisitDAO;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ImplVisitDAO extends AbstractDao<VisitEntity, Long> implements VisitDAO {
    @Override
    public List<VisitEntity> wyswietlWszystkieWizytyDlaPacjenta(Long patientId) {
        return this.entityManager.createQuery("select v from VisitEntity where v.patient.id = :patientId").setParameter("patientId", patientId).getResultList();
    }
}
