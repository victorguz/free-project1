package com.free.project1.main.model.mantenimiento.view;

import java.util.ArrayList;
import java.util.List;

import com.free.project1.main.config.Functions;
import com.free.project1.main.model.mantenimiento.Mantenimiento;

public class MantenimientoView {

    public String id;
    public String cod_expediente;
    public String cod_contrato;
    public String responsable_area;
    public String txt_descripcion;
    public String des_empresa;
    public String num_importe;
    public String fe_ini_contrato;
    public String fe_fin_contrato;
    public String chk_prorroga;
    public String fe_ini_prorroga;
    public String fe_fin_prorroga;
    public String txt_observaciones;
    public String chk_activo;
    public String fe_crea_reg;
    public String fe_modi_reg;
    public String cod_mod_usu;
    public String palabra_clave;
    public String procedencia;
    public String estado;
    public String responsable_unidad;
    public String responsable_auxiliar;
    List<DetalleMantenimientoView> detalles;
    public String tipo;
    public String departamento;
    public String unidad;
    public String empresa_adjudicada;
    public String unidad_solicitante_aux;
    public String procedimiento;
    public String aniosProrroga;

    public MantenimientoView() {
    }

    public MantenimientoView(Mantenimiento mnt) {
        if (mnt != null) {

            this.id = mnt.id + "";
            this.cod_expediente = mnt.cod_expediente;
            this.cod_contrato = mnt.cod_contrato;
            this.txt_descripcion = mnt.txt_descripcion;
            this.des_empresa = mnt.des_empresa;
            this.num_importe = mnt.num_importe;
            this.fe_ini_contrato = Functions.processDate(mnt.fe_ini_contrato);
            this.fe_fin_contrato = Functions.processDate(mnt.fe_fin_contrato);
            this.chk_prorroga = mnt.chk_prorroga + "";
            this.fe_ini_prorroga = Functions.processDate(mnt.fe_ini_prorroga);
            this.fe_fin_prorroga = Functions.processDate(mnt.fe_fin_prorroga);
            this.txt_observaciones = mnt.txt_observaciones;
            this.chk_activo = mnt.chk_activo + "";
            this.fe_crea_reg = Functions.processDate(mnt.fe_crea_reg);
            this.fe_modi_reg = Functions.processDate(mnt.fe_modi_reg);
            this.cod_mod_usu = mnt.cod_mod_usu;
            this.palabra_clave = mnt.palabra_clave;
            this.unidad_solicitante_aux = mnt.unidad_solicitante_aux;

            this.responsable_unidad = mnt.responsable_unidad == null ? "" : mnt.responsable_unidad.getFullName();
            this.responsable_auxiliar = mnt.responsable_auxiliar == null ? "" : mnt.responsable_auxiliar.getFullName();
            this.responsable_area = mnt.responsable_area == null ? "" : mnt.responsable_area.getFullName();
            this.procedencia = mnt.procedencia == null ? "" : mnt.procedencia.getDes_procedencia();
            this.tipo = mnt.tipo == null ? "" : mnt.tipo.getDes_tipo_mto();
            this.departamento = mnt.departamento == null ? "" : mnt.departamento.getDepartamento();
            this.unidad = mnt.unidad == null ? "" : mnt.unidad.getDescripcion();
            this.num_importe = Functions.processCurrency(mnt.num_importe);
            this.procedimiento = mnt.procedimiento == null ? "" : mnt.procedimiento.getDes_proc_adj();

            this.detalles = DetalleMantenimientoView.toList(mnt.detalles);
            this.estado = processEstado();
            this.empresa_adjudicada = processEmpresa();

            this.aniosProrroga = Functions.dateDifference(mnt.fe_ini_contrato, mnt.fe_fin_contrato, "years") + "";
        }
    }

    public String getAniosProrroga() {
        return this.aniosProrroga;
    }

    public void setAniosProrroga(String aniosProrroga) {
        this.aniosProrroga = aniosProrroga;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getResponsable_area() {
        return this.responsable_area;
    }

    public void setResponsable_area(String responsable_area) {
        this.responsable_area = responsable_area;
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

    public String getFe_ini_contrato() {
        return this.fe_ini_contrato;
    }

    public void setFe_ini_contrato(String fe_ini_contrato) {
        this.fe_ini_contrato = fe_ini_contrato;
    }

    public String getFe_fin_contrato() {
        return this.fe_fin_contrato;
    }

    public void setFe_fin_contrato(String fe_fin_contrato) {
        this.fe_fin_contrato = fe_fin_contrato;
    }

    public String getChk_prorroga() {
        return this.chk_prorroga;
    }

    public void setChk_prorroga(String chk_prorroga) {
        this.chk_prorroga = chk_prorroga;
    }

    public String getFe_ini_prorroga() {
        return this.fe_ini_prorroga;
    }

    public void setFe_ini_prorroga(String fe_ini_prorroga) {
        this.fe_ini_prorroga = fe_ini_prorroga;
    }

    public String getFe_fin_prorroga() {
        return this.fe_fin_prorroga;
    }

    public void setFe_fin_prorroga(String fe_fin_prorroga) {
        this.fe_fin_prorroga = fe_fin_prorroga;
    }

    public String getTxt_observaciones() {
        return this.txt_observaciones;
    }

    public void setTxt_observaciones(String txt_observaciones) {
        this.txt_observaciones = txt_observaciones;
    }

    public String getChk_activo() {
        return this.chk_activo;
    }

    public void setChk_activo(String chk_activo) {
        this.chk_activo = chk_activo;
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

    public String getPalabra_clave() {
        return this.palabra_clave;
    }

    public void setPalabra_clave(String palabra_clave) {
        this.palabra_clave = palabra_clave;
    }

    public String getProcedencia() {
        return this.procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getResponsable_unidad() {
        return this.responsable_unidad;
    }

    public void setResponsable_unidad(String responsable_unidad) {
        this.responsable_unidad = responsable_unidad;
    }

    public String getResponsable_auxiliar() {
        return this.responsable_auxiliar;
    }

    public void setResponsable_auxiliar(String responsable_auxiliar) {
        this.responsable_auxiliar = responsable_auxiliar;
    }

    public List<DetalleMantenimientoView> getDetalles() {
        return this.detalles;
    }

    public void setDetalles(List<DetalleMantenimientoView> detalles) {
        this.detalles = detalles;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getUnidad() {
        return this.unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getEmpresa_adjudicada() {
        return this.empresa_adjudicada;
    }

    public void setEmpresa_adjudicada(String empresa_adjudicada) {
        this.empresa_adjudicada = empresa_adjudicada;
    }

    public String getUnidad_solicitante_aux() {
        return this.unidad_solicitante_aux;
    }

    public void setUnidad_solicitante_aux(String unidad_solicitante_aux) {
        this.unidad_solicitante_aux = unidad_solicitante_aux;
    }

    public String getProcedimiento() {
        return this.procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    @Override
    public String toString() {
        return "{" + " 'id':'" + getId() + "'" + ", 'cod_expediente':'" + getCod_expediente() + "'"
                + ", 'cod_contrato':'" + getCod_contrato() + "'" + ", 'responsable_area':'" + getResponsable_area()
                + "'" + ", 'txt_descripcion':'" + getTxt_descripcion() + "'" + ", 'des_empresa':'" + getDes_empresa()
                + "'" + ", 'num_importe':'" + getNum_importe() + "'" + ", 'fe_ini_contrato':'" + getFe_ini_contrato()
                + "'" + ", 'fe_fin_contrato':'" + getFe_fin_contrato() + "'" + ", 'chk_prorroga':'" + getChk_prorroga()
                + "'" + ", 'fe_ini_prorroga':'" + getFe_ini_prorroga() + "'" + ", 'fe_fin_prorroga':'"
                + getFe_fin_prorroga() + "'" + ", 'txt_observaciones':'" + getTxt_observaciones() + "'"
                + ", 'chk_activo':'" + getChk_activo() + "'" + ", 'fe_crea_reg':'" + getFe_crea_reg() + "'"
                + ", 'fe_modi_reg':'" + getFe_modi_reg() + "'" + ", 'cod_mod_usu':'" + getCod_mod_usu() + "'"
                + ", 'palabra_clave':'" + getPalabra_clave() + "'" + ", 'procedencia':'" + getProcedencia() + "'"
                + ", 'estado':'" + getEstado() + "'" + ", 'responsable_unidad':'" + getResponsable_unidad() + "'"
                + ", 'responsable_auxiliar':'" + getResponsable_auxiliar() + "'" + ", 'detalles':'" + getDetalles()
                + "'" + ", 'tipo':'" + getTipo() + "'" + ", 'departamento':'" + getDepartamento() + "'" + ", 'unidad':'"
                + getUnidad() + "'" + ", 'empresa_adjudicada':'" + getEmpresa_adjudicada() + "'"
                + ", 'unidad_solicitante_aux':'" + getUnidad_solicitante_aux() + "'" + ", 'procedimiento':'"
                + getProcedimiento() + "'" + "}";
    }

    private String processEstado() {
        int lastId = 0;
        String est = "";
        for (DetalleMantenimientoView dtl : detalles) {
            if (dtl.getId_detalle_mto() >= lastId) {
                lastId = dtl.getId_detalle_mto();
                est = dtl.getEstado();
            }
        }
        return est;
    }

    private String processEmpresa() {
        int lastId = 0;
        String emp = "";
        for (DetalleMantenimientoView dtl : detalles) {
            if (dtl.getId_detalle_mto() >= lastId) {
                lastId = dtl.getId_detalle_mto();
                emp = dtl.getDes_empresa();
            }
        }
        return emp;
    }

    public static List<MantenimientoView> toList(List<Mantenimiento> mnt) {
        List<MantenimientoView> list = new ArrayList<>();
        for (Mantenimiento mantenimiento : mnt) {
            MantenimientoView neew = new MantenimientoView(mantenimiento);
            list.add(neew);
        }
        return list;
    }

}
