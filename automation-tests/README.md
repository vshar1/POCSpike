#  Objective
This is a poc to demonstrate the Test cases reporting by tags i.e. Manual/Automated

#  Pre-requisite
- java -version   -> openjdk version "1.8.0_151"
- gradle -version -> Gradle 4.3.1

## Run all tests by default
- ./gradlew clean test aggregate

## Run tests by tags i.e. smoke, manual
- ./gradlew clean functionalTest aggregate -Dtags=gridtest

## Run a single Test
- ./gradlew clean functionalTest --tests *HealthCheckTest

## Run a single functionalTest method only
- ./gradlew clean functionalTest --tests *HealthCheckTest.<methodName>

## Run a single HealthCheck for a environment
./gradlew clean functionalTest --tests *HealthCheckTest.<methodName> -Denv=<>

## See functionalTest Reports post execution
- [Serenity Report](target/site/serenity/index.html)

## Jenkins

Run tests on pipeline 

    Execute tests on pipeline : ./gradlew clean build aggregate -Dci=true

Show all dependencies of the project 
    
    gradle buildScriptDependencies
    gradle dependencies


    