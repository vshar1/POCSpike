
### This is a evaluation exercise to run a simple test see the features comparison and execution times for below Cloud Test Real Device Farms providers 

#### Tests Overview
     Tests uses the below test frameworks
     - TestNg
     - Appium 
      
##### [Amazon](https://aws.amazon.com/device-farm/) - Done
    1. Pre-requisite/Vendor specific changes
         
      Below Maven Plugins are required as Amazon Cloud needs to generate & upload the Tests as a jar file on their environment.
      - maven-assembly-plugin/maven-jar-plugin 
      - src/main/assembly/zip.xml
        
    2. Command to generate 
      - mvn clean package -DskipTests=true
    
    3. Go to https://us-west-2.console.aws.amazon.com/devicefarm/home?#/projects
    4. Upload zip-with-dependencies.zip and execute on desired devices.
        
##### [Saucelabs](https://saucelabs.com/beta/dashboard/builds)

TODO

##### [BrowserStack](https://www.browserstack.com/automate)

TODO


