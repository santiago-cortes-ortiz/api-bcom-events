package com.bcom.apibcomevents.usuario.infraestructura.mapper;

import com.bcom.apibcomevents.usuario.dominio.dto.UsuarioDTO;
import com.bcom.apibcomevents.usuario.infraestructura.entidad.Usuario;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;

@Mapper
public abstract class UsuarioMapper {
    public Usuario usuarioDtoHaciaUsuario(UsuarioDTO usuarioDTO){
        return Usuario.builder()
                .id(usuarioDTO.getId())
                .nombre(usuarioDTO.getNombre())
                .fechaCreacion(usuarioDTO.getFechaCreacion())
                .fechaModificacion(usuarioDTO.getFechaModificacion())
                .build();
    }

    public List<UsuarioDTO> usuarioHaciaUsuarioDto( List<Usuario> listaUsuario){
        List<UsuarioDTO> listaBancoDto = listaUsuario.stream().map(lista -> UsuarioDTO.builder()
                .id(lista.getId())
                .nombre(lista.getNombre())
                .fechaCreacion(lista.getFechaCreacion())
                .fechaModificacion(lista.getFechaModificacion())
                .build())
                .collect(Collectors.toList());
        return listaBancoDto;
    }
}
