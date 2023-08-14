# Student-CRUD Application
## Build with : ![Language](https://img.shields.io/badge/language-Java,MySql-orange.svg)&nbsp;
# Mindmap representation of this project

![CRUD-drawing](https://github.com/f-mohamed-abdullah/Student-CRUD/assets/115330277/e93b9407-06a5-473f-b4f0-ec91681d0fe0)

# overview
- ```main.java``` is the Main Class of all class
- we've seperate class for the departments and database tables too.
- ```ComputerScienceandEngineering.java``` ```InformationTechnology.java``` ```ElectricalandElectronicsEngineering.java``` ```ElectronicsandCommunicationEngineering.java``` these are the seperate classes.
- Database class also available with all connection and statement ```DatabaseConnection.java```
- we can use Database Statement in all other class with the ```getConnection()```
- and also database stores all the movements in the ```history``` table with the date and time.

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

  
## To get start with this repo:
- Clone this repo ```git clone https://github.com/f-mohamed-abdullah/Student-CRUD.git```
- Open ```Student-CRUD``` project in your IDE(Intell IJ/Eclipse)
- Run it.





