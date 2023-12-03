# Use official OpenJDK 21 image as base image
FROM openjdk:17-jdk-slim

MAINTAINER Ramazan Sakin <ramazansakin63@gmail.com>
WORKDIR /app
COPY target/note-taking-app.jar /app
EXPOSE 8080

CMD ["java", "-jar", "note-taking-app.jar"]