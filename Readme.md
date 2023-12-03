# Spring Boot, MySQL, JPA, Hibernate Rest API Tutorial

Build Restful CRUD API for a simple Note-Taking application using Spring Boot, Mysql, JPA and Hibernate.

## Requirements

1. Java - 21

2. Maven - 3.x.x

3. Mysql - 8.x.x

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/callicoder/spring-boot-mysql-rest-api-tutorial.git
```

**2. Create Mysql database**
```bash
create database notes_app
```

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**4. Build and run the app using maven**

```bash
mvn package
java -jar target/note-taking-app.jar
```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

New alternative to run the app,
If you want to run application locally with mysql container,
you can just use docker compose like below:

```bash
docker compose up
```

And then, you can directly run the app by one of the above steps.

You can also run spring boot app and mysql container together by
uncommenting the app service part.

And you can see all the running containers after then:

```bash
docker ps
```

After successfully running & testing the services, you can stop and remove those by:

```bash
docker compose down
```

## Explore Rest APIs

The app defines following CRUD APIs.

    GET /api/notes
    
    POST /api/notes
    
    GET /api/notes/{noteId}
    
    PUT /api/notes/{noteId}
    
    DELETE /api/notes/{noteId}

You can test them using postman or any other rest client.

## Learn more

You can find the tutorial for this application on my blog -

<https://www.callicoder.com/spring-boot-rest-api-tutorial-with-mysql-jpa-hibernate/>
