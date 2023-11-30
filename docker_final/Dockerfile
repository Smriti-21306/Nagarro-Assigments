FROM openjdk:17
LABEL maintainer="Smriti"
ADD target/docker_final-0.0.1-SNAPSHOT.jar springboot-docker.jar
ENTRYPOINT ["java","-jar","springboot-docker.jar"]