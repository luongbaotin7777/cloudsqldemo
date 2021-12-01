FROM adoptopenjdk/openjdk11:alpine-jre
ADD target/demo-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8080
ENTRYPOINT exec java -jar demo.jar