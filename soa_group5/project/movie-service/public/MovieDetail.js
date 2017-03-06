$(document).ready(function() {
    $.ajax({
        url: "http://localhost:9001/movie?id=" + id
    }).then(function(movie) {
       $('.id').append(movie.id);
       $('.name_th').append(movie.name_th);
       $('.name_en').append(movie.name_en);
       $('#poster').attr('src',movie.poster);
       $('.description').append(movie.description);
       $('.release_date').append(movie.release_date);
       $('.duration').append(movie.duration);
       $('#trailer').attr('src',movie.trailer);
       $('#cover').attr('src',movie.cover);

    });
});

