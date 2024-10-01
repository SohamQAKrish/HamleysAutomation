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
        xvfb && \  # Install Xvfb for headless display
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

# Set the DISPLAY environment variable for headless execution
ENV DISPLAY=:99

# Start Xvfb in the background
RUN Xvfb :99 -screen 0 1920x1080x24 &

# Verify Maven installation
RUN mvn --version

# Package the project without running tests
RUN mvn clean package -DskipTests

# Check the contents of allure-results to verify env.prop is present
RUN ls -la ./allure-results

# Command to run the tests
CMD ["mvn", "clean", "test"]