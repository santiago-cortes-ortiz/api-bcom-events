package com.bcom.apibcomevents.asistencia.dominio.repositorio;

import com.bcom.apibcomevents.asistencia.dominio.dto.AsistenciaDTO;

import java.util.Optional;

public interface RepositorioControladorAsistencia {
    Optional<AsistenciaDTO> guardarAsistencia(AsistenciaDTO asistenciaDTO);
}
