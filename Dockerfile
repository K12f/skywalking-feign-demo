# First stage: complete build environment
FROM maven:3.8.6-openjdk-11-slim AS builder

# add pom.xml and source code
ADD ./pom.xml pom.xml
ADD ./src src/

# package jar
RUN mvn clean package

# Second stage: minimal runtime environment
FROM openjdk:11-jre-slim AS runner

# copy jar from the first stage
COPY --from=builder target/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]