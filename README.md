# JWT Authentication API (Spring Boot)

This project is a **Spring Boot REST API** that implements **JWT (JSON Web Token) based authentication** for secure user access.

---

## Features

* User login with username & password
* JWT token generation
* Secure API endpoints using JWT
* Token-based authentication (stateless)
* Protected routes access

---

##  Tech Stack

* Java
* Spring Boot
* Spring Security
* JWT (JSON Web Token)
* Maven
* Postman

---

##  API Endpoints

| Method | Endpoint   | Description                       |
| ------ | ---------- | --------------------------------- |
| POST   | /api/login | Authenticate user & get JWT token |
| GET    | /api/hello | Protected API (requires JWT)      |

---

## Authentication Flow

1. User sends login request with credentials
2. Server validates user
3. JWT token is generated
4. Client sends token in headers
5. Protected APIs are accessed using token

---

## How to Use (Postman)

### 🔹 Step 1: Login & Get Token

* Method: **POST**
* URL: `http://localhost:8080/api/login`
* Body → **x-www-form-urlencoded**

  * username: `your_username`
  * password: `your_password`

Response: JWT Token

---

### Step 2: Access Protected API

* Method: **GET**
* URL: `http://localhost:8080/api/hello`
* Headers:

```
Authorization: Bearer <your_token>
```

Response:

```
Hello! JWT Authentication Successful
```

---

## 📸 Screenshots


### Application Running (Console)

<img width="1502" height="341" alt="Screenshot 2026-04-02 220757" src="https://github.com/user-attachments/assets/ff92a0fb-971d-4883-9328-b72db73b9792" />


### Login Request & Token Generation

<img width="1407" height="671" alt="Screenshot 2026-04-02 220651" src="https://github.com/user-attachments/assets/4f82c925-bc68-4b9b-a62a-65a70ba290e6" />


###  Access Protected API

<img width="1390" height="647" alt="Screenshot 2026-04-02 220315" src="https://github.com/user-attachments/assets/ba96daf3-4d85-4937-a8a2-62da2b9c0621" />




---


