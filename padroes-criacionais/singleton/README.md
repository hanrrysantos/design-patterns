# Singleton

## Problema

Partes diferentes de uma aplicação precisam consultar a mesma configuração carregada na inicialização. Criar uma nova configuração em cada lugar pode duplicar o carregamento e produzir instâncias diferentes.

## Ideia

Permitir que exista uma única instância da classe e oferecer um ponto de acesso a ela. Em Java, um construtor privado impede a criação direta; um campo `static final` guarda a instância compartilhada.

## Implementação

Em [`src/Configuracao.java`](src/Configuracao.java), `Configuracao` cria sua instância uma vez, lê `APP_NAME` do ambiente e expõe `getInstancia()`. O [`Main`](src/Main.java) consulta a configuração por duas referências e mostra que ambas apontam para o mesmo objeto.

```bash
cd padroes-criacionais/singleton
javac src/*.java
java -cp src Main
```

Opcionalmente, execute `APP_NAME=MinhaLoja java -cp src Main` para definir o nome exibido.

## Exemplo real

Uma aplicação pode carregar configurações de ambiente uma vez e disponibilizá-las para diferentes serviços. O exemplo usa o nome da aplicação; em um sistema maior, as configurações poderiam incluir outros valores compartilhados.

## Vantagens e desvantagens

**Vantagens:** garante uma única instância e evita carregar repetidamente os mesmos dados. A inicialização de campos estáticos em Java é segura entre threads.

**Desvantagens:** cria acesso global, que esconde dependências e dificulta substituir a configuração em testes. Se a instância passar a conter estado mutável, será preciso cuidar da concorrência.

## Quando usar

Quando uma única instância é uma regra real do sistema e várias partes precisam acessá-la, como uma configuração carregada uma vez.

## Quando não usar

Quando basta passar um objeto às classes que o utilizam, ou quando instâncias independentes são úteis, por exemplo para configurações diferentes em testes.
