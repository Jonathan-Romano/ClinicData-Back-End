package com.ClinicData.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Visit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "paciente_id")
    @JsonBackReference
    private Patient patient;
    private LocalDate date;

    @Lob // Permite almacenar textos largos
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Lob // Permite almacenar textos largos
    @Column(name = "treatment", columnDefinition = "TEXT")
    private String treatment;
}
