FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/gcp-bigquery-crud-app-0.0.1-SNAPSHOT.war
COPY ${JAR_FILE} gcp-bigquery-crud-app.war
ENTRYPOINT ["java","-jar","/gcp-bigquery-crud-app.war"]