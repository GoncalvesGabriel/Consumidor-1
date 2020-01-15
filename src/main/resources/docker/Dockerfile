FROM adoptopenjdk/openjdk11:latest
COPY consumidor-one-0.0.1-*.jar app.jar
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]