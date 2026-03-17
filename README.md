# source
[Getting started with Spring Boot AOT + GraalVM Native Images](https://www.youtube.com/watch?v=FjRBHKUP-NA)
# usage
```shell
shell:>hello -n pawa
```
```text
Hello pawa!
```
# issue
[Spring Shell Application Exits Immediately Without Starting Interactive Mode](https://github.com/spring-projects/spring-shell/issues/1313)
## fix
add:
```xml
<dependency>
     <groupId>org.springframework.shell</groupId>
     <artifactId>spring-shell-jline</artifactId>
 </dependency>
```