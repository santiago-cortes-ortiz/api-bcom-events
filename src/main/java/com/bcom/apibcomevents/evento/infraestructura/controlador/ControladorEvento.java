package com.bcom.apibcomevents.evento.infraestructura.controlador;
import com.bcom.apibcomevents.evento.dominio.dto.EventoDTO;
import com.bcom.apibcomevents.evento.dominio.servicio.ControladorServicioEvento;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
@AllArgsConstructor
public class ControladorEvento {

    private ControladorServicioEvento controladorServicioEvento;

    @PostMapping("/usuarios/{idUsuario}/eventos")
    public ResponseEntity<EventoDTO> guardarEventoConUsuario(@RequestBody EventoDTO eventoDTO, @PathVariable("idUsuario") Long idUsuario){
        Optional<EventoDTO> eventoAGuardar = controladorServicioEvento.agregarUnEventoConUsuario(eventoDTO,idUsuario);
        if (eventoAGuardar.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(eventoAGuardar.get(),HttpStatus.CREATED);
    }

    @GetMapping("/eventos")
    public ResponseEntity<List<EventoDTO>> listarEventos(){
        return new ResponseEntity<>(controladorServicioEvento.listarEventos(),HttpStatus.OK);
    }

    @PutMapping("/eventos/{idEvento}")
    public ResponseEntity<EventoDTO> actualizarEvento(@RequestBody EventoDTO eventoDTO,@PathVariable("idEvento") Long idEvento){
        Optional<EventoDTO> eventoAModificar = controladorServicioEvento.actualizarEvento(eventoDTO,idEvento);
        if (eventoAModificar.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(eventoAModificar.get(),HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/eventos/{idEvento}")
    public ResponseEntity<HttpStatus> eliminarEventoPorId(@PathVariable("idEvento") Long idEvento){
        if (controladorServicioEvento.eliminarEventoPorId(idEvento) == true){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}
