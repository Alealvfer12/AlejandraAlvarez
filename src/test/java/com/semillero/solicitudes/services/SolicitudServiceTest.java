package com.semillero.solicitudes.services;

import com.semillero.solicitudes.persistence.entities.EmpleadosEntity;
import com.semillero.solicitudes.persistence.entities.SolicitudEntity;
import com.semillero.solicitudes.persistence.repository.EmpleadosRepository;
import com.semillero.solicitudes.persistence.repository.SolicitudRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

class SolicitudServiceTest {
        @InjectMocks
        SolicitudService spy;
        @Mock
        SolicitudRepository solicitudRepository;

        @Test
        public void noHaySolicitudListaVacia(){
            when(solicitudRepository.findAllByOrderByFechaCreacionDesc()).thenReturn(new ArrayList<>());
            List<SolicitudEntity> solicitud = spy.getSolicitud();
            assertTrue(solicitud.isEmpty());
        }


    @Test
    public void testCreateSolicitud_SuccessfullyCreatedWithoutDescription() {
        SolicitudEntity solicitud = new SolicitudEntity();
        when(solicitudRepository.save(solicitud)).thenReturn(solicitud);
        SolicitudEntity solicitudCreada = spy.createSolicitud(solicitud);
        assertEquals(solicitud, solicitudCreada);
    }


}