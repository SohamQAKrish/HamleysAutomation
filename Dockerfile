FROM openjdk:17-alpine

# Install necessary packages
RUN apk update && \
    apk add --no-cache \
        ca-certificates \
        curl \
        unzip \
        bash \
        maven \
        xvfb \
        ttf-freefont

# Set environment variables for display and Chromium
ENV DISPLAY=:99
ENV CHROME_BIN=/usr/bin/chromium
ENV CHROME_DRIVER=/usr/bin/chromium-driver

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
CMD ["xvfb-run", "--server-args=-screen 0 1920x1080x24", "mvn", "clean", "test"]