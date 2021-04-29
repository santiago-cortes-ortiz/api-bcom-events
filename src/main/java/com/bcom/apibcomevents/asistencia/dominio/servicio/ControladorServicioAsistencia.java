package com.bcom.apibcomevents.asistencia.dominio.servicio;

import com.bcom.apibcomevents.asistencia.dominio.dto.AsistenciaDTO;

import java.util.Optional;

public interface ControladorServicioAsistencia {
    Optional<AsistenciaDTO> guardarAsistencia(AsistenciaDTO asistenciaDTO);
}
