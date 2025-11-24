-- cria.sql - Criação do banco e tabela no MariaDB

CREATE DATABASE IF NOT EXISTS gestaoDeEstoque CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE gestaoDeEstoque;

CREATE TABLE IF NOT EXISTS produto (
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    quantidade INT NOT NULL CHECK (quantidade >= 0)
)