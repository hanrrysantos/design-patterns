# Observer

## Problema

Quando a quantidade em estoque muda, mais de uma parte do sistema precisa saber, mas o estoque não deve depender diretamente de cada uma delas.

## Ideia

Interessados se cadastram como observadores. O objeto observado envia uma atualização a todos quando seu estado muda.

## Implementação

[`ObservadorEstoque`](src/ObservadorEstoque.java) define `atualizar`. [`Estoque`](src/Estoque.java) mantém a lista de observadores e os notifica após uma mudança de quantidade. O [`Main`](src/Main.java) cadastra dois observadores, remove um e mostra quem recebe cada aviso.

```bash
cd padroes-comportamentais/observer
javac src/*.java
java -cp src Main
```

## Exemplo real

Uma vitrine e um módulo de compras podem reagir a mudanças no estoque sem que o estoque conheça suas implementações.

## Vantagens e desvantagens

**Vantagens:** reduz o acoplamento entre quem muda o estado e quem reage à mudança; observadores podem entrar ou sair.

**Desvantagens:** muitas notificações síncronas podem custar tempo, e a ordem das reações pode importar. Um observador que falha interrompe a notificação neste exemplo simples.

## Quando usar

Quando vários componentes precisam reagir a uma mudança de estado e os interessados variam.

## Quando não usar

Quando existe apenas um consumidor fixo e uma chamada direta é suficiente.
