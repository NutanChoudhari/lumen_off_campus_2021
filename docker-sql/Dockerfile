FROM java:8

WORKDIR /app

COPY . /app

COPY ./target/docker-sql.jar docker-sql.jar

ENTRYPOINT ["java","-jar","docker-sql.jar"]