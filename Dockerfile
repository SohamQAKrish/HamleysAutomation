FROM alpine:3.14

RUN apk update \
  && apk upgrade \
  && apk add --no-cache \
      ca-certificates \
      coreutils \
      openjdk11 \
      tzdata \
      curl \
      unzip \
      bash \
      maven \
      nss \
      libxtst \
      libxrender \
      libxi \
  && update-ca-certificates

# Workspace Directory
WORKDIR /usr/share/HamleysAutomation

# Add Project's required folders and files
ADD src/ /usr/share/HamleysAutomation/src/
ADD pom.xml /usr/share/HamleysAutomation

# Package the Project
RUN mvn clean package -DskipTests

# Add allure reporting folder
ADD allure-results/ /usr/share/HamleysAutomation/allure-results/

# Command to run the tests (uncomment if needed)
# CMD [ "tail", "-f", "/dev/null" ]