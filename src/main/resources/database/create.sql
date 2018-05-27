create database test_bank;
use test_bank;

CREATE TABLE transactions
(
	transaction_id	BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	sender_acc_id	INT,
	getter_acc_id 	INT,
	amount			BIGINT,
	add_date_time		DATETIME NOT NULL,
	FOREIGN KEY (sender_acc_id) REFERENCES accounts(account_id),
	FOREIGN KEY (getter_acc_id) REFERENCES accounts(account_id)) ;

CREATE TABLE clients
(
	client_id	TINYINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	name		VARCHAR(40),
	address		VARCHAR(40),
	age 		TINYINT);

CREATE TABLE accounts
(
	account_id	INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	client_id	TINYINT,
	cash_sum 		INT,
	FOREIGN KEY (client_id) REFERENCES clients(client_id)) ;

CREATE USER 'test_bank'@'localhost' IDENTIFIED BY 'root';
GRANT ALL PRIVILEGES ON test_bank.* TO 'test_bank'@'localhost';
