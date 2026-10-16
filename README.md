# Loja Online - Projeto POO em Java

## 📌 Descrição
Este projeto é uma simulação de uma **Loja Online** desenvolvida em **Java**, com foco nos **quatro pilares da Programação Orientada a Objetos (POO)**:
- **Abstração**: Classe abstrata `Produto` que define atributos e métodos comuns.
- **Encapsulamento**: Atributos privados com getters e setters, incluindo validações.
- **Herança**: Classes `Roupa`, `Eletronico` e `Alimento` que herdam de `Produto`.
- **Polimorfismo**: Cada classe implementa `exibirDetalhes()` e `calcularDesconto()` de forma diferente.

---

## 🛠️ Estrutura do Projeto
- **Produto (abstract)** → Classe base com atributos comuns (nome, preço, código, estoque).
- **Roupa** → Possui cor e tamanho, valida tamanhos permitidos (P, M, G).
- **Eletronico** → Possui meses de garantia, valida garantia positiva.
- **Alimento** → Possui ano de vencimento.
- **LojaOnline_Poo (main)** → Classe principal que cria listas de produtos e demonstra os métodos.

---

## 🚀 Funcionalidades
- Cadastro de diferentes tipos de produtos.
- Exibição de detalhes específicos de cada produto.
- Aplicação de descontos diferentes por categoria:
  - Roupas → 15%
  - Eletrônicos → 15%
  - Alimentos → 5%
- Validações:
  - Preço não pode ser negativo.
  - Garantia não pode ser negativa.
  - Tamanho de roupa só pode ser P, M ou G.

---

## ▶️ Como Executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/lojaonline-poo.git
