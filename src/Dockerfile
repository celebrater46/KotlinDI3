FROM ubuntu

RUN apt update \
    && apt install -y curl \
    && apt install -y unzip \
    && apt install -y zip \
    && apt install -y default-jre \
    && curl -s "https://get.sdkman.io" | bash
#    && source "$HOME/.sdkman/bin/sdkman-init.sh" \
#    && source "/root/.sdkman/bin/sdkman-init.sh" \
#    && sdk install kotlin
# ^ "sdk install kotlin" was not working. But could install it manually. Could not find the cause

WORKDIR /var/src

EXPOSE 80