package com.bcom.apibcomevents.usuario.dominio.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.Column;
import java.util.Date;

@Builder
@Getter
@AllArgsConstructor
public class UsuarioDTO {
    private Long id;

    private String nombre;

    private Date fechaCreacion;

    private Date fechaModificacion;
}
