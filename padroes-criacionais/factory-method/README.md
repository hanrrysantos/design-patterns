# Factory Method

## Problema

Um sistema precisa enviar notificações por canais diferentes. Se a rotina de envio criar diretamente um `Email` ou um `SMS`, cada novo canal exigirá alterar essa rotina.

## Ideia

Deixar o fluxo de envio na classe criadora e delegar a criação da notificação a um método que as subclasses implementam. Assim, o fluxo usa a interface `Notificacao` sem conhecer a classe concreta.

## Implementação

As classes estão separadas em arquivos dentro de [`src`](src):

- [`Notificacao`](src/Notificacao.java) define a operação `enviar`.
- [`NotificacaoEmail`](src/NotificacaoEmail.java) e [`NotificacaoSMS`](src/NotificacaoSMS.java) são os produtos concretos.
- [`ServicoNotificacao`](src/ServicoNotificacao.java) executa `notificar` e chama o método fábrica `criarNotificacao`.
- [`ServicoEmail`](src/ServicoEmail.java) e [`ServicoSMS`](src/ServicoSMS.java) escolhem qual produto criar.
- [`Main`](src/Main.java) usa os dois serviços.

O ponto central é que `notificar` permanece igual para os dois serviços; somente a criação varia.

```bash
cd padroes-criacionais/factory-method
javac src/*.java
java -cp src Main
```

## Exemplo real

Uma loja pode enviar a confirmação de um pedido por e-mail ou SMS. O processamento da mensagem é o mesmo, enquanto cada canal possui sua própria forma de entrega. Neste exemplo, o envio é simulado com uma mensagem no terminal.

## Vantagens e desvantagens

**Vantagens:** separa o fluxo de envio da criação do canal e permite adicionar outro canal por meio de novas classes concretas.

**Desvantagens:** introduz interfaces e subclasses. Para apenas um canal estável, essa estrutura adiciona complexidade sem benefício.

## Quando usar

Quando uma classe precisa trabalhar com produtos de uma mesma interface, mas a escolha do produto depende de uma especialização dessa classe.

## Quando não usar

Quando existe um único tipo de produto, ou quando uma escolha simples e localizada entre poucos tipos já resolve o problema sem espalhar condicionais pelo código.
