#! /bin/bash
java -Dspring.profiles.active=local -jar server/server-a/build/libs/server-a-v1.jar --server.port=8081
