package com.app.haelthcarejsonAI.function;

import com.app.haelthcarejsonAI.model.Patient;
import com.app.haelthcarejsonAI.model.Doctor;
import com.app.haelthcarejsonAI.model.Clinic;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.haelthcarejsonAI.repository.ClinicRepository;
import com.app.haelthcarejsonAI.repository.PatientRepository;
import com.app.haelthcarejsonAI.repository.DoctorRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
