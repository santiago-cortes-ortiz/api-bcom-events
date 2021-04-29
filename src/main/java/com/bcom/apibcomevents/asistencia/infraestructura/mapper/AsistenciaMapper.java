package com.bcom.apibcomevents.asistencia.infraestructura.mapper;

import com.bcom.apibcomevents.asistencia.dominio.dto.AsistenciaDTO;
import com.bcom.apibcomevents.asistencia.infraestructura.entidad.Asistencia;
import com.bcom.apibcomevents.asistencia.infraestructura.entidad.AsistenciaPK;
import org.mapstruct.Mapper;

@Mapper
public class AsistenciaMapper {

    public Asistencia asistenciaDtoHaciaAsistencia(AsistenciaDTO asistenciaDTO){
        return Asistencia.builder()
                .asistenciaPK(AsistenciaPK.builder()
                .idUsuario(asistenciaDTO.getIdUsuario())
                .idEvento(asistenciaDTO.getIdEvento())
                .build())
                .build();
    }

    public AsistenciaDTO asistenciaHaciaAsistenciaDto(Asistencia asistencia){
        return AsistenciaDTO.builder()
                .idUsuario(asistencia.getAsistenciaPK().getIdUsuario())
                .idEvento(asistencia.getAsistenciaPK().getIdEvento())
                .build();
    }

}
