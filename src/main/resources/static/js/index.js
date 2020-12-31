$(document).ready(function () {
    $('.ui.dropdown').dropdown()
    $('.ui.checkbox').checkbox()

    $('#datatable tfoot th').each(function () {
        var title = $(this).text();
        if (!title.includes("Acciones")) {
            $(this).addClass("ui form field");
            $(this).html('<input type="text" placeholder="' + title + '" class="input-' + title + '"/>');
        }
    });

    var table = $('#datatable').DataTable({
        lengthChange: false,
        buttons: ['copy', 'excel', 'pdf', 'colvis'],
        initComplete: function () {
            // Apply the search
            this.api().columns().every(function () {
                var that = this;

                $('input', this.footer()).on('keyup change clear input', function () {
                    if (that.search() !== this.value) {
                        if (this.value) {
                            that.search('^' + this.value + '$', true, true).draw();
                        } else {
                            that.search(this.value).draw();
                        }
                    }
                });
            });
        },
        "columnDefs": [
            {
                width: '40px',
                targets: [0],


            },
            {
                targets: [1],
                visible: false,

            },
            {
                targets: [2],
                visible: false,

            },
            {
                targets: [3],
                visible: false,

            },
            {
                targets: [7],
                visible: false,

            },
            {
                targets: [8],
                visible: false,

            },
            {
                targets: [9],
                // visible: false,
                searchable: false
            }
        ],

    });

    table.buttons().container()
        .appendTo($('div.eight.column:eq(0)', table.table().container()));
    function searchOnColumn(column, value) {
        if (value != null && value != undefined && value != -1) {
            table.columns(column).search(`^${value}$`, true, false).draw()
        } else {
            table.columns(column).search("").draw()
        }
    }

    $(".column_filter select").on('change', function () {
        console.log($(this).attr("data-column"), $(this).val())
        searchOnColumn($(this).attr("data-column"), $(this).val())
    })

    $(".hidden.column_filter").on('change click', function () {
        console.log($(this).attr("data-column"), $(this).val())
        searchOnColumn($(this).attr("data-column"), $(this).val())
    })

});
