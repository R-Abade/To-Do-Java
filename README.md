# To-Do List Application with Spring Boot

## 📝 Descrição do Projeto

Este é um projeto pessoal de aprendizado desenvolvido em Java utilizando Spring Boot e Maven para criar uma API de gerenciamento de tarefas (To-Do List). A aplicação permite:

- Cadastro de usuários
- Autenticação básica
- Criação, listagem e atualização de tarefas
- Validações de dados e regras de negócio

## 🛠 Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot 3+**
- **Spring Data JPA**
- **Maven**
- **APIDog**
- **H2 Database (embutida)**
- **Lombok** (para redução de código boilerplate)
- **BCrypt** (para hash de senhas)

## 📋 Funcionalidades

### Usuários
- ✅ Cadastro de novos usuários
- ✅ Validação de username único
- ✅ Hash de senha com BCrypt

### Tarefas
- ✅ Criação de tarefas com data de início e término
- ✅ Listagem de tarefas por usuário
- ✅ Atualização de tarefas
- ✅ Validações:
    - Título com limite de 50 caracteres
    - Datas não podem ser anteriores à data atual
    - Data de início deve ser anterior à data de término

## 🚀 Como Executar o Projeto

### Pré-requisitos
- Java 17 ou superior instalado
- Maven instalado
- IDE de sua preferência (recomendado IntelliJ ou VS Code)

### Passos para execução

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/todolist-springboot.git
2. Vá até p repositório:
   ```bash
   cd todolist-springboot
3. Execute com Maven:
   ```bash
   mvn spring-boot:run
4. A aplicação estará disponível em: http://localhost:8080


---

### Parte 5: Melhorias e Licença

```markdown
## 📌 Melhorias Futuras

- [ ] Implementar autenticação JWT
- [ ] Adicionar testes unitários e de integração
- [ ] Implementar exclusão de tarefas
- [ ] Adicionar filtros para listagem de tarefas (por data, prioridade, etc.)
- [ ] Implementar front-end básico

## 🤝 Contribuição

Como este é um projeto de aprendizado, contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests com melhorias.

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Desenvolvido com ❤️ por Raphael Abade Rodrigues como parte do aprendizado em Spring Boot e Java.