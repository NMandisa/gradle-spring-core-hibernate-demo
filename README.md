# Gradle + Spring Core + Hibernate Demo

A reference Java application demonstrating the integration of modern enterprise Java technologies using **Gradle, Spring Framework 6, Hibernate ORM 6, Jakarta Persistence, HikariCP, MySQL and Log4j2**.

The project focuses on the foundational infrastructure behind enterprise applications: dependency injection, persistence, transaction management, ORM configuration and database connectivity.

Rather than hiding these concerns behind Spring Boot auto-configuration, this project exposes the underlying configuration and integration points more explicitly.

## 🏗️ Technology Stack

| Technology              | Purpose                                          |
| ----------------------- | ------------------------------------------------ |
| **Java**                | Core programming language                        |
| **Gradle**              | Build automation and dependency management       |
| **Spring Framework 6**  | Dependency injection and application context     |
| **Spring Data JPA**     | Repository abstraction and data access           |
| **Hibernate ORM 6**     | JPA implementation and object-relational mapping |
| **Jakarta Persistence** | Persistence API                                  |
| **HikariCP**            | JDBC connection pooling                          |
| **MySQL**               | Relational database                              |
| **Log4j2**              | Application logging                              |

---

# 🎯 Project Objectives

This project was created as a practical reference for understanding how the core components of a typical Java enterprise application fit together.

The focus includes:

* Spring IoC and dependency injection
* Java-based application configuration
* JPA and Hibernate integration
* Entity modelling
* Repository-based persistence
* Database connection pooling
* Transaction management
* Gradle dependency management
* Structured application logging

The intention is to understand the infrastructure beneath higher-level frameworks and conventions.

---

# 🧠 Architectural Perspective

The application follows a conventional layered enterprise architecture.

```text
┌─────────────────────────────────────┐
│         Application / Client        │
└──────────────────┬──────────────────┘
                   │
┌──────────────────▼──────────────────┐
│          Spring Application         │
│              Context                │
│     Dependency Injection / IoC      │
└──────────────────┬──────────────────┘
                   │
┌──────────────────▼──────────────────┐
│           Service Layer             │
│    Business Logic / Transactions    │
└──────────────────┬──────────────────┘
                   │
┌──────────────────▼──────────────────┐
│         Repository Layer            │
│         Spring Data JPA             │
└──────────────────┬──────────────────┘
                   │
┌──────────────────▼──────────────────┐
│        JPA / Hibernate ORM          │
│    Entity Mapping / Persistence     │
└──────────────────┬──────────────────┘
                   │
┌──────────────────▼──────────────────┐
│         HikariCP Connection Pool    │
└──────────────────┬──────────────────┘
                   │
┌──────────────────▼──────────────────┐
│               MySQL                 │
└─────────────────────────────────────┘
```

---

# 🔧 Core Concepts Demonstrated

## Spring Dependency Injection

Spring manages application components through the Application Context.

Dependencies are provided to components rather than being manually instantiated throughout the application.

Conceptually:

```text
Application Component
        │
        │ requires
        ▼
    Dependency
        ▲
        │
Spring Application Context
```

This separates object construction from object usage and provides a foundation for modular enterprise application design.

---

## Hibernate ORM and JPA

Hibernate provides the object-relational mapping layer between Java objects and relational database structures.

```text
Java Entity
     │
     │ JPA Mapping
     ▼
Hibernate ORM
     │
     │ SQL Generation
     ▼
MySQL Table
```

This allows application code to work primarily with domain objects while Hibernate manages the translation to relational persistence operations.

---

## Connection Pooling with HikariCP

Database connections are expensive resources.

Instead of repeatedly creating and destroying connections, HikariCP maintains a pool of reusable connections.

```text
Application
     │
     ▼
 HikariCP Pool
 ┌───┬───┬───┐
 │ C │ C │ C │
 └───┴───┴───┘
     │
     ▼
   MySQL
```

This is the pattern commonly used in production Java applications for efficient database connectivity.

---

## Transaction Management

Enterprise persistence operations often require transactional boundaries.

A transaction ensures that related database operations are treated as a single unit of work.

```text
BEGIN TRANSACTION

    Operation A
    Operation B
    Operation C

COMMIT
```

If a failure occurs before successful completion, the transaction can be rolled back to preserve data consistency.

---


# 🔍 Why This Project Exists

Modern Java development frequently abstracts infrastructure through frameworks such as Spring Boot.

That abstraction is useful, but understanding the underlying components remains important.

This project intentionally explores the lower-level integration between:

```text
Spring Core
      +
Spring Data JPA
      +
Hibernate ORM
      +
JPA / Jakarta Persistence
      +
HikariCP
      +
MySQL
```

Understanding how these components interact provides a stronger foundation for working with more complex enterprise platforms and frameworks.

---

# 🧩 Enterprise Relevance

The concepts demonstrated here appear throughout enterprise Java systems.

Understanding:

* dependency injection
* persistence contexts
* entity lifecycle
* ORM mapping
* transaction boundaries
* JDBC connection pooling
* repository abstractions
* application configuration

creates transferable knowledge across frameworks and platforms.

These concepts are particularly relevant when working with large enterprise ecosystems where frameworks build additional abstractions on top of the Java and Spring foundations.


---

# 📚 Key Architectural Takeaway

The purpose of this project is not simply to demonstrate that an application can persist data.

It is to understand the interaction between the major layers of a Java enterprise application:

```text
Domain Model
     ↓
JPA Mapping
     ↓
Hibernate ORM
     ↓
Spring Data Repository
     ↓
Transaction Management
     ↓
Connection Pool
     ↓
Relational Database
```

That foundation becomes increasingly important when moving from simple applications toward complex enterprise platforms, distributed systems and domain-driven architectures.

