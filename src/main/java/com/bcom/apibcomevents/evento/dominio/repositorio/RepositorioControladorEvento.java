package com.bcom.apibcomevents.evento.dominio.repositorio;

import com.bcom.apibcomevents.evento.dominio.dto.EventoDTO;

import java.util.List;
import java.util.Optional;

public interface RepositorioControladorEvento {

    Optional<EventoDTO> agregarUnEventoConUsuario(EventoDTO eventoDTO, Long idUsuario);

    List<EventoDTO> listarEventos();

    Optional<EventoDTO> actualizarEvento(EventoDTO eventoDTO,Long idEvento);

}
