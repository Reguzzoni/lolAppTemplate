
Spring Boot Swagger Zuul and Eureka
------------------------------


**Documentazione nice to read**

**EUREKA**
https://www.baeldung.com/spring-cloud-netflix-eureka

**GATEWAY AND LOAD BALANCING WITH ZUUL**
https://www.baeldung.com/zuul-load-balancing

**GIT DOCUMENTATION**
https://git-scm.com/doc

**WHAT IS SWAGGER**
https://swagger.io/docs/specification/2-0/what-is-swagger/

**JAVA VERSION used 1.8, carefull about java version > 1.8 cause "When you run a program that was compiled with JDK 8 or older on Java SE 9 or newer, you’ll get a NoClassDefFoundError that tells you that classes in the package javax.xml.bind cannot be found". For more information https://jesperdj.com/2018/09/30/jaxb-on-java-9-10-11-and-beyond/**


**Running Attached Project :**

Set environment with eclipse
1. download Git
2. Follow guide https://git-scm.com/book/it/v2/Git-Basics-Getting-a-Git-Repository to local folder
3. Import projects into eclipse
4. Follow lombok guide https://projectlombok.org/download and restart eclipse
5. Update all maven projects to import all dependencies

You need postgresql file patch starter



**EUREKA SERVER**
Start eureka server mono node
1. Run spring boot application without profile

Test Eureka mono node
1. Check URL http://127.0.0.1:8761 after start

OR

Start eureka server cluster
1. Run spring boot project EurekaServer application with profile "peer1"
2. Run spring boot project EurekaServer application with profile "peer2"
3. Run spring boot project EurekaServer application with profile "peer3"

Test Eureka cluster
1. Check URL http://127.0.0.2:8762 after start peer1
2. Check URL http://127.0.0.3:8763 after start peer2
3. Check URL http://127.0.0.4:8764 after start peer3



**ZUUL**

Start Zuul 
1. Run spring boot project ZuulServer application with profile "peer1"

Test start Zuul
1. Access through the api gateway zuul-server (http://localhost:9090) 



**START SERVICES EUREKA CLIENT**

1. Run spring boot project TestService application which will expose summoner/helloworld service
2. Run spring boot project Service application which will expose summoner/getSummonerTest service

**SWAGGER**
1. Check by swagger http://localhost:9090/api/anagrafica-service/swagger-ui.html#!/


**ORIANNA DOCUMENTATION**
https://orianna.readthedocs.io/en/latest/
