FROM eclipse-temurin:17.0.5_8-jre-alpine

COPY target/*.jar /app.jar

ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /app.jar"]
