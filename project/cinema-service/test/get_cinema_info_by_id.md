# Get cinema information by ID

This can be run with `silk -silk.url="http://localhost:9002"`

## `GET cinema`

Perform a find cinema information by id (Default).

===

* `Status: 200`
* `Content-Type: "application/json;charset=UTF-8"`
```
{"id":1,"group":"SF","cinema_name_th":"เอส เอฟ เซ็นทรัลเวิร์ล","cinema_name_en":"SF Central World","cinema_zone":"BKK","cinema_tel":""}
```

## `GET cinema?id=2`

Perform a find cinema information by id = 2.

===

* `Status: 200`
* `Content-Type: "application/json;charset=UTF-8"`
```
{"id":2,"group":"SF","cinema_name_th":"เอส เอฟ เอ็มบีเค เซ็นเตอร์","cinema_name_en":"SF MBK Center","cinema_zone":"BKK","cinema_tel":""}
```