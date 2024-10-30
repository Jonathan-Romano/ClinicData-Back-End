package com.ClinicData.controller;

import com.ClinicData.model.Patient;
import com.ClinicData.model.Visit;
import com.ClinicData.service.IVisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("visit")
@CrossOrigin(origins = "http://localhost:4200")
public class visitController {

    @Autowired
    public IVisitService visitServ;
    @GetMapping("/{id}")
    public Visit getVisit(@PathVariable Long id) {
        return visitServ.getVisit(id);
    }

    @GetMapping("/list")
    public List<Visit> getVisitsList() {
        return visitServ.getVisits();
    }


    @PostMapping("/create")
    public Long saveVisit(
            @RequestBody Visit visit) {
        return visitServ.saveVisit(visit);
    }


    @PutMapping("/edit/{id}")
    public Visit editVisit(
            @PathVariable Long id,
            @RequestBody Visit visit) {
        return visitServ.editVisit(id,visit);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteVisit(@PathVariable Long id) {
        return visitServ.deleteVisit(id);
    }

}
