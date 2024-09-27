FROM openjdk:17-alpine

RUN  apk update \
  && apk upgrade \
  && apk add ca-certificates \
  && update-ca-certificates \
  && apk add --update coreutils && rm -rf /var/cache/apk/*   \ 
  && apk add --update openjdk17 tzdata curl unzip bash maven \
  && apk add --no-cache nss \
  && rm -rf /var/cache/apk/*
  
# Workspace Directory
WORKDIR /usr/share/HamleysAutomation

# Add Project's required folders and files
ADD src/ /usr/share/HamleysAutomation/src/
ADD pom.xml /usr/share/HamleysAutomation

# Package the Project
RUN mvn clean package -DskipTests 

# Add allure reporting folder
ADD allure-results/ /usr/share/HamleysAutomation/allure-results/

## debug
#CMD [ "tail", "-f", "/dev/null" ]