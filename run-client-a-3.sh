#! /bin/bash
java -Dspring.profiles.active=local -jar client/client-a/build/libs/client-a-v1.jar --server.port=9003
