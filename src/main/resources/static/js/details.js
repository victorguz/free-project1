let detailsList = document.querySelectorAll(".input-detalles");
let details = [];

let page = 0;
let perPage = 100;
let total = 0;
const columns = [
    { name: "Id", title: "Id", data: "id_detalle_mto" },
    { name: "Estado", title: "Estado", data: "estado" },
    {
        name: "Inicio", title: "Inicio",
        render: function (undefined, filter, data, meta) { return dateFormat(data.fe_ini_contrato) }
    },
    {
        name: "Fin", title: "Fin",
        render: function (undefined, filter, data, meta) {
            return dateFormat(data.fe_fin_contrato)
        }
    },
    { name: "Expediente", title: "Expediente", data: "cod_expediente" },
    { name: "Contrato", title: "Contrato", data: "cod_contrato" },
    { name: "Adjudicado", title: "Adjudicado", data: "des_empresa" },
    {
        name: "Prorrogable", title: "Prorrogable",
        render: function (undefined, filter, data, meta) {
            return data.chk_prorroga == 1 ? "Sí" : "No"
        }
    },
    {
        name: "Inicio prorroga", title: "Inicio prorroga",
        render: function (undefined, filter, data, meta) {
            return dateFormat(data.fe_ini_prorroga)
        }
    },
    {
        name: "Fin prorroga", title: "Fin prorroga",
        render: function (undefined, filter, data, meta) {
            return dateFormat(data.fe_fin_prorroga)
        }
    },
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
    { targets: [0, 1, 2, 3, 4, 5, 6, 7], visible: true },
    { targets: 1, orderable: false },
    { targets: '_all', visible: false }
]
const buttons = [
    {
        text: 'Columnas',
        extend: 'colvis',
    },
    {
        text: '<i class="print icon"></i>Impr. PDF',
        extend: 'print',
        exportOptions: {
            columns: ':visible'
        }
    },
    {
        text: '<i class="file excel outline icon"></i>Excel',
        extend: 'excelHtml5',
        exportOptions: {
            columns: ':visible'
        }
    },

    {
        text: '<i class="file excel icon"></i>Crystal',
        extend: 'excelHtml5',
        exportOptions: {
            columns: [1, 6, 5, 4, 8, 9, 7]
        }
    },
]
const order = [[1, "desc"]]

const rowFunction = function (data) {
    setModalDetailsData(data);
    $(".modal-details").modal("show");
}
const createdRow = function (row, data, dataIndex) {
    row.addEventListener("dblclick", function (e) {
        e.preventDefault();
        rowFunction(data)
    })
}

$(document).ready(function () {
    if (detailsList) {
        detailsList.forEach(detail => {
            detail = detail.value.replaceAll("'", '"')
            detail = JSON.parse(detail);
            for (const key in detail) {
                if (Object.hasOwnProperty.call(detail, key)) {
                    if (detail[key] === "null") {
                        detail[key] == null;
                    }
                }
            }
            details.push(detail)
        });

        setDataTable(details, columns, columnDefs, buttons, order, "details_datatable", null, 10, createdRow)
        setDataTable([], columns, [], null, [], [0, "desc"], "details_datatable2")
    }

    $('.ui.dropdown').dropdown()
    $('.ui.checkbox').checkbox()
    $('.menu .item').tab();
    setMethods()
});


function setMethods() {
    $("[button-save-mnt]").click(function () {
        $("[modal-mnt]").modal("show")
    })

}

function setModalDetailsData(data) {

    console.log(data)
}


