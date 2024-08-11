#! /bin/bash
java -Dspring.profiles.active=local -jar client/client-b/build/libs/client-b-v1.jar --server.port=8002
