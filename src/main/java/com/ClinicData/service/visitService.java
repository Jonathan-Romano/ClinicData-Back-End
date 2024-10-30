package com.ClinicData.service;

import com.ClinicData.model.Patient;
import com.ClinicData.model.Visit;
import com.ClinicData.repository.IVisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class visitService implements IVisitService{

    @Autowired
    public IVisitRepository visitRep;
    @Override
    public Visit getVisit(Long id) {
        return visitRep.findById(id).orElse(null);
    }

    @Override
    public List<Visit> getVisits() {
        return visitRep.findAll();
    }

    @Override
    public Long saveVisit(Visit visit) {
        return visitRep.save(visit).getId();
    }



    @Override
    public Visit editVisit(Long id, Visit visit) {
        Visit visitEdit = this.getVisit(id);

        visitEdit.setDescription(visit.getDescription());
        visitEdit.setTreatment(visit.getTreatment());

        visitRep.save(visitEdit);
        return this.getVisit(id);
    }



    @Override
    public String deleteVisit(Long id) {
        visitRep.deleteById(id);
        return "Borrado corectamente";
    }
}
