package com.free.project1.main.model.mantenimiento;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * ProcedenciaInversion
 */
@Entity(name = "PROCEDENCIA_INVERSION")
public class ProcedenciaInversion {

    @Id
    @Column(name = "COD_PROCEDENCIA")
    String cod_procedencia;

    @Column(name = "DES_PROCEDENCIA", length = 255)
    String des_procedencia;

    @Column(name = "FE_CREA_REG")
    Date fe_crea_reg;

    @Column(name = "FE_MODI_REG")
    Date fe_modi_reg;

    @Column(name = "COD_MOD_USU", length = 8)
    String cod_mod_usu;

    @Column(name = "CHK_ACTIVO", length = 1)
    Character chk_activo;

    @Column(name = "CHK_MARCA", length = 1)
    Character chk_marca;

    public ProcedenciaInversion() {
    }

    public ProcedenciaInversion(String cod_procedencia, String des_procedencia, Date fe_crea_reg, Date fe_modi_reg,
            String cod_mod_usu, Character chk_activo, Character chk_marca) {
        this.cod_procedencia = cod_procedencia;
        this.des_procedencia = des_procedencia;
        this.fe_crea_reg = fe_crea_reg;
        this.fe_modi_reg = fe_modi_reg;
        this.cod_mod_usu = cod_mod_usu;
        this.chk_activo = chk_activo;
        this.chk_marca = chk_marca;
    }

    public String getCod_procedencia() {
        return this.cod_procedencia;
    }

    public void setCod_procedencia(String cod_procedencia) {
        this.cod_procedencia = cod_procedencia;
    }

    public String getDes_procedencia() {
        return this.des_procedencia;
    }

    public void setDes_procedencia(String des_procedencia) {
        this.des_procedencia = des_procedencia;
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

    public String getCod_mod_usu() {
        return this.cod_mod_usu;
    }

    public void setCod_mod_usu(String cod_mod_usu) {
        this.cod_mod_usu = cod_mod_usu;
    }

    public Character getChk_activo() {
        return this.chk_activo;
    }

    public void setChk_activo(Character chk_activo) {
        this.chk_activo = chk_activo;
    }

    public Character getChk_marca() {
        return this.chk_marca;
    }

    public void setChk_marca(Character chk_marca) {
        this.chk_marca = chk_marca;
    }

    @Override
    public String toString() {
        return "{" + " 'cod_procedencia':'" + getCod_procedencia() + "'" + ", 'des_procedencia':'"
                + getDes_procedencia() + "'" + ", 'fe_crea_reg':'" + getFe_crea_reg() + "'" + ", 'fe_modi_reg':'"
                + getFe_modi_reg() + "'" + ", 'cod_mod_usu':'" + getCod_mod_usu() + "'" + ", 'chk_activo':'"
                + getChk_activo() + "'" + ", 'chk_marca':'" + getChk_marca() + "'" + "}";
    }

}