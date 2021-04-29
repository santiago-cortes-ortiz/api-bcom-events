package com.bcom.apibcomevents.asistencia.infraestructura.controlador;

import com.bcom.apibcomevents.asistencia.dominio.dto.AsistenciaDTO;
import com.bcom.apibcomevents.asistencia.dominio.servicio.ControladorServicioAsistencia;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("asistencia")
@AllArgsConstructor
public class ControladorAsistencia {

    private ControladorServicioAsistencia controladorServicioAsistencia;

    @PostMapping
    public ResponseEntity<AsistenciaDTO> guardarAsistencia(@RequestBody AsistenciaDTO asistenciaDTO){
        Optional<AsistenciaDTO> asistenciaDTOAGuardar = controladorServicioAsistencia.guardarAsistencia(asistenciaDTO);
        if (asistenciaDTOAGuardar.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(asistenciaDTOAGuardar.get(),HttpStatus.CREATED);
    }

}
