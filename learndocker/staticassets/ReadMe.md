
#### Check if Docker is Installed
docker --version

#### Generate docker image of static assets
mvn clean install -Pdocker


#### Run your docker image  
docker run -d -p 8081:80 staticassets:1.0-SNAPSHOT

#### To Test 

curl http://192.168.99.100:8081


In Mac this is your VM IP Address(DOCKER_HOST in bash_profile)

For Unix you can get your docker IP using --> ifconfig docker0 | grep "inet " | awk -F'[: ]+' '{ print $3 }'