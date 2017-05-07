# Get Showtime of specific movie

## `GET showfrommovie?movie=5`

get showtime of movie id = 5.

===

* `Status: 200`
* `Content-Type: "application/json;charset=UTF-8"`
```json
[
{
"showtime_id": 532,
"movie_id": 5,
"cinema_id": 56,
"show_language": "EN/TH",
"show_time": "13:30:00",
"show_date": "2017-05-02",
"show_movie_link": "http://www.majorcineplex.com/booking/select-tickets.php?sessionId=125725",
"show_theatre": 10,
"show_system_type": "Digital 2D",
"movie": {
"id": 5,
"name_th": "รวมพล 5 มาสค์ไรเดอร์ ปะทะ ดร. แพ็คแมน",
"name_en": "Kamen Rider 2017",
"description": "รวมพล 5 มาสค์ไรเดอร์ ปะทะ ดร.แพ็คแมน พูดถึงการรุกรานของ แพ็คแมน ไวรัสเกมลึกลับที่มีชีวิต ได้นำมาซึ่งอันตรายต่อมวลมนุษย์อย่างที่ไม่เคยมีมาก่อน โดยในขณะที่ไวรัสสุดอันตรายกำลังระบาด เท็นคูจิ ทาเครุ หรือ มาสค์ไรเดอร์โกสต์ เกิดติดไวรัสนี้เข้า ทำให้เขาไม่สามารถแปลงร่างได้ โฮโจ เอมุ หรือ มาสค์ไรเดอร์เอ็กเซด จึงพยายามสืบหาศัตรูที่เป็นต้นตอของการระบาด แต่กลับพบว่าตัวเขาเองมีส่วนเกี่ยวข้องกับ “ความจริงอันยิ่งใหญ่” ที่โถมกระหน่ำเข้ามาควบคุมชะตากรรม จนเกิดการรวมตัวของเหล่าตำนานมาสค์ไรเดอร์ทั้ง 5 แห่งยุคราวกับปาฏิหาริย์ จะมีวิธีการใดเพื่อกอบกู้สถานการณ์เลวร้ายนี้ มาสค์ไรเดอร์วิซาร์ด ที่หยุดพักและออกเดินทาง มาสค์ไรเดอร์ไกมุ ที่หายตัวไปจากพื้นพิภพ มาสค์ไรเดอร์ไดรฟ ที่สูญเสียคุณเบลท์ไป (เข็มขัดประตัวใช้สำหรับแปลงร่าง) และความลับของ มาสค์ไรเดอร์เอ็กเซด ที่รอการเปิดเผย",
"release_date": "2017-04-20",
"poster": "https://www.majorcineplex.com/uploads/movie/1928/thumb_1928.jpg",
"trailer": "https://www.youtube.com/embed/IyPYBlC0XnM",
"duration": 89,
"status": "onshow",
"cover": "https://www.majorcineplex.com/uploads/movie/1928/cover_1928.jpg"
},
"cinema": {
"id": 56,
"group": "Major",
"cinema_name_th": "เมเจอร์ ซีนีเพล็กซ์ โลตัส บางกะป",
"cinema_name_en": "Major Cineplex Lotus Bangkapi",
"cinema_zone": "BKK",
"cinema_tel": "0-2354-2133"
}
},
{
"showtime_id": 533,
"movie_id": 5,
"cinema_id": 56,
"show_language": "EN/TH",
"show_time": "18:00:00",
"show_date": "2017-05-02",
"show_movie_link": "http://www.majorcineplex.com/booking/select-tickets.php?sessionId=125726",
"show_theatre": 10,
"show_system_type": "Digital 2D",
"movie": {
"id": 5,
"name_th": "รวมพล 5 มาสค์ไรเดอร์ ปะทะ ดร. แพ็คแมน",
"name_en": "Kamen Rider 2017",
"description": "รวมพล 5 มาสค์ไรเดอร์ ปะทะ ดร.แพ็คแมน พูดถึงการรุกรานของ แพ็คแมน ไวรัสเกมลึกลับที่มีชีวิต ได้นำมาซึ่งอันตรายต่อมวลมนุษย์อย่างที่ไม่เคยมีมาก่อน โดยในขณะที่ไวรัสสุดอันตรายกำลังระบาด เท็นคูจิ ทาเครุ หรือ มาสค์ไรเดอร์โกสต์ เกิดติดไวรัสนี้เข้า ทำให้เขาไม่สามารถแปลงร่างได้ โฮโจ เอมุ หรือ มาสค์ไรเดอร์เอ็กเซด จึงพยายามสืบหาศัตรูที่เป็นต้นตอของการระบาด แต่กลับพบว่าตัวเขาเองมีส่วนเกี่ยวข้องกับ “ความจริงอันยิ่งใหญ่” ที่โถมกระหน่ำเข้ามาควบคุมชะตากรรม จนเกิดการรวมตัวของเหล่าตำนานมาสค์ไรเดอร์ทั้ง 5 แห่งยุคราวกับปาฏิหาริย์ จะมีวิธีการใดเพื่อกอบกู้สถานการณ์เลวร้ายนี้ มาสค์ไรเดอร์วิซาร์ด ที่หยุดพักและออกเดินทาง มาสค์ไรเดอร์ไกมุ ที่หายตัวไปจากพื้นพิภพ มาสค์ไรเดอร์ไดรฟ ที่สูญเสียคุณเบลท์ไป (เข็มขัดประตัวใช้สำหรับแปลงร่าง) และความลับของ มาสค์ไรเดอร์เอ็กเซด ที่รอการเปิดเผย",
"release_date": "2017-04-20",
"poster": "https://www.majorcineplex.com/uploads/movie/1928/thumb_1928.jpg",
"trailer": "https://www.youtube.com/embed/IyPYBlC0XnM",
"duration": 89,
"status": "onshow",
"cover": "https://www.majorcineplex.com/uploads/movie/1928/cover_1928.jpg"
},
"cinema": {
"id": 56,
"group": "Major",
"cinema_name_th": "เมเจอร์ ซีนีเพล็กซ์ โลตัส บางกะป",
"cinema_name_en": "Major Cineplex Lotus Bangkapi",
"cinema_zone": "BKK",
"cinema_tel": "0-2354-2133"
}
},
{
"showtime_id": 537,
"movie_id": 5,
"cinema_id": 62,
"show_language": "EN/TH",
"show_time": "13:20:00",
"show_date": "2017-05-02",
"show_movie_link": "http://www.majorcineplex.com/booking/select-tickets.php?sessionId=122540",
"show_theatre": 1,
"show_system_type": "Digital 2D",
"movie": {
"id": 5,
"name_th": "รวมพล 5 มาสค์ไรเดอร์ ปะทะ ดร. แพ็คแมน",
"name_en": "Kamen Rider 2017",
"description": "รวมพล 5 มาสค์ไรเดอร์ ปะทะ ดร.แพ็คแมน พูดถึงการรุกรานของ แพ็คแมน ไวรัสเกมลึกลับที่มีชีวิต ได้นำมาซึ่งอันตรายต่อมวลมนุษย์อย่างที่ไม่เคยมีมาก่อน โดยในขณะที่ไวรัสสุดอันตรายกำลังระบาด เท็นคูจิ ทาเครุ หรือ มาสค์ไรเดอร์โกสต์ เกิดติดไวรัสนี้เข้า ทำให้เขาไม่สามารถแปลงร่างได้ โฮโจ เอมุ หรือ มาสค์ไรเดอร์เอ็กเซด จึงพยายามสืบหาศัตรูที่เป็นต้นตอของการระบาด แต่กลับพบว่าตัวเขาเองมีส่วนเกี่ยวข้องกับ “ความจริงอันยิ่งใหญ่” ที่โถมกระหน่ำเข้ามาควบคุมชะตากรรม จนเกิดการรวมตัวของเหล่าตำนานมาสค์ไรเดอร์ทั้ง 5 แห่งยุคราวกับปาฏิหาริย์ จะมีวิธีการใดเพื่อกอบกู้สถานการณ์เลวร้ายนี้ มาสค์ไรเดอร์วิซาร์ด ที่หยุดพักและออกเดินทาง มาสค์ไรเดอร์ไกมุ ที่หายตัวไปจากพื้นพิภพ มาสค์ไรเดอร์ไดรฟ ที่สูญเสียคุณเบลท์ไป (เข็มขัดประตัวใช้สำหรับแปลงร่าง) และความลับของ มาสค์ไรเดอร์เอ็กเซด ที่รอการเปิดเผย",
"release_date": "2017-04-20",
"poster": "https://www.majorcineplex.com/uploads/movie/1928/thumb_1928.jpg",
"trailer": "https://www.youtube.com/embed/IyPYBlC0XnM",
"duration": 89,
"status": "onshow",
"cover": "https://www.majorcineplex.com/uploads/movie/1928/cover_1928.jpg"
},
"cinema": {
"id": 62,
"group": "Major",
"cinema_name_th": "อีสต์วิลล์ ซีนีเพล็กซ์",
"cinema_name_en": "Eastville Cineplex",
"cinema_zone": "BKK",
"cinema_tel": "02-5536169"
}
},
{
"showtime_id": 535,
"movie_id": 5,
"cinema_id": 65,
"show_language": "EN/TH",
"show_time": "16:40:00",
"show_date": "2017-05-02",
"show_movie_link": "http://www.majorcineplex.com/booking/select-tickets.php?sessionId=126295",
"show_theatre": 12,
"show_system_type": "Digital 2D",
"movie": {
"id": 5,
"name_th": "รวมพล 5 มาสค์ไรเดอร์ ปะทะ ดร. แพ็คแมน",
"name_en": "Kamen Rider 2017",
"description": "รวมพล 5 มาสค์ไรเดอร์ ปะทะ ดร.แพ็คแมน พูดถึงการรุกรานของ แพ็คแมน ไวรัสเกมลึกลับที่มีชีวิต ได้นำมาซึ่งอันตรายต่อมวลมนุษย์อย่างที่ไม่เคยมีมาก่อน โดยในขณะที่ไวรัสสุดอันตรายกำลังระบาด เท็นคูจิ ทาเครุ หรือ มาสค์ไรเดอร์โกสต์ เกิดติดไวรัสนี้เข้า ทำให้เขาไม่สามารถแปลงร่างได้ โฮโจ เอมุ หรือ มาสค์ไรเดอร์เอ็กเซด จึงพยายามสืบหาศัตรูที่เป็นต้นตอของการระบาด แต่กลับพบว่าตัวเขาเองมีส่วนเกี่ยวข้องกับ “ความจริงอันยิ่งใหญ่” ที่โถมกระหน่ำเข้ามาควบคุมชะตากรรม จนเกิดการรวมตัวของเหล่าตำนานมาสค์ไรเดอร์ทั้ง 5 แห่งยุคราวกับปาฏิหาริย์ จะมีวิธีการใดเพื่อกอบกู้สถานการณ์เลวร้ายนี้ มาสค์ไรเดอร์วิซาร์ด ที่หยุดพักและออกเดินทาง มาสค์ไรเดอร์ไกมุ ที่หายตัวไปจากพื้นพิภพ มาสค์ไรเดอร์ไดรฟ ที่สูญเสียคุณเบลท์ไป (เข็มขัดประตัวใช้สำหรับแปลงร่าง) และความลับของ มาสค์ไรเดอร์เอ็กเซด ที่รอการเปิดเผย",
"release_date": "2017-04-20",
"poster": "https://www.majorcineplex.com/uploads/movie/1928/thumb_1928.jpg",
"trailer": "https://www.youtube.com/embed/IyPYBlC0XnM",
"duration": 89,
"status": "onshow",
"cover": "https://www.majorcineplex.com/uploads/movie/1928/cover_1928.jpg"
},
"cinema": {
"id": 65,
"group": "Major",
"cinema_name_th": "เมกา ซีนีเพล็กซ์",
"cinema_name_en": "Mega Cineplex",
"cinema_zone": "BKK",
"cinema_tel": "02-105-1567"
}
},
{
"showtime_id": 536,
"movie_id": 5,
"cinema_id": 81,
"show_language": "TH/--",
"show_time": "21:00:00",
"show_date": "2017-05-02",
"show_movie_link": "http://www.majorcineplex.com/booking/select-tickets.php?sessionId=126711",
"show_theatre": 5,
"show_system_type": "Digital 2D",
"movie": {
"id": 5,
"name_th": "รวมพล 5 มาสค์ไรเดอร์ ปะทะ ดร. แพ็คแมน",
"name_en": "Kamen Rider 2017",
"description": "รวมพล 5 มาสค์ไรเดอร์ ปะทะ ดร.แพ็คแมน พูดถึงการรุกรานของ แพ็คแมน ไวรัสเกมลึกลับที่มีชีวิต ได้นำมาซึ่งอันตรายต่อมวลมนุษย์อย่างที่ไม่เคยมีมาก่อน โดยในขณะที่ไวรัสสุดอันตรายกำลังระบาด เท็นคูจิ ทาเครุ หรือ มาสค์ไรเดอร์โกสต์ เกิดติดไวรัสนี้เข้า ทำให้เขาไม่สามารถแปลงร่างได้ โฮโจ เอมุ หรือ มาสค์ไรเดอร์เอ็กเซด จึงพยายามสืบหาศัตรูที่เป็นต้นตอของการระบาด แต่กลับพบว่าตัวเขาเองมีส่วนเกี่ยวข้องกับ “ความจริงอันยิ่งใหญ่” ที่โถมกระหน่ำเข้ามาควบคุมชะตากรรม จนเกิดการรวมตัวของเหล่าตำนานมาสค์ไรเดอร์ทั้ง 5 แห่งยุคราวกับปาฏิหาริย์ จะมีวิธีการใดเพื่อกอบกู้สถานการณ์เลวร้ายนี้ มาสค์ไรเดอร์วิซาร์ด ที่หยุดพักและออกเดินทาง มาสค์ไรเดอร์ไกมุ ที่หายตัวไปจากพื้นพิภพ มาสค์ไรเดอร์ไดรฟ ที่สูญเสียคุณเบลท์ไป (เข็มขัดประตัวใช้สำหรับแปลงร่าง) และความลับของ มาสค์ไรเดอร์เอ็กเซด ที่รอการเปิดเผย",
"release_date": "2017-04-20",
"poster": "https://www.majorcineplex.com/uploads/movie/1928/thumb_1928.jpg",
"trailer": "https://www.youtube.com/embed/IyPYBlC0XnM",
"duration": 89,
"status": "onshow",
"cover": "https://www.majorcineplex.com/uploads/movie/1928/cover_1928.jpg"
},
"cinema": {
"id": 81,
"group": "Major",
"cinema_name_th": "เวสต์เกต ซีนีเพล็กซ์",
"cinema_name_en": "Westgate Cineplex",
"cinema_zone": "BKK",
"cinema_tel": "02-1942979"
}
},
{
"showtime_id": 534,
"movie_id": 5,
"cinema_id": 82,
"show_language": "EN/TH",
"show_time": "16:30:00",
"show_date": "2017-05-02",
"show_movie_link": "http://www.majorcineplex.com/booking/select-tickets.php?sessionId=126168",
"show_theatre": 4,
"show_system_type": "Digital 2D",
"movie": {
"id": 5,
"name_th": "รวมพล 5 มาสค์ไรเดอร์ ปะทะ ดร. แพ็คแมน",
"name_en": "Kamen Rider 2017",
"description": "รวมพล 5 มาสค์ไรเดอร์ ปะทะ ดร.แพ็คแมน พูดถึงการรุกรานของ แพ็คแมน ไวรัสเกมลึกลับที่มีชีวิต ได้นำมาซึ่งอันตรายต่อมวลมนุษย์อย่างที่ไม่เคยมีมาก่อน โดยในขณะที่ไวรัสสุดอันตรายกำลังระบาด เท็นคูจิ ทาเครุ หรือ มาสค์ไรเดอร์โกสต์ เกิดติดไวรัสนี้เข้า ทำให้เขาไม่สามารถแปลงร่างได้ โฮโจ เอมุ หรือ มาสค์ไรเดอร์เอ็กเซด จึงพยายามสืบหาศัตรูที่เป็นต้นตอของการระบาด แต่กลับพบว่าตัวเขาเองมีส่วนเกี่ยวข้องกับ “ความจริงอันยิ่งใหญ่” ที่โถมกระหน่ำเข้ามาควบคุมชะตากรรม จนเกิดการรวมตัวของเหล่าตำนานมาสค์ไรเดอร์ทั้ง 5 แห่งยุคราวกับปาฏิหาริย์ จะมีวิธีการใดเพื่อกอบกู้สถานการณ์เลวร้ายนี้ มาสค์ไรเดอร์วิซาร์ด ที่หยุดพักและออกเดินทาง มาสค์ไรเดอร์ไกมุ ที่หายตัวไปจากพื้นพิภพ มาสค์ไรเดอร์ไดรฟ ที่สูญเสียคุณเบลท์ไป (เข็มขัดประตัวใช้สำหรับแปลงร่าง) และความลับของ มาสค์ไรเดอร์เอ็กเซด ที่รอการเปิดเผย",
"release_date": "2017-04-20",
"poster": "https://www.majorcineplex.com/uploads/movie/1928/thumb_1928.jpg",
"trailer": "https://www.youtube.com/embed/IyPYBlC0XnM",
"duration": 89,
"status": "onshow",
"cover": "https://www.majorcineplex.com/uploads/movie/1928/cover_1928.jpg"
},
"cinema": {
"id": 82,
"group": "Major",
"cinema_name_th": "เอสพลานาด ซีนีเพล็กซ์ งามวงศ์วาน-แคราย",
"cinema_name_en": "Esplanade Cineplex Ngamwongwan-Khae Rai",
"cinema_zone": "BKK",
"cinema_tel": "0-2591-0393"
}
},
{
"showtime_id": 539,
"movie_id": 5,
"cinema_id": 135,
"show_language": "EN/TH",
"show_time": "13:40:00",
"show_date": "2017-05-02",
"show_movie_link": "http://www.majorcineplex.com/booking/select-tickets.php?sessionId=121005",
"show_theatre": 3,
"show_system_type": "Digital 2D",
"movie": {
"id": 5,
"name_th": "รวมพล 5 มาสค์ไรเดอร์ ปะทะ ดร. แพ็คแมน",
"name_en": "Kamen Rider 2017",
"description": "รวมพล 5 มาสค์ไรเดอร์ ปะทะ ดร.แพ็คแมน พูดถึงการรุกรานของ แพ็คแมน ไวรัสเกมลึกลับที่มีชีวิต ได้นำมาซึ่งอันตรายต่อมวลมนุษย์อย่างที่ไม่เคยมีมาก่อน โดยในขณะที่ไวรัสสุดอันตรายกำลังระบาด เท็นคูจิ ทาเครุ หรือ มาสค์ไรเดอร์โกสต์ เกิดติดไวรัสนี้เข้า ทำให้เขาไม่สามารถแปลงร่างได้ โฮโจ เอมุ หรือ มาสค์ไรเดอร์เอ็กเซด จึงพยายามสืบหาศัตรูที่เป็นต้นตอของการระบาด แต่กลับพบว่าตัวเขาเองมีส่วนเกี่ยวข้องกับ “ความจริงอันยิ่งใหญ่” ที่โถมกระหน่ำเข้ามาควบคุมชะตากรรม จนเกิดการรวมตัวของเหล่าตำนานมาสค์ไรเดอร์ทั้ง 5 แห่งยุคราวกับปาฏิหาริย์ จะมีวิธีการใดเพื่อกอบกู้สถานการณ์เลวร้ายนี้ มาสค์ไรเดอร์วิซาร์ด ที่หยุดพักและออกเดินทาง มาสค์ไรเดอร์ไกมุ ที่หายตัวไปจากพื้นพิภพ มาสค์ไรเดอร์ไดรฟ ที่สูญเสียคุณเบลท์ไป (เข็มขัดประตัวใช้สำหรับแปลงร่าง) และความลับของ มาสค์ไรเดอร์เอ็กเซด ที่รอการเปิดเผย",
"release_date": "2017-04-20",
"poster": "https://www.majorcineplex.com/uploads/movie/1928/thumb_1928.jpg",
"trailer": "https://www.youtube.com/embed/IyPYBlC0XnM",
"duration": 89,
"status": "onshow",
"cover": "https://www.majorcineplex.com/uploads/movie/1928/cover_1928.jpg"
},
"cinema": {
"id": 135,
"group": "Major",
"cinema_name_th": "โคราช ซีนีเพล็กซ์",
"cinema_name_en": "Korat Cineplex",
"cinema_zone": "ESN",
"cinema_tel": "044-288-288"
}
},
{
"showtime_id": 538,
"movie_id": 5,
"cinema_id": 156,
"show_language": "TH/--",
"show_time": "14:00:00",
"show_date": "2017-05-02",
"show_movie_link": "http://www.majorcineplex.com/booking/select-tickets.php?sessionId=122494",
"show_theatre": 6,
"show_system_type": "Digital 2D",
"movie": {
"id": 5,
"name_th": "รวมพล 5 มาสค์ไรเดอร์ ปะทะ ดร. แพ็คแมน",
"name_en": "Kamen Rider 2017",
"description": "รวมพล 5 มาสค์ไรเดอร์ ปะทะ ดร.แพ็คแมน พูดถึงการรุกรานของ แพ็คแมน ไวรัสเกมลึกลับที่มีชีวิต ได้นำมาซึ่งอันตรายต่อมวลมนุษย์อย่างที่ไม่เคยมีมาก่อน โดยในขณะที่ไวรัสสุดอันตรายกำลังระบาด เท็นคูจิ ทาเครุ หรือ มาสค์ไรเดอร์โกสต์ เกิดติดไวรัสนี้เข้า ทำให้เขาไม่สามารถแปลงร่างได้ โฮโจ เอมุ หรือ มาสค์ไรเดอร์เอ็กเซด จึงพยายามสืบหาศัตรูที่เป็นต้นตอของการระบาด แต่กลับพบว่าตัวเขาเองมีส่วนเกี่ยวข้องกับ “ความจริงอันยิ่งใหญ่” ที่โถมกระหน่ำเข้ามาควบคุมชะตากรรม จนเกิดการรวมตัวของเหล่าตำนานมาสค์ไรเดอร์ทั้ง 5 แห่งยุคราวกับปาฏิหาริย์ จะมีวิธีการใดเพื่อกอบกู้สถานการณ์เลวร้ายนี้ มาสค์ไรเดอร์วิซาร์ด ที่หยุดพักและออกเดินทาง มาสค์ไรเดอร์ไกมุ ที่หายตัวไปจากพื้นพิภพ มาสค์ไรเดอร์ไดรฟ ที่สูญเสียคุณเบลท์ไป (เข็มขัดประตัวใช้สำหรับแปลงร่าง) และความลับของ มาสค์ไรเดอร์เอ็กเซด ที่รอการเปิดเผย",
"release_date": "2017-04-20",
"poster": "https://www.majorcineplex.com/uploads/movie/1928/thumb_1928.jpg",
"trailer": "https://www.youtube.com/embed/IyPYBlC0XnM",
"duration": 89,
"status": "onshow",
"cover": "https://www.majorcineplex.com/uploads/movie/1928/cover_1928.jpg"
},
"cinema": {
"id": 156,
"group": "Major",
"cinema_name_th": "เมเจอร์ ซีนีเพล็กซ์ เซ็นทรัล ระยอง",
"cinema_name_en": "Major Cineplex Central Rayong",
"cinema_zone": "EAS",
"cinema_tel": "038-942695"
}
}
]
```