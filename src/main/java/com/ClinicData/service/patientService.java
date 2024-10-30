package com.ClinicData.service;

import com.ClinicData.model.Patient;
import com.ClinicData.model.Visit;
import com.ClinicData.repository.IPatientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class patientService implements IPatientService{

    @Autowired
    public IPatientsRepository patientRep;

    @Autowired
    public IVisitService visitServ;

    @Override
    public Patient getPatient(Long id) {
        return patientRep.findById(id).orElse(null);
    }

    @Override
    public Patient getPatientByDNI(Long dni) {
        return patientRep.findByDni(dni);
    }

    @Override
    public List<Patient> getPatients() {
        return patientRep.findAll();
    }

    @Override
    public Long savePatient(Patient patient) {
        if(this.getPatientByDNI(patient.getDNI()) == null){
            return patientRep.save(patient).getId();
        }else {
            return 0L;
        }
    }

    @Override
    public Patient editPatient(Long id,Patient patient) {
        Patient patientEdit = this.getPatient(id);
        patientEdit = new Patient(
                id,
                patient.getName(),
                patient.getLastName(),
                patient.getEmail(),
                patient.getPhone(),
                patient.getDNI(),
                patient.getVisitList()
        );

        patientRep.save(patientEdit);
        return this.getPatient(id);
    }

    @Override
    public String deletePatient(Long id) {
        patientRep.deleteById(id);
        return "Paciente borrado correctamente";
    }

    @Override
    public List<Patient> findPatientByNameDni(String searchTerm, Long dni) {
        return patientRep.findPatientsByNameOrDni(searchTerm, dni);
    }

}
