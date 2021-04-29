package com.bcom.apibcomevents.usuario.infraestructura.repositorio;

import com.bcom.apibcomevents.usuario.dominio.dto.UsuarioDTO;
import com.bcom.apibcomevents.usuario.dominio.repositorio.RepositorioControoladorUsuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class RepositorioControoladorUsuarioImpl implements RepositorioControoladorUsuario {



    @Override
    public Long guardarUsuario(UsuarioDTO usuarioDTO) {
        return null;
    }

    @Override
    public Optional<UsuarioDTO> buscarUsuarioPorId(Long id) {
        return Optional.empty();
    }
}
