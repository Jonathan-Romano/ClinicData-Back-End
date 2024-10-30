package com.ClinicData.service;

import com.ClinicData.model.Patient;
import com.ClinicData.model.Visit;

import java.util.List;

public interface IPatientService {
    public Patient getPatient(Long id);
    public Patient getPatientByDNI(Long dni);

    public List<Patient> getPatients();

    public Long savePatient(Patient patient);

    public Patient editPatient(Long id, Patient patient);

    public String deletePatient(Long id);

    public List<Patient> findPatientByNameDni(String searchTerm, Long dni);

}
