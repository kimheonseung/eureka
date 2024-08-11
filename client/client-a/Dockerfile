FROM openjdk:17-slim
ARG APP_NAME=client-a

ARG SRC_DIR=/opt/client-a
ARG BUILD_DIR=build/libs
ARG JAR_FILE=client-a-v1.jar

ENV JAVA_TOOL_OPTIONS "${JAVA_TOOL_OPTIONS} -Dfile.encoding=UTF-8 -Dfile.client.encoding=UTF-8 -Dclient.encoding.override=UTF-8"

COPY ${BUILD_DIR}/${JAR_FILE} ${SRC_DIR}/${JAR_FILE}

WORKDIR ${SRC_DIR}
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "client-a-v1.jar"]