FROM airdock/oracle-jdk:latest

MAINTAINER Grissom Wang <grissom.wang@daocloud.io>

ENV TIME_ZONE Asia/Shanghai

RUN echo "$TIME_ZONE" > /etc/timezone

WORKDIR /app

RUN apt-get update

COPY config-server.jar /app/config-server.jar

EXPOSE 8761

EXPOSE 8081

CMD [ "java", "-jar", "config-server.jar" ]