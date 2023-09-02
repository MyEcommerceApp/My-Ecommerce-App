FROM openjdk:17

COPY /target/ecommerce-oil-app-0.0.1-SNAPSHOT.jar /app.jar

CMD ["java", "-jar", "/app.jar"]