ALTER TABLE MANTENIMIENTO MODIFY COD_TIPO_MTO NULL;

update mantenimiento set cod_tipo_mto = null where cod_tipo_mto not in (select id_tipo_mto from tipo_mantenimiento);

update mantenimiento set cod_unidad = null where cod_unidad not in (select id_unidad from v_estructura_trabajo);

update mantenimiento set cod_departamento = null where cod_departamento not in (select id_unidad from v_estructura_centro);

-- update mantenimiento set COD_SILCON_SOLICITANTE_AUX = null where COD_SILCON_SOLICITANTE_AUX not in (select id_personal from personal_new);

-- update mantenimiento set COD_SILCON_SOLICITANTE_AUX2 = null where COD_SILCON_SOLICITANTE_AUX2 not in (select id_personal from personal_new);


commit;

