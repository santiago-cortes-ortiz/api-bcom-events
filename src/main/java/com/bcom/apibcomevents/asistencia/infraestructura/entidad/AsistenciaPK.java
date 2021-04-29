package com.bcom.apibcomevents.asistencia.infraestructura.entidad;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AsistenciaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_usuario", nullable = false,updatable = false,insertable = false)
    private Long idUsuario;

    @Basic(optional = false)
    @Column(name = "id_evento", nullable = false,insertable = false,updatable = false)
    private Long idEvento;

}
