package com.bcom.apibcomevents.evento.infraestructura.repositorio;

import com.bcom.apibcomevents.evento.dominio.dto.EventoDTO;
import com.bcom.apibcomevents.evento.dominio.repositorio.RepositorioControladorEvento;
import com.bcom.apibcomevents.evento.infraestructura.entidad.Evento;
import com.bcom.apibcomevents.evento.infraestructura.mapper.EventoMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class RepositorioControladorEventoImpl implements RepositorioControladorEvento {

    private final JpaRepositorio jpaRepositorio;
    private final EventoMapper eventoMapper;

    @Override
    public Optional<EventoDTO> agregarUnEventoConUsuario(EventoDTO eventoDTO, Long idUsuario) {
        Evento eventoAGuardar = jpaRepositorio.save(eventoMapper.eventoDtoHaciaEvento(eventoDTO));
        eventoAGuardar.setIdCreador(idUsuario);
        jpaRepositorio.save(eventoAGuardar);
        if (eventoAGuardar == null){
            return Optional.empty();
        }
        return Optional.of(eventoMapper.eventoHaciaEventoDto(eventoAGuardar));
    }

    @Override
    public List<EventoDTO> listarEventos() {
        return eventoMapper.listaEventoHaciaEventoDto(jpaRepositorio.findAll());
    }

    @Override
    public Optional<EventoDTO> actualizarEvento(EventoDTO eventoDTO, Long idEvento) {
        Optional<EventoDTO> eventoDTO1 = null;
        Evento eventoABuscar = jpaRepositorio.findById(idEvento).get();
        eventoABuscar.setNombre(eventoDTO.getNombre());
        eventoABuscar.setFecha(eventoDTO.getFecha());
        eventoABuscar.setDescripcion(eventoDTO.getDescripcion());
        return Optional.of(eventoMapper.eventoHaciaEventoDto(jpaRepositorio.save(eventoABuscar)));

    }
}
