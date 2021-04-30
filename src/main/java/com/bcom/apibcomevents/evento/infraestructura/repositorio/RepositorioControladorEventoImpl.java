package com.bcom.apibcomevents.evento.infraestructura.repositorio;

import com.bcom.apibcomevents.evento.dominio.dto.EventoDTO;
import com.bcom.apibcomevents.evento.dominio.repositorio.RepositorioControladorEvento;
import com.bcom.apibcomevents.evento.infraestructura.entidad.Evento;
import com.bcom.apibcomevents.evento.infraestructura.mapper.EventoMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class RepositorioControladorEventoImpl implements RepositorioControladorEvento {

    private final JpaRepositorioEvento jpaRepositorioEvento;
    private final EventoMapper eventoMapper;

    @Override
    public Optional<EventoDTO> agregarUnEventoConUsuario(EventoDTO eventoDTO, Long idUsuario) {
        Evento eventoAGuardar = jpaRepositorioEvento.save(eventoMapper.eventoDtoHaciaEvento(eventoDTO));
        if (eventoAGuardar == null){
            return Optional.empty();
        }
        eventoAGuardar.setIdCreador(idUsuario);
        jpaRepositorioEvento.save(eventoAGuardar);
        return Optional.of(eventoMapper.eventoHaciaEventoDto(eventoAGuardar));
    }

    @Override
    public List<EventoDTO> listarEventos() {
        return eventoMapper.listaEventoHaciaEventoDto(jpaRepositorioEvento.findAll());
    }

    @Override
    public Optional<EventoDTO> actualizarEvento(EventoDTO eventoDTO, Long idEvento) {
        Evento eventoABuscar = jpaRepositorioEvento.findById(idEvento).get();
        eventoABuscar.setNombre(eventoDTO.getNombre());
        eventoABuscar.setFecha(eventoDTO.getFecha());
        eventoABuscar.setDescripcion(eventoDTO.getDescripcion());
        eventoABuscar.setFechaModificacion(new Date());
        return Optional.of(eventoMapper.eventoHaciaEventoDto(jpaRepositorioEvento.save(eventoABuscar)));

    }

    @Override
    public boolean eliminarEventoPorId(Long id){
        try{
            jpaRepositorioEvento.findById(id);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
