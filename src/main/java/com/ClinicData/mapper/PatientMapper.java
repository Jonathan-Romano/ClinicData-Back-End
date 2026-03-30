package com.ClinicData.mapper;

import com.ClinicData.dto.PatientResponseDTO;
import com.ClinicData.dto.VisitResponseDTO;
import com.ClinicData.model.Patient;
import com.ClinicData.model.Visit;

import java.util.List;

public class PatientMapper {

    public static PatientResponseDTO toDto(Patient patient) {
        List<VisitResponseDTO> visits = patient.getVisitList() == null
                ? List.of()
                : patient.getVisitList().stream()
                .map(PatientMapper::toVisitDto)
                .toList();

        return new PatientResponseDTO(
                patient.getId(),
                patient.getName(),
                patient.getLastName(),
                patient.getEmail(),
                patient.getPhone(),
                patient.getDni(),
                visits
        );
    }

    public static VisitResponseDTO toVisitDto(Visit visit) {
        return new VisitResponseDTO(
                visit.getId(),
                visit.getDate(),
                visit.getDescription(),
                visit.getTreatment()
        );
    }
}