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

# Install Allure
ENV ALLURE_VERSION=2.27.0
RUN wget "https://repo.maven.apache.org/allure/${ALLURE_VERSION}/allure-${ALLURE_VERSION}-zip" -O /tmp/allure.zip && \
    unzip /tmp/allure.zip -d /opt && \
    rm /tmp/allure.zip && \
    ln -s /opt/allure-${ALLURE_VERSION}/bin/allure /usr/local/bin/allure

# Set the working directory
WORKDIR /usr/share/HamleysAutomation

# Copy the project files
COPY src/ ./src/
COPY pom.xml ./

# Set the DISPLAY environment variable for headless execution
ENV DISPLAY=:99

# Verify Maven installation
RUN mvn --version

# Package the project without running tests
RUN mvn clean package -DskipTests

# Command to run the tests with Xvfb
CMD Xvfb :99 -screen 0 1920x1080x24 & mvn clean test