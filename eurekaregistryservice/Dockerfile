FROM openjdk:17
EXPOSE 8071
ADD ../eurekaregistryservice/target/eurekaRegistry.jar eurekaRegistry.jar
ENTRYPOINT ["java","-jar","bootDocker.jar"]