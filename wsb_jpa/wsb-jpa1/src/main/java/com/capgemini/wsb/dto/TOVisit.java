package com.capgemini.wsb.dto;

import java.io.Serializable;

public class TOVisit implements Serializable {

    private String description;

    private TODoctor doctor;

    private TOShortenPatient patient;

    public TOVisit() {}

    public TOVisit(String description, TODoctor doctor, TOShortenPatient patient) {
        this.description = description;
        this.doctor = doctor;
        this.patient = patient;
    }

    public String getOpis() {
        return description;
    }

    public void setOpis(String description) {
        this.description = description;
    }

    public TODoctor getDoktor() {
        return doctor;
    }

    public void setDoktor(TODoctor doctor) {
        this.doctor = doctor;
    }

    public TOShortenPatient getPacjent() {
        return patient;
    }

    public void setPacjent(TOShortenPatient patient) {
        this.patient = patient;
    }
}

