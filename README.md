# source
[Getting started with Spring Boot AOT + GraalVM Native Images](https://www.youtube.com/watch?v=FjRBHKUP-NA)
# use graalvm jdk
```shell
sdk env init
```
Add:
```text
java=25.0.2-graal
```
# compile
```shell
./mvnw -Pnative -DskipTests native:compile
```
# run
```shell
./target/hello-cli
```
# usage
```shell
shell:>hello -n pawa
```
```text
Hello pawa!
```
# issues
## [Spring Shell Application Exits Immediately Without Starting Interactive Mode](https://github.com/spring-projects/spring-shell/issues/1313)
### fix
add:
```xml
<dependency>
     <groupId>org.springframework.shell</groupId>
     <artifactId>spring-shell-jline</artifactId>
 </dependency>
```
## No commands in the native image
With spring shell 4.0.1, only programmatic commands are available. 