#! /bin/bash
java -Dspring.profiles.active=local -jar server/server-b/build/libs/server-b-v1.jar --server.port=8082
