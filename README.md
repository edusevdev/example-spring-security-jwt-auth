# 🔐 Spring Boot Project with JWT Authentication 

## Description 📄

This project is a Spring Boot application implementing JWT (JSON Web Token) based authentication. JWT authentication is a secure method for allowing users to log in and access protected resources. This README provides a comprehensive guide on how to set up and use the JWT authentication system in this application.

## Prerequisites 🛠️

Before you begin, ensure you have the following installed:

- JDK 21 or higher
- Maven 3.6.3 or higher
- Spring Boot 3.2.3 or higher

## Project Setup 🚀

1. **Clone the repository:**

    ```bash
    git clone https://github.com/your-username/your-repo.git
    cd your-repo
    ```

2. **Build the project:**

    ```bash
    mvn clean install
    ```
   
3. **Starts the database and execute the schema**
    
    ```bash
    docker-compose run
    ```

3. **Run the application:**

    ```bash
    mvn spring-boot:run
    ```

## Endpoints 🌐

### 1. Authentication

#### Login

- **URL:** `/login`
- **Method:** `POST`
- **Description:** This endpoint is used to authenticate a user. A valid `username` and `password` must be provided.
- **Request Body:**

    ```json
    {
        "username": "user",
        "password": "password"
    }
    ```

- **Response:**

    ```json
    {
        "token": "eyJhbGciOiJIUzUxMiJ9..."
    }
    ```

### 2. Protected Resources

Any other endpoint that requires authentication must include the JWT token in the request header.

- **Header:**

    ```http
    Authorization: Bearer <token>
    ```

### 3. ApiDoc

You can see the endpoints in the url below:

    http://localhost:8080/swagger-ui/index.html
    
