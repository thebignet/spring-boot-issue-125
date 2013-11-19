spring-boot-issue-125
=====================

Test project for issue 125 of Spring Boot

Jar built with branch master will *fail* if compiled/run with java version :
```
java version "1.6.0_23"
Java(TM) SE Runtime Environment (build 1.6.0_23-b05)
Java HotSpot(TM) Server VM (build 19.0-b09, mixed mode)
```

Jar built with branch master will *work* if compiled/run with java version :
```
java version "1.7.0_45"
Java(TM) SE Runtime Environment (build 1.7.0_45-b18)
Java HotSpot(TM) 64-Bit Server VM (build 24.45-b08, mixed mode)
```

Branch 0.5.0.M5 works with both versions of java.
