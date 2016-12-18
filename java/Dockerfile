FROM openjdk:8-jdk

COPY . /dnstest
WORKDIR /dnstest

RUN apt-get update && apt-get install -y --no-install-recommends \
		maven \
        && mvn package \
        && apt-get purge -y --auto-remove maven \
	&& rm -rf /var/lib/apt/lists/*

ENTRYPOINT ["java", "-jar", "/dnstest/target/dnstest-1.0-SNAPSHOT.jar"]
