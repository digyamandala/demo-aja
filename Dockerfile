FROM openjdk:11
WORKDIR /app
ARG FILE_NAME
COPY ./target/$FILE_NAME.jar ./target/demo.jar
CMD ["java", "-jar", "./target/demo.jar"]
