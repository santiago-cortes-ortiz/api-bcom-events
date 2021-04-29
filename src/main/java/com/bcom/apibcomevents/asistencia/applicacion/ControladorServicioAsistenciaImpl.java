package com.bcom.apibcomevents.asistencia.applicacion;

import com.bcom.apibcomevents.asistencia.dominio.dto.AsistenciaDTO;
import com.bcom.apibcomevents.asistencia.dominio.repositorio.RepositorioControladorAsistencia;
import com.bcom.apibcomevents.asistencia.dominio.servicio.ControladorServicioAsistencia;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ControladorServicioAsistenciaImpl implements ControladorServicioAsistencia {

    private final RepositorioControladorAsistencia repositorioControladorAsistencia;

    @Override
    public Optional<AsistenciaDTO> guardarAsistencia(AsistenciaDTO asistenciaDTO) {
        return repositorioControladorAsistencia.guardarAsistencia(asistenciaDTO);
    }
}
