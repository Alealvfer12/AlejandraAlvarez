package com.semillero.solicitudes.services;

import com.semillero.solicitudes.persistence.entities.EmpleadosEntity;
import com.semillero.solicitudes.persistence.entities.SolicitudEntity;
import com.semillero.solicitudes.persistence.repository.SolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SolicitudService {
    @Autowired
    private SolicitudRepository solicitudRepository;

    public List<SolicitudEntity> getSolicitud() {
        return solicitudRepository.findAllByOrderByFechaCreacionDesc();
    }

    public SolicitudEntity createSolicitud(SolicitudEntity solicitud) {
        if (solicitud.getIdSolicitud() == 1){
            solicitud.setEstado("aprobado");
        }else{

        }
        return solicitudRepository.save(solicitud);
    }

    public void setSolicitudRepository(SolicitudRepository solicitudRepository) {
        this.solicitudRepository = solicitudRepository;
    }
}

