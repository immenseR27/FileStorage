FROM eclipse-temurin:21
COPY target/FileStorage-0.0.1-SNAPSHOT.jar FileStorage.jar
ENTRYPOINT ["java", "-jar", "/FileStorage.jar"]
