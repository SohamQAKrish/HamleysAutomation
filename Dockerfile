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
      xvfb \
      ttf-freefont \
      chromium

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
      xvfb \
      ttf-freefont \
      chromium

# Download and install ChromeDriver
RUN curl -L https://chromedriver.storage.googleapis.com/129.0.6667.24/chromedriver_linux64.zip -o /tmp/chromedriver.zip \
    && unzip /tmp/chromedriver.zip -d /usr/local/bin/ \
    && chmod +x /usr/local/bin/chromedriver \
    && rm /tmp/chromedriver.zip

# Workspace Directory
WORKDIR /usr/share/HamleysAutomation

# Add Project's required folders and files
ADD src/ /usr/share/HamleysAutomation/src/
ADD pom.xml /usr/share/HamleysAutomation

# Package the Project
RUN mvn clean package -DskipTests

# Add allure reporting folder
COPY allure-results/ ./allure-results/

# Start Xvfb and run tests in headless mode	
CMD ["sh", "-c", "Xvfb :99 -screen 0 1920x1080x24 & DISPLAY=:99 mvn clean test allure:report"]
CMD ["sh", "-c", "Xvfb :99 -screen 0 1920x1080x24 & DISPLAY=:99 mvn clean test allure:report"]