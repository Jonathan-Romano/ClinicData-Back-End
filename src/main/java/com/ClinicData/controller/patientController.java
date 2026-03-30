package com.ClinicData.controller;

import com.ClinicData.dto.PatientResponseDTO;
import com.ClinicData.model.Patient;
import com.ClinicData.mapper.PatientMapper;
import com.ClinicData.model.Visit;
import com.ClinicData.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("patient")
@CrossOrigin(origins = "http://localhost:4200")
public class patientController {
    @Autowired
    public IPatientService patientServ;

    @GetMapping("/{id}")
    public ResponseEntity<PatientResponseDTO> getPatientById(@PathVariable Long id) {
        Patient patient = patientServ.getPatient(id);
        return ResponseEntity.ok(PatientMapper.toDto(patient));
    }
    @GetMapping
    public ResponseEntity<PatientResponseDTO> getPatientDni(@RequestParam Long dni) {
        Patient patient = patientServ.getPatientByDNI(dni);

        if (patient == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(PatientMapper.toDto(patient));
    }

    @GetMapping("/list")
    public List<PatientResponseDTO> getPatients() {
        return patientServ.getPatients()
                .stream()
                .map(PatientMapper::toDto)
                .toList();
    }

    @GetMapping("/search")
    public List<PatientResponseDTO> getPatientListByNameDni(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Long dni) {

        return patientServ.findPatientByNameDni(name != null ? name : "", dni)
                .stream()
                .map(PatientMapper::toDto)
                .toList();
    }
    @PostMapping("/create")
    public Long savePatient(@RequestBody Patient patient) {
        return patientServ.savePatient(patient);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<PatientResponseDTO> editPatient(
            @PathVariable Long id,
            @RequestBody Patient patient) {

        Patient updatedPatient = patientServ.editPatient(id, patient);
        return ResponseEntity.ok(PatientMapper.toDto(updatedPatient));
    }


    @DeleteMapping("/delete/{id}")
    public String deletePatient(@PathVariable Long id) {
        return patientServ.deletePatient(id);
    }


}
