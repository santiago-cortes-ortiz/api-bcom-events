package com.bcom.apibcomevents.asistencia.dominio.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class AsistenciaDTO {
    private Long idUsuario;
    private Long idEvento;
}
