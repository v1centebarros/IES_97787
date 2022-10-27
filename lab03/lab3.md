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


