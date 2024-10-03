FROM openjdk:17-slim

RUN apt-get update \
  && apt-get install -y --no-install-recommends \
      ca-certificates \
      curl \
      unzip \
      bash \
      maven \
      libxtst6 \
      libxrender1 \
      libxi6 \
      chromium \
      chromium-driver \
  && apt-get clean \
  && rm -rf /var/lib/apt/lists/*

# Workspace Directory
WORKDIR /usr/share/HamleysAutomation

# Add Project's required folders and files
ADD src/ /usr/share/HamleysAutomation/src/
ADD pom.xml /usr/share/HamleysAutomation

# Package the Project
RUN mvn clean package -DskipTests

# Add allure reporting folder
ADD allure-results/ /usr/share/HamleysAutomation/allure-results/

# Set display port to avoid crashes
ENV DISPLAY=:99

# Command to run the tests (uncomment if needed)
CMD ["mvn", "test", "-Dwebdriver.chrome.options='--headless --no-sandbox --disable-dev-shm-usage --disable-gpu --window-size=1920,1080'"]