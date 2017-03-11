$(document).ready(function() {
    var movie_id = document.getElementById('movie_id').innerHTML;
    console.log(movie_id);
    $.ajax({
        url: "http://localhost:9001/movie?id=" + movie_id
    }).then(function(movie, status, jqxhr) {
       $('#name_th').append(movie.name_th);
       $('#name_en').append(movie.name_en);
       $('#poster').attr('src',movie.poster);
       $('#description').append(movie.description);
       $('#release_date').append("Release date : " + movie.release_date);
       $('#duration').append("Length : " + movie.duration + " นาที");
       $('#trailer').attr('src',movie.trailer);
       $('#cover').attr('src',movie.cover);

    });
});

