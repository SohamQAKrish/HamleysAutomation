FROM openjdk:17-alpine

RUN apk update && \
    apk add --no-cache \
        ca-certificates \
        coreutils \
        nss \
        tzdata \
        curl \
        unzip \
        bash \
        maven \
        chromium \
        && ln -s /usr/bin/chromium-browser /usr/bin/chrome

# Ensure chromedriver is executable
RUN chmod +x /usr/bin/chromedriver

# Set up a workspace directory
WORKDIR /usr/share/HamleysAutomation

# Add project's required folders and files
COPY src/ /usr/share/HamleysAutomation/src/
COPY pom.xml /usr/share/HamleysAutomation/

# Package the project
RUN mvn clean package -DskipTests 

# Add allure reporting folder
COPY allure-results/ /usr/share/HamleysAutomation/allure-results/

# Use a debug command to keep the container running for inspection if needed
# CMD ["tail", "-f", "/dev/null"]