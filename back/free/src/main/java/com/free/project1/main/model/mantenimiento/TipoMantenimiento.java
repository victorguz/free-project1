package com.free.project1.main.model.mantenimiento;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "TIPO_MANTENIMIENTO")
public class TipoMantenimiento {

    @Id
    @Column(name = "ID_TIPO_MTO")
    int id_tipo_mto;// NUMBER NOT NULL,

    @Column(name = "DES_TIPO_MTO", nullable = false, length = 255)
    String des_tipo_mto;// VARCHAR(255) NOT NULL,

    @Column(name = "CHK_ACTIVO", nullable = false)
    int chk_activo;// NUMBER NOT NULL,

    @Column(name = "FE_CREA_REG")
    Date fe_crea_reg;// DATE,

    @Column(name = "FE_MODI_REG")
    Date fe_modi_reg;// DATE,

    @Column(name = "COD_MOD_USU", length = 8)
    String cod_mod_usu;// VARCHAR(8)

}
