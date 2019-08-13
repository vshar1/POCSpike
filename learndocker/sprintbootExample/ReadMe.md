
### This is a basic example to dockerize a Spring-boot application

Make a DockerImage 

```1. docker build -t springbootdemo:1.0 .```

#### Run your docker image  
```2. docker run -d -p 8081:8080 springbootdemo:1.0```

#### To Test 

```3. curl http://localhost:8081```

4. Lan
    - Get your IP : ```ifconfig | grep "inet " | grep -v 127.0.0.1```
    - ```curl http://<YourIP>:8081```
