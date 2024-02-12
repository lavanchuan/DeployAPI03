FROM maven:3.9.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.8-jdk-slim
COPY --from=build /target\DeployAPI03-0.0.1-SNAPSHOT.jar DeployAPI03.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "DeployAPI03.jar" ]