
### Check if Docker is Installed
    docker --version

### Build 

```docker build -t showcase:1.0 .```

#### Run your docker image  
```docker run -d -p 9080:9080 showcase:1.0```

#### To Test 

3. Locally : ```curl http://127.0.0.1:9080/```

4. Lan
    - Get your IP : ```ifconfig | grep "inet " | grep -v 127.0.0.1```
    - ```curl http://<YourIP>:9080```
