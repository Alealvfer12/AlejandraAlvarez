package com.semillero.solicitudes.persistence.entities;

import jakarta.persistence.*;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "alerta")
public class alertasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nm_id_alerta")
    private Long idAlerta;

    @Column(name = "ds_asunto")
    private String asunto;

    @Column(name = "ds_destinatario")
    private String destinatario;

    @Column(name = "ds_contenido_alerta")
    private String contenidoAlerta;

    @Column(name = "ds_estado_alerta")
    private String estadoAlerta;

    @Column(name = "fe_fecha_creacion")
    private Date fechaCreacion;

    public Long getIdAlerta() {
        return idAlerta;
    }

    public void setIdAlerta(Long idAlerta) {
        this.idAlerta = idAlerta;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getContenidoAlerta() {
        return contenidoAlerta;
    }

    public void setContenidoAlerta(String contenidoAlerta) {
        this.contenidoAlerta = contenidoAlerta;
    }

    public String getEstadoAlerta() {
        return estadoAlerta;
    }

    public void setEstadoAlerta(String estadoAlerta) {
        this.estadoAlerta = estadoAlerta;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}