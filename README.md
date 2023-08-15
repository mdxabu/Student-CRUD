# Student-CRUD Application
## Build with : ![Language](https://img.shields.io/badge/language-Java,MySql-orange.svg)&nbsp;
Welcome to the Student-CRUD repository! This repository contains a simple application for performing CRUD (Create, Read, Update, Delete) operations on student records. The application is designed to manage student information, allowing you to add, view, edit, and delete student records.
# Mindmap representation of this project

![CRUD-drawing](https://github.com/f-mohamed-abdullah/Student-CRUD/assets/115330277/e93b9407-06a5-473f-b4f0-ec91681d0fe0)

# Features
- Create: Add new student records to the database, including details like name, age, gender, and contact information.
- Read: View a list of all student records with relevant details.
- Update: Edit existing student records to reflect any changes in their information.
- Delete: Remove student records from the database when they are no longer needed.

# MySQL Database
## Manually
- Create the Mysql database by running the following command
```sql
  CREATE DATABASE college;
  USE college;
  ```
- And create four tables
  <br>
```CSE👇 DEPT```

```sql
CREATE TABLE CSE(
    name VARCHAR(20),
    email VARCHAR(50),
    phoneNo VARCHAR(10),
    dept VARCHAR(20),
    UNIQUE(email,phoneNo)
);
```
```IT👇 DEPT```

```sql
CREATE TABLE IT(
    name VARCHAR(20),
    email VARCHAR(50),
    phoneNo VARCHAR(10),
    dept VARCHAR(20),
    UNIQUE(email,phoneNo)
);
```
```EEE👇 DEPT```

```sql
CREATE TABLE EEE(
    name VARCHAR(20),
    email VARCHAR(50),
    phoneNo VARCHAR(10),
    dept VARCHAR(20),
    UNIQUE(email,phoneNo)
);
```
```ECE👇 DEPT```

```sql
CREATE TABLE ECE(
    name VARCHAR(20),
    email VARCHAR(50),
    phoneNo VARCHAR(10),
    dept VARCHAR(20),
    UNIQUE(email,phoneNo)
);
```
## Automatically
Run the following command to your terminal:

```bash
mysql < create_tables.sql
```

  
# Getting Started
## Installation
- Clone the repository:
```bash
git clone https://github.com/f-mohamed-abdullah/Student-CRUD.git
```
- Navigate to the project directory:
```bash
cd Student-CRUD
```
# Contributing
Contributions to this repository are welcome. If you find a bug, have a feature request, or want to contribute in any other way, please follow these steps:

- Fork the repository.

- Create a new branch for your feature or bug fix:
```bash
  git checkout -b feature/your-feature-name
```
- Make your changes and commit them with descriptive commit messages.

- Push your changes to your forked repository.

- Create a pull request against the main branch of this repository, describing your changes and the problem or feature you're addressing.

# License
This project is licensed under the <a href="https://en.wikipedia.org//wiki/MIT_License">MIT License</a>, which means you are free to use, modify, and distribute it as you see fit. Please refer to the <a href="https://github.com/f-mohamed-abdullah/Student-CRUD/blob/main/LICENSE">LICENSE</a> file for more details.








