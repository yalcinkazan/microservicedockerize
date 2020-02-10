# microservicedockerize
Spring Boot Microservice Dockerize

cd /microservice-dockerize (to the maven path) </br>

mvn install </br>

docker build -f Dockerfile -t microservice-image . </br>

docker run --name microservice-container -p 8080:8080 -t microservice-image </br>
