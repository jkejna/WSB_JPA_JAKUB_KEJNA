package com.capgemini.wsb.dto;

import com.capgemini.wsb.persistence.enums.Specialization;

import java.io.Serializable;

public class TODoctor implements Serializable {

    private String firstName;

    private String lastName;

    private Specialization specialization;

    public TODoctor() {}

    public TODoctor(String firstName, String lastName, Specialization specialization) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
    }

    public String getImie() {
        return firstName;
    }

    public void setImie(String firstName) {
        this.firstName = firstName;
    }

    public String getNazwisko() {
        return lastName;
    }

    public void setNazwisko(String lastName) {
        this.lastName = lastName;
    }

    public Specialization getSpecjalizacja() {
        return specialization;
    }

    public void setSpecjalizacja(Specialization specialization) {
        this.specialization = specialization;
    }

}
