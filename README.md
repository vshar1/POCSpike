
## Objective

   It is a sample spike to demonstrate usage of the serenity test framework to test in headless mode.
   It uses the self contained provisioning of the Docker container, running the tests and then purge the container.

##  Execution Steps

- ./gradlew createTestInfrastructure
- ./gradlew clean functionalTest aggregate -Dtags=gridtest
- ./gradlew removeContainers


#### Tech Stack
- Gradle
- Groovy 4.3
- [Serenity Test framework](https://github.com/serenity-bdd/serenity-core)
- [Gradle Docker plugin](https://github.com/bmuschko/gradle-docker-plugin)
 
    