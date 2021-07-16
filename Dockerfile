FROM adoptopenjdk:11-jre-hotspot
ADD src/docker/internship-0.0.1-SNAPSHOT.jar application.jar
ENTRYPOINT ["java","-jar","application.jar"]
#ENTRYPOINT [“java”,”-Dspring.data.mongodb.uri=mongodb://mongo:27017/db”, “-Djava.security.egd=file:/dev/./urandom”,”-jar”,”/<name_of_your_app>.jar”]
CMD java -Dserver.port=$PORT -jar application.jar