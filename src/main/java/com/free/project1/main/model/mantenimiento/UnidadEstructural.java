package com.free.project1.main.model.mantenimiento;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "UNIDAD_ESTRUCTURAL")
public class UnidadEstructural {

    @Id
    @Column(name = "ID_UNIDAD")
    int id_unidad;

    @Column(name = "CODIGO_G", length = 8)
    String codigo_g;

    @Column(name = "DES_UNIDAD", length = 100)
    String descripcion;

    @Column(name = "ID_RESPONSABLE")
    String id_responsable;

    @Column(name = "COD_NIVEL")
    String cod_nivel;

    @Column(name = "ID_PADRE")
    String id_padre;

    @Column(name = "ID_PADRE1")
    String id_padre1;

    @Column(name = "ID_PADRE2")
    String id_padre2;

    @Column(name = "ID_PADRE3")
    String id_padre3;

    @Column(name = "ID_JERARQUIA")
    String id_jerarquia;

    @Column(name = "CHK_ACTIVO")
    String chk_activo;

    @Column(name = "FE_CREA_REG")
    Date fe_crea_reg;

    @Column(name = "FE_MODI_REG")
    Date fe_modi_reg;

    @Column(name = "COD_MOD_USU", length = 8)
    String cod_mod_usu;

    @Column(name = "ID_PADRE4", length = 10)
    String id_padre4;

    @Column(name = "COD_ORDEN")
    String cod_orden;

    public UnidadEstructural() {
    }

    public UnidadEstructural(int id_unidad, String codigo_g, String descripcion, String id_responsable,
            String cod_nivel, String id_padre, String id_padre1, String id_padre2, String id_padre3,
            String id_jerarquia, String chk_activo, Date fe_crea_reg, Date fe_modi_reg, String cod_mod_usu,
            String id_padre4, String cod_orden) {
        this.id_unidad = id_unidad;
        this.codigo_g = codigo_g;
        this.descripcion = descripcion;
        this.id_responsable = id_responsable;
        this.cod_nivel = cod_nivel;
        this.id_padre = id_padre;
        this.id_padre1 = id_padre1;
        this.id_padre2 = id_padre2;
        this.id_padre3 = id_padre3;
        this.id_jerarquia = id_jerarquia;
        this.chk_activo = chk_activo;
        this.fe_crea_reg = fe_crea_reg;
        this.fe_modi_reg = fe_modi_reg;
        this.cod_mod_usu = cod_mod_usu;
        this.id_padre4 = id_padre4;
        this.cod_orden = cod_orden;
    }

    public int getId_unidad() {
        return this.id_unidad;
    }

    public void setId_unidad(int id_unidad) {
        this.id_unidad = id_unidad;
    }

    public String getCodigo_g() {
        return this.codigo_g;
    }

    public void setCodigo_g(String codigo_g) {
        this.codigo_g = codigo_g;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getId_responsable() {
        return this.id_responsable;
    }

    public void setId_responsable(String id_responsable) {
        this.id_responsable = id_responsable;
    }

    public String getCod_nivel() {
        return this.cod_nivel;
    }

    public void setCod_nivel(String cod_nivel) {
        this.cod_nivel = cod_nivel;
    }

    public String getId_padre() {
        return this.id_padre;
    }

    public void setId_padre(String id_padre) {
        this.id_padre = id_padre;
    }

    public String getId_padre1() {
        return this.id_padre1;
    }

    public void setId_padre1(String id_padre1) {
        this.id_padre1 = id_padre1;
    }

    public String getId_padre2() {
        return this.id_padre2;
    }

    public void setId_padre2(String id_padre2) {
        this.id_padre2 = id_padre2;
    }

    public String getId_padre3() {
        return this.id_padre3;
    }

    public void setId_padre3(String id_padre3) {
        this.id_padre3 = id_padre3;
    }

    public String getId_jerarquia() {
        return this.id_jerarquia;
    }

    public void setId_jerarquia(String id_jerarquia) {
        this.id_jerarquia = id_jerarquia;
    }

    public String getChk_activo() {
        return this.chk_activo;
    }

    public void setChk_activo(String chk_activo) {
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

    public String getId_padre4() {
        return this.id_padre4;
    }

    public void setId_padre4(String id_padre4) {
        this.id_padre4 = id_padre4;
    }

    public String getCod_orden() {
        return this.cod_orden;
    }

    public void setCod_orden(String cod_orden) {
        this.cod_orden = cod_orden;
    }

    @Override
    public String toString() {
        return "{" + " 'id_unidad':'" + getId_unidad() + "'" + ", 'codigo_g':'" + getCodigo_g() + "'"
                + ", 'descripcion':'" + getDescripcion() + "'" + ", 'id_responsable':'" + getId_responsable() + "'"
                + ", 'cod_nivel':'" + getCod_nivel() + "'" + ", 'id_padre':'" + getId_padre() + "'" + ", 'id_padre1':'"
                + getId_padre1() + "'" + ", 'id_padre2':'" + getId_padre2() + "'" + ", 'id_padre3':'" + getId_padre3()
                + "'" + ", 'id_jerarquia':'" + getId_jerarquia() + "'" + ", 'chk_activo':'" + getChk_activo() + "'"
                + ", 'fe_crea_reg':'" + getFe_crea_reg() + "'" + ", 'fe_modi_reg':'" + getFe_modi_reg() + "'"
                + ", 'cod_mod_usu':'" + getCod_mod_usu() + "'" + ", 'id_padre4':'" + getId_padre4() + "'"
                + ", 'cod_orden':'" + getCod_orden() + "'" + "}";
    }

}
