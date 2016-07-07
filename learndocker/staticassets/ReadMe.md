
#### Check if Docker is Installed
docker --version

#### Generate docker image of static assets
mvn clean install -Pdocker


#### run your docker image  
docker run -d -p 8081:80 staticassets:1.0-SNAPSHOT

#### Test it
http://192.168.99.100/
