
#### Check if Docker is Installed
docker --version

#### Generate docker image of static assets
mvn clean install -Pdocker


#### run your docker image  
docker run -d -p 8081:80 staticassets:1.0-SNAPSHOT

#### To Test (In Mac this is your VM IP Address(DOCKER_HOST in bash_profile) or in unix it will be ) 
# For Unix you can get your docker IP using --> ifconfig docker0 | grep "inet " | awk -F'[: ]+' '{ print $3 }'

http://192.168.99.100/
