const urlAll = document.querySelector(".all-url").value;
const urlDetails = document.querySelector(".details-url").value;
let page = 0;
let perPage = 100;
let total = 0;
let columns = [
    // {
    //     title: "#",
    //     render: function (undefined, filter, data, meta) {
    //         return meta.row;
    //     }
    // },
    { name: "Id", title: "Id", data: "id_mantenimiento" },
    { name: "Tipo", title: "Tipo", data: "cod_tipo_mto" },
    { name: "Dpto", title: "Dpto", data: "cod_departamento" },
    { name: "Unidad", title: "Unidad", data: "cod_unidad" },
    { name: "Expediente", title: "Expediente", data: "cod_expediente" },
    { name: "Contrato", title: "Contrato", data: "cod_contrato" },
    { name: "Descripción", title: "Descripción", data: "txt_descripcion" },
    { name: "Observaciones", title: "Observaciones", data: "txt_observaciones" },
    { name: "Palabra clave", title: "Palabra clave", data: "palabra_clave" },
    { name: "Estado activo", title: "Estado activo", data: "chk_activo" },
    { name: "Importe", title: "Importe", data: "num_importe" },
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
                // meta.settings.setAttribute("data-content", data.fe_fin_prorroga)
            }
            return date;
        }
    },
    {
        name: "Estado prorroga",
        title: "Estado prorroga",
        data: "chk_prorroga"
    },
    {
        name: "Acciones",
        title: "Acciones",
        render: function (undefined, filter, data, meta) {
            return `<a class="ui button icon" href="${getUrl(urlDetails, { id: data.id_mantenimiento })}">
                        <i class="ui icon eye"></i>
                    </a>`;
        }
    }
];
let columnDefs = [
    { targets: 0, width: '40px' },
    { targets: [0, 6, 7, 15], visible: true },
    { targets: '_all', visible: false }
]

// <a class="ui button icon" th:href="@{/details(id=${item.id_mantenimiento})}">
//     <i class="ui icon eye"></i>
// </a>
$(document).ready(function () {

    $.ajax({
        url: getUrl(urlAll, { page: page, perPage: perPage }),
        success: function (data) {
            console.log(data);
            setDataTable(data, columns, columnDefs)
        }
    });

    $('.ui.dropdown').dropdown()
    $('.ui.checkbox').checkbox()
    // $('.custom-popup').popup()
});


