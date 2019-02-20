FROM cantara/alpine-openjdk-jdk8

MAINTAINER Danny Bastos <danny.bastos.br@gmail.com>

USER root

ADD /target/spring-boot*.jar /app/spring-boot.jar

EXPOSE 8888

CMD ["java", "-jar", "/app/spring-boot.jar"]
