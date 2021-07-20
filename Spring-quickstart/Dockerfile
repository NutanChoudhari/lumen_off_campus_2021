FROM java:8

ARG java_file=target/Spring-quickstart-0.0.1-SNAPSHOT.jar

WORKDIR /opt/app

COPY ${java_file} app.jar

ENTRYPOINT ["java","-jar","app.jar"]