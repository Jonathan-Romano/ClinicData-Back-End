package com.ClinicData.controller;

import com.ClinicData.model.Patient;
import com.ClinicData.model.Visit;
import com.ClinicData.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("patient")
@CrossOrigin(origins = "http://localhost:4200")
public class patientController {
    @Autowired
    public IPatientService patientServ;

    @GetMapping("/{id}")
    public Patient getPatient(@PathVariable Long id) {
        return patientServ.getPatient(id);
    }
    @GetMapping
    public Patient getPatientDni( @RequestParam Long dni) {
        return patientServ.getPatientByDNI(dni);
    }
    @GetMapping("/list")
    public List<Patient> getPatientsList() {
        return patientServ.getPatients();
    }

    @GetMapping("/search")
    public List<Patient> getPatientListByNameDni(@RequestParam(required = false) String name,
                                                 @RequestParam(required = false) Long dni) {
        return patientServ.findPatientByNameDni(name != null ? name : "", dni);
    }

    @PostMapping("/create")
    public Long savePatient(@RequestBody Patient patient) {
        return patientServ.savePatient(patient);
    }

    @PutMapping("/edit/{id}")
    public Patient editPatient(
            @PathVariable Long id,
            @RequestBody Patient patient) {
        return patientServ.editPatient(id,patient);
    }


    @DeleteMapping("/delete/{id}")
    public String deletePatient(@PathVariable Long id) {
        return patientServ.deletePatient(id);
    }


}
