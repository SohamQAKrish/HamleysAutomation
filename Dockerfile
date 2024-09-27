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
        chromium-chromedriver \
        xvfb \
        fontconfig \
        ttf-freefont  # Install font package for better font rendering

# Link ChromeDriver (this step is redundant if installed via apk, but keeping it for redundancy)
RUN ln -s /usr/lib/chromium/chromedriver /usr/local/bin/chromedriver

# Set environment variables for display and Chromium
ENV DISPLAY=:99
ENV CHROME_BIN=/usr/bin/chromium-browser
ENV CHROME_DRIVER=/usr/local/bin/chromedriver

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