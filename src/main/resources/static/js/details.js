let detailsList = document.querySelectorAll(".input-detalles");
let details = [];

let page = 0;
let perPage = 100;
let total = 0;
const columns = [
    // { name: "Id", title: "Id", data: "id_detalle_mto" },
    // { name: "Estado", title: "Estado", data: "estado" },
    // {
    //     name: "Inicio", title: "Inicio",
    //     render: function (undefined, filter, data, meta) { return data.fe_ini_contrato }
    // },
    // {
    //     name: "Fin", title: "Fin",
    //     render: function (undefined, filter, data, meta) {
    //         return data.fe_fin_contrato
    //     }
    // },
    // { name: "Expediente", title: "Expediente", data: "cod_expediente" },
    // { name: "Contrato", title: "Contrato", data: "cod_contrato" },
    // { name: "Adjudicado", title: "Adjudicado", data: "des_empresa" },
    // {
    //     name: "Prorrogable", title: "Prorrogable",
    //     render: function (undefined, filter, data, meta) {
    //         return data.chk_prorroga == 1 ? "Sí" : "No"
    //     }
    // },
    // {
    //     name: "Inicio prorroga", title: "Inicio prorroga",
    //     render: function (undefined, filter, data, meta) {
    //         return data.fe_ini_prorroga
    //     }
    // },
    // {
    //     name: "Fin prorroga", title: "Fin prorroga",
    //     render: function (undefined, filter, data, meta) {
    //         return data.fe_fin_prorroga
    //     }
    // },
    // { name: "No. Importe", title: "No. Importe", data: "num_importe" },
    // { name: "Estado activo", title: "Estado activo", data: "chk_activo" },
    // { name: "Cod estado nuevo expediente", title: "Cod estado nuevo expediente", data: "cod_estadonuevoexp" },
    // { name: "Años prorroga", title: "Años prorroga", data: "añosprorroga" },
    // { name: "Solicitud de alquisición", title: "Solicitud de alquisición", render: function (undefined, filter, data, meta) { return data.fe_sol_adq } },
    // // { name: "fe_env_org_col", title: "fe_env_org_col", render: function (undefined, filter, data, meta) { return data.fe_env_org_col} },
    // { name: "Recepción memorando", title: "Recepción memorando", render: function (undefined, filter, data, meta) { return data.fe_recp_mem } },
    // { name: "Envío validación", title: "Envío validación", render: function (undefined, filter, data, meta) { return data.fe_env_val } },
    // { name: "Recepcion validación", title: "Recepcion validación", render: function (undefined, filter, data, meta) { return data.fe_recp_val } },
    // { name: "Ult. día validacion memorando", title: "Ult. día validacion memorando", render: function (undefined, filter, data, meta) { return data.fe_ultdia_valmem } },
    // { name: "Validación memorando", title: "Validación memorando", render: function (undefined, filter, data, meta) { return data.fe_mem_val } },
    // // { name: "fe_tram_cotec", title: "fe_tram_cotec", render: function (undefined, filter, data, meta) { return data.fe_tram_cotec} },
    // { name: "Ultimo día ofertas", title: "Ultimo día ofertas", render: function (undefined, filter, data, meta) { return data.fe_ultdia_ofertas } },
    // { name: "Recepción de ofertas", title: "Recepción de ofertas", render: function (undefined, filter, data, meta) { return data.fe_recp_ofertas } },
    // { name: "Aviso jefes", title: "Aviso jefes", render: function (undefined, filter, data, meta) { return data.fe_aviso_jefes } },
    // { name: "Aviso ofertas validadas", title: "Aviso ofertas validadas", render: function (undefined, filter, data, meta) { return data.fe_aviso_ofertasvalidadas } },
    // { name: "Respuesta a ofertas", title: "Respuesta a ofertas", render: function (undefined, filter, data, meta) { return data.fe_respuesta_ofertas } },
    // { name: "Ult. día expediente", title: "Ult. día expediente", render: function (undefined, filter, data, meta) { return data.fe_ult_diaexpdate } },
    // { name: "Ini. Mto. garantía prevista ", title: "Ini. Mto. garantía prevista ", render: function (undefined, filter, data, meta) { return data.fe_inimto_garantia_prevista } },
    // { name: "Fin Mto. garantía prevista", title: "Fin Mto. garantía prevista", render: function (undefined, filter, data, meta) { return data.fe_finmto_garantia_prevista } },
    // { name: "Informe validación", title: "Informe validación", render: function (undefined, filter, data, meta) { return data.fe_informevalidacion } },
    // { name: "Adjudicacion formalizacion", title: "Adjudicacion formalizacion", render: function (undefined, filter, data, meta) { return data.fe_adjudicacionformalizacion } },
    // { name: "Importe contratación", title: "Importe contratación", data: "num_importe_contratacion" },
    // { name: "Estado RRHH", title: "Estado RRHH", data: "cod_estado_rrhh" },
    // { name: "Formalización", title: "Formalización", render: function (undefined, filter, data, meta) { return data.fe_formalizacion } },
];
const columnDefs = [
    { targets: 0, width: '40px' },
    { targets: [8, 9], visible: false },
    { targets: 10, orderable: false },
]
const buttons = [
    {
        text: 'Columnas',
        extend: 'colvis',
    },
    {
        text: '<div class="dttable-button"><img src="icons/pdf.png">Impr. PDF<div>',
        extend: 'print',
        exportOptions: {
            columns: ':visible'
        }
    },
    {
        text: '<div class="dttable-button"><img src="icons/excel.png">Excel<div>',
        extend: 'excelHtml5',
        exportOptions: {
            columns: ':visible'
        }
    },
    {
        text: '<div class="dttable-button"><img src="icons/crystal.jpg">Crystal<div>',
        extend: 'excelHtml5',
        exportOptions: {
            columns: [1, 6, 5, 4, 8, 9, 7]
        }
    },
]
const order = [[1, "desc"]]


const createdRow = function (row, data, dataIndex) {
    const vencimiento = timeValueAndUnit(data[11])
    const prorroga = timeValueAndUnit(data[16])
    if ((vencimiento && vencimiento.unit == "month" && vencimiento.value > 0 && vencimiento.value < 8)
        || (prorroga && prorroga.unit == "month" && prorroga.value > 0 && prorroga.value < 4)) {
        row.classList.add("yellow-row")
    } else if (data[1] == "En vigor") {
        row.classList.add("green-row")
    } else if (data[1] == "Caducado") {
        row.classList.add("red-row")
    }
}
let details_datatable;
let ciclos_datatable;
$(document).ready(function () {
    details_datatable = setDataTable(null, columns, columnDefs, buttons,
        order, "details_datatable", null, 10, createdRow)
    $('.ui.dropdown').dropdown()
    $('.ui.checkbox').checkbox()
    $(".boolean").each(function () {
        $(this).text($(this).text() == 0 ? "No" : "Si")
    })

    getDetails()
    setMethods()
});


function setMethods() {
    $("[button-save-mnt]").click(function () {
        $("[modal-mnt]").modal("show")
    });
    $("[button-modal-details]").click(function (e) {
        e.preventDefault();
        $('.ui.dimmer').dimmer('show');
        setModalDetailsData($(this).attr("button-modal-details"));
        $('.ui.dimmer').dimmer('hide');
        $(".modal-details").modal("show");
    });
}

function setModalDetailsData(id) {
    const dtl = findDetailById(id)
    $("[modal-details-header]").html("Detalle #" + dtl.id_detalle_mto)

    let item = `
    
    
    <div class="ui bottom attached tab segment active" data-tab="uno">
        <div class="two fields">
            <div class="field">
                <label>Estado</label>
                <input type="text" readonly="true" placeholder="Estado" value='${dtl.estado ? dtl.estado : ""}'>
            </div>
            <div class="field">
                <label>Estado nuevo expediente</label>
                <input type="text" readonly="true" placeholder="Estado nuevo expediente" value='${dtl.cod_estadonuevoexp ? dtl.cod_estadonuevoexp : ""}'>
            </div>
            <div class="field">
                <label>Estado RRHH</label>
                <input type="text" readonly="true" placeholder="Estado RRHH" value='${dtl.cod_estado_rrhh ? dtl.cod_estado_rrhh : ""}'>
            </div>
            <div class="field">
                <label>Prorrogable</label>
                <input type="text" readonly="true" placeholder="Prorrogable" value='${dtl.chk_prorroga ? (dtl.chk_prorroga == 0 ? "No" : "Si") : ""}'>
            </div>
        </div>

        <div class="two fields">
            <div class="field">
                <label>Fecha ini. contrato</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Fecha inicio contrato" value='${dtl.fe_ini_contrato ? dtl.fe_ini_contrato : ""}'>
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Fecha fin contrato</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Fecha fin contrato" value='${dtl.fe_fin_contrato ? dtl.fe_fin_contrato : ""}'>
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Fecha ini. prorroga</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Fecha inicio prorroga" value='${dtl.fe_ini_prorroga ? dtl.fe_ini_prorroga : ""}'>
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Fecha fin prorroga</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Fecha fin prorroga" value='${dtl.fe_fin_prorroga ? dtl.fe_fin_prorroga : ""}'>
                    </div>
                </div>
            </div>
        </div>

        <div class="two fields">
            <div class="field">
                <label>Presupuesto base</label>
                <input type="number" min="0" placeholder="Presupuesto base" value='${dtl.num_importe ? dtl.num_importe : ""}'>
            </div>
            <div class="field">
                <label>Importe adjudicado</label>
                <input type="number" min="0" placeholder="Importe adjudicado" value='${dtl.num_importe_contratacion ? dtl.num_importe_contratacion : ""}'>
            </div>
            <div class="field">
                <label>Expediente</label>
                <input type="text" readonly="true" placeholder="Expediente" value='${dtl.cod_expediente ? dtl.cod_expediente : ""}'>
            </div>
            <div class="field">
                <label>Contrato</label>
                <input type="text" readonly="true" placeholder="Contrato" value='${dtl.cod_contrato ? dtl.cod_contrato : ""}'>
            </div>
        </div>
        <div class="field">
            <label>Empresa adjudicada</label>
            <input type="text" readonly="true" placeholder="Empresa adjudicada" value='${dtl.des_empresa ? dtl.des_empresa : ""}'>
        </div>

        <table class="ui selectable celled table" style="wid100%" id="details_datatable2">
        <tbody>

            <thead>
                <tr>
                    <th>ID</th>
                    <th>Fecha tratamiento</th>
                    <th>Observaciones QyA</th>
                    <th>Observaciones detalle</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            `;

    dtl.ciclos.forEach(cl => {
        cl.id_detalle_mto = dtl.id_detalle_mto;
        item += `
                
                <tr>
                    <td>${cl.id_ciclo}</td>
                    <td>${cl.fe_tratamiento}</td>
                    <td>${cl.des_comentarios}</td>
                    <td>${cl.de_comentarios_publicos}</td>
                    <td>
                        <a class="ui button icon" button-modal-cicle='${JSON.stringify(cl)}'>
                            <i class="eye icon"></i>
                        </a>
                    </td>
                </tr>
                
                
                `
    });


    item += `
        </tbody>
        </table>
    </div>

    <div class="ui bottom attached tab segment" data-tab="dos">
        <h5 class="ui header dividing">Control de memorias</h5>
        <div class="two fields">
            <div class="field">
                <label>Fecha solicitud adquisición</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Fecha solicitud adquisición" value='${dtl.fe_sol_adq ? dtl.fe_sol_adq : ""}'>
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Fecha envío org. colegiados</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Fecha envío org. colegiados" value='${dtl.fe_env_org_col ? dtl.fe_env_org_col : ""}'>
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Fecha recepción de memoria</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Fecha recepción de memoria" value='${dtl.fe_recp_mem ? dtl.fe_recp_mem : ""}'>
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Fecha envío validación responsable</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" value='${dtl.fe_env_val ? dtl.fe_env_val : ""}' placeholder="Fecha envío validación responsable">
                    </div>
                </div>

            </div>
        </div>
        <div class="two fields">
            <div class="field">
                <label>Fecha recepción validación responsable</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="" value='${dtl.fe_recp_val ? dtl.fe_recp_val : ""}' placeholder="Fecha recepción validación responsable">
                    </div>
                </div>

            </div>
            <div class="field">
                <label>Último día de validación</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" value='${dtl.fe_ultdia_valmem ? dtl.fe_ultdia_valmem : ""}'
                            placeholder="Último día de validación">
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Fecha memoria validada (Memorias Tec)</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Fecha memoria validada" value='${dtl.fe_mem_val ? dtl.fe_mem_val : ""}'>
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Fecha terminación en COTEC</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Fecha terminación en COTEC" value='${dtl.fe_tram_cotec ? dtl.fe_tram_cotec : ""}'>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="ui bottom attached tab segment" data-tab="tres">
        <h5 class="ui header dividing">Control de ofertas</h5>
        <div class="two fields">
            <div class="field">
                <label>Último día presentación ofertas</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" value='${dtl.fe_ultdia_ofertas ? dtl.fe_ultdia_ofertas : ""}'
                            placeholder="Último día presentación ofertas">
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Fecha recepción de ofertas</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Fecha recepción de ofertas" value='${dtl.fe_recp_ofertas ? dtl.fe_recp_ofertas : ""}'>
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Fecha aviso a jefes</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Fecha aviso a jefes" value='${dtl.fe_aviso_jefes ? dtl.fe_aviso_jefes : ""}'>
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Fecha aviso ofertas validadas</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" value='${dtl.fe_aviso_ofertasvalidadas ? dtl.fe_aviso_ofertasvalidadas : ""}'
                            placeholder="Fecha aviso ofertas validadas">
                    </div>
                </div>
            </div>
        </div>
        <div class="two fields">
            <div class="field">
                <label>Fecha respuesta de oferta</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Fecha respuesta de oferta" value='${dtl.fe_respuesta_ofertas ? dtl.fe_respuesta_ofertas : ""}'>
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Último día de validación</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" value='${dtl.fe_ult_diaexpdate ? dtl.fe_ult_diaexpdate : ""}'
                            placeholder="Último día de validación">
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Fecha informe de validación</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Fecha informe de validación" value='${dtl.fe_informevalidacion ? dtl.fe_informevalidacion : ""}'>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="ui bottom attached tab segment" data-tab="cuatro">
        <h5 class="ui header dividing">Control de garantías</h5>
        <div class="two fields">
            <div class="field">
                <label>Fecha inicio Mto/Garantía prevista</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="" tru value='${dtl.fe_inimto_garantia_prevista ? dtl.fe_inimto_garantia_prevista : ""}'e
                            placeholder="Fecha inicio Mto/Garantía prevista">
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Fecha fin Mto/Garantía prevista</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" value='${dtl.fe_finmto_garantia_prevista ? dtl.fe_finmto_garantia_prevista : ""}'
                            placeholder="Fecha fin Mto/Garantía prevista">
                    </div>
                </div>
            </div>
        </div>
        <h5 class="ui header dividing">Control de adjudicación y
            formalización</h5>
        <div class="two fields">
            <div class="field">
                <label>Fecha adjudicación</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Fecha adjudicación" value='${dtl.fe_adjudicacionformalizacion ? dtl.fe_adjudicacionformalizacion : ""}'>
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Fecha formalización</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Fecha formalización" value='${dtl.fe_formalizacion ? dtl.fe_formalizacion : ""}'>
                    </div>
                </div>
            </div>
        </div>
    </div>

    `;

    document.querySelector(".tabs-detail-container").innerHTML = item;


    $("[button-modal-cicle]").click(function (e) {
        e.preventDefault();
        openCicleModal(stringToJSON($(this).attr("button-modal-cicle"), true))
    })

    $('.menu .item').tab();
}
function openCicleModal(cicle) {
    if (cicle) {
        console.log(cicle)
        $("[modal-cicle-content]").html(`
        
            <div class="field">
                <label>Inicio prorroga</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Fecha inicio prorroga" value='${cicle.fe_tratamiento}'>
                    </div>
                </div>
            </div>

            <div class="field">
                <label>Observaciones QyA:</label>
                <textarea name="descripcion" id="descripcion" rows="3" maxlength="2000"
                    placeholder="Observaciones QyA">${cicle.des_comentarios}</textarea>
            </div>

            <div class="field">
                <label>Observaciones detalle:</label>
                <textarea name="observaciones" id="observaciones" rows="5" maxlength="2000"
                    placeholder="Observaciones detalle">${cicle.de_comentarios_publicos}</textarea>
            </div>

            <div class="field">
                <label>Ruta archivo adjunto:</label>
                <div class="ui action input">
                    <input type="text" placeholder="Ruta archivo adjunto" value='${cicle.ruta_adjunto}'>
                    <a class="ui blue icon button" href='${cicle.ruta_adjunto}' download='${cicle.ruta_adjunto}'>
                        <i class="download icon"></i>
                        	&nbsp;&nbsp;Descargar archivo
                    </a>
                    <a class="ui green icon button">
                        <i class="upload icon"></i>
                        	&nbsp;&nbsp;Subir un archivo
                    </a>
                </div>
            </div>

        `);

        $("[modal-cicle]").modal("show")
        $("[modal-cicle-header]").html("Detalle #" + cicle.id_detalle_mto + " - Ciclo #" + cicle.id_ciclo)
    }
}

function getDetails() {
    if (detailsList) {
        detailsList.forEach(detail => {
            details.push(stringToJSON(detail.value))
        });
    }
}

function findDetailById(id) {
    let d = null
    details.forEach(dtl => {
        if (dtl.id_detalle_mto == id) {
            d = dtl
        }
    });
    return d;
}