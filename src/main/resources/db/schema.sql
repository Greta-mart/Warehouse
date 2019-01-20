CREATE DATABASE warehouse CHARACTER SET utf8;

CREATE TABLE Product_owner(
Product_ownerID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
FirstName varchar(255) NOT NULL,
Lastname varchar(255) NOT NULL,
CompaneName varchar(255) NOT NULL
);

CREATE TABLE Product_owner_contacts(
Product_ownerID int NOT NULL REFERENCES Product_owner (Product_ownerID),
Type varchar(255),
Value varchar(255)
);

CREATE TABLE Items(
ItemsID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
Product_ownerID int,
Title varchar(255) NOT NULL,
Count int,
Price int,
StoringDate Date
);

CREATE TABLE Сategory(
ItemsID int NOT NULL REFERENCES Items (ItemsID),
Category varchar(255)
);

CREATE TABLE Withdraw_items(
ItemsID int NOT NULL REFERENCES Items (ItemsID),
Product_ownerID int NOT NULL REFERENCES Product_owner (Product_ownerID),
Title varchar(255),
Count int,
Price int,
StoringDate Date,
WithdrawDate Date
);