package com.free.project1.main.model.mantenimiento;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity(name = "CICLO_MANTENIMIENTO")
public class CicloMantenimiento {

    @Id
    @Column(name = "ID_CICLO")
    public int id_ciclo;

    @Column(name = "ID_MANTENIMIENTO", nullable = false)
    public int id_mantenimiento;

    @Column(name = "DES_COMENTARIOS", length = 2000)
    public String des_comentarios;

    @Column(name = "FE_TRATAMIENTO")
    public Date fe_tratamiento;

    @Column(name = "RUTA_ADJUNTO", length = 255)
    public String ruta_adjunto;

    @Column(name = "FE_CREA_REG")
    public Date fe_crea_reg;

    @Column(name = "FE_MODI_REG")
    public Date fe_modi_reg;

    @Column(name = "COD_MOD_USU", length = 8)
    public String cod_mod_usu;

    // @Column(name = "ID_DETALLE_MTO", nullable = false)
    // public int ID_DETALLE_MTO;// NUMBER NOT NULL,

    @JsonIgnore
    @Fetch(FetchMode.JOIN)
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DETALLE_MTO")
    public DetalleMantenimiento detalle_mantenimiento;

    @Column(name = "CHK_ACTIVO")
    public Character chk_activo;

    @Column(name = "DES_COMENTARIOS_PUBLICOS", length = 2000)
    public String de_comentarios_publicos;

    public CicloMantenimiento() {
    }

    public CicloMantenimiento(int id_ciclo, int id_mantenimiento, String des_comentarios, Date fe_tratamiento,
            String ruta_adjunto, Date fe_crea_reg, Date fe_modi_reg, String cod_mod_usu,
            DetalleMantenimiento detalle_mantenimiento, Character chk_activo, String de_comentarios_publicos) {
        this.id_ciclo = id_ciclo;
        this.id_mantenimiento = id_mantenimiento;
        this.des_comentarios = des_comentarios;
        this.fe_tratamiento = fe_tratamiento;
        this.ruta_adjunto = ruta_adjunto;
        this.fe_crea_reg = fe_crea_reg;
        this.fe_modi_reg = fe_modi_reg;
        this.cod_mod_usu = cod_mod_usu;
        this.detalle_mantenimiento = detalle_mantenimiento;
        this.chk_activo = chk_activo;
        this.de_comentarios_publicos = de_comentarios_publicos;
    }

    public int getId_ciclo() {
        return this.id_ciclo;
    }

    public void setId_ciclo(int id_ciclo) {
        this.id_ciclo = id_ciclo;
    }

    public int getId_mantenimiento() {
        return this.id_mantenimiento;
    }

    public void setId_mantenimiento(int id_mantenimiento) {
        this.id_mantenimiento = id_mantenimiento;
    }

    public String getDes_comentarios() {
        return this.des_comentarios;
    }

    public void setDes_comentarios(String des_comentarios) {
        this.des_comentarios = des_comentarios;
    }

    public Date getFe_tratamiento() {
        return this.fe_tratamiento;
    }

    public void setFe_tratamiento(Date fe_tratamiento) {
        this.fe_tratamiento = fe_tratamiento;
    }

    public String getRuta_adjunto() {
        return this.ruta_adjunto;
    }

    public void setRuta_adjunto(String ruta_adjunto) {
        this.ruta_adjunto = ruta_adjunto;
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

    public DetalleMantenimiento getDetalle_mantenimiento() {
        return this.detalle_mantenimiento;
    }

    public void setDetalle_mantenimiento(DetalleMantenimiento detalle_mantenimiento) {
        this.detalle_mantenimiento = detalle_mantenimiento;
    }

    public Character getChk_activo() {
        return this.chk_activo;
    }

    public void setChk_activo(Character chk_activo) {
        this.chk_activo = chk_activo;
    }

    public String getDe_comentarios_publicos() {
        return this.de_comentarios_publicos;
    }

    public void setDe_comentarios_publicos(String de_comentarios_publicos) {
        this.de_comentarios_publicos = de_comentarios_publicos;
    }

    @Override
    public String toString() {
        return "{" + " 'id_ciclo':'" + getId_ciclo() + "'" + ", 'id_mantenimiento':'" + getId_mantenimiento() + "'"
                + ", 'des_comentarios':'" + getDes_comentarios() + "'" + ", 'fe_tratamiento':'" + getFe_tratamiento()
                + "'" + ", 'ruta_adjunto':'" + getRuta_adjunto() + "'" + ", 'fe_crea_reg':'" + getFe_crea_reg() + "'"
                + ", 'fe_modi_reg':'" + getFe_modi_reg() + "'" + ", 'cod_mod_usu':'" + getCod_mod_usu() + "'"
                + ", 'chk_activo':'" + getChk_activo() + "'" + ", 'de_comentarios_publicos':'"
                + getDe_comentarios_publicos() + "'" + "}";
    }

}
