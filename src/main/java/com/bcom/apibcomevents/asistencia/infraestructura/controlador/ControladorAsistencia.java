package com.bcom.apibcomevents.asistencia.infraestructura.controlador;

import com.bcom.apibcomevents.asistencia.dominio.dto.AsistenciaDTO;
import com.bcom.apibcomevents.asistencia.dominio.repositorio.RepositorioControladorAsistencia;
import com.bcom.apibcomevents.asistencia.dominio.servicio.ControladorServicioAsistencia;
import com.bcom.apibcomevents.asistencia.infraestructura.repositorio.RepositorioControladorAsistenciaImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("asistencia")
@CrossOrigin(origins = "http://localhost:8081")
@AllArgsConstructor
public class ControladorAsistencia {

    private ControladorServicioAsistencia controladorServicioAsistencia;
    private RepositorioControladorAsistenciaImpl repositorioControladorAsistenciaImpl;

    @PostMapping
    public ResponseEntity<AsistenciaDTO> guardarAsistencia(@RequestBody AsistenciaDTO asistenciaDTO){
        Optional<AsistenciaDTO> asistenciaDTOAGuardar = controladorServicioAsistencia.guardarAsistencia(asistenciaDTO);
        if (asistenciaDTOAGuardar.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(asistenciaDTOAGuardar.get(),HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<AsistenciaDTO>> listar(@PathVariable Long id){

        return new ResponseEntity<>(repositorioControladorAsistenciaImpl.listarEventosAsistencia(id),HttpStatus.OK);

    }

}
