FROM frolvlad/alpine-oraclejdk8:slim
ADD ./target/showtime-service.jar app.jar
ENTRYPOINT [ "sh", "-c", "java -jar app.jar" ]