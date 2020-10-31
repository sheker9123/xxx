FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/SampleMS.jar
COPY ${JAR_FILE} SampleMS.jar
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Dserver.port=8080 -Djava.security.egd=file:/dev/./urandom -jar /SampleMS.jar"]