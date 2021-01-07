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

    public TipoMantenimiento() {
    }

    public TipoMantenimiento(int id_tipo_mto, String des_tipo_mto, int chk_activo, Date fe_crea_reg, Date fe_modi_reg,
            String cod_mod_usu) {
        this.id_tipo_mto = id_tipo_mto;
        this.des_tipo_mto = des_tipo_mto;
        this.chk_activo = chk_activo;
        this.fe_crea_reg = fe_crea_reg;
        this.fe_modi_reg = fe_modi_reg;
        this.cod_mod_usu = cod_mod_usu;
    }

    public int getId_tipo_mto() {
        return this.id_tipo_mto;
    }

    public void setId_tipo_mto(int id_tipo_mto) {
        this.id_tipo_mto = id_tipo_mto;
    }

    public String getDes_tipo_mto() {
        return this.des_tipo_mto;
    }

    public void setDes_tipo_mto(String des_tipo_mto) {
        this.des_tipo_mto = des_tipo_mto;
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
        return "{" + " id_tipo_mto='" + getId_tipo_mto() + "'" + ", des_tipo_mto='" + getDes_tipo_mto() + "'"
                + ", chk_activo='" + getChk_activo() + "'" + ", fe_crea_reg='" + getFe_crea_reg() + "'"
                + ", fe_modi_reg='" + getFe_modi_reg() + "'" + ", cod_mod_usu='" + getCod_mod_usu() + "'" + "}";
    }

}
