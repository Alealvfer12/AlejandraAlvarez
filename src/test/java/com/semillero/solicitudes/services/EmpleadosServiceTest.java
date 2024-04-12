package com.semillero.solicitudes.services;


import com.semillero.solicitudes.persistence.entities.EmpleadosEntity;
import com.semillero.solicitudes.persistence.repository.EmpleadosRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
class EmpleadosServiceTest {
     @InjectMocks
    EmpleadosService spy;
    @Mock
    EmpleadosRepository empleadosRepository;

    @Test
    public void noHayEmpleadosListaVacia(){
        when(empleadosRepository.findAll()).thenReturn(new ArrayList<>());
        ArrayList<EmpleadosEntity> empleados = spy.getempleados();
        assertTrue(empleados.isEmpty());
    }
    @Test
    public void crearEmpleadoExistosamente() {

        EmpleadosEntity empleado = new EmpleadosEntity();
        when(empleadosRepository.save(empleado)).thenReturn(empleado);
        EmpleadosEntity empleados = spy.createEmpleado(empleado);
        assertNotNull(empleados);
    }

    @Test
    public void deberiaCrearempleado() {
        EmpleadosEntity empleado = new EmpleadosEntity();
        when(empleadosRepository.save(empleado)).thenReturn(empleado);
        EmpleadosEntity empleados = spy.createEmpleado(empleado);
        assertEquals(empleado, empleados);
    }




}