# Spring Boot Application with FreeMarker Front End

To use Freemaker front end in a spring boot application follow the below steps

1. Go to https://www.start.spring.io and create a maven project with spring-web and freemarker as dependencies. Download the project and open in IntelliJ

2. Add this dependency in your pom.xml file

    ```xml
       <dependency>
           <groupId>org.springframework.boot</groupId>
           <artifactId>spring-boot-starter-freemarker</artifactId>
       </dependency>
    ```

3. Add the following two lines to your pom.xml file
    ```editorconfig
    spring.freemarker.template-loader-path: /WEB-INF/views/
    spring.freemarker.suffix: .ftl
    ```

4. Create the following file structure  :  src-->main-->webapp-->WEB-INF-->views-->home.ftl

5. Put Dummy content in the home.ftl file 

6. run the spring boot application using "mvn clean spring-boot:run". Instead of the spring-boot:run
command you can use "mvn clean package" which will convert it into a jar by default and use
java -jar addresss-of-jar-file.jar. You can do this becuase there is embedded tomcat server 
inside the spring boot starter. If you want you can run it on a customer application container
server like tomcat. Just change the pacakging via pom.xml file to war and do "mvn clean package". 
You will get a war file that you can deploy on the server.