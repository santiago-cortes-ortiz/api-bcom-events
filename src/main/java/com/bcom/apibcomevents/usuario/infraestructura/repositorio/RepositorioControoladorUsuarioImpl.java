package com.bcom.apibcomevents.usuario.infraestructura.repositorio;

import com.bcom.apibcomevents.usuario.dominio.dto.UsuarioDTO;
import com.bcom.apibcomevents.usuario.dominio.repositorio.RepositorioControoladorUsuario;
import com.bcom.apibcomevents.usuario.infraestructura.mapper.UsuarioMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class RepositorioControoladorUsuarioImpl implements RepositorioControoladorUsuario {

    private final JpaRepositorio jpaRepositorio;
    private final UsuarioMapper usuarioMapper;

    @Override
    public Long guardarUsuario(UsuarioDTO usuarioDTO) {
        return jpaRepositorio.save(usuarioMapper.usuarioDtoHaciaUsuario(usuarioDTO)).getId();
    }

    @Override
    public List<UsuarioDTO> listarUsuarios() {
        return usuarioMapper.listaUsuarioHaciaUsuarioDto(jpaRepositorio.findAll());
    }
}
