package com.capgemini.wsb.persistance.dao;

import com.capgemini.wsb.persistence.dao.PatientDAO;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientDAOTest {
    @Autowired
    private PatientDAO patientDAO;

    @Test
    public void testPatientBySurnameTest() {
        final String surname = "Bober";

        final List<PatientEntity> patients = patientDAO.findPatientBySurname(surname);

        Assertions.assertEquals(3, patients.size());
    }

    @Test
    public void testPatientsWithVisitsMoreThanTest() {
        final int visitCount = 2;

        final List<PatientEntity> patients = patientDAO.findPatientsWithVisitsMoreThan(visitCount);

        Assertions.assertEquals(1, patient.size());
        Assertions.assertEquals(3, patients.get(0).getVisits().size());
    }

    @Test
    public void testPatientsTallerThanTest() {

        final double height = 185;

        final List<PatientEntity> patients = patientDAO.findPatientsTallerThan(height);

        Assertion.assertEquals(1, patients.size());
        Assertions.assertEquals("Miłosz", patients.get(0).getFirstName());
    }
}