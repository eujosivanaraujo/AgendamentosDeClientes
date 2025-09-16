# 📌 AGENDAMENTO DE CLIENTES PARA BARBEARIA

# 💈 JAS Barbearia - Sistema de Agendamento  

Um sistema desenvolvido em **Spring Boot & MySQL** para gerenciar agendamentos de clientes em uma barbearia.  
O objetivo é fornecer uma API para gerenciar horários, serviços e registros de clientes de forma simples e escalável. 

---

- 📅 **Gerenciamento de Agendamentos**
  - Criar novos agendamentos para clientes
  - Editar data, hora e serviço de um agendamento existente
  - Cancelar agendamentos
 
- 👨‍💼 **Cadastro de Clientes**
  - Registrar novos clientes com nome, telefone e e-mail
  - Consultar informações do cliente
  - Histórico de agendamentos de cada cliente

- 💈 **Serviços da Barbearia**
  - Cadastro de serviços (ex: corte, barba, combo e etc...)
  - Definição de preços e duração de cada serviço

- 🕒 **Controle de Horários**
  - Exibir horários disponíveis para marcação
  - Impedir agendamentos em horários já ocupados
  - Gerenciamento de agenda diária/semana/mês
 
- 👥 **Gestão de Funcionários**
  - Associação de agendamentos a barbeiros específicos
  - Consulta de disponibilidade de cada barbeiro

- 🔔 **Notificações**
  - Envio de lembrete para clientes via e-mail/WhatsApp
  - Notificação de confirmação/cancelamento

- 📊 **Relatórios**
  - Total de atendimentos por período
  - Serviços mais solicitados
  - Clientes mais recorrentes

---

## 📌 Detalhes dos passos do projeto
1. Criar a estrutura inicial do projeto 
2. Configurar o banco de dados para testes
3. Implementar as entidadedes e o repositório JPA   
5. Implementar a lógica de agendamentos
6. Desenvolver as APIs REST para cadastro e consulta  
7. Criar interface simples
8. Realizar testes 
9. Publicar no GitHub com documentação atualizada  

---

## ▶️ Como executar
1. Clone este repositório:  
   ```bash
   git clone https://github.com/SEU-USUARIO/agendamentosdeclientes.git

---

## 🚀 Tecnologias utilizadas
- Java 17
- Spring Boot
- Maven
- MySQL 
- Java

---
```bash
## ✍️ Autor: Josivan Araújo
"Este projeto estar em desenvolvimento e estará sendo atualizado!"
---

## 📂 Estrutura do Projeto
agendamentosdeclientes/
 ├── src/
 │   ├── main/
 │   │   ├── java/        # Código fonte Java
 │   │   └── resources/   # application.properties, static, templates
 │   └── test/            # Testes automatizados
 ├── pom.xml              # Configurações do Maven
 └── README.md            # Este arquivo

