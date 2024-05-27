package com.capgemini.wsb.dto;

import com.capgemini.wsb.persistence.enums.TreatmentType;

import java.io.Serializable;

public class TOTreatment implements Serializable {

    private String description;

    private TreatmentType treatmentType;

    public TOTreatment() {}

    public TOTreatment(String description, TreatmentType treatmentType) {
        this.description = description;
        this.treatmentType = treatmentType;
    }

    public String getOpis() {
        return description;
    }

    public void setOpis(String description) {
        this.description = description;
    }

    public TreatmentType getMetodaLeczenia() {
        return treatmentType;
    }

    public void setMetodaLeczenia(TreatmentType treatmentType) {
        this.treatmentType = treatmentType;
    }
}

