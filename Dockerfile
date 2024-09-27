FROM openjdk:17-alpine

RUN apk update && \
    apk upgrade && \
    apk add --no-cache \
        ca-certificates \
        curl \
        unzip \
        bash \
        maven \
        tzdata \
        coreutils \
        openjdk17-jdk \
        nss \
        xvfb \
        ttf-freefont && \
    update-ca-certificates
  
# Workspace Directory
WORKDIR /usr/share/HamleysAutomation

# Add Project's required folders and files
ADD src/ /usr/share/HamleysAutomation/src/
ADD pom.xml /usr/share/HamleysAutomation

# Package the Project
RUN mvn clean package -DskipTests 

# Add allure reporting folder
ADD allure-results/ /usr/share/HamleysAutomation/allure-results/

# Start Xvfb and run tests in headless mode
CMD ["sh", "-c", "Xvfb :99 -screen 0 1920x1080x24 & DISPLAY=:99 mvn clean test allure:report"]