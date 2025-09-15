# 📌 AGENDAMENTOS DE CLIENTES PARA BARBEARIA

Sistema de agendamento de clientes para barbearia desenvolvido em **Spring Boot & MySQL**.  
O objetivo do projeto é fornecer uma API para gerenciar horários e registros de clientes de forma simples e escalável.

## ✂️ Funcionalidades do Sistema de Agendamento para Barbearia

- 📅 **Gerenciamento de Agendamentos**
  - Criar novos agendamentos para clientes
  - Editar data, hora e serviço de um agendamento existente
  - Cancelar agendamentos

- 👨‍💼 **Cadastro de Clientes**
  - Registrar novos clientes com nome, telefone e e-mail
  - Consultar informações do cliente
  - Histórico de agendamentos de cada cliente

- 💈 **Serviços da Barbearia**
  - Cadastro de serviços (ex: corte de cabelo, barba, combo, química e hidratação)
  - Definição de preços e duração de cada serviço

- 🕒 **Controle de Horários**
  - Exibir horários disponíveis para marcação
  - Impedir agendamentos em horários já ocupados
  - Gerenciamento de agenda diária/semana/mês

- 👥 **Gestão de Funcionários**
  - Associação de agendamentos a barbeiros específicos
  - Consulta de disponibilidade de cada barbeiro

- 🔔 **Notificações (Futuro)**
  - Envio de lembrete para clientes via e-mail/WhatsApp
  - Notificação de confirmação/cancelamento

- 📊 **Relatórios (Futuro)**
  - Total de atendimentos por período
  - Serviços mais solicitados
  - Clientes mais recorrentes

---

## 🚀 Tecnologias utilizadas
- Java 17
- Spring Boot
- Maven
- MySQL 
- Lombok
- Nodejs
- Java

---

## 📂 Estrutura do Projeto
```bash
agendamentosdeclientes/
 ├── src/
 │   ├── main/
 │   │   ├── java/        # Código fonte Java
 │   │   └── resources/   # application.properties, static, templates
 │   └── test/            # Testes automatizados
 ├── pom.xml              # Configurações do Maven
 └── README.md            # Este arquivo

