package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.TOTreatment;
import com.capgemini.wsb.persistence.entity.MedicalTreatmentEntity;

public final class TOTreatmentMapper {

    public static TOTreatment mapToTO(MedicalTreatmentEntity treatment) {
        if (treatment == null) {
            return null;
        }
        return new TOTreatment(
                treatment.getDescription(),
                treatment.getType());
    }
}
