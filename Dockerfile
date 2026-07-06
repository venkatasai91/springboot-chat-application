FROM eclipse-temurin:21-jdk
COPY target/chat-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]