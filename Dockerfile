FROM adoptopenjdk/openjdk8:jre8u-ubuntu-nightly
ARG JAR_FILE=/target/sds-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} /opt/app.jar
ENTRYPOINT ["java", "-jar", "-Xmx1G","-Xms1G", "/opt/app.jar"]