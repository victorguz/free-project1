-- TABLA MANTENIMIENTO

CREATE TABLE GOYA.MANTENIMIENTO
(
  ID_MANTENIMIENTO               NUMBER         NOT NULL,
  COD_TIPO_MTO                   NUMBER         NOT NULL,
  COD_EXPEDIENTE                 VARCHAR2(25 BYTE),
  COD_CONTRATO                   VARCHAR2(25 BYTE),
  TIPO_PROCEDIMIENTO_ADJUDICADO  NUMBER,
  COD_DEPARTAMENTO               NUMBER,
  COD_UNIDAD                     NUMBER,
  COD_RESPONSABLE                NUMBER,
  TXT_DESCRIPCION                VARCHAR2(2000 BYTE),
  DES_EMPRESA                    VARCHAR2(255 BYTE),
  NUM_IMPORTE                    NUMBER(12,2),
  FE_INI_CONTRATO                DATE,
  FE_FIN_CONTRATO                DATE,
  CHK_PRORROGA                   CHAR(1 BYTE),
  FE_INI_PRORROGA                DATE,
  FE_FIN_PRORROGA                DATE,
  TXT_OBSERVACIONES              VARCHAR2(2000 BYTE),
  CHK_ACTIVO                     CHAR(1 BYTE),
  FE_CREA_REG                    DATE,
  FE_MODI_REG                    DATE,
  COD_MOD_USU                    VARCHAR2(8 BYTE),
  PALABRA_CLAVE                  VARCHAR2(2000 BYTE)
)
/

CREATE UNIQUE INDEX GOYA.MANTENIMIENTO_PK ON GOYA.MANTENIMIENTO (ID_MANTENIMIENTO)
/

ALTER TABLE GOYA.MANTENIMIENTO ADD (CONSTRAINT MANTENIMIENTO_PK  PRIMARY KEY  (ID_MANTENIMIENTO))
/

----TABLA CICLO_MANTENIMIENTO

---- TABLA CICLO_MANTENIMIENTO

CREATE TABLE GOYA.CICLO_MANTENIMIENTO
(
  ID_CICLO                  NUMBER              NOT NULL,
  ID_MANTENIMIENTO          NUMBER              NOT NULL,
  DES_COMENTARIOS           VARCHAR2(2000 BYTE),
  FE_TRATAMIENTO            DATE,
  RUTA_ADJUNTO              VARCHAR2(255 BYTE),
  FE_CREA_REG               DATE,
  FE_MODI_REG               DATE,
  COD_MOD_USU               VARCHAR2(8 BYTE),
  ID_DETALLE_MTO            NUMBER              NOT NULL,
  CHK_ACTIVO                CHAR(1 BYTE),
  DES_COMENTARIOS_PUBLICOS  VARCHAR2(2000 BYTE)
)
/

CREATE UNIQUE INDEX GOYA.CICLO_MANTENIMIENTO_PK ON GOYA.CICLO_MANTENIMIENTO (ID_CICLO)
/

ALTER TABLE GOYA.CICLO_MANTENIMIENTO ADD (CONSTRAINT CICLO_MANTENIMIENTO_PK  PRIMARY KEY  (ID_CICLO))
/

-----Tabla de DETALLE_MANTENIMIENTO

CREATE TABLE GOYA.DETALLE_MANTENIMIENTO
(
  ID_DETALLE_MTO                NUMBER          NOT NULL,
  ID_MANTENIMIENTO              NUMBER          NOT NULL,
  COD_ESTADO_MTO                NUMBER          NOT NULL,
  DES_EMPRESA                   VARCHAR2(255 BYTE),
  NUM_IMPORTE                   NUMBER(12,2),
  FE_INI_CONTRATO               DATE,
  FE_FIN_CONTRATO               DATE,
  CHK_PRORROGA                  CHAR(1 BYTE),
  FE_INI_PRORROGA               DATE,
  FE_FIN_PRORROGA               DATE,
  COD_EXPEDIENTE                VARCHAR2(25 BYTE),
  COD_CONTRATO                  VARCHAR2(25 BYTE),
  CHK_ACTIVO                    CHAR(1 BYTE),
  FE_CREA_REG                   DATE,
  FE_MODI_REG                   DATE,
  COD_MOD_USU                   VARCHAR2(8 BYTE),
  COD_ESTADONUEVOEXP            NUMBER,
  AÑOSPRORROGA                  NUMBER,
  FE_SOL_ADQ                    DATE,
  FE_ENV_ORG_COL                DATE,
  FE_RECP_MEM                   DATE,
  FE_ENV_VAL                    DATE,
  FE_RECP_VAL                   DATE,
  FE_ULTDIA_VALMEM              DATE,
  FE_MEM_VAL                    DATE,
  FE_TRAM_COTEC                 DATE,
  FE_ULTDIA_OFERTAS             DATE,
  FE_RECP_OFERTAS               DATE,
  FE_AVISO_JEFES                DATE,
  FE_AVISO_OFERTASVALIDADAS     DATE,
  FE_RESPUESTA_OFERTAS          DATE,
  FE_ULT_DIAEXPDATE             DATE,
  FE_INIMTO_GARANTÍA_PREVISTA   DATE,
  FE_FINMTO_GARANTÍA_PREVISTA   DATE,
  FE_INFORMEVALIDACION          DATE,
  FE_ADJUDICACIÓNFORMALIZACION  DATE,
  NUM_IMPORTE_CONTRATACION      NUMBER(11,2),
  COD_ESTADO_RRHH               NUMBER,
  FE_FORMALIZACION              DATE
)
/

CREATE UNIQUE INDEX GOYA.DETALLE_MANTENIMIENTO_PK ON GOYA.DETALLE_MANTENIMIENTO (ID_DETALLE_MTO)
/

ALTER TABLE GOYA.DETALLE_MANTENIMIENTO ADD (CONSTRAINT DETALLE_MANTENIMIENTO_PK  PRIMARY KEY  (ID_DETALLE_MTO))
/

ALTER TABLE GOYA.DETALLE_MANTENIMIENTO ADD (
  CONSTRAINT ID_MANTENIMIENTO_FK 
 FOREIGN KEY (ID_MANTENIMIENTO) 
 REFERENCES GOYA.MANTENIMIENTO (ID_MANTENIMIENTO))
/

ALTER TABLE GOYA.CICLO_MANTENIMIENTO ADD (CONSTRAINT CICLO_MANTENIMIENTO_FK FOREIGN KEY (ID_DETALLE_MTO) 
 REFERENCES GOYA.DETALLE_MANTENIMIENTO (ID_DETALLE_MTO))
/

----Tabla ESTADO_MANTENIMIENTO

CREATE TABLE GOYA.ESTADO_MANTENIMIENTO
(
  ID_ESTADO    NUMBER                           NOT NULL,
  DES_ESTADO   VARCHAR2(100 BYTE)               NOT NULL,
  FE_CREA_REG  DATE,
  FE_MODI_REG  DATE,
  CHK_ACTIVO   CHAR(1 BYTE),
  COD_MOD_USU  VARCHAR2(10 BYTE)
)
/

-----Tabla REQUIERE_MANTENIMIENTO

CREATE TABLE GOYA.REQUIERE_MANTENIMIENTO
(
  COD_REQMTO   NUMBER                           NOT NULL,
  DES_REQMTO   VARCHAR2(255 BYTE)               NOT NULL,
  FE_CREA_REG  DATE,
  FE_MODI_REG  DATE,
  COD_MOD_USU  VARCHAR2(8 BYTE),
  CHK_ACTIVO   CHAR(1 BYTE),
  CHK_MARCA    CHAR(1 BYTE)
)
/

----Tabla TIPO_MANTENIMIENTO

CREATE TABLE GOYA.TIPO_MANTENIMIENTO
(
  ID_TIPO_MTO   NUMBER                          NOT NULL,
  DES_TIPO_MTO  VARCHAR2(255 BYTE)              NOT NULL,
  CHK_ACTIVO    NUMBER                          NOT NULL,
  FE_CREA_REG   DATE,
  FE_MODI_REG   DATE,
  COD_MOD_USU   VARCHAR2(8 BYTE)
)
/

CREATE UNIQUE INDEX GOYA.TIPO_TIPO_MANTENIMIENTO_PK ON GOYA.TIPO_MANTENIMIENTO (ID_TIPO_MTO)
/

ALTER TABLE GOYA.TIPO_MANTENIMIENTO ADD (CONSTRAINT TIPO_TIPO_MANTENIMIENTO_PK  PRIMARY KEY  (ID_TIPO_MTO))
/

ALTER TABLE MANTENIMIENTO ADD UNIDAD_SOLICITANTE_AUX  VARCHAR2(2000)
/
ALTER TABLE MANTENIMIENTO ADD COD_SILCON_SOLICITANTE_AUX VARCHAR2(8)
/ 
ALTER TABLE MANTENIMIENTO ADD COD_SILCON_SOLICITANTE_AUX2  VARCHAR2(8)
/
ALTER TABLE MANTENIMIENTO ADD COD_PROCEDENCIA  NUMBER
/

DELETE FROM CICLO_MANTENIMIENTO
/
DELETE FROM DETALLE_MANTENIMIENTO
/
DELETE FROM MANTENIMIENTO
/
commit
/