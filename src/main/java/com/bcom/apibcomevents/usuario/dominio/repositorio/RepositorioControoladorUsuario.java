package com.bcom.apibcomevents.usuario.dominio.repositorio;

import com.bcom.apibcomevents.usuario.dominio.dto.UsuarioDTO;

import java.util.List;
import java.util.Optional;

public interface RepositorioControoladorUsuario {
    Long guardarUsuario(UsuarioDTO usuarioDTO);
    List<UsuarioDTO> listarUsuarios();
}
