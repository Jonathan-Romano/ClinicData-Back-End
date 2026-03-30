package com.ClinicData.dto;
import java.util.List;
public class PatientResponseDTO {
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String address;
    private Long phone;
    private Long dni;
    private List<VisitResponseDTO> visits;

    public PatientResponseDTO() {
    }

    public PatientResponseDTO(Long id, String name, String lastName, String email, Long phone, Long dni, List<VisitResponseDTO> visits) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.dni = dni;
        this.visits = visits;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public Long getPhone() {
        return phone;
    }

    public Long getDni() {
        return dni;
    }

    public List<VisitResponseDTO> getVisits() {
        return visits;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public void setVisits(List<VisitResponseDTO> visits) {
        this.visits = visits;
    }
}