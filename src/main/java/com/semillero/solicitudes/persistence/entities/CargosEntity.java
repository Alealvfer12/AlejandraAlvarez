package com.semillero.solicitudes.persistence.entities;
import com.fasterxml.jackson.annotation.JsonManagedReference;


import jakarta.persistence.*;
import java.util.Date;


@Entity
@Table(name = "cargos")
public class CargosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nm_id_cargo")
    private Long cargoId;

    @Column(name = "ds_cargo", length = 50)
    private String cargo;

    @Column(name = "ds_descripcion", length = 100)
    private String descripcion;

    @Column(name = "fe_fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "ds_activo", length = 10)
    private String activo;

    // Getters y Setters

    public Long getCargoId() {
        return cargoId;
    }

    public void setCargoId(Long cargoId) {
        this.cargoId = cargoId;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }
}

