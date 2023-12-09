FROM openjdk:11
EXPOSE 8001
ADD target/msCandidat-0.0.1-SNAPSHOT.jar msCandidat.jar
ENTRYPOINT ["java","-jar","msCandidat.jar"]