FROM cantara/alpine-openjdk-jdk8

MAINTAINER Danny Bastos <danny.bastos.br@gmail.com>

WORKDIR /app

COPY . /app

RUN ./mvnw clean package

RUN mv /app/target/spring-boot*.jar /app/spring-boot.jar

EXPOSE 8888

CMD ["java", "-jar", "/app/spring-boot.jar"]
