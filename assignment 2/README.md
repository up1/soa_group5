# How to run the user service ?

```
$mvn clean package
$java -jar ./target/user-service.jar
```

And go to URL http://localhost:9001/users or add some parameter such as http://localhost:9001/users?page=1&userperpage=10 (default value of parameters 'page' and 'userperpage' are 1 and 10 by order)
