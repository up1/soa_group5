/**
 * Created by caliver on 4/24/2017 AD.
 */
$(document).ready(function() {
    $("#login-button").click(function() {
        $.ajax(
            console.log($("#input-username").value),
            {
            "url" : "http://localhost:9004/login?username=" +
                    $("#input-username").val() +
                    "&password=" +
                    $("#input-password").val()
        }).then(function(data, status, jqxhr){
            console.log(jqxhr);
        });
    })
});