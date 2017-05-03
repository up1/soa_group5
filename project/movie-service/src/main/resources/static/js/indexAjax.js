$(document).ready(function() {

    $.ajax({

        url: "http://localhost:9001/movies"

    }).then(function(data, status, jqxhr) {
        $.each(data, function(i){
             $('#movie-container').append('<div id="' + data[i].id +'" class="movie-content column"></div>');

            $('#'+data[i].id).append(`
                                                <div class="ui segment card">

                                                        <a href="/movie_desc?id=${data[i].id}" class="image">
                                                            <img src=${ data[i].poster }>
                                                        </a>
                                                            <p class="name_en"> ${ data[i].name_en } </p>
                                                            <p class="name_th"> ${ data[i].name_th} </p>
                                                            <p class="release_date"> ${ data[i].release_date} </p>
                                                            <button class="ui button"> เช็ครอบหนัง </button>
                                                </div>`);
        });

        console.log(jqxhr);

    });
});