package com.bcom.apibcomevents.usuario.dominio.service;

import com.bcom.apibcomevents.usuario.dominio.dto.UsuarioDTO;

import java.util.Optional;

public interface ControladorServicioUsuario {
    Long guardarUsuario(UsuarioDTO usuarioDTO);
    Optional<UsuarioDTO> buscarUsuarioPorId(Long id);
}
