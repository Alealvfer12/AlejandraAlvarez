package com.semillero.solicitudes.persistence.entities;


import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "empleado")
public class EmpleadosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nm_id_empleado")
    private Integer idEmpleado;

    @Column(name = "nm_documento")
    private Integer documento;

    @Column(name = "ds_tipo_documento")
    private String tipoDocumento;

    @Column(name = "ds_nombre")
    private String nombre;

    @Column(name = "ds_apellido")
    private String apellido;

    @Column(name = "ds_telefono")
    private String telefono;

    @Column(name = "ds_direccion")
    private String direccion;

    @Column(name = "fe_fecha_ingreso")
    private Date fechaIngreso;

    @Column(name = "fe_fecha_retiro")
    private Date fechaRetiro;

    @Column(name = "ds_tipo_contrato")
    private String tipoContrato;

    @Column(name = "ds_estado_empleado")
    private String estadoEmpleado;

    @Column(name = "nm_supervisor_inmediato")
    private Integer supervisorInmediato;

    @Column(name = "nm_cargo")
    private Integer cargo;

    public Integer getIdEmpleado() {
        return idEmpleado;
    }
    public EmpleadosEntity() {
    }
    public EmpleadosEntity(Integer id) {
        this.idEmpleado = id;
    }


    // Getters y setters




    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(Date fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(String estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }

    public Integer getSupervisorInmediato() {
        return supervisorInmediato;
    }

    public void setSupervisorInmediato(Integer supervisorInmediato) {
        this.supervisorInmediato = supervisorInmediato;
    }

    public Integer getCargo() {
        return cargo;
    }

    public void setCargo(Integer cargo) {
        this.cargo = cargo;
    }
}
