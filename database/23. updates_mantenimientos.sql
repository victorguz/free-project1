-- Permitir que COD_TIPO_MTO tenga valores null

ALTER TABLE MANTENIMIENTO MODIFY COD_TIPO_MTO NULL;

-- Actualizar mantenimientos con cod_tipo_mto inexistente
update mantenimiento set cod_tipo_mto = null where cod_tipo_mto not in (select id_tipo_mto from tipo_mantenimiento);

-- Actualizar mantenimientos con cod_unidad inexistente
-- update mantenimiento set cod_unidad = null where cod_unidad not in (select id_unidad from v_estructura_trabajo);

-- Actualizar mantenimientos con cod_departamento inexistente
update mantenimiento set cod_departamento = null where cod_departamento not in (select id_unidad from v_estructura_centro);

-- Actualizar mantenimientos con COD_SILCON_SOLICITANTE_AUX inexistente
update mantenimiento set COD_SILCON_SOLICITANTE_AUX = null where COD_SILCON_SOLICITANTE_AUX not in (select id_personal from personal_new);

-- Actualizar mantenimientos con COD_SILCON_SOLICITANTE_AUX2 inexistente
update mantenimiento set COD_SILCON_SOLICITANTE_AUX2 = null where COD_SILCON_SOLICITANTE_AUX2 not in (select id_personal from personal_new);

-- Actualizar mantenimientos con COD_PROCEDENCIA inexistente
update mantenimiento set COD_PROCEDENCIA = null where COD_PROCEDENCIA not in (select COD_PROCEDENCIA from procedencia_inversion);


commit;

