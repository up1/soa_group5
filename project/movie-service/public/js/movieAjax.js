$(document).ready(function() {

    $.ajax({

        url: "http://localhost:9001/movies"

    }).then(function(data, status, jqxhr) {
        $.each(data, function(i){
            $('.movie-container').append('<div id="' + data[i].id +'" class="movie_content"></div>');

            $('#'+data[i].id).append(`<div class="col s3 m4">
                                                    <a href="/movie_desc?id=${data[i].id}">
                                                    <div class="card">
                                                        <div class="card-image">
                                                            <img src=${ data[i].poster }>
                                                        </div>
                                                        <div class="card-content black-text">
                                                            <p class="name_en"> ${ data[i].name_en } </p>
                                                            <p class="name_th"> ${ data[i].name_th} </p>
                                                            <p class="release_date"> ${ data[i].release_date} </p>
                                                        </div>
                                                        <div class="card-action">
                                                            <a href="#">เช็ครอบหนัง</a>
                                                        </div>
                                                    </div>
                                                    </a>
                                                </div>`);
        });

        console.log(jqxhr);

    });

});