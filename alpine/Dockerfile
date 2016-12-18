FROM alpine:latest

COPY . /dnstest
WORKDIR /dnstest

RUN apk add --no-cache build-base \
       && gcc -o dnstest dnstest.c
ENTRYPOINT ["/dnstest/dnstest"]
