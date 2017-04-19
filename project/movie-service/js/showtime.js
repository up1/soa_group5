$(document).ready(function() {
    var movie_id = document.getElementById('movie_id').innerHTML;
    var cinema_id = document.getElementById('cinema_id').innerHTML;

    console.log(movie_id);
    console.log();

    if(cinema_id == '[]') {
        $.ajax({

                url: "http://localhost:9003/showfrommovie?movie=" + movie_id

            }).then(function(showtime, status, jqxhr) {

                $.each(showtime, function(i) {

                });

            });
    }



});