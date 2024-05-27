package com.capgemini.wsb.dto;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class TOVisitDetails implements Serializable {

    private String description;

    private LocalDateTime date;

    private TODoctor doctor;

    private List<TOTreatment> treatment;

    public TOVisitDetails() {
    }

    public TOVisitDetails(String description, LocalDateTime date, TODoctor doctor, List<TOTreatment> treatment) {
        this.description = description;
        this.date = date;
        this.treatment = treatment;
        this.doctor = doctor;
    }

    public String getOpis() {
        return description;
    }

    public void setOpis(String description) {
        this.description = description;
    }

    public LocalDateTime getData() {
        return date;
    }

    public void setData(LocalDateTime date) {
        this.date = date;
    }

    public TODoctor getDoktor() {
        return doctor;
    }

    public void setDoktor(TODoctor doctor) {
        this.doctor = doctor;
    }

    public List<TOTreatment> getLeczenie() {
        return treatment;
    }

    public void setLeczenie(List<TOTreatment> treatment) {
        this.treatment = treatment;
    }
}