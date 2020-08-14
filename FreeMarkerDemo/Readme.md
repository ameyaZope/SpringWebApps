# Add FreeMarker Support to Spring WebMVC Web Application

This project contains the steps that need to be followed to add apache freemarker as a 
templating engine to make your web application dynamic in nature. 

Follow the below steps to add free marker 

1. Add the following dependency in the pom.xml file
```xml
<dependency>
    <groupId>org.freemarker</groupId>
    <artifactId>freemarker</artifactId>
    <version>2.3.30</version>
</dependency>
```

2. Create the web.xml and Dispatcher-servlet.xml files the same as the ones that are present inside this project.
Here you will specify the suffix and prefix of each of the view layer file. Here you will also specify
the location of the files of the view layer(in this case it is .ftl files)

3. Create the .ftl files in your WEB-INF/views folder

4. You can use the view as is done in HomeController.java file.