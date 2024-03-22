package com.semillero.solicitudes.services;

import com.semillero.solicitudes.persistence.entities.EmpleadosEntity;
import com.semillero.solicitudes.persistence.repository.EmpleadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadosService {
    @Autowired
    private  EmpleadosRepository empleadosRepository;

    public ArrayList<EmpleadosEntity> getempleados(){
        return (ArrayList<EmpleadosEntity>) empleadosRepository.findAll();
    }
    public EmpleadosEntity createEmpleado(EmpleadosEntity empleado) {
        return empleadosRepository.save(empleado);
    }

    public EmpleadosEntity updateByID(EmpleadosEntity request, Long id ){
        EmpleadosEntity empleadosEntity = empleadosRepository.findById(id).get();
        empleadosEntity.setDocumento(request.getDocumento());
        empleadosEntity.setTipoDocumento(request.getTipoDocumento());
        empleadosEntity.setNombre(request.getNombre());
        empleadosEntity.setApellido(request.getApellido());
        empleadosEntity.setTelefono(request.getTelefono());
        empleadosEntity.setDireccion(request.getDireccion());
        empleadosEntity.setFechaIngreso(request.getFechaIngreso());
        empleadosEntity.setFechaRetiro(request.getFechaRetiro());
        empleadosEntity.setTipoContrato(request.getTipoContrato());
        empleadosEntity.setEstadoEmpleado(request.getEstadoEmpleado());
        empleadosEntity.setSupervisorInmediato(request.getSupervisorInmediato());
        empleadosEntity.setCargo(request.getCargo());
        empleadosRepository.save(empleadosEntity);
        return empleadosEntity;
    }

}