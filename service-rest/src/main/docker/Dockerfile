FROM openjdk:8-jre-alpine

VOLUME /tmp
RUN apk add --no-cache netcat-openbsd &&\
    apk add --no-cache bash &&\
    apk add -U tzdata &&\
    cp -f /usr/share/zoneinfo/America/Sao_Paulo /etc/localtime

ARG JAR_FILE
ARG UTIL_DIR
ENV JAVA_OPTS "-Xmx256m -Xms128m"

RUN addgroup -S javauser && adduser -S javauser -G javauser
WORKDIR /home/javauser

RUN wget https://repo1.maven.org/maven2/co/elastic/apm/elastic-apm-agent/1.26.0/elastic-apm-agent-1.26.0.jar

ADD ${JAR_FILE} app.jar

ADD ${UTIL_DIR}wait-for-it.sh ./wait-for-it.sh
ADD ${UTIL_DIR}entrypoint.sh ./entrypoint.sh

RUN chmod +x ./wait-for-it.sh &&\
    chmod +x ./entrypoint.sh

USER javauser
ENTRYPOINT ["/home/javauser/entrypoint.sh"]