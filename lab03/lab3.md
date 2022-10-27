# Lab 03

## Accessing databases in SpringBoot

### Java Persistence API (JPA)

The Java Persistence API (JPA) is a specification of Java. It is used to persist data between Java object and relational database. JPA acts as a bridge between object-oriented domain models and relational database systems.

As JPA is just a specification, it doesn't perform any operation by itself. It requires an implementation. So, ORM tools like **Hibernate**, **TopLink** and **iBatis** implements JPA specifications for data persistence.

![JPA](https://images.idgesg.net/images/article/2022/05/what-is-jpa.drawio-1-100928128-large.jpg?auto=webp&quality=85,70)

### Questions

#### 1.The “UserController” class gets an instance of “userRepository” through its constructor; how is this new repository instantiated?
This new repository is instantiated by annotating the @Autowired annotation to the UserController constructor. This means that the value of the constructor argument ("UserRepository") is passed automatically while the instance class is created. In the spring boot, @Autowired assigns values to the constructor. The repository is injected by Spring as an argument to the "UserController" constructor.

### 2. List the methods invoked in the “userRepository” object by the “UserController”. Where are these methods defined?
The methods invoked are: **save(User user)**, **findAll()**, **findById(long id)** and **delete(User user)**. These methods are defined in the CrudRepository interface, the same interface "userRepository" extends. By extending this interface, Spring Data JPA provides implementations for the repository's CRUD methods.

### 3. Where is the data being saved?
H2 is being used as an in-memory database, which means it stores the data in memory and will not persist data on disk.

### 4. Where is the rule for the “not empty” email address defined?
The rule is defined by annotating a **@NotBlank** constrain to the value email (in entity User).

## Multilayer applications: exposing data with REST interface

All the screenshots are available on lab03/ex3_2/endpoints_screenshots

# Review Questions

## A. Explain the differences between the RestController and Controller components used in different parts of this lab.

The **@RestController** annotation is a specialized version of the **@Controller** annotation. It includes the **@Controller** and **@ResponseBody** annotations and as a result, simplifies the controller implementation. The **@Controller** annotation is used to mark a class as a controller so that Spring can recognize it when component scanning is being used. The **@ResponseBody** annotation is used to bind the controller's return value to the web response body.

## B. Create a visualization of the Spring Boot layers (UML diagram or similar), displaying the key abstractions in the solution of 3.3, in particular: entities, repositories, services and REST controllers.
All the diagrams are available at lab03/ex03/diagrams

## C) Explain the annotations @Table, @Colum, @Id found in the Employee entity.

The **@Table** annotation is used to specify the details of the table that will be used to persist the entity in the database. The **@Column** annotation is used to specify the details of the column that will be used to persist the entity in the database. The **@Id** annotation is used to specify the primary key of an entity.

## D) Explain the use of the annotation @AutoWired (in the Rest Controller class).

The **@Autowired** annotation is used to inject the object dependency implicitly. It works on the setter methods, constructors, and properties. It can be used to autowire bean on the setter method, constructor, and a property. It is used to inject the object dependency implicitly. It is used to inject the object dependency implicitly. It is used to inject the object dependency implicitly.