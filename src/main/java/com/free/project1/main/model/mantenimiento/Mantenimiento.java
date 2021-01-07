package com.free.project1.main.model.mantenimiento;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "MANTENIMIENTO")
public class Mantenimiento {
    @Id
    @Column(name = "ID_MANTENIMIENTO")
    int id_mantenimiento;// NUMBER NOT NULL,

    @Column(nullable = false)
    String cod_tipo_mto;// NUMBER NOT NULL,

    @Column(name = "COD_EXPEDIENTE", length = 25)
    String cod_expediente;// VARCHAR(25),

    @Column(name = "COD_CONTRATO", length = 25)
    String cod_contrato;// VARCHAR(25),

    @Column(name = "TIPO_PROCEDIMIENTO_ADJUDICADO")
    String tipo_procedimiento_adjudicado;// NUMBER,

    @Column(name = "COD_DEPARTAMENTO")
    String cod_departamento;// NUMBER,

    @Column(name = "COD_UNIDAD")
    String cod_unidad;// NUMBER,

    @Column(name = "COD_RESPONSABLE")
    String cod_responsable;// NUMBER,

    @Column(name = "TXT_DESCRIPCION", length = 2000)
    String txt_descripcion;// VARCHAR(2000),

    @Column(name = "DES_EMPRESA", length = 255)
    String des_empresa;// VARCHAR(255),

    @Column(name = "NUM_IMPORTE", nullable = true)
    String num_importe;// NUMBER(12,2),

    @Column(name = "FE_INI_CONTRATO")
    Date fe_ini_contrato;// DATE,

    @Column(name = "FE_FIN_CONTRATO")
    Date fe_fin_contrato;// DATE,

    @Column(name = "CHK_PRORROGA")
    Character chk_prorroga;// CHAR(1),

    @Column(name = "FE_INI_PRORROGA")
    Date fe_ini_prorroga;// DATE,

    @Column(name = "FE_FIN_PRORROGA")
    Date fe_fin_prorroga;// DATE,

    @Column(name = "TXT_OBSERVACIONES", length = 2000)
    String txt_observaciones;// VARCHAR(2000),

    @Column(name = "CHK_ACTIVO")
    Character chk_activo;// CHAR(1),

    @Column(name = "FE_CREA_REG")
    Date fe_crea_reg;// DATE,

    @Column(name = "FE_MODI_REG")
    Date fe_modi_reg;// DATE,

    @Column(name = "COD_MOD_USU", length = 8)
    String cod_mod_usu;// VARCHAR(8),

    @Column(name = "PALABRA_CLAVE", length = 2000)
    String palabra_clave;// VARCHAR(2000)

    @OneToMany(mappedBy = "mantenimiento", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<DetalleMantenimiento> detalles;

    public Mantenimiento() {
    }

    public int getId_mantenimiento() {
        return this.id_mantenimiento;
    }

    public void setId_mantenimiento(int id_mantenimiento) {
        this.id_mantenimiento = id_mantenimiento;
    }

    public String getCod_tipo_mto() {
        return this.cod_tipo_mto;
    }

    public void setCod_tipo_mto(String cod_tipo_mto) {
        this.cod_tipo_mto = cod_tipo_mto;
    }

    public String getCod_expediente() {
        return this.cod_expediente;
    }

    public void setCod_expediente(String cod_expediente) {
        this.cod_expediente = cod_expediente;
    }

    public String getCod_contrato() {
        return this.cod_contrato;
    }

    public void setCod_contrato(String cod_contrato) {
        this.cod_contrato = cod_contrato;
    }

    public String getTipo_procedimiento_adjudicado() {
        return this.tipo_procedimiento_adjudicado;
    }

    public void setTipo_procedimiento_adjudicado(String tipo_procedimiento_adjudicado) {
        this.tipo_procedimiento_adjudicado = tipo_procedimiento_adjudicado;
    }

    public String getCod_departamento() {
        return this.cod_departamento;
    }

    public void setCod_departamento(String cod_departamento) {
        this.cod_departamento = cod_departamento;
    }

    public String getCod_unidad() {
        return this.cod_unidad;
    }

    public void setCod_unidad(String cod_unidad) {
        this.cod_unidad = cod_unidad;
    }

    public String getCod_responsable() {
        return this.cod_responsable;
    }

    public void setCod_responsable(String cod_responsable) {
        this.cod_responsable = cod_responsable;
    }

    public String getTxt_descripcion() {
        return this.txt_descripcion;
    }

    public void setTxt_descripcion(String txt_descripcion) {
        this.txt_descripcion = txt_descripcion;
    }

    public String getDes_empresa() {
        return this.des_empresa;
    }

    public void setDes_empresa(String des_empresa) {
        this.des_empresa = des_empresa;
    }

    public String getNum_importe() {
        return this.num_importe;
    }

    public void setNum_importe(String num_importe) {
        this.num_importe = num_importe;
    }

    public Date getFe_ini_contrato() {
        return this.fe_ini_contrato;
    }

    public void setFe_ini_contrato(Date fe_ini_contrato) {
        this.fe_ini_contrato = fe_ini_contrato;
    }

    public Date getFe_fin_contrato() {
        return this.fe_fin_contrato;
    }

    public void setFe_fin_contrato(Date fe_fin_contrato) {
        this.fe_fin_contrato = fe_fin_contrato;
    }

    public Character getChk_prorroga() {
        return this.chk_prorroga;
    }

    public void setChk_prorroga(Character chk_prorroga) {
        this.chk_prorroga = chk_prorroga;
    }

    public Date getFe_ini_prorroga() {
        return this.fe_ini_prorroga;
    }

    public void setFe_ini_prorroga(Date fe_ini_prorroga) {
        this.fe_ini_prorroga = fe_ini_prorroga;
    }

    public Date getFe_fin_prorroga() {
        return this.fe_fin_prorroga;
    }

    public void setFe_fin_prorroga(Date fe_fin_prorroga) {
        this.fe_fin_prorroga = fe_fin_prorroga;
    }

    public String getTxt_observaciones() {
        return this.txt_observaciones;
    }

    public void setTxt_observaciones(String txt_observaciones) {
        this.txt_observaciones = txt_observaciones;
    }

    public Character getChk_activo() {
        return this.chk_activo;
    }

    public void setChk_activo(Character chk_activo) {
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

    public String getPalabra_clave() {
        return this.palabra_clave;
    }

    public void setPalabra_clave(String palabra_clave) {
        this.palabra_clave = palabra_clave;
    }

    public List<DetalleMantenimiento> getDetalles() {
        return this.detalles;
    }

    public void setDetalles(List<DetalleMantenimiento> detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return "{" + " id_mantenimiento:'" + getId_mantenimiento() + "'" + ", cod_tipo_mto:'" + getCod_tipo_mto() + "'"
                + ", cod_expediente:'" + getCod_expediente() + "'" + ", cod_contrato:'" + getCod_contrato() + "'"
                + ", tipo_procedimiento_adjudicado:'" + getTipo_procedimiento_adjudicado() + "'"
                + ", cod_departamento:'" + getCod_departamento() + "'" + ", cod_unidad:'" + getCod_unidad() + "'"
                + ", cod_responsable:'" + getCod_responsable() + "'" + ", txt_descripcion:'" + getTxt_descripcion()
                + "'" + ", des_empresa:'" + getDes_empresa() + "'" + ", num_importe:'" + getNum_importe() + "'"
                + ", fe_ini_contrato:'" + getFe_ini_contrato() + "'" + ", fe_fin_contrato:'" + getFe_fin_contrato()
                + "'" + ", chk_prorroga:'" + getChk_prorroga() + "'" + ", fe_ini_prorroga:'" + getFe_ini_prorroga()
                + "'" + ", fe_fin_prorroga:'" + getFe_fin_prorroga() + "'" + ", txt_observaciones:'"
                + getTxt_observaciones() + "'" + ", chk_activo:'" + getChk_activo() + "'" + ", fe_crea_reg:'"
                + getFe_crea_reg() + "'" + ", fe_modi_reg:'" + getFe_modi_reg() + "'" + ", cod_mod_usu:'"
                + getCod_mod_usu() + "'" + ", palabra_clave:'" + getPalabra_clave() + "'" + ", detalles:'"
                + getDetalles() + "'" + "}";
    }

}
