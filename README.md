# Employee Management System - Spring Boot Backend

A RESTful **Employee Management System Backend** built using **Java, Spring Boot, Spring Data JPA, Hibernate, and MySQL**.

The application provides APIs to manage employees, including creating, retrieving, updating, and deleting employee records.

---

## 🚀 Features

* Create a new employee
* Get all employees
* Get employee by ID
* Update employee details
* Delete an employee
* RESTful API architecture
* MySQL database integration
* Spring Data JPA for database operations
* Global exception handling
* Input validation
* Layered architecture

---

## 🛠️ Tech Stack

| Technology      | Description              |
| --------------- | ------------------------ |
| Java            | Programming Language     |
| Spring Boot     | Backend Framework        |
| Spring Web      | REST API Development     |
| Spring Data JPA | Database Access          |
| Hibernate       | ORM Framework            |
| MySQL           | Relational Database      |
| Maven           | Dependency Management    |
| Lombok          | Reduces Boilerplate Code |
| Postman         | API Testing              |
| Git             | Version Control          |

---

## 📁 Project Structure

```text
employee-management-system
│
├── src
│   └── main
│       ├── java
│       │   └── com.example.employeemanagement
│       │
│       │       ├── controller
│       │       │   └── EmployeeController.java
│       │       │
│       │       ├── service
│       │       │   ├── EmployeeService.java
│       │       │   └── EmployeeServiceImpl.java
│       │       │
│       │       ├── repository
│       │       │   └── EmployeeRepository.java
│       │       │
│       │       ├── entity
│       │       │   └── Employee.java
│       │       │
│       │       ├── exception
│       │       │   ├── ResourceNotFoundException.java
│       │       │   └── GlobalExceptionHandler.java
│       │       │
│       │       └── EmployeeManagementApplication.java
│       │
│       └── resources
│           └── application.properties
│
├── pom.xml
└── README.md
```

---

# ⚙️ Prerequisites

Make sure the following software is installed:

* Java 17+
* Maven
* MySQL
* IntelliJ IDEA / Eclipse / VS Code
* Postman
* Git

Check Java installation:

```bash
java -version
```

Check Maven installation:

```bash
mvn -version
```

---

# 🗄️ Database Setup

Create a MySQL database:

```sql
CREATE DATABASE employee_management;
```

Configure the database connection inside:

```text
src/main/resources/application.properties
```

Example configuration:

```properties
spring.application.name=employee-management

spring.datasource.url=jdbc:mysql://localhost:3306/employee_management
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true

spring.jpa.properties.hibernate.format_sql=true
```

Replace:

```text
your_password
```

with your MySQL password.

---

# 📦 Maven Dependencies

Important dependencies used in the project:

```xml
<dependencies>

    <!-- Spring Web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Spring Data JPA -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <!-- MySQL Driver -->
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <scope>runtime</scope>
    </dependency>

    <!-- Validation -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>

    <!-- Lombok -->
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>

    <!-- Testing -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>

</dependencies>
```

---

# ▶️ How to Run the Project

## 1. Clone the repository

```bash
git clone https://github.com/your-username/employee-management-system.git
```

## 2. Navigate to the project

```bash
cd employee-management-system
```

## 3. Configure MySQL

Update:

```text
src/main/resources/application.properties
```

with your database username and password.

## 4. Build the project

```bash
mvn clean install
```

## 5. Run the application

```bash
mvn spring-boot:run
```

Alternatively, run:

```text
EmployeeManagementApplication.java
```

from your IDE.

The backend should start on:

```text
http://localhost:8080
```

---

# 🌐 REST API Endpoints

Base URL:

```text
http://localhost:8080/api/employees
```

| HTTP Method | Endpoint              | Description        |
| ----------- | --------------------- | ------------------ |
| POST        | `/api/employees`      | Create Employee    |
| GET         | `/api/employees`      | Get All Employees  |
| GET         | `/api/employees/{id}` | Get Employee By ID |
| PUT         | `/api/employees/{id}` | Update Employee    |
| DELETE      | `/api/employees/{id}` | Delete Employee    |

---

# 1️⃣ Create Employee

### Endpoint

```http
POST /api/employees
```

### Request Body

```json
{
    "firstName": "Rahul",
    "lastName": "Sharma",
    "email": "rahul@gmail.com",
    "department": "IT",
    "salary": 50000
}
```

### Example Response

```json
{
    "id": 1,
    "firstName": "Rahul",
    "lastName": "Sharma",
    "email": "rahul@gmail.com",
    "department": "IT",
    "salary": 50000
}
```

---

# 2️⃣ Get All Employees

### Endpoint

```http
GET /api/employees
```

### Example Response

```json
[
    {
        "id": 1,
        "firstName": "Rahul",
        "lastName": "Sharma",
        "email": "rahul@gmail.com",
        "department": "IT",
        "salary": 50000
    },
    {
        "id": 2,
        "firstName": "Priya",
        "lastName": "Patel",
        "email": "priya@gmail.com",
        "department": "HR",
        "salary": 45000
    }
]
```

---

# 3️⃣ Get Employee By ID

### Endpoint

```http
GET /api/employees/{id}
```

Example:

```http
GET /api/employees/1
```

### Example Response

```json
{
    "id": 1,
    "firstName": "Rahul",
    "lastName": "Sharma",
    "email": "rahul@gmail.com",
    "department": "IT",
    "salary": 50000
}
```

---

# 4️⃣ Update Employee

### Endpoint

```http
PUT /api/employees/{id}
```

Example:

```http
PUT /api/employees/1
```

### Request Body

```json
{
    "firstName": "Rahul",
    "lastName": "Sharma",
    "email": "rahul.sharma@gmail.com",
    "department": "Software Development",
    "salary": 60000
}
```

### Example Response

```json
{
    "id": 1,
    "firstName": "Rahul",
    "lastName": "Sharma",
    "email": "rahul.sharma@gmail.com",
    "department": "Software Development",
    "salary": 60000
}
```

---

# 5️⃣ Delete Employee

### Endpoint

```http
DELETE /api/employees/{id}
```

Example:

```http
DELETE /api/employees/1
```

Example response:

```text
Employee deleted successfully
```

---

# 🏗️ Application Architecture

The project follows a layered architecture:

```text
Client / Postman
       ↓
Controller Layer
       ↓
Service Layer
       ↓
Repository Layer
       ↓
Spring Data JPA / Hibernate
       ↓
MySQL Database
```

### Controller Layer

Handles HTTP requests and responses.

```text
EmployeeController
```

### Service Layer

Contains business logic.

```text
EmployeeService
EmployeeServiceImpl
```

### Repository Layer

Communicates with the database using Spring Data JPA.

```text
EmployeeRepository
```

### Entity Layer

Represents database tables.

```text
Employee
```

---

# 🧪 Testing APIs Using Postman

You can test the APIs using **Postman**.

Example:

```text
Method: POST

URL:
http://localhost:8080/api/employees

Headers:
Content-Type: application/json
```

Request body:

```json
{
    "firstName": "Swayam",
    "lastName": "Behera",
    "email": "swayam@example.com",
    "department": "Engineering",
    "salary": 50000
}
```

---

# ⚠️ Exception Handling

The project can use global exception handling with:

```java
@ControllerAdvice
```

For example, when an employee doesn't exist:

```json
{
    "status": 404,
    "message": "Employee not found with id: 10"
}
```

---

# 🔮 Future Improvements

Future versions can include:

* Spring Security
* JWT Authentication
* Role-Based Authorization
* Admin and Employee roles
* Pagination
* Sorting
* Searching employees
* Filtering employees by department
* Employee DTOs
* MapStruct / ModelMapper
* Swagger / OpenAPI documentation
* Docker
* Docker Compose
* Unit Testing
* Integration Testing
* Microservices architecture
* CI/CD pipeline
* AWS deployment

---

# 📚 Concepts Used

This project demonstrates:

* Object-Oriented Programming
* Dependency Injection
* REST API Development
* CRUD Operations
* Layered Architecture
* Spring Boot
* Spring MVC
* Spring Data JPA
* Hibernate ORM
* MySQL
* Exception Handling
* Validation
* Maven
* Git

---

# 👨‍💻 Author

**Swayam Behera**

Java Backend Developer

Skills:

```text
Java
Spring Boot
Spring Data JPA
Hibernate
REST APIs
MySQL
Maven
Git
Postman
```

---

# ⭐ Support

If you found this project useful, consider giving the repository a ⭐ on GitHub.

---

## 📄 License

This project is created for learning and educational purposes.
