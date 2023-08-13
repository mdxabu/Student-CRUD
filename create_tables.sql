CREATE DATABASE college;
USE college;

CREATE TABLE CSE(
name VARCHAR(20),
email VARCHAR(50),
phoneNo VARCHAR(10),
dept VARCHAR(20),
UNIQUE(email,phoneNo)
);

CREATE TABLE IT(
    name VARCHAR(20),
    email VARCHAR(50),
    phoneNo VARCHAR(10),
    dept VARCHAR(20),
    UNIQUE(email,phoneNo)
);

CREATE TABLE EEE(
    name VARCHAR(20),
    email VARCHAR(50),
    phoneNo VARCHAR(10),
    dept VARCHAR(20),
    UNIQUE(email,phoneNo)
);

CREATE TABLE ECE(
    name VARCHAR(20),
    email VARCHAR(50),
    phoneNo VARCHAR(10),
    dept VARCHAR(20),
    UNIQUE(email,phoneNo)
);

CREATE TABLE history(
    history VARCHAR(150);
);
