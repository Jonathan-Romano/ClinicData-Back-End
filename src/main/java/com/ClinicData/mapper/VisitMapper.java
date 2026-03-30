package com.ClinicData.mapper;

import com.ClinicData.dto.VisitResponseDTO;
import com.ClinicData.model.Visit;

public class VisitMapper {

    public static VisitResponseDTO toDto(Visit visit) {
        return new VisitResponseDTO(
                visit.getId(),
                visit.getDate(),
                visit.getDescription(),
                visit.getTreatment()
        );
    }
}