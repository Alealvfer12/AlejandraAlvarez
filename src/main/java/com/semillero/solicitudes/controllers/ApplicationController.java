package com.semillero.solicitudes.controllers;


import com.semillero.solicitudes.persistence.entities.EmpleadosEntity;
import com.semillero.solicitudes.persistence.entities.SolicitudEntity;
import com.semillero.solicitudes.services.SolicitudService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/solicitud")
public class ApplicationController {
    @Resource
    private SolicitudService solicitudService;

    //@Resource
//    private ModelMapper modelMapper;

    @GetMapping
    public List<SolicitudEntity> getSolicitud(){
        return solicitudService.getSolicitud();
    }
    @PostMapping
    public SolicitudEntity createSolicitudes(@RequestBody SolicitudEntity solicitud){
        return solicitudService.createSolicitud(solicitud);
    }

    public SolicitudService getSolicitudService() {
        return solicitudService;
    }

    public void setSolicitudService(SolicitudService solicitudService) {
        this.solicitudService = solicitudService;
    }
}

//public ModelMapper getModelMapper() {
//    return modelMapper;
//}
//
//public void setModelMapper(ModelMapper modelMapper) {
//    this.modelMapper = modelMapper;
//}
