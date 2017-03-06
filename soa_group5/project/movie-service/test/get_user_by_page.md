# Get movie information by ID

This can be run with `silk -silk.url="http://localhost:9001"`

## `GET users?page=1&userperpage=5`

Perform a find movie information with pager.

===

* `Status: 200`
* `Content-Type: "application/json;charset=UTF-8"`
```
[{"id":1,"firstname":"AA\t","lastname":"AAA"},
{"id":2,"firstname":"BB","lastname":"BBB"},
{"id":3,"firstname":"CC","lastname":"CCC"},
{"id":4,"firstname":"DD","lastname":"DDD"},
{"id":5,"firstname":"EE","lastname":"EEE"}]
```
