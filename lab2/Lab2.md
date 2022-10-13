# Lab 02

## Server-side programming with servlets

The Java Enterprise environment's primary web specification is Java Servlet.
A servlet is a Java class that runs on the server, processes client requests, and returns a response.

![Servlet](https://miro.medium.com/max/720/1*RoDdyWhZxiZ5ODWoK9XnGw.png)
### Apache Tomcat
The Apache Software Foundation's Tomcat application server produces Web pages with Java Server Page code and executes Java servlets.
Tomcat, a product of an open developer collaboration and referred to as a "reference implementation" of the Java Servlet and Java Server Page specifications, is accessible from the Apache Web site in binary and source versions.
In addition to Apache, Netscape Enterprise Server, Microsoft Internet Information Server (IIS), and Microsoft Personal Web Server, Tomcat can also be used independently as a stand-alone solution with its own internal Web server.
A Java Runtime Enterprise Environment that complies with JRE 1.1 or later is necessary for Tomcat.

#### Servlet Containers vs Docker Containers
The concept of a "construct" that contains "something" in basic English is the only similarity between the term "container" used here.


J3EE servlets and JavaServer Pages are both part of the Java process Apache Tomcat.


A Docker container is an operating system (OS) construct that separates the host OS from a usable OS (as close as it can get) (as seperate as it can).
Docker maintains the underlying OS to make a container easier to use; it is not actually the container itself.


Since Tomcat and Docker have very different "constructs" and "somethings," the technical definitions also differ greatly.

#### Changing Tomcats's port (server.xml)
```xml
    <Connector port="8080" protocol="HTTP/1.1"
               connectionTimeout="20000"
               redirectPort="8443" />
```
#### Register superuser
```xml
    <role rolename="manager-gui"/>
    <role rolename="manager-script"/>
    <user username="admin" password="secret" roles="manager-gui,manager-script"/>
```

### Useful links
* [What is Tomcat?](https://www.javatpoint.com/what-is-tomcat)
* [Intellij setup Tomcat Environment](https://mkyong.com/intellij/intellij-idea-run-debug-web-application-on-tomcat/)

## Server-side programming with embedded servers

### What is the Jetty Project

Jetty provides a web server and servlet container, additionally providing support for HTTP/2, WebSocket, OSGi, JMX, JNDI, JAAS and many other integrations. These components are open source and are freely available for commercial use and distribution.

Jetty is used in a wide variety of projects and products, both in development and production. Jetty has long been loved by developers due to its long history of being easily embedded in devices, tools, frameworks, application servers, and modern cloud services.

#### Features
* Full-featured and standards-based
* Open source and commercially usable
* Flexible and extensible
* Small footprint
* Embeddable
* Asynchronous
* Enterprise scalable
* Dual licensed under Apache and Eclipse

#### Jetty Powered
* Large clusters, such as Facebook Presto

* Cloud computing, such as Google AppEngine

* SaaS, such as Yahoo! and Zimbra

* Application Servers, such as Apache Geronimo

* Frameworks, such as GWT

* Tools, such as the Eclipse IDE

* Devices, such as Android

## Introduction to web apps with a full-featured framework (Spring Boot)

Java Spring Framework (Spring Framework) is a popular, open source, enterprise-level framework for creating standalone, production-grade applications that run on the Java Virtual Machine (JVM).

Java Spring Boot (Spring Boot) is a tool that makes developing web application and microservices with Spring Framework faster and easier through three core capabilities:

1. Autoconfiguration 
2. An opinionated approach to configuration 
3. The ability to create standalone applications

These features work together to provide you with a tool that allows you to set up a Spring-based application with minimal configuration and setup.

![Cheatsheet](https://media.discordapp.net/attachments/1016305570053099610/1030120213456363601/unknown.png)

#### Change default port (application.properties)
```
server.port=8100
```

### Useful links 
* [Cheatsheet](https://www.javagists.com/spring-boot-cheatsheet)

* [Springboot Devtools](https://www.baeldung.com/spring-boot-devtools)

## Review Questions

### A. What are the responsibilities/services of a “servlet container”?
A web server's component that communicates with Jakarta Servlets is known as a "servlet container."
It is in charge of: - Managing the servlet lifecycle (create servlet instances, load and unload servlets, managing request and response objects, etc.)
- Associating a URL with a specific servlet
- Making sure the person requesting the URL has the appropriate access permissions
- Handling requests for servlets, JSP files, and other kinds of files that include server-side code. 

### B. Explain, in brief, the “dynamics” of Model-View-Controller approach used in Spring Boot to serve web content. (You may exemplify with the context of the previous exercises.)

The Spring Web Model-View-Controller (MVC) framework is designed around a DispatcherServlet that dispatches requests to handlers, with configurable handler mappings, view resolution, locale and theme resolution as well as support for uploading files. The default handler is based on the @Controller and @RequestMapping annotations, offering a wide range of flexible handling methods. (The @Controller mechanism also allows you to create RESTful Web sites and applications.)

In summary, the DispatcherServlet acts as the main Controller to route requests to their intended destination. Model is the data of our application, and the view is represented by any of the various template engines.

### C. Inspect the POM.xml for the previous Spring Boot projects. What is the role of the “starters” dependencies?

To cut down on the time developers spend managing dependencies, "starters" dependencies were developed.
These dependencies allow us to: - Boost productivity by cutting down on developers' configuration time.
- By lowering the required number of dependents, we simplify the process of managing the POM.
- We have dependency setups that have been tried out and are ready for production.
- The names and versions of the dependencies don't need to be recalled. 

### D. Which annotations are transitively included in the @SpringBootApplication?

A convenient annotation called @SpringBootApplication contains the following information:
Class is identified as a source of bean specifications for the application context by the annotation @Configuration.
- @EnableAutoConfiguration: Instructs Spring Boot to begin adding beans in accordance with the classpath configuration, other beans, and different property configurations.
- @ComponentScan instructs Spring to search the com/example package for additional components, settings, and services in order to locate the controllers. 

### E. Search online for the topic “Best practices for REST API design”. From what you could learn, select your “top 5” practices, and briefly explain them in you own words.

#### 1. Use JSON as a Format for Sending and Receiving Data JSON is a better option than XML for sending and receiving data.

For instance, decoding and encoding data in XML is frequently a headache, therefore frameworks no longer support it generally.

#### 2. Endpoints Should Use Nouns Rather Than Verbs When Creating A REST API, Endpoints Should Use Nouns to Describe What Each One Does.

This is so that the fundamental CRUD (Create, Read, Update, Delete) operations may be carried out via HTTP methods like GET, POST, PUT, PATCH, and DELETE.

#### 3. Name Groups Using Plural Nouns

A collection is a gathering of resources. When creating collections for the REST API, you should provide them plural noun names. It avoids ambiguity and facilitates comprehension of the collection's meaning.

#### 4. Utilize Status Codes When Handling Errors

If your API receives a request, you should always respond with a standard HTTP status code.
This will make it easier for your users to understand what's happening—whether the request was successful, unsuccessful, or for some other reason. 