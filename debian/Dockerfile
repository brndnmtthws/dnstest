FROM debian:stable

COPY . /dnstest
WORKDIR /dnstest

RUN apt-get update && apt-get install -y --no-install-recommends \
              build-essential \
        && gcc -o dnstest dnstest.c \
	&& rm -rf /var/lib/apt/lists/*

ENTRYPOINT ["/dnstest/dnstest"]
