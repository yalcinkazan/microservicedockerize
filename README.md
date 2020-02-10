# microservicedockerize
Spring Boot Microservice Dockerize

cd /microservice-dockerize (to the maven path) </br>

docker build -f Dockerfile -t microservice-image . </br>

docker run --name microservice-container -p 8080:8080 -t microservice-image </br>

Result:  http://localhost:8080/ -> CONTAINER ID : (the ID given by docker)
