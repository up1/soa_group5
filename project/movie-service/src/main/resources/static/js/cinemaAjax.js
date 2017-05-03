$(document).ready(function() {
    $.ajax({

                     url: "http://139.59.227.188:9002/cinemas/major/bkk"

                 }).then(function(data, status, jqxhr) {
                     $('#major-bkk').append(`<div class="ui five column grid" id="major-bkk-dropdown"></div>`);
                     $.each(data, function(i){
                        $('#major-bkk-dropdown').append('<div id="c-' + data[i].id +'" class="column cinema-content"></div>');
                        $('#c-'+data[i].id).append(`<div class="ui segment card" id="${'ci-'+data[i].id}" onclick="test_select_cinema('${data[i].id}');">
                                                       <p class="name_en"> ${ data[i].cinema_name_en}</p>
                                                    </div>`);
                     });
                 });

    $.ajax({

                          url: "http://139.59.227.188:9002/cinemas/major/cen"

                      }).then(function(data, status, jqxhr) {
                          $('#major-cen').append(`<div class="ui five column grid" id="major-center-dropdown"></div>`);
                          $.each(data, function(i){
                             $('#major-center-dropdown').append('<div id="c-' + data[i].id +'" class="column cinema-content"></div>');
                             $('#c-'+data[i].id).append(`<div class="ui segment card" id="${'ci-'+data[i].id}" onclick="test_select_cinema('${data[i].id}');">
                                                            <p class="name_en"> ${ data[i].cinema_name_en}</p>
                                                         </div>`);
                          });
                      });

    $.ajax({

                                   url: "http://139.59.227.188:9002/cinemas/major/east"

                               }).then(function(data, status, jqxhr) {
                                   $('#major-eas').append(`<div class="ui five column grid" id="major-eas-dropdown"></div>`);
                                   $.each(data, function(i){
                                      $('#major-eas-dropdown').append('<div id="c-' + data[i].id +'" class="column cinema-content"></div>');
                                      $('#c-'+data[i].id).append(`<div class="ui segment card" id="${'ci-'+data[i].id}" onclick="test_select_cinema('${data[i].id}');">
                                                                     <p class="name_en"> ${ data[i].cinema_name_en}</p>
                                                                  </div>`);
                                   });
                               });

     $.ajax({

                                        url: "http://139.59.227.188:9002/cinemas/major/north"

                                    }).then(function(data, status, jqxhr) {
                                        $('#major-nor').append(`<div class="ui five column grid" id="major-nor-dropdown"></div>`);
                                        $.each(data, function(i){
                                           $('#major-nor-dropdown').append('<div id="c-' + data[i].id +'" class="column cinema-content"></div>');
                                           $('#c-'+data[i].id).append(`<div class="ui segment card" id="${'ci-'+data[i].id}" onclick="test_select_cinema('${data[i].id}');">
                                                                          <p class="name_en"> ${ data[i].cinema_name_en}</p>
                                                                       </div>`);
                                        });
                                    });

    $.ajax({

                                            url: "http://139.59.227.188:9002/cinemas/major/northeast"

                                        }).then(function(data, status, jqxhr) {
                                            $('#major-esn').append(`<div class="ui five column grid" id="major-esn-dropdown"></div>`);
                                            $.each(data, function(i){
                                               $('#major-esn-dropdown').append('<div id="c-' + data[i].id +'" class="column cinema-content"></div>');
                                               $('#c-'+data[i].id).append(`<div class="ui segment card" id="${'ci-'+data[i].id}" onclick="test_select_cinema('${data[i].id}');">
                                                                              <p class="name_en"> ${ data[i].cinema_name_en}</p>
                                                                           </div>`);
                                            });
                                        });

    $.ajax({

                                                url: "http://139.59.227.188:9002/cinemas/major/south"

                                            }).then(function(data, status, jqxhr) {
                                                $('#major-sou').append(`<div class="ui five column grid" id="major-sou-dropdown"></div>`);
                                                $.each(data, function(i){
                                                   $('#major-sou-dropdown').append('<div id="c-' + data[i].id +'" class="column cinema-content"></div>');
                                                   $('#c-'+data[i].id).append(`<div class="ui segment card" id="${'ci-'+data[i].id}" onclick="test_select_cinema('${data[i].id}');">
                                                                                  <p class="name_en"> ${ data[i].cinema_name_en}</p>
                                                                               </div>`);
                                                });
                                            });
    $.ajax({

                                                    url: "http://139.59.227.188:9002/cinemas/major/west"

                                                }).then(function(data, status, jqxhr) {
                                                    $('#major-wes').append(`<div class="ui five column grid" id="major-wes-dropdown"></div>`);
                                                    $.each(data, function(i){
                                                       $('#major-wes-dropdown').append('<div id="c-' + data[i].id +'" class="column cinema-content"></div>');
                                                       $('#c-'+data[i].id).append(`<div class="ui segment card" id="${'ci-'+data[i].id}" onclick="test_select_cinema('${data[i].id}');">
                                                                                      <p class="name_en"> ${ data[i].cinema_name_en}</p>
                                                                                   </div>`);
                                                    });
                                                });


    $.ajax({

                         url: "http://139.59.227.188:9002/cinemas/sf/bkk"

                     }).then(function(data, status, jqxhr) {
                         $('#sf-bkk').append(`<div class="ui five column grid" id="sf-bkk-dropdown"></div>`);
                         $.each(data, function(i){
                            $('#sf-bkk-dropdown').append('<div id="c-' + data[i].id +'" class="column cinema-content"></div>');
                            $('#c-'+data[i].id).append(`<div class="ui segment card" id="${'ci-'+data[i].id}" onclick="test_select_cinema('${data[i].id}');">
                                                           <p class="name_en"> ${ data[i].cinema_name_en}</p>
                                                        </div>`);
                         });
                     });

        $.ajax({

                              url: "http://139.59.227.188:9002/cinemas/sf/cen"

                          }).then(function(data, status, jqxhr) {
                              $('#sf-cen').append(`<div class="ui five column grid" id="sf-center-dropdown"></div>`);
                              $.each(data, function(i){
                                 $('#sf-center-dropdown').append('<div id="c-' + data[i].id +'" class="column cinema-content"></div>');
                                 $('#c-'+data[i].id).append(`<div class="ui segment card" id="${'ci-'+data[i].id}" onclick="test_select_cinema('${data[i].id}');">
                                                                <p class="name_en"> ${ data[i].cinema_name_en}</p>
                                                             </div>`);
                              });
                          });

        $.ajax({

                                       url: "http://139.59.227.188:9002/cinemas/sf/east"

                                   }).then(function(data, status, jqxhr) {
                                       $('#sf-eas').append(`<div class="ui five column grid" id="sf-eas-dropdown"></div>`);
                                       $.each(data, function(i){
                                          $('#sf-eas-dropdown').append('<div id="c-' + data[i].id +'" class="column cinema-content"></div>');
                                          $('#c-'+data[i].id).append(`<div class="ui segment card" id="${'ci-'+data[i].id}" onclick="test_select_cinema('${data[i].id}');">
                                                                         <p class="name_en"> ${ data[i].cinema_name_en}</p>
                                                                      </div>`);
                                       });
                                   });

         $.ajax({

                                            url: "http://139.59.227.188:9002/cinemas/sf/north"

                                        }).then(function(data, status, jqxhr) {
                                            $('#sf-nor').append(`<div class="ui five column grid" id="sf-nor-dropdown"></div>`);
                                            $.each(data, function(i){
                                               $('#sf-nor-dropdown').append('<div id="c-' + data[i].id +'" class="column cinema-content"></div>');
                                               $('#c-'+data[i].id).append(`<div class="ui segment card" id="${'ci-'+data[i].id}" onclick="test_select_cinema('${data[i].id}');">
                                                                              <p class="name_en"> ${ data[i].cinema_name_en}</p>
                                                                           </div>`);
                                            });
                                        });

        $.ajax({

                                                url: "http://139.59.227.188:9002/cinemas/sf/northeast"

                                            }).then(function(data, status, jqxhr) {
                                                $('#sf-esn').append(`<div class="ui five column grid" id="sf-esn-dropdown"></div>`);
                                                $.each(data, function(i){
                                                   $('#sf-esn-dropdown').append('<div id="c-' + data[i].id +'" class="column cinema-content"></div>');
                                                   $('#c-'+data[i].id).append(`<div class="ui segment card" id="${'ci-'+data[i].id}" onclick="test_select_cinema('${data[i].id}');">
                                                                                  <p class="name_en"> ${ data[i].cinema_name_en}</p>
                                                                               </div>`);
                                                });
                                            });

        $.ajax({

                                                    url: "http://139.59.227.188:9002/cinemas/sf/south"

                                                }).then(function(data, status, jqxhr) {
                                                    $('#sf-sou').append(`<div class="ui five column grid" id="sf-sou-dropdown"></div>`);
                                                    $.each(data, function(i){
                                                       $('#sf-sou-dropdown').append('<div id="c-' + data[i].id +'" class="column cinema-content"></div>');
                                                       $('#c-'+data[i].id).append(`<div class="ui segment card" id="${'ci-'+data[i].id}" onclick="test_select_cinema('${data[i].id}');">
                                                                                      <p class="name_en"> ${ data[i].cinema_name_en}</p>
                                                                                   </div>`);
                                                    });
                                                });
        $.ajax({

                                                        url: "http://139.59.227.188:9002/cinemas/sf/west"

                                                    }).then(function(data, status, jqxhr) {
                                                        $('#sf-wes').append(`<div class="ui five column grid" id="sf-wes-dropdown"></div>`);
                                                        $.each(data, function(i){
                                                           $('#sf-wes-dropdown').append('<div id="c-' + data[i].id +'" class="column cinema-content"></div>');
                                                           $('#c-'+data[i].id).append(`<div class="ui segment card" id="${'ci-'+data[i].id}" onclick="test_select_cinema('${data[i].id}');">
                                                                                          <p class="name_en"> ${ data[i].cinema_name_en}</p>
                                                                                       </div>`);
                                                        });
                                                    });


});