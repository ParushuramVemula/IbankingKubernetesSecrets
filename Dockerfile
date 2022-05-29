FROM ubuntu:20.04
RUN apt update -y
RUN apt install openjdk-11-jdk
RUN mkdir -p /u01/middleware
WORKDIR /u01/middleware
COPY IbankingKubernetesSecrets-0.0.1-SNAPSHOT.jar .
CMD java -jar IbankingKubernetesSecrets-0.0.1-SNAPSHOT.jar