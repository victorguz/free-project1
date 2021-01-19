package com.free.project1.main.model.mantenimiento.view;

import java.util.ArrayList;
import java.util.List;

import com.free.project1.main.config.Functions;
import com.free.project1.main.model.mantenimiento.CicloMantenimiento;

public class CicloMantenimientoView {

    int id_ciclo;

    int id_mantenimiento;

    String des_comentarios;

    String fe_tratamiento;

    String ruta_adjunto;

    String fe_crea_reg;

    String fe_modi_reg;

    String cod_mod_usu;

    DetalleMantenimientoView detalle_mantenimiento;

    Character chk_activo;

    String de_comentarios_publicos;

    public CicloMantenimientoView() {
    }

    public CicloMantenimientoView(CicloMantenimiento ciclo) {
        this.id_ciclo = ciclo.id_ciclo;
        this.id_mantenimiento = ciclo.id_mantenimiento;
        this.des_comentarios = ciclo.des_comentarios;
        this.fe_tratamiento = Functions.processDate(ciclo.fe_tratamiento);
        this.ruta_adjunto = ciclo.ruta_adjunto;
        this.fe_crea_reg = Functions.processDate(ciclo.fe_crea_reg);
        this.fe_modi_reg = Functions.processDate(ciclo.fe_modi_reg);
        this.cod_mod_usu = ciclo.cod_mod_usu;
        this.chk_activo = ciclo.chk_activo;
        this.de_comentarios_publicos = ciclo.de_comentarios_publicos;
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

    public String getFe_tratamiento() {
        return this.fe_tratamiento;
    }

    public void setFe_tratamiento(String fe_tratamiento) {
        this.fe_tratamiento = fe_tratamiento;
    }

    public String getRuta_adjunto() {
        return this.ruta_adjunto;
    }

    public void setRuta_adjunto(String ruta_adjunto) {
        this.ruta_adjunto = ruta_adjunto;
    }

    public String getFe_crea_reg() {
        return this.fe_crea_reg;
    }

    public void setFe_crea_reg(String fe_crea_reg) {
        this.fe_crea_reg = fe_crea_reg;
    }

    public String getFe_modi_reg() {
        return this.fe_modi_reg;
    }

    public void setFe_modi_reg(String fe_modi_reg) {
        this.fe_modi_reg = fe_modi_reg;
    }

    public String getCod_mod_usu() {
        return this.cod_mod_usu;
    }

    public void setCod_mod_usu(String cod_mod_usu) {
        this.cod_mod_usu = cod_mod_usu;
    }

    public DetalleMantenimientoView getDetalle_mantenimiento() {
        return this.detalle_mantenimiento;
    }

    public void setDetalle_mantenimiento(DetalleMantenimientoView detalle_mantenimiento) {
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

    public static List<CicloMantenimientoView> toList(List<CicloMantenimiento> mnt) {
        List<CicloMantenimientoView> list = new ArrayList<>();
        for (CicloMantenimiento mantenimiento : mnt) {
            CicloMantenimientoView neew = new CicloMantenimientoView(mantenimiento);
            list.add(neew);
        }
        return list;
    }
}
