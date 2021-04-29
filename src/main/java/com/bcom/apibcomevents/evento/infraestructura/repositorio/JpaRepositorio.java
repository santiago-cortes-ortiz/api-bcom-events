package com.bcom.apibcomevents.evento.infraestructura.repositorio;

import com.bcom.apibcomevents.evento.infraestructura.entidad.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaRepositorio extends JpaRepository<Evento,Long> {

}
