package com.ClinicData.controller;

import com.ClinicData.dto.VisitResponseDTO;
import com.ClinicData.mapper.VisitMapper;
import com.ClinicData.model.Visit;
import com.ClinicData.service.IVisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("visit")
@CrossOrigin(origins = "http://localhost:4200")
public class visitController {
    @Autowired
    public IVisitService visitServ;

    @GetMapping("/{id}")
    public ResponseEntity<VisitResponseDTO> getVisit(@PathVariable Long id) {
        Visit visit = visitServ.getVisit(id);

        if (visit == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(VisitMapper.toDto(visit));
    }

    @GetMapping("/list")
    public List<VisitResponseDTO> getVisitsList() {
        return visitServ.getVisits()
                .stream()
                .map(VisitMapper::toDto)
                .toList();
    }

    @PostMapping("/create/{patientId}")
    public ResponseEntity<Long> saveVisit(@PathVariable Long patientId, @RequestBody Visit visit) {
        Long id = visitServ.saveVisit(patientId, visit);
        return ResponseEntity.ok(id);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<VisitResponseDTO> editVisit(
            @PathVariable Long id,
            @RequestBody Visit visit) {

        Visit updatedVisit = visitServ.editVisit(id, visit);

        if (updatedVisit == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(VisitMapper.toDto(updatedVisit));
    }

    @DeleteMapping("/delete/{id}")
    public String deleteVisit(@PathVariable Long id) {
        return visitServ.deleteVisit(id);
    }

}
