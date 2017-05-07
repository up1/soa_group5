$(document).ready(function() {
    var tokenID = localStorage.getItem("tokenID");
        if (tokenID !== null) {
            $.ajax({
                "url": "http://128.199.122.153:9004/validate/" + tokenID
            }).then(function (data) {
                if (data !== null && data.username !== undefined) {
                    //noinspection JSAnnotator
                    $.ajax({
                        "url": "http://128.199.122.153:9004/user/" + data.username
                    }).then(function(response) {
                        document.getElementById("username").value = response.username;
                        document.getElementById("firstname").value = response.firstname;
                        document.getElementById("lastname").value = response.lastname;
                        document.getElementById("email").value = response.email;
                        document.getElementById("birthday").value = response.birth_date;
                        if (response.noti_status === 'no') {
                            $("#noticheck").removeAttr("checked");
                        }
                        if (response.gender === 'female') {
                            $("#male").removeAttr("checked");
                            $("#female").attr("checked", "checked");
                        }
                        $("#username").prop('disabled', true);
                    });
                }
            });
        } else {
            window.location.href = "/";
        }

    $("#update-button").click(function() {
        var noti;
        if($('input[name="noti"]:checked').val() == 'on') {
            noti = 'yes';
        } else {
            noti = 'no';
        }
         $.ajax({
                     "type" : "PUT",
                     "url" : "http://128.199.122.153:9004/edit?username=" +
                             $("#username").val() + "&firstname=" +
                             $("#firstname").val() + "&lastname=" +
                             $("#lastname").val() + "&gender=" +
                             $('input[name="gender"]:checked').val() + "&birth_date=" +
                             $("#birthday").val() + "&email=" +
                             $("#email").val() + "&noti_status=" +
                             noti
                 }).then(function(data, status, jqxhr){
                     window.location.href = "/edit";
                 });

    });
});
