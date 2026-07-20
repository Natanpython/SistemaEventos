# Sistema Evento

Sistema para gerenciar participantes e atividades de um evento acadêmico.

## Tecnologias
- Spring Boot
- JPA/Hibernate
- H2 Database

## Como executar
1. Clone o repositório
2. Execute o projeto com `mvn spring-boot:run`
3. Acesse o H2 Console: `http://localhost:8080/h2-console`
   - JDBC URL: `jdbc:h2:mem:evento`
   - User: `sa`
   - Password: (vazio)

## Modelo de domínio
- Categoria (1) → (N) Atividade
- Atividade (1) → (N) Bloco
- Atividade (N) ↔ (N) Participante
