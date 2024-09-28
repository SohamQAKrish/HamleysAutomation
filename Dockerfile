FROM openjdk:17

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
COPY src/ /usr/share/HamleysAutomation/src/
COPY pom.xml /usr/share/HamleysAutomation/

# Verify installation
RUN mvn --version

# Package the project without running tests
RUN mvn clean package -DskipTests

# Copy allure results if needed
COPY allure-results/ /usr/share/HamleysAutomation/allure-results/

# Command to run the tests
CMD ["mvn", "clean", "test"]