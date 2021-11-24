-- Script de inicializacao do db para armazenamento persistente de cliente.
DROP DATABASE IF EXISTS CLIENT;

CREATE DATABASE CLIENT;

USE CLIENT;

-- Tabela de armazenamento de cliente.
CREATE TABLE CLIENT( 
	ID INT NOT NULL AUTO_INCREMENT,
	CPF VARCHAR(256) NOT NULL UNIQUE,
	NOME VARCHAR(256) NOT NULL,
	EMAIL VARCHAR(256) NOT NULL,
	PRIMARY KEY (ID)
);

-- Inserindo 2 elementos exemplo.
INSERT INTO CLIENT (CPF ,NOME , EMAIL) VALUES("085-643-898.21", "Roseval","rdmaljr@hotmail.com");
INSERT INTO CLIENT (CPF ,NOME , EMAIL) VALUES("045-323-234.36", "Malaquias","rdmal@hotmail.com");

-- Visualizando tabelas.
SELECT * FROM CLIENT;
