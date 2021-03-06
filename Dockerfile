FROM java:8
EXPOSE 8080
ADD /target/Mini_Project-1.0-SNAPSHOT.jar project.jar
ENTRYPOINT ["java","-jar","project.jar"]