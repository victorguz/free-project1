CREATE TABLE GOYA.PROCEDENCIA_INVERSION
(
  COD_PROCEDENCIA  NUMBER                       NOT NULL,
  DES_PROCEDENCIA  VARCHAR2(255 BYTE)           NOT NULL,
  FE_CREA_REG      DATE,
  FE_MODI_REG      DATE,
  COD_MOD_USU      VARCHAR2(8 BYTE),
  CHK_ACTIVO       CHAR(1 BYTE),
  CHK_MARCA        CHAR(1 BYTE)
);
