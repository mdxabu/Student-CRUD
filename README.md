# Student-CRUD Application
  ![GitHub License](https://img.shields.io/github/license/mdxabu/Student-CRUD) 


> [!IMPORTANT]
> This Project is officially moved from `AWS MySQL RDS` to Local `MySQL`.

Welcome to the Student-CRUD repository! This repository contains a simple Java application used for performing CRUD (Create, Read, Update, Delete) operations on student records. The application is designed to manage student information, allowing you to add, view, edit, and delete student records.
# Pictorial representation of this project



![AWS-RDS-Overview](https://github.com/mdxabu/Student-CRUD/assets/115330277/4026d6e4-0ec7-45d6-88d4-73d987deb56b)


# Features
- Create: Add new student records to the database, including name, age, gender, and contact information.
- Read: View a list of all student records with relevant details.
- Update: Edit existing student records to reflect any changes in their information.
- Delete: Remove student records from the database when they are no longer needed.
# Create an ```.env``` file
  For storing Mysql Database credentials
  ```.env
  USERNAME=your_mysql_username
  PASSWORD=your_mysql_password
```
or
Store on your environmental variables space.
# Depenedency for Dotenv-java
```xml
<dependency>
    <groupId>io.github.cdimascio</groupId>
    <artifactId>dotenv-java</artifactId>
    <version>3.0.0</version>
</dependency>
```
# How to access the ```.env``` file variables:
  These statements are used to access the value in the ```.env``` file
```java
Dotenv getenvirnmentalVariables = Dotenv.configure().load();

// get the Environmental value using Key(USERNAME)
DatabaseConnection.user = getenvirnmentalVariables.get("USERNAME");

// get the Environmental value using Key(PASSWORD)
DatabaseConnection.password = getenvirnmentalVariables.get("PASSWORD");
```
# Load the AWS Driver 
```java
// AWS Driver class name
Class.forName("software.aws.rds.jdbc.mysql.Driver");
```
# Dependency for AWS RDS Mysql Connector Java
```xml
  <dependency>
     <groupId>software.aws.rds</groupId>
     <artifactId>aws-mysql-jdbc</artifactId>
     <version>1.1.9</version>
   </dependency>
```


# MySQL Database
## For MySQL Database setup see the ➡️ [SETUP.md](https://github.com/f-mohamed-abdullah/Student-CRUD/blob/main/SETUP.md) or
## you can run the following command on your terminal:

```bash
MySQL > create_tables.sql
```

  
# Getting Started
## Installation
- Fork this repository
- Clone the repository
- Navigate to the project directory:
```bash
> git clone https://github.com/mdxabu/Student-CRUD.git
> cd Student-CRUD
```
# Contributing
Contributing to this repository is welcome. If you find a bug, have a feature request, or want to contribute in any other way, please follow these steps:

- Fork the repository.

- Create a new branch for your feature or bug fix or you can work on the main branch too:
```bash
> git checkout -b test
```
- Make your changes and commit them with descriptive commit messages.

- Push your changes to your forked repository.

- Create a PR against the main branch of this repository, describing your changes and the problem or feature you're addressing.

# License
This project is licensed under the <a href="https://en.wikipedia.org//wiki/MIT_License">MIT License</a>, which means you are free to use, modify, and distribute it as you see fit. Please refer to the <a href="https://github.com/f-mohamed-abdullah/Student-CRUD/blob/main/LICENSE">LICENSE</a> file for more details.








