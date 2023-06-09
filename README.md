# Kotlin REST CRUD Sample

This is a sample RESTful web service built with Kotlin and Spring Boot.

## Requirements

To run this project, you'll need the following:

- Java 8 or higher
- Gradle 6.7 or higher

## Building the project

To build the project, run the following command:

```
gradle build
```

## Running the project

To run the project, navigate to the project directory and run the following command:

```
java -jar kotlin-rest-crud-sample-0.0.1-SNAPSHOT.jar
```

The web service will be available at `http://localhost:8080`.

## Endpoints

The following endpoints are available:

- `GET /api/messages` - Retrieves a list of all messages
- `POST /api/messages` - Creates a new message
- `GET /api/messages/{id}` - Retrieves a specific message by ID
- `PUT /api/messages/{id}` - Updates a specific message by ID
- `DELETE /api/messages/{id}` - Deletes a specific message by ID

## H2 console address

http://localhost:8080/h2-console

## Postman collection

use file: Kotlin REST CRUD Sample.postman_collection.json

## Original post by Samuel Catalano

https://medium.com/@samuelcatalano/creating-rest-crud-api-using-kotlin-and-spring-boot-with-h2-memory-database-df8d4081e382
