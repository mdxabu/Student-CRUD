# Create a new Connection for AWS RDS in Mysql workbench
- Put the AWS endpoint in the host field
- and put the AWS Master username & AWS Master password
- and give test connection

# Setup the Mysql workbench

## Create a database
```sql
CREATE DATABASE college;
```

## Use that database
```sql
USE college;
```

## Create the tables for departments
```sql
CREATE TABLE CSE(
    name VARCHAR(20),
    email VARCHAR(50) UNIQUE,
    phoneNo VARCHAR(10) UNIQUE,
    dept VARCHAR(20),
    dob year,
    Academic_Year INT
);
```
## the below query will use to see the data in CSE 🔽
```sql
SELECT * FROM CSE;
```

```sql
CREATE TABLE IT(
    name VARCHAR(20),
    email VARCHAR(50) UNIQUE,
    phoneNo VARCHAR(10) UNIQUE,
    dept VARCHAR(20),
    dob year,
    Academic_Year INT
);
```

## the below query will use to see the data in IT 🔽
```sql
SELECT * FROM IT;
```

```sql
CREATE TABLE EEE(
    name VARCHAR(20),
    email VARCHAR(50) UNIQUE,
    phoneNo VARCHAR(10) UNIQUE,
    dept VARCHAR(20),
    dob year,
    Academic_Year INT
);
```

## the below query will use to see the data in EEE 🔽
```sql
SELECT * FROM EEE;
```

```sql
CREATE TABLE ECE(
    name VARCHAR(20),
    email VARCHAR(50) UNIQUE,
    phoneNo VARCHAR(10) UNIQUE,
    dept VARCHAR(20),
    dob year,
    Academic_Year INT
);
```
## the below query will use to see the data in ECE 🔽
```sql
SELECT * FROM ECE;
```

# Create a table for history 
## It stores the all movements with local time taken in tables using program  
```sql
CREATE TABLE history(
    history VARCHAR(150)
);
```
## the below query will use to see the histories 🔽
```sql
SELECT * FROM history;
```
