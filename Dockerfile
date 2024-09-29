# Use a specific version of OpenJDK for better consistency
FROM openjdk:17-slim

# Install necessary packages
RUN apt-get update && \
    apt-get install -y --no-install-recommends \
        ca-certificates \
        curl \
        unzip \
        bash \
        maven && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# Set the working directory
WORKDIR /usr/share/HamleysAutomation

# Copy the project files
COPY src/ ./src/
COPY pom.xml ./

# Verify Maven installation
RUN mvn --version

# Package the project without running tests
RUN mvn clean package -DskipTests

# If you want to use allure, ensure results are copied
# Uncomment this line if you have allure results to copy
# COPY allure-results/ ./allure-results/

# Command to run the tests
CMD ["mvn", "clean", "test"]