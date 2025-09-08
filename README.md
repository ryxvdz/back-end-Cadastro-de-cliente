# 📌 CRUD de Clientes com Spring Boot

Este é um projeto de **back-end simples** que implementa um CRUD (Create, Read, Update, Delete) para gerenciar dados de clientes.  
A aplicação é construída com o **Spring Boot** e utiliza o **PostgreSQL** como banco de dados.

O objetivo do projeto é demonstrar a criação de uma **API RESTful completa**, com persistência de dados e documentação automatizada.

---

## 📋 Funcionalidades
- ✅ Criar um novo cliente (**POST**)
- ✅ Listar todos os clientes (**GET**)
- ✅ Buscar um cliente por ID (**GET**)
- ✅ Atualizar um cliente existente (**PUT**)
- ✅ Deletar um cliente (**DELETE**)

---

## 🛠️ Tecnologias Utilizadas
- **Linguagem:** Java 21  
- **Framework:** Spring Boot (v3.5.5)  
- **Persistência:** Spring Data JPA  
- **Banco de Dados:** PostgreSQL  
- **Build:** Maven  
- **Testes de API:** Postman & Swagger UI (Springdoc)

---

## 🚀 Como Executar o Projeto

### 🔹 Pré-requisitos
- Java Development Kit (**JDK 21** ou superior)  
- **Maven**  
- **PostgreSQL**  
- Uma IDE (recomendado: IntelliJ IDEA)

---

### 🔹 Configuração do Banco de Dados
1. Certifique-se de que o servidor PostgreSQL está em execução.  
2. Crie o banco de dados:  

```sql
CREATE DATABASE crud_clientes_db;

CREATE TABLE cliente (
  id BIGSERIAL PRIMARY KEY,
  nome VARCHAR(255),
  email VARCHAR(255),
  telefone VARCHAR(255)
);
```

### 🔹Configuração do Projeto
Clone este repositório para o seu ambiente local:

git clone https://github.com/ryxvdz/back-end-Cadastro-de-cliente.git
cd back-end-Cadastro-de-cliente

Abra o projeto no seu IDE. O Maven irá baixar as dependências automaticamente.

Abra o arquivo src/main/resources/application.properties e configure as credenciais do seu banco de dados PostgreSQL:

Properties

spring.datasource.url=jdbc:postgresql://localhost:5432/crud_clientes_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
