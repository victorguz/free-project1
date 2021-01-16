const urlAll = document.querySelector(".all-url").value;
const urlTotal = document.querySelector(".total-url").value;
// const urlSearch = document.querySelector(".all-url").value;
const urlDetails = document.querySelector(".details-url").value;
let total;
let page = 1;
const perPage = 10000;
const pageLength = 5;
const columns = [
    { name: "Id", title: "Id", data: "id" },
    {
        name: "Estado", title: "Estado",
        render: function (undefined, filter, data, meta) {
            const detail = getLastDetail(data.detalles);
            return detail && detail.estado && detail.estado.des_estado ? detail.estado.des_estado : "";
        }
    },
    { name: "Contrato", title: "Contrato", data: "cod_contrato" },
    { name: "Expediente", title: "Expediente", data: "cod_expediente" },
    { name: "Descripción", title: "Descripción", data: "txt_descripcion" },
    {
        name: "Unidad de seguimiento y ejec Cxto", title: "Unidad de seguimiento y ejec Cxto",
        data: "txt_descripcion",
        render: function (undefined, filter, data, meta) {
            return data.unidad_solicitante_aux && data.unidad_solicitante_aux ? data.unidad_solicitante_aux : ""
        }
    },
    {
        name: "Tipo", title: "Tipo",
        render: function (undefined, filter, data, meta) {
            return data.tipo && data.tipo.des_tipo_mto ? data.tipo.des_tipo_mto : ""
        }
    },
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
            let date = timeValueAndUnit(data.fe_fin_prorroga);
            return date && date.unit == "year" && date.value > 0 ? date.value : 0;
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
            return data.procedimiento && data.procedimiento.des_proc_adj ? data.procedimiento.des_proc_adj : "";
        }
    },
    {
        name: "Acciones",
        title: "Acciones",
        render: function (undefined, filter, data, meta) {
            return `
            <a href="${getUrl(urlDetails, { id: data.id })}" class="ui button icon">
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
const columnDefs = [
    // { targets: [4], width: '200px' },
    { targets: [4, 13], className: "td-width" },
    { targets: [0, 18], className: "td-width-fixed" },
    { targets: [13, 14, 15, 16], visible: false },
    { targets: [18], sortable: false }
]

const fixedColumns = {
    leftColumns: 1,
    rightColumns: 1
}

let datatable = null;

$(document).ready(function () {
    $.ajax({
        url: getUrl(urlTotal),
        success: function (data) {
            total = data
        }
    });
    load();

    let loadMoreButton = document.querySelector("[loadMoreButton]");
    loadMoreButton.addEventListener("click", function (e) {
        e.preventDefault();
        page++;
        if (((page + 1) * perPage) < total || datatable.rows().count() < total) {
            load()
        } else {
            loadMoreButton.textContent = "No hay mas registros";
            loadMoreButton.setAttribute("disabled", true)
        }


    })

    $('.ui.dropdown').dropdown()
    $('.ui.checkbox').checkbox()
    $("[data-content]").popup()
});

const createdRow = function (row, data, dataIndex) {
    const vencimiento = timeValueAndUnit(data[11])
    const prorroga = timeValueAndUnit(data[16])
    console.log(data[0], data[11], data[16], vencimiento, prorroga)
    if ((vencimiento && vencimiento.unit == "month" && vencimiento.value > 0 && vencimiento.value < 8)
        || (prorroga && prorroga.unit == "month" && prorroga.value > 0 && prorroga.value < 4)) {
        row.classList.add("yellow-row")
    } else if (data[1] == "En vigor") {
        row.classList.add("green-row")
    } else if (data[1] == "Caducado") {
        row.classList.add("red-row")
    }
}
function load() {

    if (!datatable) {
        datatable = setDataTable(null, null, columnDefs,
            buttons, [0, "desc"], "datatable", fixedColumns, pageLength, createdRow)
    } else {
        $.ajax({
            url: getUrl(urlAll, { page: page, perPage: perPage }),
            success: function (data) {
                data.forEach(element => {
                    datatable.row.add(element).draw()
                });
            }
        });
    }
}

function getLastDetail(details) {
    let lastId = 0;
    let detail = null;
    details.forEach(detalle => {
        if (detalle.id_detalle_mto >= lastId) {
            lastId = detalle.id_detalle_mto;
            detail = detalle
        }
    });
    return detail
}
