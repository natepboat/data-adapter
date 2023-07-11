FROM maven:3.8-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean install

FROM amazoncorretto:17-alpine
COPY --from=build /home/app/app.jar /home/app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/home/app/app.jar"]
