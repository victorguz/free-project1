package com.free.project1.main.model.mantenimiento;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "REQUIERE_MANTENIMIENTO")
public class RequiereMantenimiento {

    @Id
    @Column(name = "COD_REQMTO")
    int cod_reqmto;// NUMBER NOT NULL,

    @Column(name = "DES_REQMTO", length = 255, nullable = false)
    String des_reqmto;// VARCHAR(255) NOT NULL,

    @Column(name = "FE_CREA_REG")
    Date fe_crea_reg;// DATE,

    @Column(name = "FE_MODI_REG")
    Date fe_modi_reg;// DATE,

    @Column(name = "COD_MOD_USU", length = 8)
    String cod_mod_usu;// VARCHAR(8),

    @Column(name = "CHK_ACTIVO")
    Character chk_activo;// CHAR(1),

    @Column(name = "CHK_MARCA")
    Character chk_marca;// CHAR(1)


    public RequiereMantenimiento() {
    }

    public RequiereMantenimiento(int cod_reqmto, String des_reqmto, Date fe_crea_reg, Date fe_modi_reg, String cod_mod_usu, Character chk_activo, Character chk_marca) {
        this.cod_reqmto = cod_reqmto;
        this.des_reqmto = des_reqmto;
        this.fe_crea_reg = fe_crea_reg;
        this.fe_modi_reg = fe_modi_reg;
        this.cod_mod_usu = cod_mod_usu;
        this.chk_activo = chk_activo;
        this.chk_marca = chk_marca;
    }

    public int getCod_reqmto() {
        return this.cod_reqmto;
    }

    public void setCod_reqmto(int cod_reqmto) {
        this.cod_reqmto = cod_reqmto;
    }

    public String getDes_reqmto() {
        return this.des_reqmto;
    }

    public void setDes_reqmto(String des_reqmto) {
        this.des_reqmto = des_reqmto;
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

}
