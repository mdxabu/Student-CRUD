# Student-CRUD Application
![build-btn](https://img.shields.io/badge/build%20with-JDBC-brightgreen?style=default&logo=eclipse) ![version-btn](https://img.shields.io/badge/maven&dash;central-v4.0.0-blue?logo=mvn)    


Welcome to the Student-CRUD repository! This repository contains a simple application for performing CRUD (Create, Read, Update, Delete) operations on student records. The application is designed to manage student information, allowing you to add, view, edit, and delete student records.
# Mindmap representation of this project
![newRep](https://github.com/f-mohamed-abdullah/Student-CRUD/assets/115330277/c9de46ea-3fed-41d2-9634-bf66bcc1edb2)



# Features
- Create: Add new student records to the database, including details like name, age, gender, and contact information.
- Read: View a list of all student records with relevant details.
- Update: Edit existing student records to reflect any changes in their information.
- Delete: Remove student records from the database when they are no longer needed.
# Create an ```.env``` file
  For storing Mysql Database credentials
  ```.env
  USERNAME=your_mysql_username
  PASSWORD=your_mysql_password
```
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
mysql > create_tables.sql
```

  
# Getting Started
## Installation
- Fork this repository
- Clone the repository
- Navigate to the project directory:
```bash
> git clone https://github.com/f-mohamed-abdullah/Student-CRUD.git
> cd Student-CRUD
```
# Contributing
Contributions to this repository are welcome. If you find a bug, have a feature request, or want to contribute in any other way, please follow these steps:

- Fork the repository.

- Create a new branch for your feature or bug fix or you can work on main branch too:
```bash
> git checkout -b test
```
- Make your changes and commit them with descriptive commit messages.

- Push your changes to your forked repository.

- Create a PR against the main branch of this repository, describing your changes and the problem or feature you're addressing.

# License
This project is licensed under the <a href="https://en.wikipedia.org//wiki/MIT_License">MIT License</a>, which means you are free to use, modify, and distribute it as you see fit. Please refer to the <a href="https://github.com/f-mohamed-abdullah/Student-CRUD/blob/main/LICENSE">LICENSE</a> file for more details.








