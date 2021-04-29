package com.bcom.apibcomevents.usuario.dominio.service;

import com.bcom.apibcomevents.usuario.dominio.dto.UsuarioDTO;

import java.util.List;
import java.util.Optional;

public interface ControladorServicioUsuario {
    Long guardarUsuario(UsuarioDTO usuarioDTO);
    List<UsuarioDTO> listarUsuarios();
}
