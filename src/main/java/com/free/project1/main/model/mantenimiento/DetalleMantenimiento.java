package com.free.project1.main.model.mantenimiento;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "DETALLE_MANTENIMIENTO")
public class DetalleMantenimiento {

    @Id
    @Column(name = "ID_DETALLE_MTO", nullable = false)
    int id_detalle_mto;// NUMBER NOT NULL


    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MANTENIMIENTO")
    Mantenimiento mantenimiento;

    @OneToOne
    @JoinColumn(name = "COD_ESTADO_MTO", nullable = false)
    EstadoMantenimiento estado;

    @Column(name = "DES_EMPRESA")
    String des_empresa;// VARCHAR(255)

    @Column(name = "NUM_IMPORTE")
    String num_importe;// NUMBER(12,2)

    @Column(name = "FE_INI_CONTRATO")
    Date fe_ini_contrato;// DATE

    @Column(name = "FE_FIN_CONTRATO")
    Date fe_fin_contrato;// DATE

    @Column(name = "CHK_PRORROGA")
    Character chk_prorroga;// CHAR(1)

    @Column(name = "FE_INI_PRORROGA")
    Date fe_ini_prorroga;// DATE

    @Column(name = "FE_FIN_PRORROGA")
    Date fe_fin_prorroga;// DATE

    @Column(name = "COD_EXPEDIENTE")
    String cod_expediente;// VARCHAR(25)

    @Column(name = "COD_CONTRATO")
    String cod_contrato;// VARCHAR(25)

    @Column(name = "CHK_ACTIVO")
    Character chk_activo;// CHAR(1)

    @Column(name = "FE_CREA_REG")
    Date fe_crea_reg;// DATE

    @Column(name = "FE_MODI_REG")
    Date fe_modi_reg;// DATE

    @Column(name = "COD_MOD_USU")
    String cod_mod_usu;// VARCHAR(8)

    @Column(name = "COD_ESTADONUEVOEXP")
    String cod_estadonuevoexp;// NUMBER

    @Column(name = "AÑOSPRORROGA")
    String añosprorroga;// NUMBER

    @Column(name = "FE_SOL_ADQ")
    Date fe_sol_adq;// DATE

    @Column(name = "FE_ENV_ORG_COL")
    Date fe_env_org_col;// DATE

    @Column(name = "FE_RECP_MEM")
    Date fe_recp_mem;// DATE

    @Column(name = "FE_ENV_VAL")
    Date fe_env_val;// DATE

    @Column(name = "FE_RECP_VAL")
    Date fe_recp_val;// DATE

    @Column(name = "FE_ULTDIA_VALMEM")
    Date fe_ultdia_valmem;// DATE

    @Column(name = "FE_MEM_VAL")
    Date fe_mem_val;// DATE

    @Column(name = "FE_TRAM_COTEC")
    Date fe_tram_cotec;// DATE

    @Column(name = "FE_ULTDIA_OFERTAS")
    Date fe_ultdia_ofertas;// DATE

    @Column(name = "FE_RECP_OFERTAS")
    Date fe_recp_ofertas;// DATE

    @Column(name = "FE_AVISO_JEFES")
    Date fe_aviso_jefes;// DATE

    @Column(name = "FE_AVISO_OFERTASVALIDADAS")
    Date fe_aviso_ofertasvalidadas;// DATE

    @Column(name = "FE_RESPUESTA_OFERTAS")
    Date fe_respuesta_ofertas;// DATE

    @Column(name = "FE_ULT_DIAEXPDATE")
    Date fe_ult_diaexpdate;// DATE

    @Column(name = "FE_INIMTO_GARANTÍA_PREVISTA")
    Date fe_inimto_garantia_prevista;// DATE

    @Column(name = "FE_FINMTO_GARANTÍA_PREVISTA")
    Date fe_finmto_garantia_prevista;// DATE

    @Column(name = "FE_INFORMEVALIDACION")
    Date fe_informevalidacion;// DATE

    @Column(name = "FE_ADJUDICACIÓNFORMALIZACION")
    Date fe_adjudicacionformalizacion;// DATE

    @Column(name = "NUM_IMPORTE_CONTRATACION")
    String num_importe_contratacion;// NUMBER(11,2)

    @Column(name = "COD_ESTADO_RRHH")
    String cod_estado_rrhh; // NUMBER

    @Column(name = "FE_FORMALIZACION")
    Date fe_formalizacion;// DATE

    public DetalleMantenimiento() {
    }

    public int getId_detalle_mto() {
        return this.id_detalle_mto;
    }

    public void setId_detalle_mto(int id_detalle_mto) {
        this.id_detalle_mto = id_detalle_mto;
    }

    public Mantenimiento getMantenimiento() {
        return this.mantenimiento;
    }

    public void setMantenimiento(Mantenimiento mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public EstadoMantenimiento getEstado() {
        return this.estado;
    }

    public void setEstado(EstadoMantenimiento estado) {
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

    public String getCod_estadonuevoexp() {
        return this.cod_estadonuevoexp;
    }

    public void setCod_estadonuevoexp(String cod_estadonuevoexp) {
        this.cod_estadonuevoexp = cod_estadonuevoexp;
    }

    public String getAñosprorroga() {
        return this.añosprorroga;
    }

    public void setAñosprorroga(String añosprorroga) {
        this.añosprorroga = añosprorroga;
    }

    public Date getFe_sol_adq() {
        return this.fe_sol_adq;
    }

    public void setFe_sol_adq(Date fe_sol_adq) {
        this.fe_sol_adq = fe_sol_adq;
    }

    public Date getFe_env_org_col() {
        return this.fe_env_org_col;
    }

    public void setFe_env_org_col(Date fe_env_org_col) {
        this.fe_env_org_col = fe_env_org_col;
    }

    public Date getFe_recp_mem() {
        return this.fe_recp_mem;
    }

    public void setFe_recp_mem(Date fe_recp_mem) {
        this.fe_recp_mem = fe_recp_mem;
    }

    public Date getFe_env_val() {
        return this.fe_env_val;
    }

    public void setFe_env_val(Date fe_env_val) {
        this.fe_env_val = fe_env_val;
    }

    public Date getFe_recp_val() {
        return this.fe_recp_val;
    }

    public void setFe_recp_val(Date fe_recp_val) {
        this.fe_recp_val = fe_recp_val;
    }

    public Date getFe_ultdia_valmem() {
        return this.fe_ultdia_valmem;
    }

    public void setFe_ultdia_valmem(Date fe_ultdia_valmem) {
        this.fe_ultdia_valmem = fe_ultdia_valmem;
    }

    public Date getFe_mem_val() {
        return this.fe_mem_val;
    }

    public void setFe_mem_val(Date fe_mem_val) {
        this.fe_mem_val = fe_mem_val;
    }

    public Date getFe_tram_cotec() {
        return this.fe_tram_cotec;
    }

    public void setFe_tram_cotec(Date fe_tram_cotec) {
        this.fe_tram_cotec = fe_tram_cotec;
    }

    public Date getFe_ultdia_ofertas() {
        return this.fe_ultdia_ofertas;
    }

    public void setFe_ultdia_ofertas(Date fe_ultdia_ofertas) {
        this.fe_ultdia_ofertas = fe_ultdia_ofertas;
    }

    public Date getFe_recp_ofertas() {
        return this.fe_recp_ofertas;
    }

    public void setFe_recp_ofertas(Date fe_recp_ofertas) {
        this.fe_recp_ofertas = fe_recp_ofertas;
    }

    public Date getFe_aviso_jefes() {
        return this.fe_aviso_jefes;
    }

    public void setFe_aviso_jefes(Date fe_aviso_jefes) {
        this.fe_aviso_jefes = fe_aviso_jefes;
    }

    public Date getFe_aviso_ofertasvalidadas() {
        return this.fe_aviso_ofertasvalidadas;
    }

    public void setFe_aviso_ofertasvalidadas(Date fe_aviso_ofertasvalidadas) {
        this.fe_aviso_ofertasvalidadas = fe_aviso_ofertasvalidadas;
    }

    public Date getFe_respuesta_ofertas() {
        return this.fe_respuesta_ofertas;
    }

    public void setFe_respuesta_ofertas(Date fe_respuesta_ofertas) {
        this.fe_respuesta_ofertas = fe_respuesta_ofertas;
    }

    public Date getFe_ult_diaexpdate() {
        return this.fe_ult_diaexpdate;
    }

    public void setFe_ult_diaexpdate(Date fe_ult_diaexpdate) {
        this.fe_ult_diaexpdate = fe_ult_diaexpdate;
    }

    public Date getFe_inimto_garantia_prevista() {
        return this.fe_inimto_garantia_prevista;
    }

    public void setFe_inimto_garantia_prevista(Date fe_inimto_garantia_prevista) {
        this.fe_inimto_garantia_prevista = fe_inimto_garantia_prevista;
    }

    public Date getFe_finmto_garantia_prevista() {
        return this.fe_finmto_garantia_prevista;
    }

    public void setFe_finmto_garantia_prevista(Date fe_finmto_garantia_prevista) {
        this.fe_finmto_garantia_prevista = fe_finmto_garantia_prevista;
    }

    public Date getFe_informevalidacion() {
        return this.fe_informevalidacion;
    }

    public void setFe_informevalidacion(Date fe_informevalidacion) {
        this.fe_informevalidacion = fe_informevalidacion;
    }

    public Date getFe_adjudicacionformalizacion() {
        return this.fe_adjudicacionformalizacion;
    }

    public void setFe_adjudicacionformalizacion(Date fe_adjudicacionformalizacion) {
        this.fe_adjudicacionformalizacion = fe_adjudicacionformalizacion;
    }

    public String getNum_importe_contratacion() {
        return this.num_importe_contratacion;
    }

    public void setNum_importe_contratacion(String num_importe_contratacion) {
        this.num_importe_contratacion = num_importe_contratacion;
    }

    public String getCod_estado_rrhh() {
        return this.cod_estado_rrhh;
    }

    public void setCod_estado_rrhh(String cod_estado_rrhh) {
        this.cod_estado_rrhh = cod_estado_rrhh;
    }

    public Date getFe_formalizacion() {
        return this.fe_formalizacion;
    }

    public void setFe_formalizacion(Date fe_formalizacion) {
        this.fe_formalizacion = fe_formalizacion;
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
                + getFe_modi_reg() + "'" + ", 'cod_mod_usu':'" + getCod_mod_usu() + "'" + ", 'cod_estadonuevoexp':'"
                + getCod_estadonuevoexp() + "'" + ", 'añosprorroga':'" + getAñosprorroga() + "'" + ", 'fe_sol_adq':'"
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
                + ", 'num_importe_contratacion':'" + getNum_importe_contratacion() + "'" + ", 'cod_estado_rrhh':'"
                + getCod_estado_rrhh() + "'" + ", 'fe_formalizacion':'" + getFe_formalizacion() + "'" + "}";
    }

}
