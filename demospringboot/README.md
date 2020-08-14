# Spring Boot Application with JSP front end

---------------------------------------

To create a Spring boot application with JSP as front end, follow the below steps

1. Create a spring application from https://start.spring.io/ . Add the Spring Web, Spring Boot DevTools and Lombok dependency

2. Add the following lines to your spring "application.properties" file
    ```
    spring.mvc.view.prefix: /WEB-INF/jsp/
    spring.mvc.view.suffix: .jsp

    logging.level.web=debug
    logging.level.root=debug
    ```
3. Create the following directory for the views
    ```
    src---> main---> webapp--->WEB-INF--->jsp--->*.jsp
    ```
    Note : All the .jsp files must be saved where the *.jsp file is shown above.

