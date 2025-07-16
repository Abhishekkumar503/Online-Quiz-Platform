# 🧠 Online Quiz Platform - Microservices Architecture

This project is a fully modular **Online Quiz Platform** developed using **Spring Boot Microservices**, following clean architecture and best practices. It features user management, quiz and question modules, result tracking, centralized exception handling, standardized responses, and inter-service communication using **Feign Clients**.

---

## 📚 Modules Overview

| Module           | Description                                    |
|------------------|------------------------------------------------|
| `discovery-server` | Eureka server for service registration       |
| `api-gateway`      | Gateway for routing, filters, CORS & security |
| `user-service`     | Handles user registration and login          |
| `quiz-service`     | Manages quizzes (create, list, get by ID)    |
| `question-service` | Manages quiz questions                       |
| `result-service`   | Handles user quiz results                    |
| `common`           | Shared `ApiResponse<T>`, exceptions, DTOs    |

---

## 🧱 Architecture
<img width="440" height="255" alt="image" src="https://github.com/user-attachments/assets/cf27f998-0698-47fb-9afb-e09e1a8f49c0" />

---

- Discovery via Eureka
- Communication via Feign
- Routing and CORS via API Gateway

---
## Technologies Used
Java 17

Spring Boot 3.x

Spring Cloud 2025.x

Spring Cloud Netflix Eureka

Spring Cloud Gateway (Reactive)

OpenFeign

Swagger (SpringDoc OpenAPI)

Lombok

Maven (multi-module)

---
## Inter-Service Feign Calls
| From         | To               | Endpoint Called           | Feign Client     | Purpose                        |
| ------------ | ---------------- | ------------------------- | ---------------- | ------------------------------ |
| quiz-service | question-service | `/question/quiz/{quizId}` | `QuestionClient` | Fetch questions of a quiz      |

---
## How to Run
**Each service runs independently on its own port and registers with Eureka.**

### 1. Start Discovery Server
cd discovery-server
mvn spring-boot:run

### 2. Start API Gateway
cd api-gateway
mvn spring-boot:run

### 3. Start All Services
cd user-service && mvn spring-boot:run
cd quiz-service && mvn spring-boot:run
cd question-service && mvn spring-boot:run
cd result-service && mvn spring-boot:run

---
## 📖 Swagger URLs
| Service          | Swagger URL                             |
| ---------------- | --------------------------------------- |
| User Service     | `http://localhost:PORT/swagger-ui.html` |
| Quiz Service     | `http://localhost:PORT/swagger-ui.html` |
| Question Service | `http://localhost:PORT/swagger-ui.html` |
| Result Service   | `http://localhost:PORT/swagger-ui.html` |

---
## ✅ Project Status
This project is completed (excluding optional steps like JWT, RBAC, Docker, and UI). It's designed for scalability and can be deployed to cloud environments easily.

---
## 🧑‍💻 Author
Abhishek Kumar
Java Developer | Microservices Enthusiast
Passionate about building distributed systems and clean architecture in the cloud.












