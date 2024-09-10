package com.app.haelthcarejsonAI.repository;

import com.app.haelthcarejsonAI.model.Patient;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class PatientRepository extends SimpleJpaRepository<Patient, String> {
    private final EntityManager em;
    public PatientRepository(EntityManager em) {
        super(Patient.class, em);
        this.em = em;
    }
    @Override
    public List<Patient> findAll() {
        return em.createNativeQuery("Select * from \"haelthcarejsonai\".\"Patient\"", Patient.class).getResultList();
    }
}