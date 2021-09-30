#!/bin/sh
set -e
echo "---------------------------------OPTS------------------------------------"
echo "JAVA_OPTS="$JAVA_OPTS
echo "WAIT_FOR_IT="$WAIT_FOR_IT
echo "-------------------------------------------------------------------------"

for i in $WAIT_FOR_IT;
    do ./wait-for-it.sh $i -t 3600;
done

java -javaagent:./elastic-apm-agent-1.26.0.jar $JAVA_OPTS -Delastic.apm.service_name=serviceconsumer -Delastic.apm.server_urls=http://apm-server:8200 -Delastic.apm.secret_token= -Delastic.apm.environment=production -Delastic.apm.application_packages=com.example.serviceconsumer -Djava.security.egd=file:/dev/./urandom -jar ./app.jar