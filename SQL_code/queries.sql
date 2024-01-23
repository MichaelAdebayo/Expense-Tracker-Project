-- Create database if it doesn't exist
CREATE DATABASE IF NOT EXISTS Expense_Trackers;

-- Switch to the created database
USE Expense_Tracker;

-- Create User table
CREATE TABLE User (
    userId INT PRIMARY KEY,
    userName VARCHAR(255)
);

-- Create Expenses table
CREATE TABLE Expenses (
    expensesId INT PRIMARY KEY,
    userId INT,
    expensesAmt DOUBLE,
    date DATE,
    categoryId INT,
    FOREIGN KEY (userId) REFERENCES User(userId),
    FOREIGN KEY (categoryId) REFERENCES Categories(categoryId)
);

-- Create Income table
CREATE TABLE Income (
    incomeId INT PRIMARY KEY,
    userId INT,
    incomeAmt DOUBLE,
    date DATE,
    FOREIGN KEY (userId) REFERENCES User(userId)
);

-- Create Categories table
CREATE TABLE Categories (
    categoryId INT PRIMARY KEY,
    categoryName VARCHAR(255)
);

-- Create Goals table
CREATE TABLE Goals (
    goalsId INT PRIMARY KEY,
    userId INT,
    goalAmt DOUBLE,
    dateTarget DATE,
    target BOOLEAN,
    currAmt DOUBLE,
    goalName VARCHAR(255),
    FOREIGN KEY (userId) REFERENCES User(userId)
);
