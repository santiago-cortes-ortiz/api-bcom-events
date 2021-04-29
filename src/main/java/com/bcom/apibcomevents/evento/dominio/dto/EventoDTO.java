package com.bcom.apibcomevents.evento.dominio.dto;

import com.bcom.apibcomevents.usuario.infraestructura.entidad.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

@Builder
@Getter
@AllArgsConstructor
public class EventoDTO {

    private Long id;

    private Long idCreador;

    private String nombre;

    private Date fecha;

    private String descripcion;

    private Date fechaCreacion;

    private Date fechaModificacion;

}
