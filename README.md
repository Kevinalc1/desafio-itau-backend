# Desafio Itaú - API de Estatísticas de Transações

Este projeto é uma API REST desenvolvida em Java 21 com Spring Boot, projetada para processar transações financeiras e fornecer estatísticas em tempo real sobre as transações ocorridas nos últimos 60 segundos.

## 🚀 Tecnologias

- **Java 21**
- **Spring Boot 4.0.3**
- **Maven**
- **Jakarta Validation** (para validação de dados)

## 📌 Funcionalidades

A API permite o registro de transações, a limpeza de todos os registros e a consulta de estatísticas baseadas no tempo.

### Endpoints

#### 1. Criar Transação
`POST /transacao`

Recebe uma nova transação e a armazena na memória.

- **Corpo da Requisição (JSON):**
  ```json
  {
    "valor": 100.50,
    "dataHora": "2024-03-05T10:30:00.000-03:00"
  }
  ```
- **Respostas:**
  - `201 Created`: Transação recebida com sucesso.
  - `422 Unprocessable Entity`: Se o valor for negativo ou campos obrigatórios estiverem ausentes.
  - `400 Bad Request`: Se o JSON for inválido.

#### 2. Limpar Transações
`DELETE /transacao`

Remove todas as transações armazenadas na memória.

- **Resposta:**
  - `200 OK`: Todas as transações foram removidas.

#### 3. Obter Estatísticas
`GET /estatistica`

Retorna as estatísticas das transações que aconteceram nos últimos 60 segundos.

- **Resposta (Exemplo de JSON):**
  ```json
  {
    "count": 10,
    "sum": 1000.00,
    "avg": 100.00,
    "min": 10.00,
    "max": 200.00
  }
  ```
  *Nota: Se não houver transações nos últimos 60 segundos, todos os campos retornam 0.*

## 🛠️ Como Executar

### Pré-requisitos
- JDK 21 instalado.
- Maven instalado (ou use o `mvnw` incluso).

### Passos para rodar
1. Clone o repositório.
2. Navegue até a pasta raiz do projeto.
3. Execute o comando:
   ```bash
   ./mvnw spring-boot:run
   ```
   *No Windows:* `mvnw.cmd spring-boot:run`

A aplicação estará disponível em `http://localhost:8080`.

## 🧪 Estrutura do Projeto

- `controller`: Contém os controladores REST (`TransactionController`, `StaticsController`).
- `service`: Camada de lógica de negócio e processamento de dados.
- `dto`: Objetos de transferência de dados para entrada e saída da API.
- `model`: Representação interna das transações.
