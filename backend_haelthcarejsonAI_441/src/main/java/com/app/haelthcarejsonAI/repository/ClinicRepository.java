package com.app.haelthcarejsonAI.repository;

import com.app.haelthcarejsonAI.model.Clinic;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class ClinicRepository extends SimpleJpaRepository<Clinic, String> {
    private final EntityManager em;
    public ClinicRepository(EntityManager em) {
        super(Clinic.class, em);
        this.em = em;
    }
    @Override
    public List<Clinic> findAll() {
        return em.createNativeQuery("Select * from \"haelthcarejsonai\".\"Clinic\"", Clinic.class).getResultList();
    }
}