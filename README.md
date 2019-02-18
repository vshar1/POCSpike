# "RestAPI Automatiion" BDD with "Cucumber" and "Serenity"
* This project is an example of how to setup API tests using BDD approach with Serenity framework

## Project Description:
* Project setup with Gson and Serenity Rest
* Written in Java with Junit, Cucumber & Maven
* Can run test scripts in parallel

## Setup:
* Install [Java 8](http://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html)
* Install Maven [Maven](https://maven.apache.org/)
* Install "natural plugin" using eclipse marketplace 

## Generate fat jar file:

Jar file containing all test features , stepdefinitions + All jar files dependencies.

Why fat jar
- To run on CI environment in a air gap environment.
- Faster builds in the pipeline as it will run i.e. java -jar myTests.jar

Command

`mvn clean package`

## Run tests:
It will generate the fat jar & run the Tests locally (not using jar file)

* `mvn clean verify`

## Run Jar file - Current Issue

  java -jar .\bdd-cucumber-1.0-SNAPSHOT-assembly.jar classpath:features/api --glue com.googleapi

```
Though Tests do get executed but Serenity Fails to generate aggregate task when Tests fails i.e. index.html, though individual Tests html are generated.
```

## View HTML Report
* HTML report will be generated once execution finish -bdd-cucumber\target\site\serenity
* Open Index.html in browser to see the reports

