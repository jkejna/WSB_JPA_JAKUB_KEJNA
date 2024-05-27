package com.capgemini.wsb.service;

import com.capgemini.wsb.dto.DetailVisitTO;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional

public class ServiceVisitTest {
    @Autowired
    private ServiceVisit serviceVisit;

    @Test
    public void testMultipleVisitsPatient() {
        final Long patientId = 3L;

        final List<TOVisitDetails> visits = serviceVisit.getVisitsForPatient(patientId);

        Assertions.assertEquals(3, visits.size());
        Assertions.assertEquals("wizyta okulistyczna", visits.get(0).getDescription());
        Assertions.assertEquals("wycięcie migdałków", visits.get(1).getDescription());
        Assertions.assertEquals("wizyta kontrolna", visits.get(2).getDescription());
    }
}