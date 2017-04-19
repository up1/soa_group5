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
        console.log(jqxhr);

        });
    });
   });