# Get Showtime of specific cinema

## `GET showfromcinema?cinema=3`

get showtime of cinema id = 3.

===

* `Status: 200`
* `Content-Type: "application/json;charset=UTF-8"`
```json
[
{
"showtime_id": 525,
"movie_id": 3,
"cinema_id": 3,
"show_language": "E",
"show_time": "21:10:00",
"show_date": "2017-05-02",
"show_movie_link": "https://booking.sfcinemacity.com/visSelectTickets.aspx?cinemacode=9925&txtSessionId=40421&visLang=2",
"show_theatre": 7,
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
"id": 3,
"group": "SF",
"cinema_name_th": "เอส เอฟ เซ็นทรัล พระราม 9",
"cinema_name_en": "SF Central Pra Ram 9",
"cinema_zone": "BKK",
"cinema_tel": ""
}
}
]
```