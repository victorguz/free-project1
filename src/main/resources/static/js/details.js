let detailsList = document.querySelectorAll(".input-detalles");
let details = [];

let page = 0;
let perPage = 100;
let total = 0;
let columns = [
    { name: "Id", title: "Id", data: "id_detalle_mto" },
    { name: "Estado", title: "Estado", data: "cod_estado_mto" },
    {
        name: "Inicio", title: "Inicio",
        render: function (undefined, filter, data, meta) {
            return dateFormat(data.fe_ini_contrato)
        }
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
        name: "Prorrogable", title: "Prorrogable", data: "chk_prorroga",
        render: function (undefined, filter, data, meta) {
            return data.chk_prorroga == 1 ? "Sí" : "No"
        }
    },
];
let columnDefs = [
    { targets: 0, width: '40px' },
    // { targets: [0, 6, 7, 15], visible: true },
    // { targets: '_all', visible: false }
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
]

$(document).ready(function () {
    if (detailsList) {
        detailsList.forEach(detail => {
            detail = detail.value.replaceAll("'", '"')
            detail = JSON.parse(detail);
            for (const key in detail) {
                if (Object.hasOwnProperty.call(detail, key)) {
                    const element = detail[key];
                    if (element == "null") {
                        detail[key] == null;
                    }
                }
            }
            details.push(detail)
        });

        setDataTable(details, columns, columnDefs, buttons)
    }

    $('.ui.dropdown').dropdown()
    $('.ui.checkbox').checkbox()
    // $('.custom-popup').popup()
});


