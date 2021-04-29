package com.bcom.apibcomevents.usuario.aplicacion;

import com.bcom.apibcomevents.usuario.dominio.dto.UsuarioDTO;
import com.bcom.apibcomevents.usuario.dominio.repositorio.RepositorioControoladorUsuario;
import com.bcom.apibcomevents.usuario.dominio.service.ControladorServicioUsuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ControladorServicioUsuarioImpl implements ControladorServicioUsuario {

    private final RepositorioControoladorUsuario repositorioControoladorUsuario;

    @Override
    public Long guardarUsuario(UsuarioDTO usuarioDTO) {
        return repositorioControoladorUsuario.guardarUsuario(usuarioDTO);
    }

    @Override
    public Optional<UsuarioDTO> buscarUsuarioPorId(Long id) {
        return repositorioControoladorUsuario.buscarUsuarioPorId(id);
    }
}
