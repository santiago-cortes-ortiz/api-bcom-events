package com.bcom.apibcomevents.evento.infraestructura.entidad;

import com.bcom.apibcomevents.usuario.infraestructura.entidad.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "evento")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_creador")
    private Long idCreador;

    @JoinColumn(name = "id_creador",insertable = false,updatable = false)
    @ManyToOne
    private Usuario usuario;

    private String nombre;

    private Date fecha;

    private String descripcion;

    @Column( name = "fecha_creacion" )
    private Date fechaCreacion;

    @Column ( name="fecha_modificacion")
    private Date fechaModificacion;


}
