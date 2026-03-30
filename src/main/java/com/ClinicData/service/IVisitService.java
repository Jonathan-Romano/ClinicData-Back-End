package com.ClinicData.service;

import com.ClinicData.model.Patient;
import com.ClinicData.model.Visit;

import java.util.List;

public interface IVisitService {
    public Visit getVisit(Long id);

    public List<Visit> getVisits();

    Long saveVisit(Long patientId, Visit visit);

    public Visit editVisit(Long id, Visit visit);

    public String deleteVisit(Long id);


}
