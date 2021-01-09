const urlAll = document.querySelector(".all-url").value;
// const urlSearch = document.querySelector(".all-url").value;
const urlDetails = document.querySelector(".details-url").value;
let page = 0;
let perPage = 100;
let total = 0;
const columns = [
    { name: "Id", title: "Id", data: "id_mantenimiento" },
    {
        name: "Chk Activo", title: "Chk Activo",
        render: function (undefined, filter, data, meta) {
            return data.chk_activo ? "Si" : "No"
        }
    },
    { name: "Contrato", title: "Contrato", data: "cod_contrato" },
    { name: "Expediente", title: "Expediente", data: "cod_expediente" },
    { name: "Descripción", title: "Descripción", data: "txt_descripcion", width: '200px' },
    { name: "Tipo", title: "Tipo", data: "tipo.des_tipo_mto" },
    {
        name: "Dpto", title: "Dpto",
        render: function (undefined, filter, data, meta) {
            return data.unidad && data.unidad.departamento ? data.unidad.departamento : ""
        }
    },
    {
        name: "Unidad", title: "Unidad",
        render: function (undefined, filter, data, meta) {
            return data.unidad && data.unidad.unidad ? data.unidad.unidad : ""
        }
    },
    {
        name: "Importe", title: "Importe",
        render: function (undefined, filter, data, meta) {
            return moneyFormat(data.num_importe)
            // return data.num_importe
        }
    },
    {
        name: "Inicio Mnt.",
        title: "Inicio Mnt.",
        render: function (undefined, filter, data, meta) {
            return dateFormat(data.fe_ini_contrato)
        }
    },
    {
        name: "Fin Mnt.",
        title: "Fin Mnt.",
        render: function (undefined, filter, data, meta) {
            return dateFormat(data.fe_fin_contrato)
        }
    },
    {
        name: "Años prorroga",
        title: "Años prorroga",
        render: function (undefined, filter, data, meta) {
            let date = timeAgo(data.fe_fin_prorroga);
            if (date) {
                date = (date.includes("hace") ? "Vencido " : "Vence ") + date;
            }
            return date ? date : 0;
        }
    },
    { name: "Observaciones", title: "Observaciones", data: "txt_observaciones" },
    { name: "Palabra clave", title: "Palabra clave", data: "palabra_clave" },
    {
        name: "Prorrogable",
        title: "Prorrogable",
        render: function (undefined, filter, data, meta) {
            return data.chk_prorroga ? "Si" : "No";
        }
    },
    {
        name: "Procedimiento",
        title: "Procedimiento",
        render: function (undefined, filter, data, meta) {
            return data.procedimiento && data.procedimiento.des_procedencia ? data.procedimiento.des_procedencia : "";
        }
    },
    {
        name: "Acciones",
        title: "Acciones",
        render: function (undefined, filter, data, meta) {
            return `
            <a href="${getUrl(urlDetails, { id: data.id_mantenimiento })}" class="ui button icon">
                <i class="ui icon eye"></i>
            </a>`;
        }
    },
];

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
const columnDefs = [
    // { targets: [4], width: '200px' },
    { targets: [4], className: "td-width" },
    { targets: [12, 13, 14, 15], visible: false },
    { targets: [16], sortable: false }
]

const fixedColumns = {
    leftColumns: 1,
    rightColumns: 1
}

let datatable = null;

$(document).ready(function () {

    load();

    $("[select-quantity]").on('change', function () {
        // page++;
        perPage = $(this).val();
        console.log(page, perPage)
        load()
    })


    $('.ui.dropdown').dropdown()
    $('.ui.checkbox').checkbox()
    $("[data-content]").popup()
});

const rowFunction = function (data) {
    // console.log(data)
    // window.location.href = getUrl(urlDetails, { id: data.id_mantenimiento })
}

function load() {
    $.ajax({
        url: getUrl(urlAll, { page: page, perPage: perPage }),
        success: function (data) {
            if (!datatable) {
                datatable = setDataTable(data, columns, columnDefs, rowFunction, buttons, [0, "desc"], "datatable", fixedColumns)
            }
        }
    });
}


