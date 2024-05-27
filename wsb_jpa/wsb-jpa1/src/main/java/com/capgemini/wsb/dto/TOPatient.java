package com.capgemini.wsb.dto;

import java.io.Serializable;
import java.util.List;

public class TOPatient implements Serializable {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private Double height;

    private List<TOVisit> visits;

    public TOPatient() {}

    public TOPatient(Long id, String firstName, String lastName, String email, Double height, List<TOVisit> visits){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.visits = visits;
        this.height = height;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getWzrost() {
        return height;
    }

    public void setWzrost(Double height) {
        this.height = height;
    }

    public List<TOVisit> getWizyty() {
        return visits;
    }

    public void setWizyty(List<TOVisit> visits) {
        this.visits = visits;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
