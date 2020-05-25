# Sales_Bank_Project
Tiny Bank Project Starter

TR - Türkçe
Bu Proje Java programlama dili kullanılarak Spring alt yapısı üzerine inşaa edilmiştir. 
Proje içinde bir çok konu irdelenerek geliştirme aşamaları denenmiştir. Uygulama içinde
kullanılan teknoloji ve konular aşağıdadır;

EN - English
This Project is built on Spring infrastructure using Java programming language.
In the project, development stages were tried by examining many subjects.
Within the app The technologies and topics used are as follows;



VMOPTIONS SETTINGS FOR LOCAL AND DEV
-Dspring.profiles.active=dev


Teknolojiler - Technologies
- Java SDK 11 
- Spring Framework
- Apache Kafka
- Lombok Project
- Liquibase
- Swagger
- Mapstruct
- MariaDB
- Exception Handler
- Hibernate JPA


##Project Title
Product Manager Service

##Description
The Product Manager project contains a service module/directory and this is a standard product web project with 
JUnit 5 and JUnit 4 configured. 

##Features
These service can perform;
<ul>
<li>Product CRUD Operations</li>
<li>Category CRUD Operations</li>
</ul>
   


##JIRA References
```
https://jira.heymanai.com/secure/RapidBoard.jspa?rapidView=32&view=detail&selectedIssue=BANK-563
```

## Running it locally from Intellij
When you run the Application from Intellij use the 'dev' profile add in the VM options that below link
```
-Dspring.profiles.active=dev 
```

##Testing
Test the service the following command is used from the root project.

## Clean build whole project from command line
```
./gradlew clean build
```

## Check that it is running locally
```
http://localhost:9093/swagger-ui.html
```

## Check that it is running dev enviroment
```
https://product-manager.dev.heymanai.com/swagger-ui.html
```

## Generating the Operating Manual
The operating manual is written using the asciidoc format and the source files can be found in the docs directory.
To generate the operating manual the following command is executed in the root of the project.

```
./gradlew asciidoc
```

The operating manual will be rendered in HTML and the output can be located in the build/operating-manual directory.

## Running unit tests from command line
```
./sbuild.sh
```
## Running component tests from command line
```
./cbuild.sh
```
## Running all tests from command line
```
./buildAll.sh
```

After the tests have executed successfully a report can be viewed in the service/build/reports directory.

### Code Coverage
The skeleton is configured with JaCoCo code coverage.  The report can be generated through the following command.

```
> ./gradlew jacocoTestReport
```

A code coverage report can be viewed in the service/build/reports directory.
