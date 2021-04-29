package com.bcom.apibcomevents.evento.aplicacion;

import com.bcom.apibcomevents.evento.dominio.dto.EventoDTO;
import com.bcom.apibcomevents.evento.dominio.servicio.ControladorServicioEvento;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ControladorServicioEventoImpl implements ControladorServicioEvento {
    @Override
    public Optional<EventoDTO> agregarUnEventoConUsuario(EventoDTO eventoDTO, Long idUsuario) {
        return Optional.empty();
    }

    @Override
    public List<EventoDTO> listarEventos() {
        return null;
    }

    @Override
    public Optional<EventoDTO> actualizarEvento(EventoDTO eventoDTO, Long idEvento) {
        return Optional.empty();
    }
}
