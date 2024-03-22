package com.semillero.solicitudes.persistence.repository;

import com.semillero.solicitudes.persistence.entities.SolicitudEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public interface SolicitudRepository extends JpaRepository<SolicitudEntity, Long> {


    List<SolicitudEntity> findAllByOrderByFechaCreacionDesc();
}
