/**
 * Created by caliver on 4/24/2017 AD.
 */
$(document).ready(function() {
    $(".ui.negative.message").hide();
    $("#login-button").click(function() {
        $.ajax({
            "url" : "http://localhost:9004/login?username=" +
                $("#input-username").val() +
                "&password=" +
                $("#input-password").val()
        }).then(function(data, status, jqxhr){
            localStorage.setItem("tokenID", data.tokenID);
            window.location.href = "/";
        });
    });

    $("#register-button").click(function() {
        var noti;
        if($('input[name="noti"]:checked').val() == 'on') {
            noti = 'yes';
        } else {
            console.log(noti);
            noti = 'no';
        }

        if($("#password").val() != $("#confirmpassword").val()) {
            $(".ui.negative.message").show();
        } else {
            $.ajax({
                        "type" : "POST",
                        "url" : "http://localhost:9004/register?username=" +
                                $("#username").val() + "&password=" +
                                $("#password").val() + "&firstname=" +
                                $("#firstname").val() + "&lastname=" +
                                $("#lastname").val() + "&gender=" +
                                $('input[name="gender"]:checked').val() + "&birth_date=" +
                                $("#birthday").val() + "&email=" +
                                $("#email").val() + "&noti_status=" +
                                noti
                    }).then(function(data, status, jqxhr){
                        window.location.href = '/login';
                    });
        }
    });
});
