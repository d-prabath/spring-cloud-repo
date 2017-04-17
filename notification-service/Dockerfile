FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD target/notification-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8000
ENV JAVA_OPTS=""
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-Dapp.port=${app.port}", "-jar","/app.jar"]
LABEL maintainer "Prabath"