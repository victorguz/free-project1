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
    //     render: function (undefined, filter, data, meta) { return dateFormat(data.fe_ini_contrato) }
    // },
    // {
    //     name: "Fin", title: "Fin",
    //     render: function (undefined, filter, data, meta) {
    //         return dateFormat(data.fe_fin_contrato)
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
    //         return dateFormat(data.fe_ini_prorroga)
    //     }
    // },
    // {
    //     name: "Fin prorroga", title: "Fin prorroga",
    //     render: function (undefined, filter, data, meta) {
    //         return dateFormat(data.fe_fin_prorroga)
    //     }
    // },
    // { name: "No. Importe", title: "No. Importe", data: "num_importe" },
    // { name: "Estado activo", title: "Estado activo", data: "chk_activo" },
    // { name: "Cod estado nuevo expediente", title: "Cod estado nuevo expediente", data: "cod_estadonuevoexp" },
    // { name: "Años prorroga", title: "Años prorroga", data: "añosprorroga" },
    // { name: "Solicitud de alquisición", title: "Solicitud de alquisición", render: function (undefined, filter, data, meta) { return dateFormat(data.fe_sol_adq) } },
    // // { name: "fe_env_org_col", title: "fe_env_org_col", render: function (undefined, filter, data, meta) { return dateFormat(data.fe_env_org_col)} },
    // { name: "Recepción memorando", title: "Recepción memorando", render: function (undefined, filter, data, meta) { return dateFormat(data.fe_recp_mem) } },
    // { name: "Envío validación", title: "Envío validación", render: function (undefined, filter, data, meta) { return dateFormat(data.fe_env_val) } },
    // { name: "Recepcion validación", title: "Recepcion validación", render: function (undefined, filter, data, meta) { return dateFormat(data.fe_recp_val) } },
    // { name: "Ult. día validacion memorando", title: "Ult. día validacion memorando", render: function (undefined, filter, data, meta) { return dateFormat(data.fe_ultdia_valmem) } },
    // { name: "Validación memorando", title: "Validación memorando", render: function (undefined, filter, data, meta) { return dateFormat(data.fe_mem_val) } },
    // // { name: "fe_tram_cotec", title: "fe_tram_cotec", render: function (undefined, filter, data, meta) { return dateFormat(data.fe_tram_cotec)} },
    // { name: "Ultimo día ofertas", title: "Ultimo día ofertas", render: function (undefined, filter, data, meta) { return dateFormat(data.fe_ultdia_ofertas) } },
    // { name: "Recepción de ofertas", title: "Recepción de ofertas", render: function (undefined, filter, data, meta) { return dateFormat(data.fe_recp_ofertas) } },
    // { name: "Aviso jefes", title: "Aviso jefes", render: function (undefined, filter, data, meta) { return dateFormat(data.fe_aviso_jefes) } },
    // { name: "Aviso ofertas validadas", title: "Aviso ofertas validadas", render: function (undefined, filter, data, meta) { return dateFormat(data.fe_aviso_ofertasvalidadas) } },
    // { name: "Respuesta a ofertas", title: "Respuesta a ofertas", render: function (undefined, filter, data, meta) { return dateFormat(data.fe_respuesta_ofertas) } },
    // { name: "Ult. día expediente", title: "Ult. día expediente", render: function (undefined, filter, data, meta) { return dateFormat(data.fe_ult_diaexpdate) } },
    // { name: "Ini. Mto. garantía prevista ", title: "Ini. Mto. garantía prevista ", render: function (undefined, filter, data, meta) { return dateFormat(data.fe_inimto_garantia_prevista) } },
    // { name: "Fin Mto. garantía prevista", title: "Fin Mto. garantía prevista", render: function (undefined, filter, data, meta) { return dateFormat(data.fe_finmto_garantia_prevista) } },
    // { name: "Informe validación", title: "Informe validación", render: function (undefined, filter, data, meta) { return dateFormat(data.fe_informevalidacion) } },
    // { name: "Adjudicacion formalizacion", title: "Adjudicacion formalizacion", render: function (undefined, filter, data, meta) { return dateFormat(data.fe_adjudicacionformalizacion) } },
    // { name: "Importe contratación", title: "Importe contratación", data: "num_importe_contratacion" },
    // { name: "Estado RRHH", title: "Estado RRHH", data: "cod_estado_rrhh" },
    // { name: "Formalización", title: "Formalización", render: function (undefined, filter, data, meta) { return dateFormat(data.fe_formalizacion) } },
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
        text: '<div class="dttable-button"><img src="../icons/pdf.png">Impr. PDF<div>',
        extend: 'print',
        exportOptions: {
            columns: ':visible'
        }
    },
    {
        text: '<div class="dttable-button"><img src="../icons/excel.png">Excel<div>',
        extend: 'excelHtml5',
        exportOptions: {
            columns: ':visible'
        }
    },
    {
        text: '<div class="dttable-button"><img src="../icons/crystal.jpg">Crystal<div>',
        extend: 'excelHtml5',
        exportOptions: {
            columns: [1, 6, 5, 4, 8, 9, 7]
        }
    },
]
const order = [[1, "desc"]]


const createdRow = function (row, data, dataIndex) {
    row.addEventListener("dblclick", function (e) {
        e.preventDefault();
        $('.ui.dimmer').dimmer('show');
        setModalDetailsData(data[0]);
    })
}
let details_datatable;
let ciclos_datatable;
$(document).ready(function () {
    details_datatable = setDataTable(null, columns, columnDefs, buttons,
        order, "details_datatable", null, 10, null)
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
                <label>Inicio contrato</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Inicio contrato" value='${dtl.fe_ini_contrato ? dateFormat(dtl.fe_ini_contrato) : ""}'>
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Fin contrato</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Fin contrato" value='${dtl.fe_fin_contrato ? dateFormat(dtl.fe_fin_contrato) : ""}'>
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Inicio prorroga</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Inicio prorroga" value='${dtl.fe_ini_prorroga ? dateFormat(dtl.fe_ini_prorroga) : ""}'>
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Fin prorroga</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Fin prorroga" value='${dtl.fe_fin_prorroga ? dateFormat(dtl.fe_fin_prorroga) : ""}'>
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
    </div>

    <div class="ui bottom attached tab segment" data-tab="dos">
        <div class="two fields">
            <div class="field">
                <label>Solicitud adquisición</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Solicitud adquisición" value='${dtl.fe_sol_adq ? dateFormat(dtl.fe_sol_adq) : ""}'>
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Envío org. colegiados</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Envío org. colegiados" value='${dtl.fe_env_org_col ? dateFormat(dtl.fe_env_org_col) : ""}'>
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Recepción de memoria</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Recepción de memoria" value='${dtl.fe_recp_mem ? dateFormat(dtl.fe_recp_mem) : ""}'>
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Envío validación responsable</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true value='${dtl.fe_env_val ? dateFormat(dtl.fe_env_val) : ""}'"
                            placeholder="Envío validación responsable">
                    </div>
                </div>

            </div>
        </div>
        <div class="two fields">
            <div class="field">
                <label>Recepción validación responsable</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="" tru value='${dtl.fe_recp_val ? dateFormat(dtl.fe_recp_val) : ""}'e
                            placeholder="Recepción validación responsable">
                    </div>
                </div>

            </div>
            <div class="field">
                <label>Último día de validación</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true value='${dtl.fe_ultdia_valmem ? dateFormat(dtl.fe_ultdia_valmem) : ""}'"
                            placeholder="Último día de validación">
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Memoria validada (Memorias Tec)</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Memoria validada" value='${dtl.fe_mem_val ? dateFormat(dtl.fe_mem_val) : ""}'>
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Terminación en COTEC</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Terminación en COTEC" value='${dtl.fe_tram_cotec ? dateFormat(dtl.fe_tram_cotec) : ""}'>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="ui bottom attached tab segment" data-tab="tres">
        <div class="two fields">
            <div class="field">
                <label>Último día presentación ofertas</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true value='${dtl.fe_ultdia_ofertas ? dateFormat(dtl.fe_ultdia_ofertas) : ""}'"
                            placeholder="Último día presentación ofertas">
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Recepción de ofertas</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Recepción de ofertas" value='${dtl.fe_recp_ofertas ? dateFormat(dtl.fe_recp_ofertas) : ""}'>
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Aviso a jefes</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Aviso a jefes" value='${dtl.fe_aviso_jefes ? dateFormat(dtl.fe_aviso_jefes) : ""}'>
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Aviso ofertas validadas</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true value='${dtl.fe_aviso_ofertasvalidadas ? dateFormat(dtl.fe_aviso_ofertasvalidadas) : ""}'"
                            placeholder="Aviso ofertas validadas">
                    </div>
                </div>
            </div>
        </div>
        <div class="two fields">
            <div class="field">
                <label>Respuesta de oferta</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Respuesta de oferta" value='${dtl.fe_respuesta_ofertas ? dateFormat(dtl.fe_respuesta_ofertas) : ""}'>
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Último día de validación</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true value='${dtl.fe_ult_diaexpdate ? dateFormat(dtl.fe_ult_diaexpdate) : ""}'"
                            placeholder="Último día de validación">
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Informe de validación</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Informe de validación" value='${dtl.fe_informevalidacion ? dateFormat(dtl.fe_informevalidacion) : ""}'>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="ui bottom attached tab segment" data-tab="cuatro">
        <h5 class="ui header dividing">Fechas control de garantías</h5>
        <div class="two fields">
            <div class="field">
                <label>Inicio Mto/Garantía prevista</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="" tru value='${dtl.fe_inimto_garantia_prevista ? dateFormat(dtl.fe_inimto_garantia_prevista) : ""}'e
                            placeholder="Inicio Mto/Garantía prevista">
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Fin Mto/Garantía prevista</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true value='${dtl.fe_finmto_garantia_prevista ? dateFormat(dtl.fe_finmto_garantia_prevista) : ""}'"
                            placeholder="Fin Mto/Garantía prevista">
                    </div>
                </div>
            </div>
        </div>
        <h5 class="ui header dividing">Fechas control de adjudicación y
            formalización</h5>
        <div class="two fields">
            <div class="field">
                <label>Fecha adjudicación</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Fecha adjudicación" value='${dtl.fe_adjudicacionformalizacion ? dateFormat(dtl.fe_adjudicacionformalizacion) : ""}'>
                    </div>
                </div>
            </div>
            <div class="field">
                <label>Fecha formalización</label>
                <div class="ui calendar">
                    <div class="ui input right icon">
                        <i class="calendar icon"></i>
                        <input type="text" readonly="true" placeholder="Fecha formalización" value='${dtl.fe_formalizacion ? dateFormat(dtl.fe_formalizacion) : ""}'>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="ui bottom attached tab segment" data-tab="cinco">
        <table class="ui selectable celled table" style="width:100%" id="details_datatable2">
        </table>
    </div>


    `;

    document.querySelector(".tabs-detail-container").innerHTML = item;

    setDataTable(null, columns, [], null, [], [0, "desc"], "details_datatable2")

    $('.menu .item').tab();
    // $('.ui .dropdown').dropdown();

    // $('.ui.calendar').calendar({
    //     type: 'date',
    //     formatter: {
    //         date: function (date, settings) {
    //             if (!date) return '';
    //             var day = date.getDate() + '';
    //             if (day.length < 2) {
    //                 day = '0' + day;
    //             }
    //             var month = (date.getMonth() + 1) + '';
    //             if (month.length < 2) {
    //                 month = '0' + month;
    //             }
    //             var year = date.getFullYear();
    //             return year + '/' + month + '/' + day;
    //         }
    //     }
    // })
}


function getDetails() {
    if (detailsList) {
        detailsList.forEach(detail => {
            detail = detail.value.replaceAll("'", '"')
            detail = JSON.parse(detail);
            for (const key in detail) {
                if (Object.hasOwnProperty.call(detail, key)) {
                    if (detail[key] === "null") {
                        detail[key] == "";
                    }
                }
            }
            details.push(detail)
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