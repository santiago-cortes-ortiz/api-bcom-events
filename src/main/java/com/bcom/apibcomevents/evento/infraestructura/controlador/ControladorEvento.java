package com.bcom.apibcomevents.evento.infraestructura.controlador;
import com.bcom.apibcomevents.evento.dominio.dto.EventoDTO;
import com.bcom.apibcomevents.evento.dominio.servicio.ControladorServicioEvento;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@AllArgsConstructor
public class ControladorEvento {

    private ControladorServicioEvento controladorServicioEvento;

    @PostMapping("/usuarios/{idUsuario}/evento")
    public ResponseEntity<EventoDTO> guardarEventoConUsuario(@RequestBody EventoDTO eventoDTO, @PathVariable("idUsuario") Long idUsuario){
        Optional<EventoDTO> eventoAGuardar = controladorServicioEvento.agregarUnEventoConUsuario(eventoDTO,idUsuario);
        if (eventoAGuardar.isEmpty()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(eventoAGuardar.get(),HttpStatus.CREATED);
    }

}
