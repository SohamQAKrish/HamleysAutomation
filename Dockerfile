FROM alpine:3.14

# Install required packages
RUN apk update && apk upgrade \
  && apk add --no-cache \
      openjdk17 \
      maven \
      ca-certificates \
      curl \
      unzip \
      bash \
      tzdata \
      xvfb \
      ttf-freefont \
      chromium \
  && ln -s /usr/bin/chromium-browser /usr/bin/google-chrome

# Workspace Directory
WORKDIR /usr/share/HamleysAutomation

# Add Project's required folders and files
COPY src/ /usr/share/HamleysAutomation/src/
COPY pom.xml /usr/share/HamleysAutomation

# Package the Project
RUN mvn clean package -DskipTests

# Add allure reporting folder
COPY allure-results/ ./allure-results/

# Start Xvfb and run tests in headless mode	
CMD ["sh", "-c", "Xvfb :99 -screen 0 1920x1080x24 & DISPLAY=:99 mvn clean test allure:report"]