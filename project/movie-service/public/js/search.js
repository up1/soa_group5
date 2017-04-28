$(document).ready(function() {

    $.ajax({
            url: 'http://localhost:9005/search'
        }).then(function(movie, status, jqxhr) {

           var search = movie.movies;
            $(".ui.search")
                    .search({
                        source  :   search,
                        fields: {
                            image   :   'poster',
                            title   :   'name_en',
                            description :   'name_th',
                            url :   'link'
                        },
                        searchFields    :   [
                            'name_en',
                            'name_th'
                        ],
                        searchFullText: false
                });
        });


});