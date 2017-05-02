# Get Movie information by id

This can be run with `silk -silk.url="http://localhost:9001"`

## `GET movie`

Perform a find movie by id (Default).

===

* `Status: 200`
* `Content-Type: "application/json;charset=UTF-8"`
```
{"id":1,"name_th":"รวมพันธุ์นักสู้พิทักษ์จักรวาล 2","name_en":"Guardians Galaxy 2","description":"เอาใจสาวกมาเวลด้วยภาพยนตร์ซุปเปอร์ฮีโร่สุดแปลกแหวกแนว Guardian of the Galaxy Vol.2 พบกับการร่วมตัวกันของเหล่าซุปเปอร์ฮีโร่ที่เราคุ้นหน้าคุ้นตากันดี ทั้ง “สตาร์ลอร์ด”, “กาโมร่า”, “แดร็ก”,”ร็อกเก็ต”, และที่ขาดไม่ได้ ฮีโร่สุดน่ารัก“เบบี้กรูท” และตัวละครอื่นๆอีกมากมายพร้อมพาคุณออกเดินทางไปในอวกาศกับภารกิจการกอบกู้จักรวาลครั้งใหม่ รวมถึงการค้นหาถึงชาติกำเนิดที่แท้จริงของ “ปีเตอร์ควิลล์” พระเอกหนุ่มขวัญใจสาวๆอีกด้วย","release_date":"2017-05-02","poster":"https://www.majorcineplex.com/uploads/movie/1737/thumb_1737.jpg","trailer":"https://www.youtube.com/embed/duGqrYw4usE","duration":135,"status":"coming_soon","cover":"https://www.majorcineplex.com/uploads/movie/1737/cover_1737.jpg"}
```

## `GET movie?id=2`

Perform a find movie by id = 2.

===

* `Status: 200`
* `Content-Type: "application/json;charset=UTF-8"`
```
{"id":2,"name_th":"Noor","name_en":"Noor","description":"Noor (Sonakshi Sinha) is impatient, intelligent, impetuous and on the hunt for love in a city that is frustrating but also her addiction. She and her two best friends, Saad a young entrepreneurial restaurateur, who shuttles between London and Mumbai, and Zaara a with-it Parsi who plays DJ gigs at various nightclubs in the city, form the core of a coming-of-age story set in Mumbai, the ever-changing metropolis that is home to more than 21 million people.","release_date":"2017-04-21","poster":"https://www.majorcineplex.com/uploads/movie/1932/thumb_1932.jpg","trailer":"https://www.youtube.com/embed/DHuM6C6EyXE","duration":107,"status":"onshow","cover":"https://www.majorcineplex.com/uploads/movie/1932/cover_1932.jpg"}
```