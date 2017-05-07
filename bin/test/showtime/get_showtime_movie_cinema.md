# Get Showtime of specific movie and cinema


## `GET showfromall?movie=3&cinema=1`

get showtime of movie id = 3 and cinema id = 1.

===

* `Status: 200`
* `Content-Type: "application/json;charset=UTF-8"`
```json
[
{
"showtime_id": 521,
"movie_id": 3,
"cinema_id": 1,
"show_language": "E",
"show_time": "13:00:00",
"show_date": "2017-05-02",
"show_movie_link": "https://booking.sfcinemacity.com/visSelectTickets.aspx?cinemacode=9909&txtSessionId=46895&visLang=2",
"show_theatre": 4,
"show_system_type": "Digital 2D",
"movie": {
"id": 3,
"name_th": "กระท่อมเหนือปาฏิหาริย์",
"name_en": "The Shack",
"description": "A grieving man receives a mysterious, personal invitation to meet with God at a place called \"The Shack.\"",
"release_date": "2017-04-20",
"poster": "https://www.majorcineplex.com/uploads/movie/1633/thumb_1633.jpg",
"trailer": "https://www.youtube.com/embed/CL0yUbSS5Eg",
"duration": 132,
"status": "onshow",
"cover": "https://www.majorcineplex.com/uploads/movie/1633/cover_1633.jpg"
},
"cinema": {
"id": 1,
"group": "SF",
"cinema_name_th": "เอส เอฟ เซ็นทรัลเวิร์ล",
"cinema_name_en": "SF Central World",
"cinema_zone": "BKK",
"cinema_tel": ""
}
},
{
"showtime_id": 522,
"movie_id": 3,
"cinema_id": 1,
"show_language": "E",
"show_time": "16:10:00",
"show_date": "2017-05-02",
"show_movie_link": "https://booking.sfcinemacity.com/visSelectTickets.aspx?cinemacode=9909&txtSessionId=46896&visLang=2",
"show_theatre": 4,
"show_system_type": "Digital 2D",
"movie": {
"id": 3,
"name_th": "กระท่อมเหนือปาฏิหาริย์",
"name_en": "The Shack",
"description": "A grieving man receives a mysterious, personal invitation to meet with God at a place called \"The Shack.\"",
"release_date": "2017-04-20",
"poster": "https://www.majorcineplex.com/uploads/movie/1633/thumb_1633.jpg",
"trailer": "https://www.youtube.com/embed/CL0yUbSS5Eg",
"duration": 132,
"status": "onshow",
"cover": "https://www.majorcineplex.com/uploads/movie/1633/cover_1633.jpg"
},
"cinema": {
"id": 1,
"group": "SF",
"cinema_name_th": "เอส เอฟ เซ็นทรัลเวิร์ล",
"cinema_name_en": "SF Central World",
"cinema_zone": "BKK",
"cinema_tel": ""
}
}
]
```