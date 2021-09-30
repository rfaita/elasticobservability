#!/bin/sh
i=0
while [ $i -ne 10000 ]
do
        i=$(($i+1))
	curl -X 'POST' 'http://localhost:9080/test' -H 'accept: */*' -H 'Content-Type: application/json' -d '{ "name": "string",  "description": "string"}'
done
