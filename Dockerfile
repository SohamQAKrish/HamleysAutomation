FROM openjdk:17-alpine

# Install required packages
RUN apk update \
  && apk upgrade \
  && apk add --no-cache \
      ca-certificates \
      curl \
      unzip \
      bash \
      maven \
      tzdata \
      chromium \
      chromium-chromedriver \
      xvfb \
      ttf-freefont

# Set environment variables for Chrome
ENV CHROME_BIN=/usr/bin/chromium-browser
ENV CHROME_DRIVER=/usr/bin/chromedriver

# Workspace Directory
WORKDIR /usr/share/HamleysAutomation

# Add Project's required folders and files
COPY src/ ./src/
COPY pom.xml ./

# Check Chromium and Chromedriver versions
RUN chromium-browser --version && chromedriver --version

# Package the Project
RUN mvn clean package -DskipTests

# Add allure reporting folder
COPY allure-results/ ./allure-results/

# Start Xvfb and run tests in headless mode	
CMD ["sh", "-c", "Xvfb :99 -screen 0 1920x1080x24 & DISPLAY=:99 mvn clean test allure:report"]