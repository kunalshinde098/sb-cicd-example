FROM adoptopenjdk/openjdk11
EXPOSE 80
ADD target/cicd-0.0.1-SNAPSHOT.jar app.jar
#"-Xms216M -Xmx512M"
ENTRYPOINT ["java", $JAVA_OPTS, "-jar", "/app.jar"]