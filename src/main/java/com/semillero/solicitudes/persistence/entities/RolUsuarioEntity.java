package com.semillero.solicitudes.persistence.entities;

import jakarta.persistence.*;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "rol_usuario")
public class RolUsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nm_id_rol")
    private Long idRol;

    @Column(name = "ds_rol", length = 30)
    private String rol;

    @Column(name = "fe_fecha_creacion")
    private Date fechaCreacion;

    // Getters y setters
    public Long getIdRol() {
        return idRol;
    }
    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
