package com.semillero.solicitudes.controllers;

import com.semillero.solicitudes.persistence.entities.EmpleadosEntity;
import com.semillero.solicitudes.services.EmpleadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/empleado")

public class EmpleadosControllers {

    @Resource
    private EmpleadosService empleadosService;

    @GetMapping
    public ArrayList<EmpleadosEntity> getempleados(){
        return getEmpleadosService().getempleados();
    }
    @PostMapping
    public EmpleadosEntity createEmpleados(@RequestBody EmpleadosEntity empleado){
        return this.empleadosService.createEmpleado(empleado);
    }
    @PutMapping("/{id}")
    public EmpleadosEntity updateById(@RequestBody EmpleadosEntity request, @PathVariable Long id){
        return empleadosService.updateByID(request, id);
    }

    public EmpleadosService getEmpleadosService() {
        return empleadosService;
    }

    public void setEmpleadosService(EmpleadosService empleadosService) {
        this.empleadosService = empleadosService;
    }
}
