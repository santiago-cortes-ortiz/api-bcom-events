package com.bcom.apibcomevents.evento.dominio.servicio;

import com.bcom.apibcomevents.evento.dominio.dto.EventoDTO;

import java.util.List;
import java.util.Optional;

public interface ControladorServicioEvento {

    Optional<EventoDTO> agregarUnEventoConUsuario(EventoDTO eventoDTO, Long idUsuario);

    List<EventoDTO> listarEventos();

    Optional<EventoDTO> actualizarEvento(EventoDTO eventoDTO,Long idEvento);

    boolean eliminarEventoPorId(Long id);

}
