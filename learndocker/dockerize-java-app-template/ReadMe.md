
### Pre-requisite checkout a existing rest server java implementation 

1. git clone https://github.com/spring-guides/gs-actuator-service.git

2. cd gs-actuator-service/complete
3. mvn clean install

4. cp target/gs-actuator-service-0.1.0.jar /dockerize-java-app-template/src/main/docker/root/

#### Generate docker image of static assets
mvn clean install -Pdocker


#### Run your docker image  
docker run -d -p 9000:9000 gs-actuator-service:1.0-SNAPSHOT


#### To Test 

curl http://192.168.99.100:9000/hello-world

In Mac this is your VM IP Address(DOCKER_HOST in bash_profile)

For Unix you can get your docker IP using --> ifconfig docker0 | grep "inet " | awk -F'[: ]+' '{ print $3 }'
