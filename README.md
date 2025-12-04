<div style="
    font-family: Arial, sans-serif;
    padding: 30px;
    line-height: 1.6;
">

    <h1 style="
        font-size: 34px;
        text-align: center;
        color: #2c3e50;
        margin-bottom: 10px;
    ">
        📘 Sistema de Controle Acadêmico
    </h1>

    <p style="
        text-align: center;
        font-size: 16px;
        color: #555;
        margin-bottom: 25px;
    ">
        Projeto completo desenvolvido com Spring Boot, Thymeleaf e MySQL.<br>
        Inclui autenticação, controle de acesso, CRUD completo e interface responsiva.
    </p>

    <hr style="border: none; height: 1px; background: #ddd; margin: 25px 0;">


    <!-- Tecnologias -->
    <h2 style="color:#2c3e50;">🚀 Tecnologias Utilizadas</h2>

    <ul style="padding-left: 20px;">
        <li><b>Spring Boot 4</b> (Web, JPA, Security)</li>
        <li><b>Thymeleaf</b> (templates HTML)</li>
        <li><b>MySQL 8</b> + Hibernate ORM</li>
        <li><b>BCrypt</b> para criptografia de senha</li>
        <li><b>Maven</b> para gerenciamento do projeto</li>
        <li><b>HTML5 & CSS3</b></li>
    </ul>


    <!-- Segurança -->
    <h2 style="color:#2c3e50;">🔐 Segurança (Spring Security)</h2>

    <div style="
        background: #eef6ff;
        border-left: 4px solid #3498db;
        padding: 15px;
        margin: 15px 0;
    ">
        <p><b>✔ Login customizado</b></p>
        <p><b>✔ Senhas com BCrypt</b></p>
        <p><b>✔ Controle de acesso por perfis</b></p>
        <p><b>✔ Páginas públicas e privadas</b></p>
    </div>

    <h3 style="color:#333;">Perfis:</h3>
    <ul>
        <li><b>ADMIN:</b> Acesso total (CRUD completo)</li>
        <li><b>SECRETARIA:</b> Gerencia Alunos e Matrículas</li>
        <li><b>Público:</b> Acesso somente à listagem de disciplinas</li>
    </ul>


    <!-- Funcionalidades -->
    <h2 style="color:#2c3e50;">🧩 Funcionalidades do Sistema</h2>

    <h3 style="margin-top: 10px;">👨‍🎓 Alunos</h3>
    <ul>
        <li>Listar</li>
        <li>Adicionar</li>
        <li>Editar</li>
        <li>Excluir (somente se não tiver matrícula)</li>
    </ul>

    <h3>📚 Disciplinas</h3>
    <ul>
        <li>Listar</li>
        <li>Criar disciplina (ADMIN)</li>
        <li>Editar</li>
        <li>Excluir (ADMIN)</li>
    </ul>

    <h3>📝 Matrículas</h3>
    <ul>
        <li>Listar com: aluno, disciplina, nota e situação</li>
        <li>Criar matrícula</li>
        <li>Editar matrícula</li>
        <li>Excluir</li>
    </ul>


    <!-- Como rodar -->
    <h2 style="color:#2c3e50;">⚙️ Como Rodar o Projeto</h2>

    <ol>
        <li>Clone o repositório:<br>
            <code>git clone https://github.com/SEU-USUARIO/controle-academico.git</code>
        </li>

        <li>Acesse o diretório:<br>
            <code>cd controle-academico</code>
        </li>

        <li>Crie o banco no MySQL:
            <pre><code>CREATE DATABASE controle_academico;</code></pre>
        </li>

        <li>Configure o <b>application.properties</b>:
            <pre><code>
spring.datasource.url=jdbc:mysql://localhost:3306/controle_academico
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
            </code></pre>
        </li>

        <li>Execute:
            <pre><code>mvn spring-boot:run</code></pre>
        </li>

        <li>Acesse no navegador:
            <pre><code>http://localhost:8080</code></pre>
        </li>
    </ol>


    <!-- Usuários -->
    <h2 style="color:#2c3e50;">🔑 Usuários de Teste</h2>

    <table style="
        border-collapse: collapse;
        width: 100%;
        margin: 10px 0;
        border: 1px solid #ccc;
    ">
        <tr style="background: #3498db; color: white;">
            <th style="padding: 8px;">Perfil</th>
            <th style="padding: 8px;">Usuário</th>
            <th style="padding: 8px;">Senha</th>
        </tr>
        <tr>
            <td style="padding: 8px;">ADMIN</td>
            <td style="padding: 8px;">admin</td>
            <td style="padding: 8px;">admin123</td>
        </tr>
        <tr>
            <td style="padding: 8px;">SECRETARIA</td>
            <td style="padding: 8px;">secretaria</td>
            <td style="padding: 8px;">sec123</td>
        </tr>
    </table>


    <!-- Estrutura -->
    <h2 style="color:#2c3e50;">🗂️ Estrutura do Projeto</h2>

    <pre style="
        background: #f4f4f4;
        border-left: 4px solid #3498db;
        padding: 15px;
        overflow-x: auto;
    "><code>
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
    </code></pre>


    <!-- Contato -->
    <h2 style="color:#2c3e50;">📞 Contato</h2>

    <p>
        <b>Autor:</b> Lorran Rodrigues Bezerra <br>
        <b>Email:</b> rodriguesbromen@gmail.com
    </p>

    <hr style="border: none; height: 1px; background: #ddd; margin-top: 20px;">
    <p style="text-align:center; color:#999;">Projeto desenvolvido para fins acadêmicos.</p>

</div>
