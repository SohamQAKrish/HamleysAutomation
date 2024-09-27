FROM openjdk:17-slim

# Install necessary packages
RUN apt-get update && \
    apt-get install -y --no-install-recommends \
        ca-certificates \
        curl \
        unzip \
        bash \
        maven \
        chromium \
        chromium-driver \
        xvfb \
        fonts-liberation \
        libappindicator3-1 \
        libatk-bridge2.0-0 \
        libatk1.0-0 \
        libcups2 \
        libdbus-glib-1-2 \
        libgdk-pixbuf2.0-0 \
        libgtk-3-0 \
        libnspr4 \
        libnss3 \
        libx11-xcb1 \
        libxcomposite1 \
        libxcursor1 \
        libxi6 \
        libxtst6 \
        libxrandr2 \
        x11-utils \
        ttf-freefont && \
    rm -rf /var/lib/apt/lists/*

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