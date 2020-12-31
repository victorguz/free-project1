package com.free.project1.main.model.mantenimiento;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "DETALLE_MANTENIMIENTO")
public class DetalleMantenimiento {

    @Id
    @Column(name = "ID_DETALLE_MTO", nullable = false)
    int id_detalle_mto;// NUMBER NOT NULL

    @Column(name = "ID_MANTENIMIENTO", nullable = false)
    int id_mantenimiento;// NUMBER NOT NULL

    @Column(name = "COD_ESTADO_MTO", nullable = false)
    int cod_estado_mto;// NUMBER NOT NULL

    @Column(name = "DES_EMPRESA")
    String des_empresa;// VARCHAR(255)

    @Column(name = "NUM_IMPORTE")
    double num_importe;// NUMBER(12,2)

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
    int cod_estadonuevoexp;// NUMBER

    @Column(name = "AÑOSPRORROGA")
    int añosprorroga;// NUMBER

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
    double num_importe_contratacion;// NUMBER(11,2)

    @Column(name = "COD_ESTADO_RRHH")
    int cod_estado_rrhh; // NUMBER

    @Column(name = "FE_FORMALIZACION")
    Date fe_formalizacion;// DATE


    public DetalleMantenimiento() {
    }

    public DetalleMantenimiento(int id_detalle_mto, int id_mantenimiento, int cod_estado_mto, String des_empresa, double num_importe, Date fe_ini_contrato, Date fe_fin_contrato, Character chk_prorroga, Date fe_ini_prorroga, Date fe_fin_prorroga, String cod_expediente, String cod_contrato, Character chk_activo, Date fe_crea_reg, Date fe_modi_reg, String cod_mod_usu, int cod_estadonuevoexp, int añosprorroga, Date fe_sol_adq, Date fe_env_org_col, Date fe_recp_mem, Date fe_env_val, Date fe_recp_val, Date fe_ultdia_valmem, Date fe_mem_val, Date fe_tram_cotec, Date fe_ultdia_ofertas, Date fe_recp_ofertas, Date fe_aviso_jefes, Date fe_aviso_ofertasvalidadas, Date fe_respuesta_ofertas, Date fe_ult_diaexpdate, Date fe_inimto_garantia_prevista, Date fe_finmto_garantia_prevista, Date fe_informevalidacion, Date fe_adjudicacionformalizacion, double num_importe_contratacion, int cod_estado_rrhh, Date fe_formalizacion) {
        this.id_detalle_mto = id_detalle_mto;
        this.id_mantenimiento = id_mantenimiento;
        this.cod_estado_mto = cod_estado_mto;
        this.des_empresa = des_empresa;
        this.num_importe = num_importe;
        this.fe_ini_contrato = fe_ini_contrato;
        this.fe_fin_contrato = fe_fin_contrato;
        this.chk_prorroga = chk_prorroga;
        this.fe_ini_prorroga = fe_ini_prorroga;
        this.fe_fin_prorroga = fe_fin_prorroga;
        this.cod_expediente = cod_expediente;
        this.cod_contrato = cod_contrato;
        this.chk_activo = chk_activo;
        this.fe_crea_reg = fe_crea_reg;
        this.fe_modi_reg = fe_modi_reg;
        this.cod_mod_usu = cod_mod_usu;
        this.cod_estadonuevoexp = cod_estadonuevoexp;
        this.añosprorroga = añosprorroga;
        this.fe_sol_adq = fe_sol_adq;
        this.fe_env_org_col = fe_env_org_col;
        this.fe_recp_mem = fe_recp_mem;
        this.fe_env_val = fe_env_val;
        this.fe_recp_val = fe_recp_val;
        this.fe_ultdia_valmem = fe_ultdia_valmem;
        this.fe_mem_val = fe_mem_val;
        this.fe_tram_cotec = fe_tram_cotec;
        this.fe_ultdia_ofertas = fe_ultdia_ofertas;
        this.fe_recp_ofertas = fe_recp_ofertas;
        this.fe_aviso_jefes = fe_aviso_jefes;
        this.fe_aviso_ofertasvalidadas = fe_aviso_ofertasvalidadas;
        this.fe_respuesta_ofertas = fe_respuesta_ofertas;
        this.fe_ult_diaexpdate = fe_ult_diaexpdate;
        this.fe_inimto_garantia_prevista = fe_inimto_garantia_prevista;
        this.fe_finmto_garantia_prevista = fe_finmto_garantia_prevista;
        this.fe_informevalidacion = fe_informevalidacion;
        this.fe_adjudicacionformalizacion = fe_adjudicacionformalizacion;
        this.num_importe_contratacion = num_importe_contratacion;
        this.cod_estado_rrhh = cod_estado_rrhh;
        this.fe_formalizacion = fe_formalizacion;
    }

    public int getId_detalle_mto() {
        return this.id_detalle_mto;
    }

    public void setId_detalle_mto(int id_detalle_mto) {
        this.id_detalle_mto = id_detalle_mto;
    }

    public int getId_mantenimiento() {
        return this.id_mantenimiento;
    }

    public void setId_mantenimiento(int id_mantenimiento) {
        this.id_mantenimiento = id_mantenimiento;
    }

    public int getCod_estado_mto() {
        return this.cod_estado_mto;
    }

    public void setCod_estado_mto(int cod_estado_mto) {
        this.cod_estado_mto = cod_estado_mto;
    }

    public String getDes_empresa() {
        return this.des_empresa;
    }

    public void setDes_empresa(String des_empresa) {
        this.des_empresa = des_empresa;
    }

    public double getNum_importe() {
        return this.num_importe;
    }

    public void setNum_importe(double num_importe) {
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

    public int getCod_estadonuevoexp() {
        return this.cod_estadonuevoexp;
    }

    public void setCod_estadonuevoexp(int cod_estadonuevoexp) {
        this.cod_estadonuevoexp = cod_estadonuevoexp;
    }

    public int getAñosprorroga() {
        return this.añosprorroga;
    }

    public void setAñosprorroga(int añosprorroga) {
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

    public double getNum_importe_contratacion() {
        return this.num_importe_contratacion;
    }

    public void setNum_importe_contratacion(double num_importe_contratacion) {
        this.num_importe_contratacion = num_importe_contratacion;
    }

    public int getCod_estado_rrhh() {
        return this.cod_estado_rrhh;
    }

    public void setCod_estado_rrhh(int cod_estado_rrhh) {
        this.cod_estado_rrhh = cod_estado_rrhh;
    }

    public Date getFe_formalizacion() {
        return this.fe_formalizacion;
    }

    public void setFe_formalizacion(Date fe_formalizacion) {
        this.fe_formalizacion = fe_formalizacion;
    }

}
