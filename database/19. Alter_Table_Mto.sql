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