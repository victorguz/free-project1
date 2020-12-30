SET DEFINE OFF;
Insert into GOYA.TIPO_MANTENIMIENTO
   (ID_TIPO_MTO, DES_TIPO_MTO, CHK_ACTIVO, FE_CREA_REG, FE_MODI_REG, COD_MOD_USU)
 Values
   (1, 'Servicio', 1, TO_DATE('09/29/2017 09:49:04', 'MM/DD/YYYY HH24:MI:SS'), TO_DATE('09/29/2017 09:49:04', 'MM/DD/YYYY HH24:MI:SS'), 
    '99GU5677');
Insert into GOYA.TIPO_MANTENIMIENTO
   (ID_TIPO_MTO, DES_TIPO_MTO, CHK_ACTIVO, FE_CREA_REG, FE_MODI_REG, COD_MOD_USU)
 Values
   (2, 'Suministro', 1, TO_DATE('09/29/2017 09:49:04', 'MM/DD/YYYY HH24:MI:SS'), TO_DATE('09/29/2017 09:49:04', 'MM/DD/YYYY HH24:MI:SS'), 
    '99GU5677');
Insert into GOYA.TIPO_MANTENIMIENTO
   (ID_TIPO_MTO, DES_TIPO_MTO, CHK_ACTIVO, FE_CREA_REG, COD_MOD_USU)
 Values
   (3, 'AC', 1, TO_DATE('03/03/2020 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), '99GU7196');
Insert into GOYA.TIPO_MANTENIMIENTO
   (ID_TIPO_MTO, DES_TIPO_MTO, CHK_ACTIVO, FE_CREA_REG, COD_MOD_USU)
 Values
   (4, 'HW', 1, TO_DATE('03/03/2020 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), '99GU7196');
Insert into GOYA.TIPO_MANTENIMIENTO
   (ID_TIPO_MTO, DES_TIPO_MTO, CHK_ACTIVO, FE_CREA_REG, COD_MOD_USU)
 Values
   (5, 'HW-SW', 1, TO_DATE('03/03/2020 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), '99GU7196');
Insert into GOYA.TIPO_MANTENIMIENTO
   (ID_TIPO_MTO, DES_TIPO_MTO, CHK_ACTIVO, FE_CREA_REG, COD_MOD_USU)
 Values
   (6, 'HW-SW - Serv', 1, TO_DATE('03/03/2020 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), '99GU7196');
Insert into GOYA.TIPO_MANTENIMIENTO
   (ID_TIPO_MTO, DES_TIPO_MTO, CHK_ACTIVO, FE_CREA_REG, COD_MOD_USU)
 Values
   (7, 'Serv', 1, TO_DATE('03/03/2020 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), '99GU7196');
Insert into GOYA.TIPO_MANTENIMIENTO
   (ID_TIPO_MTO, DES_TIPO_MTO, CHK_ACTIVO, FE_CREA_REG, COD_MOD_USU)
 Values
   (8, 'SW', 1, TO_DATE('03/03/2020 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), '99GU7196');
Insert into GOYA.TIPO_MANTENIMIENTO
   (ID_TIPO_MTO, DES_TIPO_MTO, CHK_ACTIVO, FE_CREA_REG, COD_MOD_USU)
 Values
   (9, 'Suscripciones', 1, TO_DATE('03/03/2020 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), '99GU7196');
COMMIT;
