package com.free.project1.main.model.mantenimiento;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "PERSONAL_NEW")
public class PersonalNew {

    @Id
    @Column(name = "ID_PERSONAL", length = 10)
    String id_personal;

    @Column(name = "COD_SILCON", length = 1)
    String cod_silcon;

    @Column(name = "COD_DNI", length = 9)
    String cod_ini;

    @Column(name = "DES_NOMBRE", length = 100)
    String des_nombre;

    @Column(name = "DES_APELLIDOS", length = 250)
    String des_apellidos;

    @Column(name = "FE_ALTA")
    Date fe_alta;

    @Column(name = "FE_BAJA")
    Date fe_baja;

    @Column(name = "NUM_TELEFONO", length = 9)
    String num_telefono;

    @Column(name = "NUM_MOVIL", length = 9)
    String num_movil;

    @Column(name = "ID_UBICACION", length = 9)
    String id_ubicacion;

    @Column(name = "DES_FUNCION", length = 2000)
    String des_funcion;

    @Column(name = "ID_CONTRATO", length = 10)
    String id_contrato;

    @Column(name = "ID_LOTE", length = 10)
    String id_lote;

    @Column(name = "ID_TURNO", length = 10)
    String id_turno;

    @Column(name = "ID_EMPRESA", length = 10)
    String id_empresa;

    @Column(name = "ID_EMPRESA_REAL", length = 10)
    String id_empresa_real;

    @Column(name = "ID_CATEGORIA", length = 10)
    String id_categoria;

    @Column(name = "ID_COMISION", length = 10)
    String id_comision;

    @Column(name = "ID_DESEMPENO", length = 10)
    String id_desempeno;

    @Column(name = "COD_GRUPO", length = 5)
    String cod_grupo;

    @Column(name = "ID_ESTATUS", length = 10)
    String id_estatus;

    @Column(name = "CHK_ARTEMIS", length = 1)
    String chk_artemis;

    @Column(name = "ID_UNIDAD", length = 10)
    String id_unidad;

    @Column(name = "COD_JERARQUIA")
    String cod_jerarquia;

    @Column(name = "CHK_ACTIVO", length = 1)
    String chk_activo;

    @Column(name = "ID_PERFIL", length = 10)
    String id_perfil;

    @Column(name = "FE_CREA_REG")
    Date fe_crea_reg;

    @Column(name = "FE_MODI_REG")
    Date fe_modi_reg;

    @Column(name = "COD_USU_MOD", length = 8)
    String cod_usu_mod;

    public PersonalNew() {
    }

    public PersonalNew(String id_personal, String cod_silcon, String cod_ini, String des_nombre, String des_apellidos,
            Date fe_alta, Date fe_baja, String num_telefono, String num_movil, String id_ubicacion, String des_funcion,
            String id_contrato, String id_lote, String id_turno, String id_empresa, String id_empresa_real,
            String id_categoria, String id_comision, String id_desempeno, String cod_grupo, String id_estatus,
            String chk_artemis, String id_unidad, String cod_jerarquia, String chk_activo, String id_perfil,
            Date fe_crea_reg, Date fe_modi_reg, String cod_usu_mod) {
        this.id_personal = id_personal;
        this.cod_silcon = cod_silcon;
        this.cod_ini = cod_ini;
        this.des_nombre = des_nombre;
        this.des_apellidos = des_apellidos;
        this.fe_alta = fe_alta;
        this.fe_baja = fe_baja;
        this.num_telefono = num_telefono;
        this.num_movil = num_movil;
        this.id_ubicacion = id_ubicacion;
        this.des_funcion = des_funcion;
        this.id_contrato = id_contrato;
        this.id_lote = id_lote;
        this.id_turno = id_turno;
        this.id_empresa = id_empresa;
        this.id_empresa_real = id_empresa_real;
        this.id_categoria = id_categoria;
        this.id_comision = id_comision;
        this.id_desempeno = id_desempeno;
        this.cod_grupo = cod_grupo;
        this.id_estatus = id_estatus;
        this.chk_artemis = chk_artemis;
        this.id_unidad = id_unidad;
        this.cod_jerarquia = cod_jerarquia;
        this.chk_activo = chk_activo;
        this.id_perfil = id_perfil;
        this.fe_crea_reg = fe_crea_reg;
        this.fe_modi_reg = fe_modi_reg;
        this.cod_usu_mod = cod_usu_mod;
    }

    public String getId_personal() {
        return this.id_personal;
    }

    public void setId_personal(String id_personal) {
        this.id_personal = id_personal;
    }

    public String getCod_silcon() {
        return this.cod_silcon;
    }

    public void setCod_silcon(String cod_silcon) {
        this.cod_silcon = cod_silcon;
    }

    public String getCod_ini() {
        return this.cod_ini;
    }

    public void setCod_ini(String cod_ini) {
        this.cod_ini = cod_ini;
    }

    public String getDes_nombre() {
        return this.des_nombre;
    }

    public void setDes_nombre(String des_nombre) {
        this.des_nombre = des_nombre;
    }

    public String getDes_apellidos() {
        return this.des_apellidos;
    }

    public void setDes_apellidos(String des_apellidos) {
        this.des_apellidos = des_apellidos;
    }

    public String getFullName() {
        return getDes_nombre() + " " + getDes_apellidos();
    }

    public Date getFe_alta() {
        return this.fe_alta;
    }

    public void setFe_alta(Date fe_alta) {
        this.fe_alta = fe_alta;
    }

    public Date getFe_baja() {
        return this.fe_baja;
    }

    public void setFe_baja(Date fe_baja) {
        this.fe_baja = fe_baja;
    }

    public String getNum_telefono() {
        return this.num_telefono;
    }

    public void setNum_telefono(String num_telefono) {
        this.num_telefono = num_telefono;
    }

    public String getNum_movil() {
        return this.num_movil;
    }

    public void setNum_movil(String num_movil) {
        this.num_movil = num_movil;
    }

    public String getId_ubicacion() {
        return this.id_ubicacion;
    }

    public void setId_ubicacion(String id_ubicacion) {
        this.id_ubicacion = id_ubicacion;
    }

    public String getDes_funcion() {
        return this.des_funcion;
    }

    public void setDes_funcion(String des_funcion) {
        this.des_funcion = des_funcion;
    }

    public String getId_contrato() {
        return this.id_contrato;
    }

    public void setId_contrato(String id_contrato) {
        this.id_contrato = id_contrato;
    }

    public String getId_lote() {
        return this.id_lote;
    }

    public void setId_lote(String id_lote) {
        this.id_lote = id_lote;
    }

    public String getId_turno() {
        return this.id_turno;
    }

    public void setId_turno(String id_turno) {
        this.id_turno = id_turno;
    }

    public String getId_empresa() {
        return this.id_empresa;
    }

    public void setId_empresa(String id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getId_empresa_real() {
        return this.id_empresa_real;
    }

    public void setId_empresa_real(String id_empresa_real) {
        this.id_empresa_real = id_empresa_real;
    }

    public String getId_categoria() {
        return this.id_categoria;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getId_comision() {
        return this.id_comision;
    }

    public void setId_comision(String id_comision) {
        this.id_comision = id_comision;
    }

    public String getId_desempeno() {
        return this.id_desempeno;
    }

    public void setId_desempeno(String id_desempeno) {
        this.id_desempeno = id_desempeno;
    }

    public String getCod_grupo() {
        return this.cod_grupo;
    }

    public void setCod_grupo(String cod_grupo) {
        this.cod_grupo = cod_grupo;
    }

    public String getId_estatus() {
        return this.id_estatus;
    }

    public void setId_estatus(String id_estatus) {
        this.id_estatus = id_estatus;
    }

    public String getChk_artemis() {
        return this.chk_artemis;
    }

    public void setChk_artemis(String chk_artemis) {
        this.chk_artemis = chk_artemis;
    }

    public String getId_unidad() {
        return this.id_unidad;
    }

    public void setId_unidad(String id_unidad) {
        this.id_unidad = id_unidad;
    }

    public String getCod_jerarquia() {
        return this.cod_jerarquia;
    }

    public void setCod_jerarquia(String cod_jerarquia) {
        this.cod_jerarquia = cod_jerarquia;
    }

    public String getChk_activo() {
        return this.chk_activo;
    }

    public void setChk_activo(String chk_activo) {
        this.chk_activo = chk_activo;
    }

    public String getId_perfil() {
        return this.id_perfil;
    }

    public void setId_perfil(String id_perfil) {
        this.id_perfil = id_perfil;
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

    public String getCod_usu_mod() {
        return this.cod_usu_mod;
    }

    public void setCod_usu_mod(String cod_usu_mod) {
        this.cod_usu_mod = cod_usu_mod;
    }

    @Override
    public String toString() {
        return "{" + " 'id_personal':'" + getId_personal() + "'" + ", 'cod_silcon':'" + getCod_silcon() + "'"
                + ", 'cod_ini':'" + getCod_ini() + "'" + ", 'des_nombre':'" + getDes_nombre() + "'"
                + ", 'des_apellidos':'" + getDes_apellidos() + "'" + ", 'fe_alta':'" + getFe_alta() + "'"
                + ", 'fe_baja':'" + getFe_baja() + "'" + ", 'num_telefono':'" + getNum_telefono() + "'"
                + ", 'num_movil':'" + getNum_movil() + "'" + ", 'id_ubicacion':'" + getId_ubicacion() + "'"
                + ", 'des_funcion':'" + getDes_funcion() + "'" + ", 'id_contrato':'" + getId_contrato() + "'"
                + ", 'id_lote':'" + getId_lote() + "'" + ", 'id_turno':'" + getId_turno() + "'" + ", 'id_empresa':'"
                + getId_empresa() + "'" + ", 'id_empresa_real':'" + getId_empresa_real() + "'" + ", 'id_categoria':'"
                + getId_categoria() + "'" + ", 'id_comision':'" + getId_comision() + "'" + ", 'id_desempeno':'"
                + getId_desempeno() + "'" + ", 'cod_grupo':'" + getCod_grupo() + "'" + ", 'id_estatus':'"
                + getId_estatus() + "'" + ", 'chk_artemis':'" + getChk_artemis() + "'" + ", 'id_unidad':'"
                + getId_unidad() + "'" + ", 'cod_jerarquia':'" + getCod_jerarquia() + "'" + ", 'chk_activo':'"
                + getChk_activo() + "'" + ", 'id_perfil':'" + getId_perfil() + "'" + ", 'fe_crea_reg':'"
                + getFe_crea_reg() + "'" + ", 'fe_modi_reg':'" + getFe_modi_reg() + "'" + ", 'cod_usu_mod':'"
                + getCod_usu_mod() + "'" + "}";
    }

}
