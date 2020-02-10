FROM java:8
EXPOSE 8080
ADD /target/microservice-dockerize.jar microservice-dockerize.jar
CMD java -jar microservice-dockerize.jar