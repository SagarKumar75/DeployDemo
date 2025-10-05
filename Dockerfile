FROM maven:3.9.9-eclipse-temurin-21 AS builder
WORKDIR /DeployDemo
COPY . .
RUN mvn clean package -DskipTests


FROM eclipse-temurin:21-jdk-jammy
WORKDIR /DeployDemo
COPY --from=builder /DeployDemo/target/*.jar DeployDemo.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","DeployDemo.jar"]