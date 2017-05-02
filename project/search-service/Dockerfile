FROM frolvlad/alpine-oraclejdk8:slim
ADD ./target/search-service.jar app.jar
ENTRYPOINT [ "sh", "-c", "java -jar app.jar" ]