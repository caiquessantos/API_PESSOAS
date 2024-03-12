# REST API CRUD com Spring Boot e MySQL

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)
![Apache Tomcat](https://img.shields.io/badge/apache%20tomcat-%23F8DC75.svg?style=for-the-badge&logo=apache-tomcat&logoColor=black)
![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)

> Status do Projeto: ✔️ Concluido ✔️

### Este repositório contém um projeto de exemplo de uma API RESTful com operações CRUD (Create, Read, Update, Delete) implementadas em Spring Boot, utilizando um banco de dados MySQL para armazenar informações de tarefas, com o padrão Value Object para encpsulamento de informações.

## 🛠️ Funcionalidades do projeto 🛠️

- [x] Cadastro de Pessoas: Crie um novo registro de pessoa com informações detalhadas, incluindo nome, idade, endereço, etc.
- [x] Listagem de Pessoas: Obtenha uma lista de todas as pessoas cadastradas.
- [x] Listagem de Pessoa por ID: Obtenha uma pessoa cadastrada pelo seu ID.
- [x] Atualização de Pessoas: Atualize as informações de uma pessoa existente.
- [x] Exclusão de Pessoas: Exclua registros de pessoas do banco de dados.

## 🛠️ Configuração 🛠️

### Clone o repositório para sua máquina local:

1. git clone https://github.com/caiquessantos/APIrest-Pessoas-Spring3-Mysql.git
2. cd APIrest-Pessoas-Spring3-Mysql

### Crie o banco de dados

1. Crie uma nova conexão com o nome de sua escolha e coloque 'Hostname': localhost.
2. Crie um banco de dados MySQL com o nome 'person'.
3. Atualize as configurações de conexão no arquivo src/main/resources/application.yml de acordo com as suas configurações da conexão criada(username, password).

### Execute a aplicação Spring Boot:

1. ./mvnw spring-boot:run
2. A API estará disponível em http://localhost:8080.

## 💻 Uso 💻

1. GET /api/pessoas: Retorna uma lista de todas as pessoas.

2. GET /api/pessoas/{id}: Retorna os detalhes de uma pessoa específica com base no ID.

3. POST /api/pessoas: Crie uma nova pessoa.

4. PUT /api/pessoas/{id}: Atualize as informações de uma pessoa existente com base no ID.

5. DELETE /api/pessoas/{id}: Exclua uma pessoa com base no ID.

## ⚠️ Pré-requisitos ⚠️

### Certifique-se de ter as seguintes ferramentas instaladas em seu sistema:

- Java Development Kit 18 (JDK 18)
- Spring Boot
- MySQL

## 💡 Técnicas e Tecnologias usadas 💡

- [Java](https://www.oracle.com/java/technologies/)
- [SpringBoot](https://spring.io/projects/spring-boot)
- [MySQL](https://www.mysql.com/)
- [Postman](https://www.postman.com/)
- [Hibernate](https://hibernate.org/)
- [Eclipse IDE](https://eclipseide.org/)
- [DozerMapper](https://github.com/DozerMapper/dozer)
- PADRÃO VO
- JPA
- POO
- REST
