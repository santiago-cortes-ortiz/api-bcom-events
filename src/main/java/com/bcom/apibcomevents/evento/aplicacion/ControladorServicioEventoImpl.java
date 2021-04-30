package com.bcom.apibcomevents.evento.aplicacion;

import com.bcom.apibcomevents.evento.dominio.dto.EventoDTO;
import com.bcom.apibcomevents.evento.dominio.repositorio.RepositorioControladorEvento;
import com.bcom.apibcomevents.evento.dominio.servicio.ControladorServicioEvento;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ControladorServicioEventoImpl implements ControladorServicioEvento {

    private final RepositorioControladorEvento repositorioControladorEvento;

    @Override
    public Optional<EventoDTO> agregarUnEventoConUsuario(EventoDTO eventoDTO, Long idUsuario) {
        return repositorioControladorEvento.agregarUnEventoConUsuario(eventoDTO, idUsuario);
    }

    @Override
    public List<EventoDTO> listarEventos() {
        return repositorioControladorEvento.listarEventos();
    }

    @Override
    public Optional<EventoDTO> actualizarEvento(EventoDTO eventoDTO, Long idEvento) {
        return repositorioControladorEvento.actualizarEvento(eventoDTO, idEvento);
    }

    @Override
    public boolean eliminarEventoPorId(Long id) {
        return repositorioControladorEvento.eliminarEventoPorId(id);
    }
}
