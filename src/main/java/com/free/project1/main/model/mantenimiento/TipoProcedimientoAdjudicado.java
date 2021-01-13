package com.free.project1.main.model.mantenimiento;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * TipoProcedimientoAdjudicado
 */
@Entity(name = "TIPO_PROC_ADJ")
public class TipoProcedimientoAdjudicado {

    @Id
    @Column(name = "ID_PROC_ADJ")
    int id_proc_adj;

    @Column(name = "COD_PROC_ADJ", length = 10)
    String cod_proc_adj;

    @Column(name = "DES_PROC_ADJ", length = 255)
    String des_proc_adj;

    @Column(name = "CHK_ACTIVO")
    int chk_activo;

    @Column(name = "FE_CREA_REG")
    Date fe_crea_reg;

    @Column(name = "FE_MODI_REG")
    Date fe_modi_reg;

    @Column(name = "COD_MOD_USU", length = 8)
    String cod_mod_usu;

    public TipoProcedimientoAdjudicado() {
    }

    public int getId_proc_adj() {
        return this.id_proc_adj;
    }

    public void setId_proc_adj(int id_proc_adj) {
        this.id_proc_adj = id_proc_adj;
    }

    public String getCod_proc_adj() {
        return this.cod_proc_adj;
    }

    public void setCod_proc_adj(String cod_proc_adj) {
        this.cod_proc_adj = cod_proc_adj;
    }

    public String getDes_proc_adj() {
        return this.des_proc_adj;
    }

    public void setDes_proc_adj(String des_proc_adj) {
        this.des_proc_adj = des_proc_adj;
    }

    public int getChk_activo() {
        return this.chk_activo;
    }

    public void setChk_activo(int chk_activo) {
        this.chk_activo = chk_activo;
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

    @Override
    public String toString() {
        return "{" + " 'id_proc_adj':'" + getId_proc_adj() + "'" + ", 'cod_proc_adj':'" + getCod_proc_adj() + "'"
                + ", 'des_proc_adj':'" + getDes_proc_adj() + "'" + ", 'chk_activo':'" + getChk_activo() + "'"
                + ", 'fe_crea_reg':'" + getFe_crea_reg() + "'" + ", 'fe_modi_reg':'" + getFe_modi_reg() + "'"
                + ", 'cod_mod_usu':'" + getCod_mod_usu() + "'" + "}";
    }

}