# 💍 Sistema de Gerenciamento - Lindoka Pratas

## 📖 Sobre o Projeto

Este projeto foi desenvolvido por estudantes da disciplina de **Programação Orientada a Objetos** com o objetivo de criar um sistema de gerenciamento modular para a loja **Lindoka Pratas**, especializada em vendas de joias de prata.

A loja enfrentava problemas com a gestão manual de dados, o que causava lentidão, falhas no controle de estoque e dificuldades com pedidos e fornecedores. Este sistema foi pensado para solucionar esses problemas por meio de uma aplicação Java organizada em camadas.

> ⚠️ **Importante:** Este projeto **não utiliza banco de dados** e **não utiliza Spring Boot**. Todos os dados são manipulados em tempo de execução com listas e objetos Java.

---

## 🛠 Arquitetura do Projeto

O sistema foi estruturado com base em uma arquitetura **em camadas (MVC adaptado)**:


O padrão seguido foi:

- `model`: contém as entidades e classes de domínio.
- `service`: responsável pela lógica de negócio.
- `controller`: faz a mediação entre o usuário (interface CLI) e a lógica do sistema.
- `enums`: contém os tipos fixos usados por diversas entidades (ex: tipo de produto, setor, função).

---

## 📁 Funcionalidades Implementadas

O sistema permite o **cadastro, atualização, consulta e gerenciamento** dos seguintes recursos:

### 👤 Clientes
- Cadastro com CPF e senha
- Atualização de dados
- Listagem e busca por CPF

### 📦 Produtos
- Cadastro de produtos
- Classificação por tipo (`enum`)
- Vínculo com fornecedores

### 🛒 Pedidos
- Registro de pedidos feitos por clientes
- Relacionamento entre clientes e produtos
- Consulta e listagem de pedidos

### 🧑‍💼 Funcionários
- Cadastro de funcionários com setor e função
- Classificação por função e setor (`enum`)
- Listagem e atualização

### 🚚 Fornecedores
- Cadastro de fornecedores
- Vínculo com produtos fornecidos

### 🏬 Estoque
- Controle de entrada e saída de produtos
- Atualização automática da quantidade em estoque

---

## 🔁 Relacionamentos entre Entidades

- Um **pedido** está vinculado a um ou mais **produtos** e a um **cliente**.
- Um **produto** pode ter **um ou mais fornecedores**.
- Um **funcionário** está associado a um **setor** e a uma **função**.

---

## 🧪 Regras de Negócio

- Clientes precisam de **CPF válido** e **senha segura** para serem cadastrados.
- Um pedido só pode ser registrado se houver **estoque suficiente** do produto.
- A entrada e saída de produtos atualiza automaticamente o controle de estoque.
- Produtos são classificados obrigatoriamente por um **tipo** definido via `enum`.
- Funcionários devem ter **setor e função definidos**, ambos usando `enum`.

---

## 👥 Equipe de Desenvolvimento

Este projeto foi desenvolvido colaborativamente por cinco integrantes, cada um com sua própria branch de desenvolvimento:

| Nome      | Branch         |
|-----------|----------------|
| Alvino    | `alvino-v1`    |
| Daniela   | `daniela-v1`   |
| Filipe    | `filipe-v1`    |
| Izabelle  | `izabelle-v1`  |
| Jani      | `jani-v1`      |

Branches adicionais:

- `development`: ambiente de integração das funcionalidades das branches individuais.
- `main`: branch final com a versão estável do projeto.

---

## 💻 Como Executar o Projeto

### Pré-requisitos

- Java JDK 21 (ou compatível)
- IntelliJ IDEA ou outro editor compatível com projetos Java

### Passos:

1. Clone o repositório:
```bash
git clone https://github.com/danielacvmelo/loja_lindokapratas
cd loja_lindokapratas
