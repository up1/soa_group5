/**
 * Created by caliver on 4/24/2017 AD.
 */
$(document).ready(function() {
    $("#login-button").click(function() {
        $.ajax({
            "url" : "http://localhost:9004/login?username=" +
                $("#input-username").val() +
                "&password=" +
                $("#input-password").val()
        }).then(function(data, status, jqxhr){
            localStorage.setItem("tokenID", data.tokenID);
            window.location.href = "/";
            console.log(jqxhr);
        });
    })
});

