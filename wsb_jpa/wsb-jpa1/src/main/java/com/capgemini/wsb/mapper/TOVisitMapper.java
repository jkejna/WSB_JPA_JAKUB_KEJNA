package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.TOVisitDetails;
import com.capgemini.wsb.dto.TOVisit;
import com.capgemini.wsb.persistence.entity.VisitEntity;

import static java.util.stream.Collectors.toList;

public final class TOVisitMapper {

    public static TOVisit mapToTO(final VisitEntity visit) {
        if (visit == null) {
            return null;
        }
        return new TOVisit(
                visit.getDescription(),
                TODoctorMapper.mapToTO(visit.getDoctor()),
                TOPatientMapper.mapToSimpleTO(visit.getPatient()));
    }

    public static TOVisitDetails mapToDetailTO(final VisitEntity visit) {
        if (visit == null) {
            return null;
        }
        return new TOVisitDetails(
                visit.getDescription(),
                visit.getTime(),
                TODoctorMapper.mapToTO(visit.getDoctor()),
                visit.getMedicalTreatmentEntityList().stream().map(TOTreatmentMapper::mapToTO).collect(toList()));
    }
}
