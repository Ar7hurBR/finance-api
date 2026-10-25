# Finance API

API REST de gestão financeira pessoal: cada usuário registra suas receitas e despesas
e consulta um resumo mensal.

> Projeto em desenvolvimento. Status atual: estrutura base e conexão com o banco.

## Tecnologias

- Java 21 e Spring Boot
- PostgreSQL 16
- Flyway (migrations do banco)
- Spring Security com JWT (em breve)
- Docker e Docker Compose

## Como rodar

Pré-requisitos: JDK 21 e Docker.

    git clone https://github.com/Ar7hurBR/finance-api.git
    cd finance-api
    docker compose up -d
    ./mvnw spring-boot:run

Teste se subiu: `GET http://localhost:8080/health` deve responder `{"status":"UP"}`.

## Roadmap

- [x] Estrutura do projeto e banco com Docker
- [x] Cadastro de usuários
- [ ] Autenticação com JWT
- [ ] CRUD de categorias e transações
- [ ] Filtros, paginação e relatório mensal
- [ ] Testes automatizados e CI
- [ ] Documentação com Swagger e deploy