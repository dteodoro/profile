FROM openjdk:21
WORKDIR /app
COPY ./target/*.jar /app/app.jar
EXPOSE 8001
CMD ["java","-jar","/app/app.jar"]
