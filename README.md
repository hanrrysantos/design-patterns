# Design Patterns (Padrões de Projeto)

Este repositório reúne explicações e exemplos simples de padrões de projeto em Java. Cada padrão parte de um problema, apresenta a ideia da solução e mostra quando ela ajuda ou atrapalha.

## O que são design patterns?

São soluções conhecidas para problemas recorrentes no projeto de software. Um padrão descreve uma forma de organizar responsabilidades e relações entre objetos; não é um trecho de código pronto para copiar. O mesmo padrão pode ter implementações diferentes conforme o contexto.

O objetivo é tornar o código mais fácil de adaptar e oferecer uma linguagem comum para discutir decisões de projeto. Usar um padrão sem um problema concreto pode apenas acrescentar classes e complexidade.

## GoF: Gang of Four

O livro *Design Patterns: Elements of Reusable Object-Oriented Software*, de Erich Gamma, Richard Helm, Ralph Johnson e John Vlissides, ficou conhecido como o livro da **Gang of Four (GoF)**. Ele apresentou um catálogo de **23 padrões** de projeto orientado a objetos, agrupados pelo tipo de problema que resolvem.

| Categoria | Pergunta principal | Exemplos |
| --- | --- | --- |
| Criacionais | Como criar objetos com flexibilidade? | Factory Method, Singleton, Builder |
| Estruturais | Como combinar classes e objetos? | Adapter, Decorator, Facade |
| Comportamentais | Como distribuir responsabilidades e comunicação? | Strategy, Observer, Command |

## Padrões comuns na prática

Esta é uma seleção para começar a estudar, não uma classificação de popularidade:

| Padrão | Ideia em uma frase |
| --- | --- |
| **Factory Method** | Delega a criação de um objeto para subclasses. |
| **Singleton** | Mantém uma única instância acessível de uma classe. |
| **Adapter** | Faz interfaces incompatíveis trabalharem juntas. |
| **Decorator** | Acrescenta comportamento a um objeto por composição. |
| **Strategy** | Permite trocar um algoritmo sem alterar quem o utiliza. |
| **Observer** | Avisa interessados quando um objeto muda de estado. |

## Exemplos deste repositório

- [Factory Method: notificações por e-mail e SMS](padroes-criacionais/factory-method/README.md)
- [Singleton: configuração compartilhada da aplicação](padroes-criacionais/singleton/README.md)

Cada pasta contém um README com problema, ideia, implementação, exemplo real, vantagens e desvantagens, quando usar e quando não usar. O código fica em `src` e os comandos de execução estão no README de cada padrão.

## Para continuar estudando

- [A Enciclopédia dos Padrões de Projeto -> Refactoring.Guru](https://refactoring.guru/pt-br/design-patterns): explicações, exemplos e relações entre os padrões.
- [Catálogo dos Padrões de Projeto -> Refactoring.Guru](https://refactoring.guru/pt-br/design-patterns/catalog): consulta rápida por categoria.
- [Livro original da GoF -> editora Addison-Wesley](https://www.informit.com/store/design-patterns-elements-of-reusable-object-oriented-software-9780201633610): referência histórica dos 23 padrões.
