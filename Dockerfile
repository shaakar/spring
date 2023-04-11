FROM openjdk:17-jdk-slim

WORKDIR /app

ADD target/demo-github-0.0.1-SNAPSHOT.jar.original /app/springapi-docker.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "springapi-docker.jar"]