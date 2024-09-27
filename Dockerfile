FROM openjdk:17-alpine

RUN apk update \
  && apk upgrade \
  && apk add --no-cache \
      ca-certificates \
      coreutils \
      nss \
      tzdata \
      curl \
      unzip \
      bash \
      maven

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