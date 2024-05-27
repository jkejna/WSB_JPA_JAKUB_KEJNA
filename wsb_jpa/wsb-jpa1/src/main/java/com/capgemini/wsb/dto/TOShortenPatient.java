package com.capgemini.wsb.dto;

import java.io.Serializable;

public class TOShortenPatient implements Serializable {

    private String firstName;

    private String lastName;

    public TOShortenPatient() {}

    public TOShortenPatient(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
}
