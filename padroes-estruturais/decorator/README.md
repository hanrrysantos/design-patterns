# Decorator

## Problema

Uma mensagem pode receber prefixo e conversão para maiúsculas, separadamente ou em combinação. Criar uma subclasse para cada combinação não escala.

## Ideia

Cada decorador implementa a mesma interface da mensagem e envolve outra mensagem. Os comportamentos podem ser empilhados na ordem desejada.

## Implementação

[`Mensagem`](src/Mensagem.java) define `texto()`. [`MensagemSimples`](src/MensagemSimples.java) guarda o texto original. [`Maiusculas`](src/Maiusculas.java) e [`Prefixo`](src/Prefixo.java) acrescentam comportamento por composição. O [`Main`](src/Main.java) combina os dois decoradores.

```bash
cd padroes-estruturais/decorator
javac src/*.java
java -cp src Main
```

## Exemplo real

Uma aplicação pode formatar notificações com marcações opcionais sem criar classes para todas as combinações possíveis.

## Vantagens e desvantagens

**Vantagens:** permite combinar comportamentos em tempo de execução sem alterar a mensagem original.

**Desvantagens:** muitas camadas podem dificultar acompanhar a ordem de aplicação e localizar o comportamento.

## Quando usar

Quando comportamentos opcionais precisam ser combinados em objetos individuais.

## Quando não usar

Quando uma única transformação direta resolve o caso sem necessidade de composição.
