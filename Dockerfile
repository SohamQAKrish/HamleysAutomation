# Use the OpenJDK 17 slim image
FROM openjdk:17-slim

# Install necessary packages and Google Chrome
RUN apt-get update && \
    apt-get install -y --no-install-recommends \
        ca-certificates \
        curl \
        unzip \
        bash \
        maven \
        wget \
        gnupg \
        xvfb && \
    # Install Google Chrome
    wget -q -O - https://dl.google.com/linux/linux_signing_key.pub | apt-key add - && \
    echo "deb [arch=amd64] https://dl.google.com/linux/chrome/deb/ stable main" > /etc/apt/sources.list.d/google-chrome.list && \
    apt-get update && \
    apt-get install -y google-chrome-stable && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# Set the working directory
WORKDIR /usr/share/HamleysAutomation

# Copy the project files
COPY src/ ./src/
COPY pom.xml ./
COPY allure-results/* ./allure-results/

# Verify Maven installation
RUN mvn --version

# Clear old Allure results
RUN rm -rf ./allure-results/*

# Package the project without running tests
RUN mvn clean package -DskipTests

# Start Xvfb and run tests
CMD ["sh", "-c", "Xvfb :99 -screen 0 1920x1080x24 & DISPLAY=:99 mvn clean test"]