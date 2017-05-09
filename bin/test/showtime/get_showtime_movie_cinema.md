# Get Showtime of specific movie and cinema


## `GET showfromall?movie=8&cinema=109`

get showtime of movie id = 8 and cinema id = 109.

===

* `Status: 200`
* `Content-Type: "application/json;charset=UTF-8"`
```json
[
{
"showtime_id": 585,
"movie_id": 8,
"cinema_id": 109,
"show_language": "TH/--",
"show_time": "12:10:00",
"show_date": "2017-05-09",
"show_movie_link": "http://www.majorcineplex.com/booking/select-tickets.php?sessionId=126122",
"show_theatre": 4,
"show_system_type": "Digital 2D",
"movie": {
"id": 8,
"name_th": "เร็ว..แรงทะลุนรก 8",
"name_en": "Fast And Furious 8",
"description": "ดอมและเล็ตตี้อยู่ในช่วงฮันนีมูน ส่วนไบรอันและมีอาก็ตัดสินใจกลับไปใช้ชีวิตครอบครัวของตัวเอง ส่วนคนอื่น ๆ ก็พ้นจากข้อกล่าวหา กลับมาใช้ชีวิตอย่างปกติ แต่เมื่อมีสตรีลึกลับ (เจ้าของรางวัลออสการ์ ชาร์ลิซ เธอรอน) เข้ามาล่อลวงดอมสู่โลกอาชญากรรรม โดยที่เขาไม่มีทางเลือกและกลายเป็นคนทรยศครอบครัว พวกเขาต้องเผชิญกับการทดสอบอย่างที่ไม่เคยพบมาก่อน",
"release_date": "2017-04-12",
"poster": "https://www.majorcineplex.com/uploads/movie/1736/thumb_1736.jpg",
"trailer": "https://www.youtube.com/embed/uisBaTkQAEs",
"duration": 136,
"status": "onshow",
"cover": "https://www.majorcineplex.com/uploads/movie/1736/cover_1736.jpg"
},
"cinema": {
"id": 109,
"group": "Major",
"cinema_name_th": "เมเจอร์ ซีนีเพล็กซ์ หัวหิน",
"cinema_name_en": "Major Cineplex Huahin",
"cinema_zone": "WES",
"cinema_tel": "032-526-204"
}
},
{
"showtime_id": 586,
"movie_id": 8,
"cinema_id": 109,
"show_language": "TH/--",
"show_time": "18:10:00",
"show_date": "2017-05-09",
"show_movie_link": "http://www.majorcineplex.com/booking/select-tickets.php?sessionId=126122",
"show_theatre": 4,
"show_system_type": "Digital 2D",
"movie": {
"id": 8,
"name_th": "เร็ว..แรงทะลุนรก 8",
"name_en": "Fast And Furious 8",
"description": "ดอมและเล็ตตี้อยู่ในช่วงฮันนีมูน ส่วนไบรอันและมีอาก็ตัดสินใจกลับไปใช้ชีวิตครอบครัวของตัวเอง ส่วนคนอื่น ๆ ก็พ้นจากข้อกล่าวหา กลับมาใช้ชีวิตอย่างปกติ แต่เมื่อมีสตรีลึกลับ (เจ้าของรางวัลออสการ์ ชาร์ลิซ เธอรอน) เข้ามาล่อลวงดอมสู่โลกอาชญากรรรม โดยที่เขาไม่มีทางเลือกและกลายเป็นคนทรยศครอบครัว พวกเขาต้องเผชิญกับการทดสอบอย่างที่ไม่เคยพบมาก่อน",
"release_date": "2017-04-12",
"poster": "https://www.majorcineplex.com/uploads/movie/1736/thumb_1736.jpg",
"trailer": "https://www.youtube.com/embed/uisBaTkQAEs",
"duration": 136,
"status": "onshow",
"cover": "https://www.majorcineplex.com/uploads/movie/1736/cover_1736.jpg"
},
"cinema": {
"id": 109,
"group": "Major",
"cinema_name_th": "เมเจอร์ ซีนีเพล็กซ์ หัวหิน",
"cinema_name_en": "Major Cineplex Huahin",
"cinema_zone": "WES",
"cinema_tel": "032-526-204"
}
}
]
```