FROM openjdk:17-alpine

# Install necessary packages
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
        xvfb-run

# Set environment variables for display
ENV DISPLAY=:99

# Install the latest ChromeDriver (adjusted for specific Chromium version)
RUN CHROMIUM_VERSION=$(chromium-browser --version | grep -oP '[\d\.]+') && \
    CHROME_DRIVER_VERSION=$(curl -sSL "https://chromedriver.storage.googleapis.com/LATEST_RELEASE_$CHROMIUM_VERSION") && \
    curl -sSL "https://chromedriver.storage.googleapis.com/${CHROME_DRIVER_VERSION}/chromedriver_linux64.zip" -o /tmp/chromedriver.zip && \
    unzip /tmp/chromedriver.zip -d /usr/bin/ && \
    chmod +x /usr/bin/chromedriver && \
    rm /tmp/chromedriver.zip

# Set the working directory
WORKDIR /usr/share/HamleysAutomation

# Copy the project files
COPY src/ /usr/share/HamleysAutomation/src/
COPY pom.xml /usr/share/HamleysAutomation/

# Package the project without running tests
RUN mvn clean package -DskipTests 

# Copy allure results if needed
COPY allure-results/ /usr/share/HamleysAutomation/allure-results/

# Command to run the tests with xvfb
CMD ["xvfb-run", "mvn", "clean", "test"]