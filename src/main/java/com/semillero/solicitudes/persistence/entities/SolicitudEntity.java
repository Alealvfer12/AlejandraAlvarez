package com.semillero.solicitudes.persistence.entities;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "solicitud_vaciones")
public class SolicitudEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nm_id_solicitud")
    private Long idSolicitud;


    @Column(name = "nm_dias_solicita")
    private Integer diasSolicita;

    @Column(name = "fe_fecha_inicio")
    private Date fechaInicio;

    @Column(name = "fe_fecha_fin")
    private Date fechaFin;

    @Column(name = "fe_fecha_retorna")
    private Date fechaRetorna;

    @Column(name = "ds_estado")
    private String estado;

    @Column(name = "ds_observaciones")
    private String observaciones;

    @Column(name = "fe_fecha_creacion")
    private Date fechaCreacion;

    @ManyToOne

    @JoinColumn(name = "nm_id_usuario")
    private UsuarioEntity id_usuario;

    public Long getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(Long idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public Integer getDiasSolicita() {
        return diasSolicita;
    }

    public void setDiasSolicita(Integer diasSolicita) {
        this.diasSolicita = diasSolicita;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaRetorna() {
        return fechaRetorna;
    }

    public void setFechaRetorna(Date fechaRetorna) {
        this.fechaRetorna = fechaRetorna;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public UsuarioEntity getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(UsuarioEntity id_usuario) {
        this.id_usuario = id_usuario;
    }
}