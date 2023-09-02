FROM openjdk:17

COPY /target/ecommerce-oil-app-0.0.1-SNAPSHOT.jar ecommerce-oil-app-0.0.1-SNAPSHOT.jar

ENTRYPOINT java -jar ecommerce-oil-app-0.0.1-SNAPSHOT.jar