package com.semillero.solicitudes.persistence.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "usuario")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nm_id_usuario")
    private Long idUsuario;

    @ManyToOne

    @JoinColumn(name = "nm_id_empleado")
    private EmpleadosEntity idEmpleado;

    @Column(name = "ds_usaurio")
    private String usuario;

    @Column(name = "fe_fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "ds_activo")
    private String activo;

    @Column(name = "ds_contraseña")
    private String contraseña;
    @ManyToOne

    @JoinColumn(name = "nm_rol")
    private RolUsuarioEntity idRol;

    @OneToMany(mappedBy = "id_usuario")
    private List<SolicitudEntity> solicitudes;

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public EmpleadosEntity getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(EmpleadosEntity idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public RolUsuarioEntity getIdRol() {
        return idRol;
    }

    public void setIdRol(RolUsuarioEntity idRol) {
        this.idRol = idRol;
    }

    public List<SolicitudEntity> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(List<SolicitudEntity> solicitudes) {
        this.solicitudes = solicitudes;
    }
}

