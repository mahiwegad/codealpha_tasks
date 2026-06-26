# CodeAlpha Java Gradle Application

## Project Overview

This project demonstrates the development and automation of a Java application using Gradle as the build automation tool.

The main objective of this project is to understand Java application development, dependency management, automated builds, testing, and CI/CD pipeline integration using Jenkins.

The application is developed using Java 21 and Gradle 9.6.0. Jenkins is used to automate the build, execution, and testing process.

---

## Technologies Used

- Java 21
- Gradle 9.6.0
- Jenkins
- Git and GitHub
- Log4j2 for application logging
- JUnit Jupiter for unit testing

---

## Project Structure

```
CodeAlpha_JavaGradleApplication

├── app
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── org/example/App.java
│   │   │   └── resources
│   │   │       └── log4j2.xml
│   │   │
│   │   └── test
│   │       └── AppTest.java
│   │
│   └── build.gradle
│
├── gradle
│   └── wrapper
│
├── Jenkinsfile
├── gradlew
├── gradlew.bat
├── settings.gradle
├── gradle.properties
└── README.md
```

---

## Features

- Java application development using Gradle
- Automated project builds
- Dependency management using Gradle
- Application logging using Log4j2
- Unit testing using JUnit
- Jenkins CI/CD pipeline integration
- Automated build and execution workflow

---

## Running the Application Locally

### Build the Project

For Windows:

```bash
.\gradlew clean build
```

### Run the Application

```bash
.\gradlew :app:run
```

---

## Application Output

Successful application execution produces the following output:

```
Java Gradle Application

Application Status : Running
Build Tool         : Gradle
Java Version       : 21
Environment        : Development
CI/CD Integration  : Jenkins

Build Completed Successfully
```

---

## Jenkins CI/CD Pipeline

This project includes a Jenkins pipeline that automates the complete application workflow.

The pipeline performs the following stages:

1. Build the Java application
2. Execute the application
3. Run automated tests
4. Validate successful completion

Pipeline Workflow:

```
Build
 |
Run Application
 |
Test
 |
Success
```

---

## Jenkins Pipeline Result

The Jenkins pipeline successfully performs:

- Gradle project build
- Application execution
- Test execution
- Continuous integration workflow

Successful pipeline execution result:

```
BUILD SUCCESSFUL

CI/CD Pipeline completed successfully

Finished: SUCCESS
```

---

## Screenshots Included

The repository contains screenshots demonstrating:

- Application execution using Gradle
- Jenkins pipeline configuration
- Successful Jenkins build execution
- CI/CD pipeline output

---

## Learning Outcomes

Through this project, I gained practical experience in:

- Java application development
- Gradle build automation
- Dependency management
- Unit testing
- Jenkins pipeline creation
- CI/CD implementation
- DevOps development practices

---

## Author

Mahi Wegad