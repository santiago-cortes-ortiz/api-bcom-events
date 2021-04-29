package com.bcom.apibcomevents.usuario.infraestructura.entidad;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "usuario")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Usuario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Column( name = "fecha_creacion" )
    private Date fechaCreacion;

    @Column ( name="fecha_modificacion")
    private Date fechaModificacion;
}
