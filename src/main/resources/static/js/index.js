const urlAll = document.querySelector(".all-url").value;
const urlTotal = document.querySelector(".total-url").value;
// const urlSearch = document.querySelector(".all-url").value;
const urlDetails = document.querySelector(".details-url").value;
let total;
let page = 1;
const perPage = 10000;
const pageLength = 5;

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
            columns: [1, 18, 2, 3, 16, 17, 15]
        }
    },

]
const columnDefs = [
    // { targets: [4], width: '200px' },
    { targets: [4, 13], className: "td-width" },
    { targets: [0, 18], className: "td-width-fixed" },
    { targets: [13, 14, 15, 16, 17, 18], visible: false },
    { targets: [19], sortable: false }
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
    loadIndex();
    setMethodsIndex();


    $('.ui.dropdown').dropdown()
    $('.ui.checkbox').checkbox()
    $("[data-content]").popup()
});

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
function loadIndex() {

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
function setMethodsIndex() {
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
