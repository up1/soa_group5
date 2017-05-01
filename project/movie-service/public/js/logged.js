/**
 * Created by caliver on 4/28/2017 AD.
 */
$(document).ready(function () {
    var tokenID = localStorage.getItem("tokenID");
    if (tokenID !== null) {
        $.ajax({
            "url": "http://localhost:9004/validate/" + tokenID
        }).then(function (data, status, jqxhr) {
            if (data !== null) {
                //noinspection JSAnnotator
                $('#to-login-contianer').html(
                    `<a id="to-user" class="ui item" href="/user/` + data.username + `">
                    Welcome, ` + data.username + `:) </a>`);
                $('#to-regis-container').html(
                    `<a id="logout" class="ui item">
                    Logout </a>`);
            }
        });
    }
});

$(document).ready(function(){
    $("#logout").click(function() {
        $.ajax({
            "url": "http;//localhost:9004/logout/" + localStorage.getItem("tokenID")
        }).then(function (data, status, jqxhr) {
            localStorage.removeItem("tokenID");
            window.location.href = window.location.pathname;
        });
    });
});
