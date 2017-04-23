$(document).ready(function() {
    var movie_id = document.getElementById('movie_id').innerHTML;
    var cinema_id = document.getElementById('cinema_id').innerHTML;

    var major_list = "";
    var sf_list = "";

    console.log(movie_id);
    console.log(cinema_id);

    if(cinema_id == '[]' && movie_id != '[]') {
        $.ajax({

                url: "http://localhost:9003/showfrommovie?movie=" + movie_id

            }).then(function(showtime, status, jqxhr) {
                for(var i = 0; i < showtime.length; i++) {
                    var cinema_id = showtime[i].cinema_id;
                    console.log(cinema_id);
                    if(showtime[i].cinema.group == 'SF') {
                        if(sf_list != cinema_id) {

                            sf_list = cinema_id;
                            console.log(sf_list);
                            $('#sf-showtime').append(`<div id="${'cinema'+showtime[i].cinema.id}" class="ui divided items" style="padding:14px;">
                                                        <h3 class="ui block header left floated">
                                                           ${showtime[i].cinema.cinema_name_en}
                                                        </h3>
                                                      </div>`);
                        }
                        if(i == 0 || showtime[i].movie_id != showtime[i-1].movie_id || showtime[i].show_theatre != showtime[i-1].show_theatre || showtime[i].cinema_id != showtime[i-1].cinema_id) {
                                                        $('#cinema'+showtime[i].cinema.id).append(`<div class="item">
                                                                                                <div class="head">
                                                                                                    <div style="margin: 30px; padding-top: 50px;">
                                                                                                        <h2>theater</h2>
                                                                                                        <h2 id="theatre">${showtime[i].show_theatre}</h2>
                                                                                                    </div>
                                                                                                </div>
                                                                                                <div class="image" style="width: 150px">
                                                                                                    <img src="${showtime[i].movie.poster}"/>
                                                                                                </div>
                                                                                                <div class="content">
                                                                                                    <a class="header" href="/movie_desc?id=${showtime[i].movie.id}">${showtime[i].movie.name_en}</a>
                                                                                                    <div class="meta">
                                                                                                        <span class="cinema">${showtime[i].movie.name_th}</span>
                                                                                                        <span class="cinema">${showtime[i].cinema.cinema_name_en}</span>
                                                                                                    </div>
                                                                                                    <div class="extra">
                                                                                                        <div class="ui label">${showtime[i].movie.duration}</div>
                                                                                                        <div class="ui label">${showtime[i].show_system_type}</div>
                                                                                                        <div class="ui label">ทั่วไป</div>
                                                                                                        <div class="ui label"><i class="globe icon"></i>${showtime[i].show_language}</div>
                                                                                                    </div>
                                                                                                    <div id="${showtime[i].cinema_id+' '+showtime[i].show_theatre}" class="description">
                                                                                                        <a href="https://www.google.com/">
                                                                                                            <button class="ui red basic button" id="${showtime[i].show_time}">
                                                                                                                ${showtime[i].show_time}
                                                                                                            </button>
                                                                                                        </a>
                                                                                                    </div>
                                                                                                </div>
                                                                                            </div>`);
                                                    } else {
                                                        console.log('#'+showtime[i].cinema_id+' '+showtime[i].show_theatre);
                                                        $("[id='"+showtime[i].cinema_id+" "+showtime[i].show_theatre+"']").append(`<a href="https://www.google.com/">
                                                                                                                                    <button class="ui red basic button" id="${showtime[i].show_time}">
                                                                                                                                        ${showtime[i].show_time}
                                                                                                                                    </button>
                                                                                                                                 </a>`);
                                                    }
                    } else {
                        if(major_list != cinema_id) {
                            major_list = cinema_id;
                            $('#major-showtime').append(`<div id="${'cinema'+showtime[i].cinema.id}" class="ui divided items" style="padding:14px;">
                                                            <h3 class="ui block header left floated">
                                                                ${showtime[i].cinema.cinema_name_en}
                                                            </h3>
                                                        </div>`);
                        }
                        if(i == 0 || showtime[i].movie_id != showtime[i-1].movie_id || showtime[i].show_theatre != showtime[i-1].show_theatre || showtime[i].cinema_id != showtime[i-1].cinema_id) {
                                                        $('#cinema'+showtime[i].cinema.id).append(`<div class="item">
                                                                                                <div class="head">
                                                                                                    <div style="margin: 30px; padding-top: 50px;">
                                                                                                        <h2>theater</h2>
                                                                                                        <h2 id="theatre">${showtime[i].show_theatre}</h2>
                                                                                                    </div>
                                                                                                </div>
                                                                                                <div class="image" style="width: 150px">
                                                                                                    <img src="${showtime[i].movie.poster}"/>
                                                                                                </div>
                                                                                                <div class="content">
                                                                                                    <a class="header" href="/movie_desc?id=${showtime[i].movie.id}">${showtime[i].movie.name_en}</a>
                                                                                                    <div class="meta">
                                                                                                        <span class="cinema">${showtime[i].movie.name_th}</span>
                                                                                                        <span class="cinema">${showtime[i].cinema.cinema_name_en}</span>
                                                                                                    </div>
                                                                                                    <div class="extra">
                                                                                                        <div class="ui label">${showtime[i].movie.duration}</div>
                                                                                                        <div class="ui label">${showtime[i].show_system_type}</div>
                                                                                                        <div class="ui label">ทั่วไป</div>
                                                                                                        <div class="ui label"><i class="globe icon"></i>${showtime[i].show_language}</div>
                                                                                                    </div>
                                                                                                    <div id="${showtime[i].cinema_id+' '+showtime[i].show_theatre}" class="description">
                                                                                                        <a href="https://www.google.com/">
                                                                                                            <button class="ui red basic button" id="${showtime[i].show_time}">
                                                                                                                ${showtime[i].show_time}
                                                                                                            </button>
                                                                                                        </a>
                                                                                                    </div>
                                                                                                </div>
                                                                                            </div>`);
                                                    } else {
                                                        console.log('#'+showtime[i].cinema_id+' '+showtime[i].show_theatre);
                                                        $("[id='"+showtime[i].cinema_id+" "+showtime[i].show_theatre+"']").append(`<a href="https://www.google.com/">
                                                                                                                                      <button class="ui red basic button" id="${showtime[i].show_time}">
                                                                                                                                          ${showtime[i].show_time}
                                                                                                                                      </button>
                                                                                                                                   </a>`);
                                                    }
                    }
                    startTime(showtime[i].show_time);
                }

            });
    } else {
        if(cinema_id != '[]' && movie_id == '[]') {
            $.ajax({

                url: "http://localhost:9003/showfromcinema?cinema=" + cinema_id

            }).then(function(showtime, status, jqxhr) {
                for(var i = 0; i < showtime.length; i++) {
                     var cinema_id = showtime[i].cinema_id;
                     console.log(cinema_id);
                     if(showtime[i].cinema.group == 'SF') {
                         if(sf_list != cinema_id) {
                              sf_list = cinema_id;
                              console.log(sf_list);
                              $('#sf-showtime').append(`<div id="${'cinema'+showtime[i].cinema.id}" class="ui divided items" style="padding:14px;">
                                                           <h3 class="ui block header left floated">
                                                               ${showtime[i].cinema.cinema_name_en}
                                                           </h3>
                                                        </div>`);
                         }
                         if(i == 0 || showtime[i].movie_id != showtime[i-1].movie_id || showtime[i].show_theatre != showtime[i-1].show_theatre || showtime[i].cinema_id != showtime[i-1].cinema_id) {
                              $('#cinema'+showtime[i].cinema.id).append(`<div class="item">
                                                                            <div class="head">
                                                                                 <div style="margin: 30px; padding-top: 50px;">
                                                                                      <h2>theater</h2>
                                                                                      <h2 id="theatre">${showtime[i].show_theatre}</h2>
                                                                                 </div>
                                                                            </div>
                                                                            <div class="image" style="width: 150px">
                                                                                 <img src="${showtime[i].movie.poster}"/>
                                                                            </div>
                                                                            <div class="content">
                                                                                 <a class="header" href="/movie_desc?id=${showtime[i].movie.id}">${showtime[i].movie.name_en}</a>
                                                                                 <div class="meta">
                                                                                     <span class="cinema">${showtime[i].movie.name_th}</span>
                                                                                     <span class="cinema">${showtime[i].cinema.cinema_name_en}</span>
                                                                                 </div>
                                                                                 <div class="extra">
                                                                                     <div class="ui label">${showtime[i].movie.duration}</div>
                                                                                     <div class="ui label">${showtime[i].show_system_type}</div>
                                                                                     <div class="ui label">ทั่วไป</div>
                                                                                     <div class="ui label"><i class="globe icon"></i>${showtime[i].show_language}</div>
                                                                                 </div>
                                                                                 <div id="${showtime[i].cinema_id+' '+showtime[i].show_theatre}" class="description">
                                                                                      <a href="https://www.google.com/">
                                                                                          <button class="ui red basic button" id="${showtime[i].show_time}">
                                                                                              ${showtime[i].show_time}
                                                                                          </button>
                                                                                      </a>
                                                                                 </div>
                                                                            </div>
                                                                         </div>`);
                        } else {
                              console.log('#'+showtime[i].cinema_id+' '+showtime[i].show_theatre);
                              $("[id='"+showtime[i].cinema_id+" "+showtime[i].show_theatre+"']").append(`<a href="https://www.google.com/">
                                                                                                            <button class="ui red basic button" id="${showtime[i].show_time}">
                                                                                                                 ${showtime[i].show_time}
                                                                                                            </button>
                                                                                                         </a>`);
                        }
                     } else {
                        if(major_list != cinema_id) {
                              major_list = cinema_id;
                              $('#major-showtime').append(`<div id="${'cinema'+showtime[i].cinema.id}" class="ui divided items" style="padding:14px;">
                                                              <h3 class="ui block header left floated">
                                                                  ${showtime[i].cinema.cinema_name_en}
                                                              </h3>
                                                           </div>`);
                        }
                        if(i == 0 || showtime[i].movie_id != showtime[i-1].movie_id || showtime[i].show_theatre != showtime[i-1].show_theatre || showtime[i].cinema_id != showtime[i-1].cinema_id) {
                              $('#cinema'+showtime[i].cinema.id).append(`<div class="item">
                                                                            <div class="head">
                                                                                <div style="margin: 30px; padding-top: 50px;">
                                                                                     <h2>theater</h2>
                                                                                     <h2 id="theatre">${showtime[i].show_theatre}</h2>
                                                                                </div>
                                                                            </div>
                                                                            <div class="image" style="width: 150px">
                                                                                <img src="${showtime[i].movie.poster}"/>
                                                                            </div>
                                                                            <div class="content">
                                                                                <a class="header" href="/movie_desc?id=${showtime[i].movie.id}">${showtime[i].movie.name_en}</a>
                                                                                    <div class="meta">
                                                                                        <span class="cinema">${showtime[i].movie.name_th}</span>
                                                                                        <span class="cinema">${showtime[i].cinema.cinema_name_en}</span>
                                                                                    </div>
                                                                                    <div class="extra">
                                                                                        <div class="ui label">${showtime[i].movie.duration}</div>
                                                                                        <div class="ui label">${showtime[i].show_system_type}</div>
                                                                                        <div class="ui label">ทั่วไป</div>
                                                                                        <div class="ui label"><i class="globe icon"></i>${showtime[i].show_language}</div>
                                                                                    </div>
                                                                                    <div id="${showtime[i].cinema_id+' '+showtime[i].show_theatre}" class="description">
                                                                                        <a href="https://www.google.com/">
                                                                                            <button class="ui red basic button" id="${showtime[i].show_time}">
                                                                                                ${showtime[i].show_time}
                                                                                            </button>
                                                                                        </a>
                                                                                    </div>
                                                                                </div>
                                                                            </div>`);
                        } else {
                            console.log('#'+showtime[i].cinema_id+' '+showtime[i].show_theatre);
                            $("[id='"+showtime[i].cinema_id+" "+showtime[i].show_theatre+"']").append(`<a href="https://www.google.com/">
                                                                                                          <button class="ui red basic button" id="${showtime[i].show_time}">
                                                                                                              ${showtime[i].show_time}
                                                                                                          </button>
                                                                                                       </a>`);
                        }
                    }
                    startTime(showtime[i].show_time);
                }

            });
        } else {
            if(cinema_id != '[]' && movie_id != '[]') {
                $.ajax({

                                url: "http://localhost:9003/showfromall?movie=" + movie_id + "&cinema=" + cinema_id

                }).then(function(showtime, status, jqxhr) {
                     for(var i = 0; i < showtime.length; i++) {
                         var cinema_id = showtime[i].cinema_id;
                         console.log(cinema_id);
                         if(showtime[i].cinema.group == 'SF') {
                             if(sf_list != cinema_id) {

                                 sf_list = cinema_id;
                                 console.log(sf_list);
                                 $('#sf-showtime').append(`<div id="${'cinema'+showtime[i].cinema.id}" class="ui divided items" style="padding:14px;">
                                                             <h3 class="ui block header left floated">
                                                                ${showtime[i].cinema.cinema_name_en}
                                                             </h3>
                                                           </div>`);
                             }
                             if(i == 0 || showtime[i].movie_id != showtime[i-1].movie_id || showtime[i].show_theatre != showtime[i-1].show_theatre || showtime[i].cinema_id != showtime[i-1].cinema_id) {
                                  $('#cinema'+showtime[i].cinema.id).append(`<div class="item">
                                                                          <div class="head">
                                                                              <div style="margin: 30px; padding-top: 50px;">
                                                                                  <h2>theater</h2>
                                                                                  <h2 id="theatre">${showtime[i].show_theatre}</h2>
                                                                              </div>
                                                                          </div>
                                                                          <div class="image" style="width: 150px">
                                                                              <img src="${showtime[i].movie.poster}"/>
                                                                          </div>
                                                                          <div class="content">
                                                                              <a class="header" href="/movie_desc?id=${showtime[i].movie.id}">${showtime[i].movie.name_en}</a>
                                                                              <div class="meta">
                                                                                  <span class="cinema">${showtime[i].movie.name_th}</span>
                                                                                  <span class="cinema">${showtime[i].cinema.cinema_name_en}</span>
                                                                              </div>
                                                                              <div class="extra">
                                                                                  <div class="ui label">${showtime[i].movie.duration}</div>
                                                                                  <div class="ui label">${showtime[i].show_system_type}</div>
                                                                                  <div class="ui label">ทั่วไป</div>
                                                                                  <div class="ui label"><i class="globe icon"></i>${showtime[i].show_language}</div>
                                                                              </div>
                                                                              <div id="${showtime[i].cinema_id+' '+showtime[i].show_theatre}" class="description">
                                                                                  <a href="https://www.google.com/">
                                                                                      <button class="ui red basic button" id="${showtime[i].show_time}">
                                                                                          ${showtime[i].show_time}
                                                                                      </button>
                                                                                  </a>
                                                                              </div>
                                                                          </div>
                                                                      </div>`);
                             } else {
                                 console.log('#'+showtime[i].cinema_id+' '+showtime[i].show_theatre);
                                 $("[id='"+showtime[i].cinema_id+" "+showtime[i].show_theatre+"']").append(`<a href="https://www.google.com/">
                                                                                                             <button class="ui red basic button" id="${showtime[i].show_time}">
                                                                                                                 ${showtime[i].show_time}
                                                                                                             </button>
                                                                                                          </a>`);
                             }
                         } else {
                             if(major_list != cinema_id) {
                                 major_list = cinema_id;
                                 $('#major-showtime').append(`<div id="${'cinema'+showtime[i].cinema.id}" class="ui divided items" style="padding:14px;">
                                                                 <h3 class="ui block header left floated">
                                                                     ${showtime[i].cinema.cinema_name_en}
                                                                 </h3>
                                                             </div>`);
                             }
                             if(i == 0 || showtime[i].movie_id != showtime[i-1].movie_id || showtime[i].show_theatre != showtime[i-1].show_theatre || showtime[i].cinema_id != showtime[i-1].cinema_id) {
                                  $('#cinema'+showtime[i].cinema.id).append(`<div class="item">
                                                                          <div class="head">
                                                                              <div style="margin: 30px; padding-top: 50px;">
                                                                                  <h2>theater</h2>
                                                                                  <h2 id="theatre">${showtime[i].show_theatre}</h2>
                                                                              </div>
                                                                          </div>
                                                                          <div class="image" style="width: 150px">
                                                                              <img src="${showtime[i].movie.poster}"/>
                                                                          </div>
                                                                          <div class="content">
                                                                              <a class="header" href="/movie_desc?id=${showtime[i].movie.id}">${showtime[i].movie.name_en}</a>
                                                                              <div class="meta">
                                                                                  <span class="cinema">${showtime[i].movie.name_th}</span>
                                                                                  <span class="cinema">${showtime[i].cinema.cinema_name_en}</span>
                                                                              </div>
                                                                              <div class="extra">
                                                                                  <div class="ui label">${showtime[i].movie.duration}</div>
                                                                                  <div class="ui label">${showtime[i].show_system_type}</div>
                                                                                  <div class="ui label">ทั่วไป</div>
                                                                                  <div class="ui label"><i class="globe icon"></i>${showtime[i].show_language}</div>
                                                                              </div>
                                                                              <div id="${showtime[i].cinema_id+' '+showtime[i].show_theatre}" class="description">
                                                                                  <a href="https://www.google.com/">
                                                                                      <button class="ui red basic button" id="${showtime[i].show_time}">
                                                                                          ${showtime[i].show_time}
                                                                                      </button>
                                                                                  </a>
                                                                              </div>
                                                                          </div>
                                                                      </div>`);
                             } else {
                                 console.log('#'+showtime[i].cinema_id+' '+showtime[i].show_theatre);
                                 $("[id='"+showtime[i].cinema_id+" "+showtime[i].show_theatre+"']").append(`<a href="https://www.google.com/">
                                                                                                               <button class="ui red basic button" id="${showtime[i].show_time}">
                                                                                                                   ${showtime[i].show_time}
                                                                                                               </button>
                                                                                                            </a>`);
                             }
                         }
                         startTime(showtime[i].show_time);
                     }

                });
            }
        }

    }



});

function checkTime(i) {
  if (i < 10) {
    i = "0" + i;
  }
  return i;
}

function startTime(show_time) {
  var today = new Date();
  var h = today.getHours();
  var m = today.getMinutes();
  var s = today.getSeconds();
  // add a zero in front of numbers<10
  m = checkTime(m);
  s = checkTime(s);
  var current = h + ":" + m + ":" + s;
  if (show_time < current) {
    console.log(show_time);
    $("[id='"+ show_time +"']").attr('disabled', 'disabled');
  }
}