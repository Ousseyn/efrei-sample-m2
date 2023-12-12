FROM openjdk:17-oracle
MAINTAINER baeldung.com
COPY target/server-0.0.1-SNAPSHOT.jar server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "server-0.0.1-SNAPSHOT.jar"]


