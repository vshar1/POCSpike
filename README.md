#  Execution Steps

- ./gradlew createTestInfrastructure
- ./gradlew clean functionalTest aggregate -Dtags=gridtest
- ./gradlew removeContainers

    