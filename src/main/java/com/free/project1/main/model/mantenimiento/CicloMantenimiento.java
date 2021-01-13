package com.free.project1.main.model.mantenimiento;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "CICLO_MANTENIMIENTO")
public class CicloMantenimiento {

    @Id
    @Column(name = "ID_CICLO")
    int ID_CICLO;// NUMBER NOT NULL,

    @Column(name = "ID_MANTENIMIENTO", nullable = false)
    int ID_MANTENIMIENTO;// NUMBER NOT NULL,

    @Column(name = "DES_COMENTARIOS", length = 2000)
    String DES_COMENTARIOS;// VARCHAR(2000),

    @Column(name = "FE_TRATAMIENTO")
    Date FE_TRATAMIENTO;// DATE,

    @Column(name = "RUTA_ADJUNTO", length = 255)
    String RUTA_ADJUNTO;// VARCHAR(255),

    @Column(name = "FE_CREA_REG")
    Date FE_CREA_REG;// DATE,

    @Column(name = "FE_MODI_REG")
    Date FE_MODI_REG;// DATE,

    @Column(name = "COD_MOD_USU", length = 8)
    String COD_MOD_USU;// VARCHAR(8),

    @Column(name = "ID_DETALLE_MTO", nullable = false)
    int ID_DETALLE_MTO;// NUMBER NOT NULL,

    @Column(name = "CHK_ACTIVO")
    Character CHK_ACTIVO;// CHAR(1),

    @Column(name = "DES_COMENTARIOS_PUBLICOS", length = 2000)
    String DES_COMENTARIOS_PUBLICOS;// VARCHAR(2000)

}
