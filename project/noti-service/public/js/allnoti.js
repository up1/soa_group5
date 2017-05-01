$(document).ready(function () {
    $.getJSON("http://localhost:9006/notification",
    function (json) {
        var tr;
        for (var i = 0; i < json.length; i++) {
            tr = $('<tr/>');
            tr.append("<td>" + json[i].username + "</td>");
            tr.append("<td>" + json[i].movie_id + "</td>");
            $("#table").append(tr);
        }
    });
});