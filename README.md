Controle Acadêmico — Sistema Completo com Spring Boot + Thymeleaf + MySQL

📘 Projeto Acadêmico Desenvolvido por Lorran Rodrigues Bezerra
Sistema completo para gerenciamento de Alunos, Disciplinas e Matrículas, incluindo autenticação e controle de acesso via Spring Security.

🚀 Tecnologias Utilizadas

As principais tecnologias aplicadas neste projeto:

Categoria	Tecnologias
Backend	Spring Boot 4, Spring Web, Spring Data JPA, Spring Security
Frontend	Thymeleaf, HTML5, CSS3
Banco de Dados	MySQL 8 + Hibernate ORM
Segurança	BCrypt, Roles (ADMIN e SECRETARIA)
Build	Maven
Controle de Versão	Git + GitHub
🔐 Regras de Segurança Implementadas

O projeto utiliza Spring Security com:

✔ Autenticação

Página de login personalizada (/login)

Criptografia BCrypt para todas as senhas

Usuários armazenados no banco

✔ Autorizações (Roles)
Função	Permissões
ADMIN	Acesso total ao sistema (CRUD completo)
SECRETARIA	Pode gerenciar Alunos e Matrículas, mas não pode criar/excluir Disciplinas
Público (não logado)	Apenas visualiza listagem de disciplinas (home)
✔ Proteção de rotas

/login → público

/ (home) → público

/alunos/**, /disciplinas/**, /matriculas/** → restrito a ADMIN/SECRETARIA

/admin/** → exclusivo ADMIN

🧩 Funcionalidades do Sistema
👨‍🎓 Alunos

Listar todos os alunos

Criar novo aluno

Editar aluno existente

Excluir aluno (somente se não possuir matrículas)

📚 Disciplinas

Listar disciplinas

Criar disciplina (ADMIN)

Editar disciplina

Excluir disciplina (ADMIN)

📝 Matrículas

Listar matrículas com:

Aluno

Disciplina

Situação

Nota

Criar matrícula

Editar matrícula

Excluir matrícula

🏠 Home Pública

A página inicial exibe:

✔ Listagem de todas as disciplinas (sem ações)
✔ Botão para fazer login
✔ Links de navegação básicos

Após o login, aparecem:

✔ Botões de gerenciamento (Aluno / Disciplina / Matrícula)
✔ Botão de Logout

🛠️ Como Rodar o Projeto
1. Clone o repositório
git clone https://github.com/SEU-USUARIO/controle-academico.git

2. Acesse o projeto
cd controle-academico

3. Configure o banco MySQL

Crie o banco:

CREATE DATABASE controle_academico;


No arquivo application.properties, configure:

spring.datasource.url=jdbc:mysql://localhost:3306/controle_academico
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

4. Rode o projeto

No IntelliJ ou via terminal:

mvn spring-boot:run


O sistema abrirá em:

http://localhost:8080

🔑 Usuários de Exemplo
ADMIN
Usuário: admin
Senha: admin123

SECRETARIA
Usuário: secretaria
Senha: sec123


(As senhas são armazenadas em BCrypt.)

🗂️ Estrutura do Projeto
src/main/java/br.ifce.controle_academico
│
├── controller
│   ├── AlunoController.java
│   ├── DisciplinaController.java
│   ├── MatriculaController.java
│   └── LoginController.java
│
├── security
│   └── SecurityConfig.java
│
├── model
│   ├── Aluno.java
│   ├── Disciplina.java
│   ├── Matricula.java
│   └── Usuario.java
│
└── repository
    ├── AlunoRepository.java
    ├── DisciplinaRepository.java
    ├── MatriculaRepository.java
    └── UsuarioRepository.java

🎯 Objetivo do Projeto

Este sistema foi desenvolvido como trabalho acadêmico com os seguintes propósitos:

Aplicar conhecimentos de engenharia de software, segurança, arquitetura MVC e persistência de dados

Demonstrar domínio em Spring Boot com segurança e CRUD completo

Criar uma aplicação funcional pronta para uso ou extensão

📸 Screenshots

(Se quiser, me envie imagens que eu coloco aqui bonito com layout GitHub.)

❤️ Contribuição

Quer sugerir melhorias? Fique à vontade para abrir um Pull Request!

📞 Contato

✉ Email: lorranrb@gmail.com

💼 LinkedIn: (posso gerar sua bio também, se quiser)
🚀 GitHub: github.com/seu-usuario
