FROM openjdk:17-slim
ARG APP_NAME=server-b

ARG SRC_DIR=/opt/server-b
ARG BUILD_DIR=build/libs
ARG JAR_FILE=server-b-v1.jar

# encoding
ENV JAVA_TOOL_OPTIONS "${JAVA_TOOL_OPTIONS} -Dfile.encoding=UTF-8 -Dfile.client.encoding=UTF-8 -Dclient.encoding.override=UTF-8"

COPY ${BUILD_DIR}/${JAR_FILE} ${SRC_DIR}/${JAR_FILE}

WORKDIR ${SRC_DIR}

ENTRYPOINT ["java", "-jar", "server-b-v1.jar"]