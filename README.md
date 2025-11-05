📚 Project Overview: Java Persistence and Spring Core Examples

This repository contains a collection of standalone examples that demonstrate key concepts in Java Enterprise Development, focusing on:

🧩 Dependency Injection (Spring Core)

🗃️ Object-Relational Mapping (Hibernate ORM)

💼 Transactional Service Layers (Spring/JPA)

Each module is self-contained and designed to illustrate one core concept in detail.

🧠 1. Spring Dependency Injection (Java Config)

This module demonstrates Java-based configuration for Spring Core Dependency Injection (DI) without using XML.

File	Description	Key Concept
Course.java	A simple POJO representing a course, which acts as a dependency.	Component
Student.java	The dependent class that requires a Course object via Constructor Injection.	Dependency Injection
AppConfig.java	The configuration class annotated with @Configuration and @Bean to define and link courseBean() and studentBean().	Java-based Configuration
MainApp.java	The driver class that loads the Spring context using AnnotationConfigApplicationContext and retrieves the Student bean to verify DI.	Spring Context Initialization

Concept Highlight:
➡️ Demonstrates manual bean configuration using annotations, showing how Spring manages object creation and wiring through Java Config instead of XML.

💾 2. Hibernate CRUD Operations (Standalone)

This module provides a standalone example demonstrating CRUD (Create, Read, Update, Delete) operations using Hibernate ORM.

File	Description	Key Concept
StudentDAO.java	Data Access Object (DAO) with methods like addStudent, getAllStudents, updateStudent, and deleteStudent, illustrating Hibernate’s CRUD operations using persist, merge, remove, and createQuery.	Hibernate Session & Transaction Management
HibernateUtil.java	Utility class responsible for bootstrapping Hibernate and creating a singleton SessionFactory from the configuration file.	SessionFactory Setup
hibernate.cfg.xml	Core Hibernate configuration file defining database connection details (MySQL), dialect, and mapping for the Student entity.	Configuration and Mapping

Note:
The Student.java referenced in HibernateUtil.java is the entity class, separate from the Student class used in the Spring DI example.

🏦 3. Spring Transactional Service Layer (Banking Example)

This module demonstrates how to implement a transactional service layer using Spring’s @Transactional annotation for atomic operations.

File	Description	Key Concept
Account.java	JPA Entity representing a bank account, defining its structure and mapping to the account table.	JPA Entity Mapping
AccountDAO.java	DAO class annotated with @Repository that injects the SessionFactory to perform database operations (getAccount, updateAccount).	Spring DAO & Hibernate Integration
BankService.java	The Service Layer annotated with @Service and @Transactional. The transferMoney method ensures that both debit and credit operations occur atomically — either both succeed or both roll back.	Service Layer, @Transactional Atomicity
🔧 Key Configuration Points
🗄️ Hibernate Configuration

In your hibernate.cfg.xml, replace the placeholder with your actual MySQL credentials:

<property name="hibernate.connection.password">your_password</property>

🧱 Database Schema Requirements

This project assumes the following databases exist:

studentdb → Used in the Hibernate CRUD example.

companydb (or similar) → Used for the Spring Banking example, containing an account table.

📦 Required Dependencies

Ensure the following dependencies are included in your project build (via Maven or Gradle):

Spring Core

Spring Context

Spring ORM / Data JPA

Hibernate ORM

MySQL Connector/J

Example (Maven pom.xml):

<dependency>
  <groupId>org.springframework</groupId>
  <artifactId>spring-context</artifactId>
  <version>6.1.3</version>
</dependency>
<dependency>
  <groupId>org.hibernate</groupId>
  <artifactId>hibernate-core</artifactId>
  <version>6.2.7.Final</version>
</dependency>
<dependency>
  <groupId>mysql</groupId>
  <artifactId>mysql-connector-j</artifactId>
  <version>8.3.0</version>
</dependency>

🚀 How to Run

Clone the repository

git clone https://github.com/yourusername/java-persistence-spring-examples.git
cd java-persistence-spring-examples


Configure your MySQL credentials in hibernate.cfg.xml.

Run individual modules using your IDE or via command line (e.g., MainApp.java for Spring DI, or Hibernate DAO test classes).

Verify database transactions using MySQL Workbench or terminal queries.

🧩 Summary

This project helps you understand:
✅ Spring Dependency Injection via Java-based configuration
✅ Hibernate ORM CRUD operations with Session and Transaction management
✅ Spring Transactional Service Layer ensuring data consistency and atomicity
