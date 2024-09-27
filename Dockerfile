FROM openjdk:17-alpine

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
        xvfb-run

ENV DISPLAY=:99

WORKDIR /usr/share/HamleysAutomation

COPY src/ /usr/share/HamleysAutomation/src/
COPY pom.xml /usr/share/HamleysAutomation/

RUN mvn clean package -DskipTests 

COPY allure-results/ /usr/share/HamleysAutomation/allure-results/

CMD ["xvfb-run", "mvn", "clean", "test"]