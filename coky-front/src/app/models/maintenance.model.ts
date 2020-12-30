export interface MantenimientoI {

    id_mantenimiento: number;// NUMBER NOT NULL
    cod_tipo_mto: string;// NUMBER NOT NULL
    cod_expediente: string;// VARCHAR(25)
    cod_contrato: string;// VARCHAR(25)
    tipo_procedimiento_adjudicado: string;// NUMBER
    cod_departamento: string;// NUMBER
    cod_unidad: string;// NUMBER
    cod_responsable: string;// NUMBER
    txt_descripcion: string;// VARCHAR(2000)
    des_empresa: string;// VARCHAR(255)
    num_importe: string;// NUMBER(12,2)
    fe_ini_contrato: Date;// DATE
    fe_fin_contrato: Date;// DATE
    chk_prorroga: string;// CHAR(1)
    fe_ini_prorroga: Date;// DATE
    fe_fin_prorroga: Date;// DATE
    txt_observaciones: string;// VARCHAR(2000)
    chk_activo: string;// CHAR(1)
    fe_crea_reg: Date;// DATE
    fe_modi_reg: Date;// DATE
    cod_mod_usu: string;// VARCHAR(8)
    palabra_clave: string;// VARCHAR(2000)

}

