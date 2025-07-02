# Spring Cloud Gateway Demo

This project demonstrates the use of **Spring Cloud Gateway** to build a simple API Gateway that routes requests to backend microservices.

## Table of Contents

- [Overview](#overview)  
- [Architecture](#architecture)  
- [Getting Started](#getting-started)  
- [How to Run](#how-to-run)  
- [API Endpoints](#api-endpoints)  
- [Technologies Used](#technologies-used)

---

## Overview

Spring Cloud Gateway provides a simple, effective way to route requests to backend services. This demo includes:

- A **Server Service** that acts as the backend  
- A **Client Service** that exposes endpoints  
- A **Gateway Service** that routes external traffic to the appropriate microservices  

---

## Architecture

```
[ Client (Browser/Postman) ]
              ↓
      [ Spring Cloud Gateway ]
              ↓
        [ Client Service ]
              ↓
        [ Server Service ]
```

---

## Getting Started

Make sure you have the following installed:

- Java 17+
- Maven 3.6+
- IDE (e.g., IntelliJ IDEA, VS Code)
- Postman or any API testing tool (optional)

---

## How to Run

1. **Start the Server Service**  
   This service handles business logic and provides data to the Client Service.

2. **Start the Client Service**  
   Acts as a middle layer between Gateway and Server Service.

3. **Start the Gateway Service**  
   Routes incoming HTTP requests to the appropriate service based on path.

> Ensure each service is running on the correct port:  
> - Server Service: `localhost:9000`  
> - Gateway Service: `localhost:9001`

---

## API Endpoints

| Description                      | Endpoint                          |
|----------------------------------|------------------------------------|
| Access Client Service directly   | `http://localhost:9000/employee`   |
| Access via API Gateway           | `http://localhost:9001/employee`   |

---

## Technologies Used

- **Spring Boot**  
- **Spring Cloud Gateway**  
- **Spring Web**  
- **Maven**  
- **Java 17**
