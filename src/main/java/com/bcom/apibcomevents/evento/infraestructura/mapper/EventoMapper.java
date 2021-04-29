package com.bcom.apibcomevents.evento.infraestructura.mapper;

import com.bcom.apibcomevents.evento.dominio.dto.EventoDTO;
import com.bcom.apibcomevents.evento.infraestructura.entidad.Evento;
import org.mapstruct.Mapper;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Mapper
public abstract class EventoMapper {

    public Evento eventoDtoHaciaEvento(EventoDTO eventoDTO){
        return Evento.builder()
                .id(eventoDTO.getId())
                .idCreador(eventoDTO.getIdCreador())
                .nombre(eventoDTO.getNombre())
                .fecha(eventoDTO.getFecha())
                .descripcion(eventoDTO.getDescripcion())
                .fechaCreacion(new Date())
                .fechaModificacion(eventoDTO.getFechaModificacion())
                .build();
    }

    public List<EventoDTO> listaEventoHaciaEventoDto(List<Evento> listaEvento){
        List<EventoDTO> listaEventoDTO = listaEvento.stream().map(
                list -> EventoDTO.builder()
                .id(list.getId())
                .idCreador(list.getIdCreador())
                .nombre(list.getNombre())
                .fecha(list.getFecha())
                .descripcion(list.getDescripcion())
                .fechaCreacion(list.getFechaCreacion())
                .fechaModificacion(list.getFechaModificacion())
                .build()).collect(Collectors.toList());
        return listaEventoDTO;
    }

}
