CREATE DATABASE college;

USE college;



CREATE TABLE CSE(
    name VARCHAR(20),
    email VARCHAR(50) UNIQUE,
    phoneNo VARCHAR(10) UNIQUE,
    dept VARCHAR(20),
    dob year,
    Academic_Year INT
);
SELECT * FROM CSE;



CREATE TABLE IT(
    name VARCHAR(20),
    email VARCHAR(50) UNIQUE,
	phoneNo VARCHAR(10) UNIQUE,
    dept VARCHAR(20),
    dob year,
	Academic_Year INT
);
SELECT * FROM IT;



CREATE TABLE EEE(
    name VARCHAR(20),
    email VARCHAR(50) UNIQUE,
	phoneNo VARCHAR(10) UNIQUE,
    dept VARCHAR(20),
    dob year,
	Academic_Year INT
);
SELECT * FROM EEE;


CREATE TABLE ECE(
    name VARCHAR(20),
    email VARCHAR(50) UNIQUE,
	phoneNo VARCHAR(10) UNIQUE,
    dept VARCHAR(20),
    dob year,
	Academic_Year INT
);
SELECT * FROM ECE;

CREATE TABLE history(
    history VARCHAR(150)
);


SELECT * FROM history;