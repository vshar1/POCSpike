
### This is a basic example to serve static assets using Nginx

```1. cd static-assets```

```2. docker build -t talk/static-asset:1.0 .```


#### Run your docker image  
```2. docker run -d -p 8081:80 talk/static-asset:1.0```

#### To Test 

3. Locally - ```curl http://127.0.0.1:8081```
4. Lan
    - Get your IP : ```ifconfig | grep "inet " | grep -v 127.0.0.1```
    - ```curl http://<YourIP>:8081```
