$(document).ready(function() {
    var tokenID = localStorage.getItem("tokenID");
        console.log(tokenID);
        if (tokenID !== null) {
            $.ajax({
                "url": "http://localhost:9004/validate/" + tokenID
            }).then(function (data) {
                if (data !== null && data.username !== undefined) {
                    //noinspection JSAnnotator
                    document.getElementById("username").value = data.username;
                    document.getElementById("firstname").value = data.firstname;
                    document.getElementById("lastname").value = data.lastname;
                    document.getElementById("email").value = data.email;
                    document.getElementById("birthday").value = data.birth_date;
                    if(data.noti_status == 'no') {
                        $("#noticheck").removeAttr("checked");
                    }
                    if(data.gender == 'female') {
                        $("#male").removeAttr("checked");
                        $("#female").attr("checked", "checked");
                    }
                    $("#username").prop('disabled', true);

                }
            });
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
                     "url" : "http://localhost:9004/edit?username=" +
                             $("#username").val() + "&firstname=" +
                             $("#firstname").val() + "&lastname=" +
                             $("#lastname").val() + "&gender=" +
                             $('input[name="gender"]:checked').val() + "&birth_date=" +
                             $("#birthday").val() + "&email=" +
                             $("#email").val() + "&noti_status=" +
                             noti
                 }).then(function(data, status, jqxhr){
                     window.location.href = "/";
                 });

    });
});
