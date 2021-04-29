package com.bcom.apibcomevents.usuario.infraestructura.controlador;

import com.bcom.apibcomevents.usuario.dominio.dto.UsuarioDTO;
import com.bcom.apibcomevents.usuario.dominio.service.ControladorServicioUsuario;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@AllArgsConstructor
public class ControladorUsuario {

    private final ControladorServicioUsuario controladorServicioUsuario;

    @PostMapping
    public ResponseEntity<UsuarioDTO> agregarUsuario(@RequestBody UsuarioDTO usuarioDTO){
        Long ubicacion = controladorServicioUsuario.guardarUsuario(usuarioDTO);
        HttpHeaders cabezera = new HttpHeaders();
        cabezera.add("Ubicacion","/usuarios/"+ ubicacion);
        return new ResponseEntity<>(cabezera,HttpStatus.CREATED);
    }
}
