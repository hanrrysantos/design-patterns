# State

## Problema

Um pedido aceita ações diferentes conforme seu estado: aberto pode ser pago, pago pode ser enviado e enviado não deve repetir essas ações.

## Ideia

Cada estado implementa as ações permitidas e decide a próxima transição. O pedido delega o comportamento ao estado atual.

## Implementação

[`EstadoPedido`](src/EstadoPedido.java) define as ações. [`Aberto`](src/Aberto.java), [`Pago`](src/Pago.java) e [`Enviado`](src/Enviado.java) implementam regras e transições. [`Pedido`](src/Pedido.java) guarda o estado atual; o [`Main`](src/Main.java) percorre o fluxo completo. Ações inválidas lançam `IllegalStateException`.

```bash
cd padroes-comportamentais/state
javac src/*.java
java -cp src Main
```

## Exemplo real

No processamento de pedidos, a operação disponível depende da etapa atual. A regra pode crescer com novos estados, como cancelado ou devolvido.

## Vantagens e desvantagens

**Vantagens:** regras de cada estado ficam juntas e o pedido evita condicionais repetidas em suas ações.

**Desvantagens:** acrescenta várias classes. Uma sequência curta e estável pode caber em um `enum` e poucas verificações.

## Quando usar

Quando o comportamento de um objeto muda significativamente com o estado e as transições têm regras próprias.

## Quando não usar

Quando o estado é apenas um valor para exibição e não altera as ações disponíveis.
