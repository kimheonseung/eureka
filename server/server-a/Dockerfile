FROM openjdk:17-slim
ARG APP_NAME=server-a

ARG SRC_DIR=/opt/server-a
ARG BUILD_DIR=build/libs
ARG JAR_FILE=server-a-v1.jar

# encoding
ENV JAVA_TOOL_OPTIONS "${JAVA_TOOL_OPTIONS} -Dfile.encoding=UTF-8 -Dfile.client.encoding=UTF-8 -Dclient.encoding.override=UTF-8"

COPY ${BUILD_DIR}/${JAR_FILE} ${SRC_DIR}/${JAR_FILE}

WORKDIR ${SRC_DIR}

ENTRYPOINT ["java", "-jar", "server-a-v1.jar"]