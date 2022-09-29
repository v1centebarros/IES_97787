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

## Source code management using Git
### What is Git?

Git is a free and open source distributed version control system designed to handle everything from small to very large projects with speed and efficiency.

### Cheatsheet
![Git Cheatsheet](https://res.cloudinary.com/practicaldev/image/fetch/s--Zib71Fgv--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_880/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/n082uxea33j6zq3mca7u.png)

### Useful Links
* [Github Git Cheatsheet](https://education.github.com/git-cheat-sheet-education.pdf)
* [Git commands](https://git-scm.com/docs)
* [git-cheatsheet](http://git-cheatsheet.com/)

Garantir acesso ao user à socket do Docker, para poder usar as funcionalidade do Intellij Idea no Docker
sudo chown [username]:docker /var/run/docker.sock

https://askubuntu.com/questions/935569/how-to-completely-uninstall-docker
https://www.digitalocean.com/community/tutorials/how-to-install-and-use-docker-on-ubuntu-22-04
https://phoenixnap.com/kb/cannot-connect-to-the-docker-daemon-error

https://docs.docker.com/engine/install/linux-postinstall/

https://docs.portainer.io/start/install/server/docker/linux

https://stackoverflow.com/questions/38775954/sudo-docker-compose-command-not-found#50243566