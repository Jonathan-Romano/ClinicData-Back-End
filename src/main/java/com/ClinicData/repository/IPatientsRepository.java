package com.ClinicData.repository;

import com.ClinicData.model.Patient;
import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPatientsRepository extends JpaRepository<Patient, Long> {

    @Query("SELECT p FROM Patient p WHERE p.dni = :dni")
    Patient findByDni(Long dni);

    @Query("SELECT p FROM Patient p WHERE LOWER(p.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<Patient> findByNameContaining(@Param("name") String name);
}
