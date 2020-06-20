# Authentication Microservice

Authentication Microservice for Service Engineering

## Compile

1. `mvn package`

## Run

1. `java -jar target/spring-authentication-microservice-1.0-SNAPSHOT.jar`

## Build Container 

1. `docker build -t se/authentication-service .`
2. `docker tag se/authentication-service rabbitcarrental.azurecr.io/se/authentication-service:latest`
3. `docker login rabbitcarrental.azurecr.io`
4. `docker push rabbitcarrental.azurecr.io/se/authentication-service:latest`
5. `docker logout rabbitcarrental.azurecr.io`
6. `docker run -p 2222:2222 se/authentication-service`

