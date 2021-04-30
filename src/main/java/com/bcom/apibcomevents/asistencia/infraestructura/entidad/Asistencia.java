package com.bcom.apibcomevents.asistencia.infraestructura.entidad;

import com.bcom.apibcomevents.evento.infraestructura.entidad.Evento;
import com.bcom.apibcomevents.usuario.infraestructura.entidad.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "asistencia")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Asistencia {

    @EmbeddedId
    private AsistenciaPK asistenciaPK;

    @ManyToOne(optional = false,cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario",referencedColumnName = "id", nullable = false,insertable = false,updatable = false)
    private Usuario usuario;

    @ManyToOne(optional = false,cascade = CascadeType.ALL)
    @JoinColumn(name = "id_evento" ,referencedColumnName = "id",nullable = false, updatable = false,insertable = false)
    private Evento evento;

}
