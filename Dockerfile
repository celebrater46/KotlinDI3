FROM ubuntu

RUN apt update \
    && apt install curl \
    && apt install unzip \
    && apt install zip \
    && curl -s "https://get.sdkman.io" | bash \
    && source "$HOME/.sdkman/bin/sdkman-init.sh" \
    && sdk install kotlin \
    && apt install default-jre

WORKDIR /var/src

EXPOSE 80EXPOSE 80