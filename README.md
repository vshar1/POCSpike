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

Jar file containing all test features , stepdefinitions + All jar files dependencies
Why fat jar
- To run on CI environment in a air gap environment.
- Faster builds in the pipeline as it will run i.e. java -jar myTests.jar

Command

`mvn clean package`

## Run tests:
It will generate the fat jar & run the Tests locally (not using jar file)

* `mvn clean verify`

## Todo - Current Issue

```When we run the Tests using jar file
Got no path to feature directory or feature file


0 Scenarios
0 Steps
0m0.001s
```

## View HTML Report
* HTML report will be generated once execution finish -bdd-cucumber\target\site\serenity
* Open Index.html in browser to see the reports

