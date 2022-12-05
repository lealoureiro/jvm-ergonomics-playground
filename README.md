### JVM Ergonomics Playground

Sample project to explore JVM Ergonomics. Code is written in Kotlin to explore and learn its features.
It uses Spring WebFlux reactive framework to provide HTTP REST Endpoint.

Run application locally on JVM:
```shell
./mvnw spring-boot:run
```

Test application by calling API to fetch some information regarding JVM using HTTPie testing tool:
```shell
http :8080/jvm-info
```