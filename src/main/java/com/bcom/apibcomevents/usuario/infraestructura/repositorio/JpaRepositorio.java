package com.bcom.apibcomevents.usuario.infraestructura.repositorio;

import com.bcom.apibcomevents.usuario.infraestructura.entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaRepositorio extends JpaRepository<Usuario,Long> {

}
