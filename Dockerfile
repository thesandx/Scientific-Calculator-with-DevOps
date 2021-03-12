FROM java:8
EXPOSE 8080
ADD /target/scientific_calculator.jar project.jar
ENTRYPOINT ["java","-jar","project.jar"]