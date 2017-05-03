$(document).ready(function() {
    var tokenID = localStorage.getItem("tokenID");
    if (tokenID !== null) {
        $.ajax({
            "url": "http://139.59.227.188:9004/validate/" + tokenID
        }).then(function (data) {
            if (data !== null && data.username !== undefined) {
                $.ajax({
                            url: 'http://139.59.227.188:9004/likes/',
                            "type": "GET",
                            "data:" : data.username
                        }).then(function(movie, status, jqxhr) {
                            console.log(movie[i].id);
                           if(movie[i].id == document.getElementById('movie_id').innerHTML) {
                                $("#favbutton").attr("onclick","unlike_movie();");
                                return ;
                           }
                           $("#favbutton").attr("onclick","like_movie();");
                        });
            }
        });
    }
});