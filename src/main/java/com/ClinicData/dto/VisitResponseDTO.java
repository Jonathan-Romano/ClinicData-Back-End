package com.ClinicData.dto;
import java.time.LocalDate;
public class VisitResponseDTO {
    private Long id;
    private LocalDate date;
    private String description;
    private String treatment;

    public VisitResponseDTO() {
    }

    public VisitResponseDTO(Long id, LocalDate date, String description, String treatment) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.treatment = treatment;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
}