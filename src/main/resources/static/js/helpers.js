
let table;
function setDataTable(data, columns, columnDefs, actionWithRow = null,
    buttons = [], order = [], elementId = "datatable", fixedColumns = null, pageLength = 5) {
    table = $('#' + elementId).DataTable({
        processing: true,
        data: data,
        columns: columns,
        columnDefs: columnDefs,
        lengthChange: false,
        buttons: buttons,
        pageLength: pageLength,
        scrollY: true,
        scrollX: true,
        order: order,
        fixedColumns: fixedColumns
    });


    if (typeof actionWithRow === 'function') {
        $('#' + elementId + ' tbody').on('dblclick', 'tr', function (e) {
            e.preventDefault();
            actionWithRow(table.row(this).data())
        });
    }

    //Ocultar barra de busqueda por defecto
    $("#datatable_filter").hide()

    //Poner los botones encima de la tabla
    table.buttons().container().appendTo($('div.eight.column:eq(0)', table.table().container()));

    /**
     * Busca en las columnas de la tabla si se entrega una columna
     * @param {*} column 
     * @param {*} value 
     */
    function searchOnColumn(column, value) {
        if (column != null && column != undefined && column != -1 && column != "") {
            if (value != null && value != undefined && value != -1 && value != "") {
                table.columns(column).search(`^${value}$`, true, false).draw()
            } else {
                table.columns(column).search("").draw()
            }
        } else {
            if (value != null && value != undefined && value != -1 && value != "") {
                table.search(value, true, true).draw()
            } else {
                table.search("").draw()
            }
        }
    }

    //Los elementos con el parámetro data-column son quienes realizan búsquedas
    $("[data-column]").on('change click', function () {
        searchOnColumn($(this).attr("data-column"), $(this).val())
    })
    $("input .column_filter").on('keyup clear', function (e) {
        if (e.key === 'Enter' || e.keyCode === 13) {
            searchOnColumn($(this).attr("data-column"), $(this).val())
            // Do something
        }
    })

    return table;
}


/**
 * postRequest
 * 
 * Realiza una petición AJAX POST (JQuery.ajax) y devuelve el objeto jqXHR
 * que es un objeto Deferred, por lo que tiene los métodos:
 * done(data, textStatus, jqXHR),
 * fail(jqXHR, textStatus, errorThrown) y
 * always(data|jqXHR, textStatus, jqXHR|errorThrown)
 * 
 * @param {string} url URL que se consultará
 * @param {FormData|Object} [data] Información enviada
 * @param {Object} [headers] Cabeceras
 * @returns {jqXHR}
 */
function postRequest(url, data, headers = {}) {

    let options = {
        url: url,
        method: 'POST',
    }

    if (data instanceof FormData) {

        options.processData = false
        options.enctype = "multipart/form-data"
        options.contentType = false
        options.cache = false
        options.data = data

    } else if (typeof data == 'object') {

        options.data = data

    }

    let parsedHeaders = parseHeaders(headers)

    if (parsedHeaders.size > 0) {

        options.beforeSend = function (request) {

            for (let key of parsedHeaders.keys()) {
                let value = parsedHeaders.get(key)
                request.setRequestHeader(key, value)
            }

        }

    }

    function parseHeaders(headers = {}) {

        let mapHeaders = new Map()

        if (typeof headers == 'object') {

            for (let name in headers) {

                let value = headers[name]
                let valueString = ''

                if (Array.isArray(value)) {

                    let length = value.length
                    let lastIndexValue = 0

                    if (length == 1) {
                        lastIndexValue = 0
                    } else if (length > 1) {
                        lastIndexValue = length - 1
                    }

                    for (let i = 0; i < length; i++) {
                        if (i == lastIndexValue) {
                            valueString += value[i]
                        } else {
                            valueString += value[i] + "\r\n"
                        }
                    }

                } else if (typeof value == 'string') {
                    valueString = value
                }

                mapHeaders.set(name, valueString)

            }

        }

        mapHeaders.set('X-Requested-With', 'XMLHttpRequest')

        return mapHeaders

    }

    return this.$.ajax(options)

}

/**
 * getRequest
 * 
 * Realiza una petición AJAX GET (JQuery.ajax) y devuelve el objeto jqXHR
 * que es un objeto Deferred, por lo que tiene los métodos:
 * done(data, textStatus, jqXHR),
 * fail(jqXHR, textStatus, errorThrown) y
 * always(data|jqXHR, textStatus, jqXHR|errorThrown)
 * 
 * @param {String} url URL que se consultará
 * @param {String|HTMLElement|JQuery} [data] Formulario
 * @param {Object} [headers] Cabeceras
 * @returns {jqXHR}
 */
function getRequest(url, data, headers = {}) {

    let options = {
        url: url,
        method: 'GET',
        enctype: "application/x-www-form-urlencoded",
    }

    if (data instanceof HTMLFormElement) {

        options.data = $(data).serialize()

    } else if (data instanceof $) {

        options.data = data.serialize()

    } else if (typeof data == 'string') {

        options.data = data

    }

    let parsedHeaders = parseHeaders(headers)

    if (parsedHeaders.size > 0) {

        options.beforeSend = function (request) {

            for (let key of parsedHeaders.keys()) {
                let value = parsedHeaders.get(key)
                request.setRequestHeader(key, value)
            }

        }

    }

    function parseHeaders(headers = {}) {

        let mapHeaders = new Map()

        if (typeof headers == 'object') {

            for (let name in headers) {

                let value = headers[name]
                let valueString = ''

                if (Array.isArray(value)) {

                    let length = value.length
                    let lastIndexValue = 0

                    if (length == 1) {
                        lastIndexValue = 0
                    } else if (length > 1) {
                        lastIndexValue = length - 1
                    }

                    for (let i = 0; i < length; i++) {
                        if (i == lastIndexValue) {
                            valueString += value[i]
                        } else {
                            valueString += value[i] + "\r\n"
                        }
                    }

                } else if (typeof value == 'string') {
                    valueString = value
                }

                mapHeaders.set(name, valueString)

            }

        }

        mapHeaders.set('X-Requested-With', 'XMLHttpRequest')

        return mapHeaders

    }

    return this.$.ajax(options)

}

function dateFormat(string) {
    string = string == "null" ? null : string;
    if (string) {
        let date = new Date(Date.parse(string));
        return date.getFullYear() + "/" + (date.getMonth() < 10 ? '0' : '') + date.getMonth() + "/" + (date.getDate() < 10 ? '0' : '') + date.getDate()
    }
    return string;
}

function moneyFormat(number) {
    if (number) {
        let formatter = new Intl.NumberFormat('es-CO', {
            style: 'currency',
            currency: 'COP',

            // These options are needed to round to whole numbers if that's what you want.
            //minimumFractionDigits: 0, // (this suffices for whole numbers, but will print 2500.10 as $2,500.1)
            //maximumFractionDigits: 0, // (causes 2500.99 to be printed as $2,501)
        });

        return formatter.format(number); /* $2,500.00 */
    }
    return number;
}

/**
 * This function returns date on "time ago" format
 */
function timeAgo(date) {
    if (date) {

        if (typeof date == "string") {
            date = new Date(date);
        }

        const DATE_UNITS = {
            year: 31536000,
            month: 2629800,
            day: 86400,
            hour: 3600,
            minute: 60,
            second: 1
        }

        const isMayor = timestamp => timestamp > Date.now()
        const getSecondsDiff = timestamp => (Date.now() - timestamp) / 1000

        const getUnitAndValueDate = (secondsElapsed) => {

            secondsElapsed = Math.abs(secondsElapsed);

            for (const [unit, secondsInUnit] of Object.entries(DATE_UNITS)) {

                if (secondsElapsed >= secondsInUnit || unit === "second") {

                    const mayor = isMayor(date)

                    const value = Math.floor(secondsElapsed / secondsInUnit) * (mayor ? 1 : -1)


                    return { value, unit }
                }

            }

        }

        const rtf = new Intl.RelativeTimeFormat("es")

        const secondsElapsed = getSecondsDiff(date)
        const { value, unit } = getUnitAndValueDate(secondsElapsed)
        return rtf.format(value, unit)
    }
    return date;
}

function getUrl(url, getData) {
    const base = document.querySelector("base").href;
    let completeUrl = "";
    let dataUrl = "";


    for (const key in getData) {
        if (Object.hasOwnProperty.call(getData, key)) {
            const element = getData[key];
            dataUrl += (dataUrl ? "&" : "?") + key + "=" + element;
        }
    }



    if (base[base.length - 1] == "/" && url[0] == "/") {
        completeUrl = base + url.substring(1) + dataUrl
    } else {
        completeUrl = base + url + dataUrl
    }

    return completeUrl;
}