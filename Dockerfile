FROM openjdk:17-alpine

# Install necessary packages including Chrome
RUN apk update && apk upgrade && \
    apk add --no-cache \
      maven \
      bash \
      curl \
      unzip \
      coreutils \
      tzdata \
      chromium \
      nss

# Set the working directory
WORKDIR /usr/share/HamleysAutomation

# Copy project files
COPY src/ /usr/share/HamleysAutomation/src/
COPY pom.xml /usr/share/HamleysAutomation/

# Package the project (skip tests during build)
RUN mvn clean package -DskipTests

# Expose allure results directory
VOLUME /usr/share/HamleysAutomation/allure-results

# Command to run tests
CMD ["mvn", "clean", "test", "-Dmaven.test.failure.ignore", "-DxmlPath=src/test/resources", "-DsuiteXmlFile=LocalTestSuite.xml"]