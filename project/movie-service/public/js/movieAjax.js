$(document).ready(function() {

    $.ajax({

        url: "http://localhost:9001/movies"

    }).then(function(data, status, jqxhr) {
        $.each(data, function(i){
            $('#movie-showtime').append('<div id="m-' + data[i].id +'" class="movie-list"></div>');
//            if(data[i].name_th.length > 11) {
//                data[i].name_th = data[i].name_th.slice(0, 8) + '...';
//            }if(data[i].name_en.length > 11) {
//                             data[i].name_en = data[i].name_en.slice(0, 8) + '...';
//            }
            $('#m-'+data[i].id).append(`<div class="col s2 m3">
                                                                            <div class="ui card" style="width:150px;" onclick="collect_movie('${data[i].id}')">
                                                                                <div class="image">
                                                                                    <img src=${ data[i].poster } style="width:150px;height:200px;">
                                                                                </div>
                                                                                <div class="content black-text">
                                                                                    <p class="name_en"> ${ data[i].name_en } </p>
                                                                                    <p class="name_th"> ${ data[i].name_th} </p>
                                                                                    <p class="release_date"> ${ data[i].release_date} </p>
                                                                                </div>
                                                                            </div>
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
//               $('.cinema_name').append(data[0].cinema_name_en);

            $('.cinema-showtime').append('<div id="c-' + data[i].id +'" class="cinema-list"></div>');

                        $('#c-'+data[i].id).append(`<div class="col s2 m3">
                                                     <div class="collection">
                                                        <a href="#" class="collection-item" onclick="collect_cinema('${data[i].id}')">${data[i].cinema_name_th}</a>
                                                      </div>

                                                                                    </div>`);

            });
        });
});