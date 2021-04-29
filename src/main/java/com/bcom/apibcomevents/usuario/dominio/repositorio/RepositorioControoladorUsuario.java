package com.bcom.apibcomevents.usuario.dominio.repositorio;

import com.bcom.apibcomevents.usuario.dominio.dto.UsuarioDTO;

import java.util.Optional;

public interface RepositorioControoladorUsuario {
    Long guardarUsuario(UsuarioDTO usuarioDTO);
    Optional<UsuarioDTO> buscarUsuarioPorId(Long id);
}
