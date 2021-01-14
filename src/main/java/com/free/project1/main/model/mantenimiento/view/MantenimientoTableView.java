package com.free.project1.main.model.mantenimiento.view;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.free.project1.main.model.mantenimiento.DetalleMantenimiento;
import com.free.project1.main.model.mantenimiento.Mantenimiento;

public class MantenimientoTableView {

    public String id;
    public String cod_expediente;
    public String cod_contrato;
    public String cod_responsable;
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
    public String unidad_cod_silcon_solicitante_aux_aux;
    public String procedencia;
    public String estado;
    public String cod_silcon_solicitante_aux;
    public String cod_silcon_solicitante_aux2;
    List<DetalleMantenimiento> detalles;
    public String tipo;
    public String departamento;
    public String unidad;

    public MantenimientoTableView() {
    }

    public MantenimientoTableView(Mantenimiento mnt) {
        this.id = mnt.id + "";
        this.cod_expediente = mnt.cod_expediente;
        this.cod_contrato = mnt.cod_contrato;
        this.cod_responsable = mnt.cod_responsable;
        this.txt_descripcion = mnt.txt_descripcion;
        this.des_empresa = mnt.des_empresa;
        this.num_importe = mnt.num_importe;
        this.fe_ini_contrato = processDate(mnt.fe_ini_contrato);
        this.fe_fin_contrato = processDate(mnt.fe_fin_contrato);
        this.chk_prorroga = mnt.chk_prorroga + "";
        this.fe_ini_prorroga = processDate(mnt.fe_ini_prorroga);
        this.fe_fin_prorroga = processDate(mnt.fe_fin_prorroga);
        this.txt_observaciones = mnt.txt_observaciones;
        this.chk_activo = mnt.chk_activo + "";
        this.fe_crea_reg = processDate(mnt.fe_crea_reg);
        this.fe_modi_reg = processDate(mnt.fe_modi_reg);
        this.cod_mod_usu = mnt.cod_mod_usu;
        this.palabra_clave = mnt.palabra_clave;
        this.cod_silcon_solicitante_aux = mnt.cod_silcon_solicitante_aux;
        this.procedencia = mnt.procedencia == null ? "" : mnt.procedencia.getDes_procedencia();

        this.cod_silcon_solicitante_aux = mnt.cod_silcon_solicitante_aux;

        this.cod_silcon_solicitante_aux2 = mnt.cod_silcon_solicitante_aux2;

        this.detalles = mnt.detalles;
        this.tipo = mnt.tipo == null ? "" : mnt.tipo.getDes_tipo_mto();
        this.departamento = mnt.departamento == null ? "" : mnt.departamento.getDepartamento();
        this.unidad = mnt.unidad == null ? "" : mnt.unidad.getUnidad();
        this.estado = processEstado();
        this.num_importe = processCurrency();
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

    public String getUnidad_cod_silcon_solicitante_aux_aux() {
        return this.unidad_cod_silcon_solicitante_aux_aux;
    }

    public void setUnidad_cod_silcon_solicitante_aux_aux(String unidad_cod_silcon_solicitante_aux_aux) {
        this.unidad_cod_silcon_solicitante_aux_aux = unidad_cod_silcon_solicitante_aux_aux;
    }

    public String getCod_procedencia() {
        return this.procedencia;
    }

    public void setCod_procedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public List<DetalleMantenimiento> getDetalles() {
        return this.detalles;
    }

    public void setDetalles(List<DetalleMantenimiento> detalles) {
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

    private String processEstado() {
        int lastId = 0;
        String est = "";
        for (DetalleMantenimiento dtl : detalles) {
            if (dtl.getId_detalle_mto() >= lastId) {
                lastId = dtl.getId_detalle_mto();
                est = dtl.getEstado().getDes_estado();
            }
        }
        return est;
    }

    private String processCurrency() {
        if (this.num_importe != null) {
            NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
            return formatter.format(Double.parseDouble(this.num_importe));
        }
        return "";
    }

    private String processDate(Date date) {
        if (date != null) {
            String pattern = "yyyy/MM/dd";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String format = simpleDateFormat.format(date);
            return format;
        }
        return "";
    }

    public static List<MantenimientoTableView> toView(List<Mantenimiento> mnt) {
        List<MantenimientoTableView> list = new ArrayList<>();
        for (Mantenimiento mantenimiento : mnt) {
            MantenimientoTableView neew = new MantenimientoTableView(mantenimiento);
            list.add(neew);
        }
        return list;
    }

    @Override
    public String toString() {
        return "{" + " 'id':'" + getId() + "'" + ", 'cod_expediente':'" + getCod_expediente() + "'"
                + ", 'cod_contrato':'" + getCod_contrato() + "'" + ", 'cod_responsable':'" + getCod_responsable() + "'"
                + ", 'txt_descripcion':'" + getTxt_descripcion() + "'" + ", 'des_empresa':'" + getDes_empresa() + "'"
                + ", 'num_importe':'" + getNum_importe() + "'" + ", 'fe_ini_contrato':'" + getFe_ini_contrato() + "'"
                + ", 'fe_fin_contrato':'" + getFe_fin_contrato() + "'" + ", 'chk_prorroga':'" + getChk_prorroga() + "'"
                + ", 'fe_ini_prorroga':'" + getFe_ini_prorroga() + "'" + ", 'fe_fin_prorroga':'" + getFe_fin_prorroga()
                + "'" + ", 'txt_observaciones':'" + getTxt_observaciones() + "'" + ", 'chk_activo':'" + getChk_activo()
                + "'" + ", 'fe_crea_reg':'" + getFe_crea_reg() + "'" + ", 'fe_modi_reg':'" + getFe_modi_reg() + "'"
                + ", 'cod_mod_usu':'" + getCod_mod_usu() + "'" + ", 'palabra_clave':'" + getPalabra_clave() + "'"
                + ", 'unidad_cod_silcon_solicitante_aux_aux':'" + getUnidad_cod_silcon_solicitante_aux_aux() + "'"
                + ", 'procedencia':'" + getCod_procedencia() + "'" + ", 'detalles':'" + getDetalles() + "'"
                + ", 'tipo':'" + getTipo() + "'" + ", 'departamento':'" + getDepartamento() + "'" + ", 'unidad':'"
                + getUnidad() + "'" + "}";
    }

}
