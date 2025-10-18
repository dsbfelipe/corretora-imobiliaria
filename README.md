#  Corretora Imobiliária

Um sistema de console para gerenciar o aluguel de casas e apartamentos, desenvolvido para praticar **Programação Orientada a Objetos (POO)** em Java. 

O projeto simula uma corretora imobiliária, permitindo o cadastro, aluguel e listagem de imóveis, aplicando de forma prática os três pilares da POO: **encapsulamento**, **herança** e **polimorfismo**.


---

##  Funcionalidades

-  **Cadastrar** casas e apartamentos.
-  **Alugar ou disponibilizar** imóveis.
-  **Calcular valor de aluguel** com desconto progressivo para contratos longos.
-  **Listar todos os imóveis** ou apenas os disponíveis/alugados.
-  Exibir informações de contato do proprietário.

---

##  Conceitos aplicados

- **Classe abstrata** `Imovel`
- **Herança** (`Casa` e `Apartamento` herdam de `Imovel`)
- **Composição** com classe `Proprietario`
- **Polimorfismo** nos métodos `estaAlugado()`
- **Encapsulamento** de atributos com getters e setters controlados
- **Streams e Lambdas** para manipulação funcional de listas
