SET DEFINE OFF;
Insert into GOYA.REQUIERE_MANTENIMIENTO
   (COD_REQMTO, DES_REQMTO, FE_CREA_REG, COD_MOD_USU, CHK_ACTIVO, CHK_MARCA)
 Values
   (1, 'NO', TO_DATE('09/30/2019 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), '99GU7196', 
    '1', '0');
Insert into GOYA.REQUIERE_MANTENIMIENTO
   (COD_REQMTO, DES_REQMTO, FE_CREA_REG, COD_MOD_USU, CHK_ACTIVO, CHK_MARCA)
 Values
   (2, 'HW', TO_DATE('09/30/2019 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), '99GU7196', 
    '1', '0');
Insert into GOYA.REQUIERE_MANTENIMIENTO
   (COD_REQMTO, DES_REQMTO, FE_CREA_REG, COD_MOD_USU, CHK_ACTIVO, CHK_MARCA)
 Values
   (3, 'SW', TO_DATE('09/30/2019 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), '99GU7196', 
    '1', '0');
Insert into GOYA.REQUIERE_MANTENIMIENTO
   (COD_REQMTO, DES_REQMTO, FE_CREA_REG, COD_MOD_USU, CHK_ACTIVO, CHK_MARCA)
 Values
   (4, 'HW y SW', TO_DATE('09/30/2019 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), '99GU7196', 
    '1', '0');
COMMIT;
