package com.bcom.apibcomevents.asistencia.infraestructura.mapper;

import com.bcom.apibcomevents.asistencia.dominio.dto.AsistenciaDTO;
import com.bcom.apibcomevents.asistencia.infraestructura.entidad.Asistencia;
import com.bcom.apibcomevents.asistencia.infraestructura.entidad.AsistenciaPK;
import com.bcom.apibcomevents.evento.dominio.dto.EventoDTO;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<AsistenciaDTO> listaAsistenciaHaciaAsistenciaDto( List<Asistencia> asistencias){
        List<AsistenciaDTO> asistenciaDTO = asistencias.stream().map(
                list -> AsistenciaDTO.builder()
                        .idEvento(list.getAsistenciaPK().getIdUsuario())
                        .idUsuario(list.getAsistenciaPK().getIdUsuario())
                        .build()).collect(Collectors.toList());
        return asistenciaDTO;
    }

}
