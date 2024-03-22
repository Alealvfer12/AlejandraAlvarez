package com.semillero.solicitudes.persistence.repository;

import com.semillero.solicitudes.persistence.entities.EmpleadosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmpleadosRepository extends JpaRepository<EmpleadosEntity, Long> {


}
