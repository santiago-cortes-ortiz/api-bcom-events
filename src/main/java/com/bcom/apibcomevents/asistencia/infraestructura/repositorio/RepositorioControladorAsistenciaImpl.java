package com.bcom.apibcomevents.asistencia.infraestructura.repositorio;

import com.bcom.apibcomevents.asistencia.dominio.dto.AsistenciaDTO;
import com.bcom.apibcomevents.asistencia.dominio.repositorio.RepositorioControladorAsistencia;
import com.bcom.apibcomevents.asistencia.infraestructura.mapper.AsistenciaMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class RepositorioControladorAsistenciaImpl implements RepositorioControladorAsistencia {

    private JpaRepositorioAsistencia jpaRepositorioAsistencia;
    private AsistenciaMapper asistenciaMapper;

    @Override
    public Optional<AsistenciaDTO> guardarAsistencia(AsistenciaDTO asistenciaDTO) {
        return Optional.of(asistenciaMapper
                .asistenciaHaciaAsistenciaDto(jpaRepositorioAsistencia
                        .save(asistenciaMapper
                                .asistenciaDtoHaciaAsistencia(asistenciaDTO))));
    }
}
