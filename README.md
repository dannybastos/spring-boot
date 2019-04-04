# spring-boot-sample-app

A very basic springboot app, with Actuator, Swagger and one test using MockMvc;

## System requirements
- docker
- docker-compose

## How to run
```
docker-compose up -d
```

After that you can check in :

>curl -v http://localhost:8888/hello/{name}
>curl -v http://localhost:8888/hi

Swagger is avaliable in :
