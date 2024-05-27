package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.TODoctor;
import com.capgemini.wsb.persistence.entity.DoctorEntity;

public final class TODoctorMapper {

    public static TODoctor mapToTO(final DoctorEntity doctor) {
        if (doctor == null) {
            return null;
        }
        return new TODoctor(
                doctor.getFirstName(),
                doctor.getLastName(),
                doctor.getSpecialization());
    }
}
