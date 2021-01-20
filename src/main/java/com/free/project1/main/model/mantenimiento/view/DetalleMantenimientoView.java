package com.free.project1.main.model.mantenimiento.view;

import java.util.ArrayList;
import java.util.List;

import com.free.project1.main.config.Functions;
import com.free.project1.main.model.mantenimiento.DetalleMantenimiento;

public class DetalleMantenimientoView {

    int id_detalle_mto;

    String estado;

    String des_empresa;

    String num_importe;

    String fe_ini_contrato;

    String fe_fin_contrato;

    String chk_prorroga;

    String fe_ini_prorroga;

    String fe_fin_prorroga;

    String cod_expediente;

    String cod_contrato;

    String chk_activo;

    String fe_crea_reg;

    String fe_modi_reg;

    String cod_mod_usu;

    String estadonuevoexp;

    String añosprorroga;

    String fe_sol_adq;

    String fe_env_org_col;

    String fe_recp_mem;

    String fe_env_val;

    String fe_recp_val;

    String fe_ultdia_valmem;

    String fe_mem_val;

    String fe_tram_cotec;

    String fe_ultdia_ofertas;

    String fe_recp_ofertas;

    String fe_aviso_jefes;

    String fe_aviso_ofertasvalidadas;

    String fe_respuesta_ofertas;

    String fe_ult_diaexpdate;

    String fe_inimto_garantia_prevista;

    String fe_finmto_garantia_prevista;

    String fe_informevalidacion;

    String fe_adjudicacionformalizacion;

    String num_importe_contratacion;

    String estado_rrhh;

    String fe_formalizacion;

    List<CicloMantenimientoView> ciclos;

    public DetalleMantenimientoView() {
    }

    public DetalleMantenimientoView(DetalleMantenimiento mnt) {
        if (mnt != null) {
            this.id_detalle_mto = mnt.id_detalle_mto;
            this.estado = mnt.estado == null ? "" : mnt.estado.getDes_estado();
            this.des_empresa = mnt.des_empresa;
            this.num_importe = Functions.processCurrency(mnt.num_importe);
            this.fe_ini_contrato = Functions.processDate(mnt.fe_ini_contrato);
            this.fe_fin_contrato = Functions.processDate(mnt.fe_fin_contrato);
            this.chk_prorroga = mnt.chk_prorroga + "";
            this.fe_ini_prorroga = Functions.processDate(mnt.fe_ini_prorroga);
            this.fe_fin_prorroga = Functions.processDate(mnt.fe_fin_prorroga);
            this.cod_expediente = mnt.cod_expediente;
            this.cod_contrato = mnt.cod_contrato;
            this.chk_activo = mnt.chk_activo + "";
            this.fe_crea_reg = Functions.processDate(mnt.fe_crea_reg);
            this.fe_modi_reg = Functions.processDate(mnt.fe_modi_reg);
            this.cod_mod_usu = mnt.cod_mod_usu;
            this.estadonuevoexp = mnt.estadonuevoexp == null ? "" : mnt.estadonuevoexp.getDescripcion();
            this.añosprorroga = mnt.añosprorroga;
            this.fe_sol_adq = Functions.processDate(mnt.fe_sol_adq);
            this.fe_env_org_col = Functions.processDate(mnt.fe_env_org_col);
            this.fe_recp_mem = Functions.processDate(mnt.fe_recp_mem);
            this.fe_env_val = Functions.processDate(mnt.fe_env_val);
            this.fe_recp_val = Functions.processDate(mnt.fe_recp_val);
            this.fe_ultdia_valmem = Functions.processDate(mnt.fe_ultdia_valmem);
            this.fe_mem_val = Functions.processDate(mnt.fe_mem_val);
            this.fe_tram_cotec = Functions.processDate(mnt.fe_tram_cotec);
            this.fe_ultdia_ofertas = Functions.processDate(mnt.fe_ultdia_ofertas);
            this.fe_recp_ofertas = Functions.processDate(mnt.fe_recp_ofertas);
            this.fe_aviso_jefes = Functions.processDate(mnt.fe_aviso_jefes);
            this.fe_aviso_ofertasvalidadas = Functions.processDate(mnt.fe_aviso_ofertasvalidadas);
            this.fe_respuesta_ofertas = Functions.processDate(mnt.fe_respuesta_ofertas);
            this.fe_ult_diaexpdate = Functions.processDate(mnt.fe_ult_diaexpdate);
            this.fe_inimto_garantia_prevista = Functions.processDate(mnt.fe_inimto_garantia_prevista);
            this.fe_finmto_garantia_prevista = Functions.processDate(mnt.fe_finmto_garantia_prevista);
            this.fe_informevalidacion = Functions.processDate(mnt.fe_informevalidacion);
            this.fe_adjudicacionformalizacion = Functions.processDate(mnt.fe_adjudicacionformalizacion);
            this.num_importe_contratacion = Functions.processCurrency(mnt.num_importe_contratacion);
            this.estado_rrhh = mnt.estado_rrhh == null ? "" : mnt.estado_rrhh.getDescripcion();
            this.fe_formalizacion = Functions.processDate(mnt.fe_formalizacion);
            this.ciclos = CicloMantenimientoView.toList(mnt.ciclos);
        }
    }

    public int getId_detalle_mto() {
        return this.id_detalle_mto;
    }

    public void setId_detalle_mto(int id_detalle_mto) {
        this.id_detalle_mto = id_detalle_mto;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public String getEstadonuevoexp() {
        return this.estadonuevoexp;
    }

    public void setEstadonuevoexp(String estadonuevoexp) {
        this.estadonuevoexp = estadonuevoexp;
    }

    public String getAñosprorroga() {
        return this.añosprorroga;
    }

    public void setAñosprorroga(String añosprorroga) {
        this.añosprorroga = añosprorroga;
    }

    public String getFe_sol_adq() {
        return this.fe_sol_adq;
    }

    public void setFe_sol_adq(String fe_sol_adq) {
        this.fe_sol_adq = fe_sol_adq;
    }

    public String getFe_env_org_col() {
        return this.fe_env_org_col;
    }

    public void setFe_env_org_col(String fe_env_org_col) {
        this.fe_env_org_col = fe_env_org_col;
    }

    public String getFe_recp_mem() {
        return this.fe_recp_mem;
    }

    public void setFe_recp_mem(String fe_recp_mem) {
        this.fe_recp_mem = fe_recp_mem;
    }

    public String getFe_env_val() {
        return this.fe_env_val;
    }

    public void setFe_env_val(String fe_env_val) {
        this.fe_env_val = fe_env_val;
    }

    public String getFe_recp_val() {
        return this.fe_recp_val;
    }

    public void setFe_recp_val(String fe_recp_val) {
        this.fe_recp_val = fe_recp_val;
    }

    public String getFe_ultdia_valmem() {
        return this.fe_ultdia_valmem;
    }

    public void setFe_ultdia_valmem(String fe_ultdia_valmem) {
        this.fe_ultdia_valmem = fe_ultdia_valmem;
    }

    public String getFe_mem_val() {
        return this.fe_mem_val;
    }

    public void setFe_mem_val(String fe_mem_val) {
        this.fe_mem_val = fe_mem_val;
    }

    public String getFe_tram_cotec() {
        return this.fe_tram_cotec;
    }

    public void setFe_tram_cotec(String fe_tram_cotec) {
        this.fe_tram_cotec = fe_tram_cotec;
    }

    public String getFe_ultdia_ofertas() {
        return this.fe_ultdia_ofertas;
    }

    public void setFe_ultdia_ofertas(String fe_ultdia_ofertas) {
        this.fe_ultdia_ofertas = fe_ultdia_ofertas;
    }

    public String getFe_recp_ofertas() {
        return this.fe_recp_ofertas;
    }

    public void setFe_recp_ofertas(String fe_recp_ofertas) {
        this.fe_recp_ofertas = fe_recp_ofertas;
    }

    public String getFe_aviso_jefes() {
        return this.fe_aviso_jefes;
    }

    public void setFe_aviso_jefes(String fe_aviso_jefes) {
        this.fe_aviso_jefes = fe_aviso_jefes;
    }

    public String getFe_aviso_ofertasvalidadas() {
        return this.fe_aviso_ofertasvalidadas;
    }

    public void setFe_aviso_ofertasvalidadas(String fe_aviso_ofertasvalidadas) {
        this.fe_aviso_ofertasvalidadas = fe_aviso_ofertasvalidadas;
    }

    public String getFe_respuesta_ofertas() {
        return this.fe_respuesta_ofertas;
    }

    public void setFe_respuesta_ofertas(String fe_respuesta_ofertas) {
        this.fe_respuesta_ofertas = fe_respuesta_ofertas;
    }

    public String getFe_ult_diaexpdate() {
        return this.fe_ult_diaexpdate;
    }

    public void setFe_ult_diaexpdate(String fe_ult_diaexpdate) {
        this.fe_ult_diaexpdate = fe_ult_diaexpdate;
    }

    public String getFe_inimto_garantia_prevista() {
        return this.fe_inimto_garantia_prevista;
    }

    public void setFe_inimto_garantia_prevista(String fe_inimto_garantia_prevista) {
        this.fe_inimto_garantia_prevista = fe_inimto_garantia_prevista;
    }

    public String getFe_finmto_garantia_prevista() {
        return this.fe_finmto_garantia_prevista;
    }

    public void setFe_finmto_garantia_prevista(String fe_finmto_garantia_prevista) {
        this.fe_finmto_garantia_prevista = fe_finmto_garantia_prevista;
    }

    public String getFe_informevalidacion() {
        return this.fe_informevalidacion;
    }

    public void setFe_informevalidacion(String fe_informevalidacion) {
        this.fe_informevalidacion = fe_informevalidacion;
    }

    public String getFe_adjudicacionformalizacion() {
        return this.fe_adjudicacionformalizacion;
    }

    public void setFe_adjudicacionformalizacion(String fe_adjudicacionformalizacion) {
        this.fe_adjudicacionformalizacion = fe_adjudicacionformalizacion;
    }

    public String getNum_importe_contratacion() {
        return this.num_importe_contratacion;
    }

    public void setNum_importe_contratacion(String num_importe_contratacion) {
        this.num_importe_contratacion = num_importe_contratacion;
    }

    public String getEstado_rrhh() {
        return this.estado_rrhh;
    }

    public void setEstado_rrhh(String estado_rrhh) {
        this.estado_rrhh = estado_rrhh;
    }

    public String getFe_formalizacion() {
        return this.fe_formalizacion;
    }

    public void setFe_formalizacion(String fe_formalizacion) {
        this.fe_formalizacion = fe_formalizacion;
    }

    public List<CicloMantenimientoView> getCiclos() {
        return this.ciclos;
    }

    public void setCiclos(List<CicloMantenimientoView> ciclos) {
        this.ciclos = ciclos;
    }

    @Override
    public String toString() {
        return "{" + " 'id_detalle_mto':'" + getId_detalle_mto() + "'" + ", 'estado':'" + getEstado() + "'"
                + ", 'des_empresa':'" + getDes_empresa() + "'" + ", 'num_importe':'" + getNum_importe() + "'"
                + ", 'fe_ini_contrato':'" + getFe_ini_contrato() + "'" + ", 'fe_fin_contrato':'" + getFe_fin_contrato()
                + "'" + ", 'chk_prorroga':'" + getChk_prorroga() + "'" + ", 'fe_ini_prorroga':'" + getFe_ini_prorroga()
                + "'" + ", 'fe_fin_prorroga':'" + getFe_fin_prorroga() + "'" + ", 'cod_expediente':'"
                + getCod_expediente() + "'" + ", 'cod_contrato':'" + getCod_contrato() + "'" + ", 'chk_activo':'"
                + getChk_activo() + "'" + ", 'fe_crea_reg':'" + getFe_crea_reg() + "'" + ", 'fe_modi_reg':'"
                + getFe_modi_reg() + "'" + ", 'cod_mod_usu':'" + getCod_mod_usu() + "'" + ", 'estadonuevoexp':'"
                + getEstadonuevoexp() + "'" + ", 'añosprorroga':'" + getAñosprorroga() + "'" + ", 'fe_sol_adq':'"
                + getFe_sol_adq() + "'" + ", 'fe_env_org_col':'" + getFe_env_org_col() + "'" + ", 'fe_recp_mem':'"
                + getFe_recp_mem() + "'" + ", 'fe_env_val':'" + getFe_env_val() + "'" + ", 'fe_recp_val':'"
                + getFe_recp_val() + "'" + ", 'fe_ultdia_valmem':'" + getFe_ultdia_valmem() + "'" + ", 'fe_mem_val':'"
                + getFe_mem_val() + "'" + ", 'fe_tram_cotec':'" + getFe_tram_cotec() + "'" + ", 'fe_ultdia_ofertas':'"
                + getFe_ultdia_ofertas() + "'" + ", 'fe_recp_ofertas':'" + getFe_recp_ofertas() + "'"
                + ", 'fe_aviso_jefes':'" + getFe_aviso_jefes() + "'" + ", 'fe_aviso_ofertasvalidadas':'"
                + getFe_aviso_ofertasvalidadas() + "'" + ", 'fe_respuesta_ofertas':'" + getFe_respuesta_ofertas() + "'"
                + ", 'fe_ult_diaexpdate':'" + getFe_ult_diaexpdate() + "'" + ", 'fe_inimto_garantia_prevista':'"
                + getFe_inimto_garantia_prevista() + "'" + ", 'fe_finmto_garantia_prevista':'"
                + getFe_finmto_garantia_prevista() + "'" + ", 'fe_informevalidacion':'" + getFe_informevalidacion()
                + "'" + ", 'fe_adjudicacionformalizacion':'" + getFe_adjudicacionformalizacion() + "'"
                + ", 'num_importe_contratacion':'" + getNum_importe_contratacion() + "'" + ", 'estado_rrhh':'"
                + getEstado_rrhh() + "'" + ", 'fe_formalizacion':'" + getFe_formalizacion() + "'" + ", 'ciclos':'"
                + getCiclos() + "'" + "}";
    }

    public static List<DetalleMantenimientoView> toList(List<DetalleMantenimiento> mnt) {
        List<DetalleMantenimientoView> list = new ArrayList<>();
        for (DetalleMantenimiento mantenimiento : mnt) {
            DetalleMantenimientoView neew = new DetalleMantenimientoView(mantenimiento);
            list.add(neew);
        }
        return list;
    }

}
