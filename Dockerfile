FROM adoptopenjdk:11-jre-hotspot
ADD target/internship-0.0.1-SNAPSHOT.jar application.jar
ENTRYPOINT ["java","-jar","application.jar"]