package com.free.project1.main.model.mantenimiento;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "MANTENIMIENTO")
public class Mantenimiento {

    @Id
    @Column(name = "ID_MANTENIMIENTO")
    public int id;

    @OneToOne
    @JoinColumn(name = "COD_TIPO_MTO", nullable = false)
    public TipoMantenimiento tipo;

    @Column(name = "COD_EXPEDIENTE", length = 25)
    public String cod_expediente;

    @Column(name = "COD_CONTRATO", length = 25)
    public String cod_contrato;

    @OneToOne
    @JoinColumn(name = "TIPO_PROCEDIMIENTO_ADJUDICADO", nullable = true)
    public TipoProcedimientoAdjudicado procedimiento;

    @OneToOne
    @JoinColumn(name = "COD_DEPARTAMENTO", nullable = true)
    public Departamento departamento;

    @OneToOne
    @JoinColumn(name = "COD_UNIDAD", nullable = true)
    public Unidad unidad;

    @Column(name = "COD_RESPONSABLE")
    public String cod_responsable;

    @Column(name = "TXT_DESCRIPCION", length = 2000)
    public String txt_descripcion;

    @Column(name = "DES_EMPRESA", length = 255)
    public String des_empresa;

    @Column(name = "NUM_IMPORTE", nullable = true)
    public String num_importe;

    @Column(name = "FE_INI_CONTRATO")
    public Date fe_ini_contrato;

    @Column(name = "FE_FIN_CONTRATO")
    public Date fe_fin_contrato;

    @Column(name = "CHK_PRORROGA")
    public Character chk_prorroga;

    @Column(name = "FE_INI_PRORROGA")
    public Date fe_ini_prorroga;

    @Column(name = "FE_FIN_PRORROGA")
    public Date fe_fin_prorroga;

    @Column(name = "TXT_OBSERVACIONES", length = 2000)
    public String txt_observaciones;

    @Column(name = "CHK_ACTIVO")
    public Character chk_activo;

    @Column(name = "FE_CREA_REG")
    public Date fe_crea_reg;

    @Column(name = "FE_MODI_REG")
    public Date fe_modi_reg;

    @Column(name = "COD_MOD_USU", length = 8)
    public String cod_mod_usu;

    @Column(name = "PALABRA_CLAVE", length = 2000)
    public String palabra_clave;

    @Column(name = "UNIDAD_SOLICITANTE_AUX", length = 2000)
    public String unidad_solicitante_aux;

    @Column(name = "COD_SILCON_SOLICITANTE_AUX", length = 8)
    public String cod_silcon_solicitante_aux;

    @Column(name = "COD_SILCON_SOLICITANTE_AUX2", length = 8)
    public String cod_silcon_solicitante_aux2;

    @OneToOne
    @JoinColumn(name = "COD_PROCEDENCIA", nullable = true)
    public ProcedenciaInversion procedencia;

    @OneToMany(mappedBy = "mantenimiento", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<DetalleMantenimiento> detalles;

    public Mantenimiento() {
    }

    public Mantenimiento(int id, TipoMantenimiento tipo, String cod_expediente, String cod_contrato,
            TipoProcedimientoAdjudicado procedimiento, Departamento departamento, Unidad unidad, String cod_responsable,
            String txt_descripcion, String des_empresa, String num_importe, Date fe_ini_contrato, Date fe_fin_contrato,
            Character chk_prorroga, Date fe_ini_prorroga, Date fe_fin_prorroga, String txt_observaciones,
            Character chk_activo, Date fe_crea_reg, Date fe_modi_reg, String cod_mod_usu, String palabra_clave,
            String unidad_solicitante_aux, String cod_silcon_solicitante_aux, String cod_silcon_solicitante_aux2,
            ProcedenciaInversion procedencia, List<DetalleMantenimiento> detalles) {
        this.id = id;
        this.tipo = tipo;
        this.cod_expediente = cod_expediente;
        this.cod_contrato = cod_contrato;
        this.procedimiento = procedimiento;
        this.departamento = departamento;
        this.unidad = unidad;
        this.cod_responsable = cod_responsable;
        this.txt_descripcion = txt_descripcion;
        this.des_empresa = des_empresa;
        this.num_importe = num_importe;
        this.fe_ini_contrato = fe_ini_contrato;
        this.fe_fin_contrato = fe_fin_contrato;
        this.chk_prorroga = chk_prorroga;
        this.fe_ini_prorroga = fe_ini_prorroga;
        this.fe_fin_prorroga = fe_fin_prorroga;
        this.txt_observaciones = txt_observaciones;
        this.chk_activo = chk_activo;
        this.fe_crea_reg = fe_crea_reg;
        this.fe_modi_reg = fe_modi_reg;
        this.cod_mod_usu = cod_mod_usu;
        this.palabra_clave = palabra_clave;
        this.unidad_solicitante_aux = unidad_solicitante_aux;
        this.cod_silcon_solicitante_aux = cod_silcon_solicitante_aux;
        this.cod_silcon_solicitante_aux2 = cod_silcon_solicitante_aux2;
        this.procedencia = procedencia;
        this.detalles = detalles;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoMantenimiento getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoMantenimiento tipo) {
        this.tipo = tipo;
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

    public TipoProcedimientoAdjudicado getProcedimiento() {
        return this.procedimiento;
    }

    public void setProcedimiento(TipoProcedimientoAdjudicado procedimiento) {
        this.procedimiento = procedimiento;
    }

    public Departamento getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Unidad getUnidad() {
        return this.unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
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

    public String getUnidad_solicitante_aux() {
        return this.unidad_solicitante_aux;
    }

    public void setUnidad_solicitante_aux(String unidad_solicitante_aux) {
        this.unidad_solicitante_aux = unidad_solicitante_aux;
    }

    public String getCod_silcon_solicitante_aux() {
        return this.cod_silcon_solicitante_aux;
    }

    public void setCod_silcon_solicitante_aux(String cod_silcon_solicitante_aux) {
        this.cod_silcon_solicitante_aux = cod_silcon_solicitante_aux;
    }

    public String getCod_silcon_solicitante_aux2() {
        return this.cod_silcon_solicitante_aux2;
    }

    public void setCod_silcon_solicitante_aux2(String cod_silcon_solicitante_aux2) {
        this.cod_silcon_solicitante_aux2 = cod_silcon_solicitante_aux2;
    }

    public ProcedenciaInversion getProcedencia() {
        return this.procedencia;
    }

    public void setProcedencia(ProcedenciaInversion procedencia) {
        this.procedencia = procedencia;
    }

    public List<DetalleMantenimiento> getDetalles() {
        return this.detalles;
    }

    public void setDetalles(List<DetalleMantenimiento> detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return "{" + " 'id':'" + getId() + "'" + ", 'tipo':'" + getTipo() + "'" + ", 'cod_expediente':'"
                + getCod_expediente() + "'" + ", 'cod_contrato':'" + getCod_contrato() + "'" + ", 'procedimiento':'"
                + getProcedimiento() + "'" + ", 'departamento':'" + getDepartamento() + "'" + ", 'unidad':'"
                + getUnidad() + "'" + ", 'cod_responsable':'" + getCod_responsable() + "'" + ", 'txt_descripcion':'"
                + getTxt_descripcion() + "'" + ", 'des_empresa':'" + getDes_empresa() + "'" + ", 'num_importe':'"
                + getNum_importe() + "'" + ", 'fe_ini_contrato':'" + getFe_ini_contrato() + "'"
                + ", 'fe_fin_contrato':'" + getFe_fin_contrato() + "'" + ", 'chk_prorroga':'" + getChk_prorroga() + "'"
                + ", 'fe_ini_prorroga':'" + getFe_ini_prorroga() + "'" + ", 'fe_fin_prorroga':'" + getFe_fin_prorroga()
                + "'" + ", 'txt_observaciones':'" + getTxt_observaciones() + "'" + ", 'chk_activo':'" + getChk_activo()
                + "'" + ", 'fe_crea_reg':'" + getFe_crea_reg() + "'" + ", 'fe_modi_reg':'" + getFe_modi_reg() + "'"
                + ", 'cod_mod_usu':'" + getCod_mod_usu() + "'" + ", 'palabra_clave':'" + getPalabra_clave() + "'"
                + ", 'unidad_solicitante_aux':'" + getUnidad_solicitante_aux() + "'"
                + ", 'cod_silcon_solicitante_aux':'" + getCod_silcon_solicitante_aux() + "'"
                + ", 'cod_silcon_solicitante_aux2':'" + getCod_silcon_solicitante_aux2() + "'" + ", 'procedencia':'"
                + getProcedencia() + "'" + ", 'detalles':'" + getDetalles() + "'" + "}";
    }

}
