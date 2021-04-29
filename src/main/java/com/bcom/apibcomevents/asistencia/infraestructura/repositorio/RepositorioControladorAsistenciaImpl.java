package com.bcom.apibcomevents.asistencia.infraestructura.repositorio;

import com.bcom.apibcomevents.asistencia.dominio.dto.AsistenciaDTO;
import com.bcom.apibcomevents.asistencia.dominio.repositorio.RepositorioControladorAsistencia;

import java.util.Optional;

public class RepositorioControladorAsistenciaImpl implements RepositorioControladorAsistencia {
    @Override
    public Optional<AsistenciaDTO> guardarAsistencia(AsistenciaDTO asistenciaDTO) {
        return Optional.empty();
    }
}
