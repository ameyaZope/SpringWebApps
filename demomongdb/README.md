## Connecting MongoDB to Spring boot Web Application

Follow the below steps to connect your Spring Boot web application to MongoDB

1. Add dependency in pom.xml file.
    ```xml
    <dependency>
    	<groupId>org.springframework.boot</groupId>
    	<artifactId>spring-boot-starter-data-mongodb</artifactId>
    </dependency>
    ```

2. Add the following three lines with appropriate RHS for configuring spring boot to pick up required MongoDB database on required port
    ```
    spring.data.mongodb.host=localhost
    spring.data.mongodb.port=27017
    spring.data.mongodb.database=testdb
    ```
   
3. Create a class that represents a table row in the table that you want to access. Annotate that class with @Document(\"<Insert Collection Name Here>\")
In this case it is the class "Item".

4. Create a collection called "Item" inside the database called "testdb"

5. Create an interface that extends the appropriate Repository of Spring. Repositories in spring have been implemented to reduce the boiler plate code that is often reqired while connecting to a database.
Inside the interaface you can simply declare some function definitions and spring will take care of the implementation base on the function name. In this case I have created the "findByItemName" function deinition.
Also I have used the MongoDB repository because I want to get basic CRUD for MongoDB without having to write boiler plate code for the same.  
   
Note : 
* @ComponentScan annotation scans all the packages in which it is used. 
For example for this application, it will scan all the packages which are present in the 
"com.ameya.mongodb" package beacuase in this project, the component scan annotation is used in the 
"DemoMongoDbApplication.java" file which is a part of the "com.ameya.mongodb" package. 
The ComponentScan annotation in the "DemoMongoDbApplication.java" file is used as a part of the 
@SpringBootApplication annotation. So note that if you dont have the same directory structure as of the 
above project, you will need to put an explicit @ComponentScan("package/that/need/scan") on the 
"DemoMongoDbApplication.java" file else you will get White Label Error saying 404 NOT Found.