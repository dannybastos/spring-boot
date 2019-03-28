FROM dannybastos/openjdk8

MAINTAINER Danny Bastos <danny.bastos.br@gmail.com>

WORKDIR /app

COPY . /app

RUN ./mvnw clean package

RUN mv /app/target/spring-boot*.jar /app/app.jar

EXPOSE 8888

ENTRYPOINT java -jar /app/app.jar
