package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.dto.TOVisitDetails;
import com.capgemini.wsb.mapper.TOVisitMapper;
import com.capgemini.wsb.persistence.dao.VisitDAO;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import com.capgemini.wsb.service.ServiceVisit;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@Transactional

public class ImplVisitService implements ServiceVisit {
    private final VisitDAO visitDAO;
    public ImplVisitService(VisitDAO visitDAO) {this.visitDAO = visitDAO;}
    @Override
    public List<TOVisitDetails> getVisitsForPatient(Long patientId) {
        final List<TOVisitDetails> result = new ArrayList<>();
        final List<VisitEntity> visits = visitDAO.wyswietlWszystkieWizytyDlaPacjenta(patientId);
        if (!visits.isEmpty()) {
            result.addAll(visits.stream().map(TOVisitMapper::mapToDetailTO).collect(toList()));
        }
        return result;
    }
}
