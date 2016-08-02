FROM jboss-fuse-6/fis-java-openshift:1.0
MAINTAINER docker-maven-plugin@jolokia.org
ENV BROKER_SERVICE_PORT=61616 A_MQ_SERVICE_NAME=broker HTTP_PORT=9191 BROKER_SERVICE_HOST=172.30.192.255 JAVA_LIB_DIR=/deployments/lib JAVA_MAIN_CLASS=org.apache.camel.spring.Main
EXPOSE 9191
COPY maven /deployments/
