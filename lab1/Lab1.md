# Lab 01

## Basic Setup for Java Development

### Install JDK 17
`sudo apt install openjdk-17-jdk -y`

### Install Maven
`sudo apt install maven -y`

### Install Git
`sudo apt install git -y`

### Check Java and Maven Version
- Java: `java --version`
- Maven: `mvn --version`
- Git: `git --version`

### Config Git
- `git config --global user.name "Your Name"`
- `git config --global user.email `

## Build management with the Maven tool
### What is Maven?

Maven is a project management and comprehension tool that provides developers a complete build lifecycle framework. Development team can automate the project's build infrastructure in almost no time as Maven uses a standard directory layout and a default build lifecycle.

### Cheatsheet

![Maven Cheatsheet](https://i1.wp.com/laurenthinoul.com/wp-content/uploads/2017/10/Maven-cheat-sheet-1.png)

### Useful Links
* [Apache Quick Reference](https://maven.apache.org/guides/MavenQuickReferenceCard.pdf)
* [Maven in 5 Minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
* [Maven in Intellij Idea](https://www.jetbrains.com/help/idea/maven-support.html)

---

## Source code management using Git
### What is Git?

Git is a free and open source distributed version control system designed to handle everything from small to very large projects with speed and efficiency.

### Cheatsheet
![Git Cheatsheet](https://res.cloudinary.com/practicaldev/image/fetch/s--Zib71Fgv--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_880/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/n082uxea33j6zq3mca7u.png)

### Useful Links
* [Github Git Cheatsheet](https://education.github.com/git-cheat-sheet-education.pdf)
* [Git commands](https://git-scm.com/docs)
* [git-cheatsheet](http://git-cheatsheet.com/)

---

## Introduction to Docker

### What is Docker?



A Docker container is a packaging format that packages all the code and dependencies of an application in a standard format that allows it to run quickly and reliably across computing environments. A Docker container is a popular lightweight, standalone, executable container that includes everything needed to run an application, including libraries, system tools, code, and runtime. Docker is also a software platform that allows developers to build, test, and deploy containerized applications quickly.

Containers as a Service (CaaS) or Container Services are managed cloud services that manage the lifecycle of containers. Container services help orchestrate (start, stop, scale) the runtime of containers. Using container services, you can simplify, automate, and accelerate your application development and deployment lifecycle.

### Cheatsheet
![Docker CheatSheet](https://raw.githubusercontent.com/sangam14/dockercheatsheets/master/dockercheatsheet8.png)

### Install Docker
The easiest way to install Docker on Ubuntu: 
1. [How To Install and Use Docker on Ubuntu 22.04](https://www.digitalocean.com/community/tutorials/how-to-install-and-use-docker-on-ubuntu-22-04)
2. [Linux Postinstall](https://docs.docker.com/engine/install/linux-postinstall/)
3. [Installing Portainer](https://docs.portainer.io/start/install/server/docker/linux)

### Troubleshoting

* [Docker Troubleshooting](https://docs.docker.com/config/daemon/#troubleshoot-the-daemon)
* [Completely Uninstall Docker](https://askubuntu.com/questions/935569/how-to-completely-uninstall-docker)
* [Docker compose not Working](https://stackoverflow.com/questions/38775954/sudo-docker-compose-command-not-found#50243566)
* [Cannot Connect to the Docker Daemon](https://phoenixnap.com/kb/cannot-connect-to-the-docker-daemon-error)

---

## Review Questions

### a) Maven has three lifecycles: clean, site and default. Explain the main phases in the default lifecycle.
1. **default:** handles project build and deployment
2. **clean:** handles project cleaning
3. **site:** handles the creation of project site documentation

Maven build lifecycle goes through a set of stages, they are called build phases. For example, the default lifecycle is made up of the following phases.

* validate
* compile
* test
* package
* verify
* install
* deploy

### b) Maven is a build tool; is it appropriate to run your project to?

Build tools, such as Maven, are used for obtaining dependencies (required external components/libraries), compiling source code, packaging artifacts, updating documentation, installing on the server, etc. Maven can provide benefits for your build process by employing standard conventions and practices to accelerate your development cycle while at the same time helping you achieve a higher rate of success

### c) What would be a likely sequence of Git commands required to contribute with a new feature to a given project?
```bash
$ git pull origin
#File Changes...
$ git status 
$ git add * 
$ git commit -m "NEW: File Changes" 
$ git push -u origin main
```

### d) There are strong opinions on how to write Git commit messages... Find some best practices online and give your own informed recommendations on how to write good commit messages (in a team project).
[How to level up your commit messages](https://www.freecodecamp.org/news/how-to-write-better-git-commit-messages/)

### e) Docker automatically prepares the required volume space as you start a container. Why is it important that you take an extra step configuring the volumes for a (production) database?

Volumes are the preferred mechanism for persisting data generated by and used by Docker containers. While bind mounts are dependent on the directory structure and OS of the host machine, volumes are completely managed by Docker.

In addition, volumes are often a better choice than persisting data in a container’s writable layer, because a volume does not increase the size of the containers using it, and the volume’s contents exist outside the lifecycle of a given container. You can create a volume explicitly using the docker volume create command, or Docker can create a volume during container or service creation.