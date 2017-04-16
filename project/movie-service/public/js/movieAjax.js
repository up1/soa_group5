$(document).ready(function() {

    $.ajax({

        url: "http://localhost:9001/movies"

    }).then(function(data, status, jqxhr) {
        $.each(data, function(i){
            $('#movie-dropdown').append('<div id="m-' + data[i].id +'" class="column movie-content"></div>');
            $('#m-'+data[i].id).append(`<div class="ui segment card" id="${'mo-'+data[i].id}" onclick="test_select_movie('${data[i].id}');">
                                                                            <img src=${ data[i].poster } height="180px" width="110px"/>
                                                                            <p class="name_en"> ${ data[i].name_en} </p>
                                                                            <p class="name_th"> ${ data[i].name_th} </p>
                                                                            <p class="release_date"> ${ data[i].release_date} </p>
                                                                        </div>`);

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

    $.ajax({

            url: "http://localhost:9002/cinemas"

        }).then(function(data, status, jqxhr) {
            $.each(data, function(i){
            $('#cinema-dropdown').append('<div id="c-' + data[i].id +'" class="column cinema-content"></div>');

                        $('#c-'+data[i].id).append(`<div class="ui segment card" id="${'ci-'+data[i].id}" onclick="test_select_cinema('${data[i].id}');">
                                                        <p class="name_en"> ${ data[i].cinema_name_en}</p>
                                                     </div>`);

            });
        });
});