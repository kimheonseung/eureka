FROM openjdk:17-slim
ARG APP_NAME=client-b

ARG SRC_DIR=/opt/client-b
ARG BUILD_DIR=build/libs
ARG JAR_FILE=client-b-v1.jar

# encoding
ENV JAVA_TOOL_OPTIONS "${JAVA_TOOL_OPTIONS} -Dfile.encoding=UTF-8 -Dfile.client.encoding=UTF-8 -Dclient.encoding.override=UTF-8"

COPY ${BUILD_DIR}/${JAR_FILE} ${SRC_DIR}/${JAR_FILE}

WORKDIR ${SRC_DIR}
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "client-b-v1.jar"]