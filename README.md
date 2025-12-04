<h1 align="center">📘 Sistema de Controle Acadêmico</h1>

<p align="center">
  <img src="https://img.shields.io/static/v1?label=Spring%20Boot&message=4.0&color=6DB33F&style=for-the-badge&logo=springboot"/>
  <img src="https://img.shields.io/static/v1?label=Java&message=17&color=ED8B00&style=for-the-badge&logo=openjdk"/>
  <img src="https://img.shields.io/static/v1?label=MySQL&message=8.0&color=blue&style=for-the-badge&logo=mysql"/>
  <img src="https://img.shields.io/static/v1?label=Thymeleaf&message=Template&color=005F0F&style=for-the-badge&logo=thymeleaf"/>
  <img src="https://img.shields.io/static/v1?label=STATUS&message=CONCLUÍDO&color=GREEN&style=for-the-badge"/>
</p>

> Status do Projeto: ✔️ **Concluído**

---

## 📌 Tópicos

:small_blue_diamond: [Descrição do projeto](#descrição-do-projeto)  
:small_blue_diamond: [Funcionalidades](#funcionalidades)   
:small_blue_diamond: [Pré-requisitos](#pré-requisitos)  
:small_blue_diamond: [Como rodar a aplicação](#como-rodar-a-aplicação-arrow_forward)  
:small_blue_diamond: [Casos de Uso](#casos-de-uso)  
:small_blue_diamond: [Tecnologias usadas](#linguagens-dependencias-e-libs-utilizadas-books)  
:small_blue_diamond: [Desenvolvedor](#desenvolvedorescontribuintes-octocat)  
:small_blue_diamond: [Licença](#licença)

---

## 📘 Descrição do projeto

<p align="justify">
O Sistema de Controle Acadêmico é uma aplicação completa desenvolvida em <b>Spring Boot</b>, com autenticação, controle de acesso e gerenciamento de Alunos, Disciplinas e Matrículas. O objetivo é entregar um sistema funcional, seguro e organizado, totalmente integrado ao MySQL.
<br><br>
O sistema possui controle de acesso com Spring Security, duas permissões (ADMIN e SECRETARIA), criptografia BCrypt, páginas protegidas e interface construída em HTML + CSS com Thymeleaf.
</p>

---

## ⚙ Funcionalidades

### 👨‍🎓 **Alunos**
✔ Listar alunos  
✔ Criar aluno  
✔ Editar aluno  
✔ Excluir aluno (somente se não tiver matrícula vinculada)

### 📚 **Disciplinas**
✔ Listar disciplinas  
✔ Criar disciplina (ADMIN)  
✔ Editar  
✔ Excluir (ADMIN)  
✔ Disciplinas visíveis ao público sem login

### 📝 **Matrículas**
✔ Listar matrículas (aluno + disciplina + situação + nota)  
✔ Criar matrícula  
✔ Editar  
✔ Excluir  

### 🔐 **Segurança**
✔ Login customizado  
✔ Senhas criptografadas (BCrypt)  
✔ Controle de acesso por perfil  
✔ Home pública com listagem de disciplinas  
✔ Botão de Login/Logout  
✔ Menus exibidos dinamicamente conforme permissão  

---

## ⚠ Pré-requisitos

Você precisa ter instalado:

- Java 17  
- Maven  
- MySQL 8+  
- Git  
- IDE (IntelliJ ou VSCode)

---

## ▶ Como rodar a aplicação :arrow_forward:

### 1️⃣ Clone o repositório:
git clone https://github.com/LorranBezerra/controle-academico--TWJ.githttps://github.com/LorranBezerra/controle-academico--TWJ.git


### 2️⃣ Entre no diretório:
cd controle-academico


### 3️⃣ Crie o banco no MySQL:
CREATE DATABASE controle_academico;



### 4️⃣ Configure o arquivo `application.properties`:
spring.datasource.url=jdbc:mysql://localhost:3306/controle_academico
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true



### 5️⃣ Rode o projeto:
mvn spring-boot:run



### 6️⃣ Acesse no navegador:
http://localhost:8080/



---

## 🔑 Casos de Uso

### 🔒 Login
Credenciais de teste:

**ADMIN**
usuario: admin
senha: admin123


**SECRETARIA**
usuario: secretaria
senha: sec123




### 🧾 Fluxo de uso
- Usuário acessa home → vê disciplinas  
- Faz login → vê botões de gerenciamento  
- ADMIN pode tudo  
- SECRETARIA não pode criar/excluir disciplinas  
- Matrículas só aparecem após login  

---

## 📚 Linguagens, dependências e libs utilizadas :books:

- Java 17  
- Spring Boot 4  
- Thymeleaf  
- MySQL  
- Hibernate  
- Maven  
- Spring Security (BCrypt, roles, filtros)  

---

## 🛠 Resolvendo Problemas

Durante o desenvolvimento, alguns problemas foram resolvidos, entre eles:

- Erro de cascata ao excluir alunos com matrículas  
- Redirecionamento incorreto após login  
- Thymeleaf não exibindo botões conforme role  
- Configuração de SecurityFilterChain  

*(posso documentar cada um se você quiser)*

---

## 👨‍💻 Desenvolvedores/Contribuintes :octocat:

| <img src="https://media.licdn.com/dms/image/v2/C4D03AQFTn3tdBUVF_w/profile-displayphoto-shrink_800_800/profile-displayphoto-shrink_800_800/0/1661868152655?e=1766620800&v=beta&t=cv-dpZq0cCUiApJyfOi4etlNemPrZkUKlcpV_618nsE" width=115><br><sub><b>Lorran  Bezerra</b></sub> |
| :---: |
| <a href="https://github.com/LorranBezerra">GitHub</a> |

---















