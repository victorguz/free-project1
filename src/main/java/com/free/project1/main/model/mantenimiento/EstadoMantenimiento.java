package com.free.project1.main.model.mantenimiento;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "ESTADO_MANTENIMIENTO")
public class EstadoMantenimiento {

    @Id
    @Column(name = "ID_ESTADO")
    int id_estado;// NUMBER NOT NULL,

    @Column(name = "DES_ESTADO", length = 100, nullable = false)
    String des_estado;// VARCHAR(100) NOT NULL,

    @Column(name = "FE_CREA_REG")
    Date fe_crea_reg;// DATE,

    @Column(name = "FE_MODI_REG")
    Date fe_modi_reg;// DATE,

    @Column(name = "CHK_ACTIVO")
    Character chk_activo;// CHAR(1),

    @Column(name = "COD_MOD_USU", length = 10)
    String cod_mod_usu; // VARCHAR(10)

    public EstadoMantenimiento() {
    }

    public int getId_estado() {
        return this.id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public String getDes_estado() {
        return this.des_estado;
    }

    public void setDes_estado(String des_estado) {
        this.des_estado = des_estado;
    }

    public Date getFe_crea_reg() {
        return this.fe_crea_reg;
    }

    public void setFe_crea_reg(Date fe_crea_reg) {
        this.fe_crea_reg = fe_crea_reg;
    }

    public Date getFe_modi_reg() {
        return this.fe_modi_reg;
    }

    public void setFe_modi_reg(Date fe_modi_reg) {
        this.fe_modi_reg = fe_modi_reg;
    }

    public Character getChk_activo() {
        return this.chk_activo;
    }

    public void setChk_activo(Character chk_activo) {
        this.chk_activo = chk_activo;
    }

    public String getCod_mod_usu() {
        return this.cod_mod_usu;
    }

    public void setCod_mod_usu(String cod_mod_usu) {
        this.cod_mod_usu = cod_mod_usu;
    }

    @Override
    public String toString() {
        return getDes_estado();
    }

}
