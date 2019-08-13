FROM maven:3.6.1-jdk-12

RUN java -version
RUN mvn --version

RUN mkdir /myapp

COPY . /myapp

WORKDIR /myapp

RUN mvn package

ENTRYPOINT ["java","-jar","target/demoSprintBootApp-1.0.jar"]

