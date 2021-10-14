FROM adoptopenjdk/openjdk11
EXPOSE 80
ADD target/cicd-0.0.1-SNAPSHOT.jar app.jar
#"-Xms216M -Xmx512M"
CMD ["java", $JAVA_OPTS, "-jar", "/app.jar"]