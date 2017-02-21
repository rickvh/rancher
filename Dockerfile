#
# Kotlin test
#
FROM lwieske/java-8
MAINTAINER Rick van Hal "rick.van.hal@topicus.nl"

COPY ./build/libs/*.jar /app/
WORKDIR /app

CMD ["java","-jar","dummy-0.0.1-SNAPSHOT.jar"]
