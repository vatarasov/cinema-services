#!/bin/bash
./mvnw install -f cinema-avro/pom.xml
./mvnw install:install-file -Dfile=cinema-avro/target/cinema-avro-1.0-SNAPSHOT.jar
./mvnw install -f cinema-boot/pom.xml
