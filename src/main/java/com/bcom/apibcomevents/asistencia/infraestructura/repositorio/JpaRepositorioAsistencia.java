package com.bcom.apibcomevents.asistencia.infraestructura.repositorio;

import com.bcom.apibcomevents.asistencia.infraestructura.entidad.Asistencia;
import com.bcom.apibcomevents.asistencia.infraestructura.entidad.AsistenciaPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JpaRepositorioAsistencia extends JpaRepository<Asistencia,Long> {
    List<Asistencia> findByAsistenciaPK_IdEvento(Long id);
}
