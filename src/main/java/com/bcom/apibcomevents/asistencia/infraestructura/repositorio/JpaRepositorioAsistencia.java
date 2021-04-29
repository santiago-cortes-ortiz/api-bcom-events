package com.bcom.apibcomevents.asistencia.infraestructura.repositorio;

import com.bcom.apibcomevents.asistencia.infraestructura.entidad.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaRepositorioAsistencia extends JpaRepository<Asistencia,Long> {
}
