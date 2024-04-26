# Banco Digital

Este projeto é uma simulação simples de um banco digital. Ele contém classes para representar o Banco, Cliente, Conta (e suas subclasses ContaCorrente e ContaPoupanca), e uma interface IConta.

Este projeto foi criado como parte da Mentoria #1: "Tire Suas Dúvidas Sobre Orientação a Objetos" realizada em 02/08/2021. O desafio era abstrair uma solução Orientada a Objetos em Java para o seguinte cenário: “Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”

## Abstração

A abstração foi usada para concentrar-se nos aspectos essenciais do domínio bancário, ignorando características menos importantes ou acidentais. Nesse contexto, as classes Banco, Cliente e Conta são abstrações de entidades existentes no domínio bancário.

## Encapsulamento

O encapsulamento foi usado para esconder a implementação dos objetos, criando assim interfaces de uso mais concisas e fáceis de usar/entender. O encapsulamento favorece principalmente dois aspectos de um sistema: a manutenção e a evolução.

## Herança

A herança foi usada para definir as classes ContaCorrente e ContaPoupanca, que reutilizam (herdam), estendem e modificam o comportamento da classe Conta.

## Polimorfismo

O polimorfismo foi usado para permitir que um objeto de Conta pudesse ser referenciado de várias formas, ou seja, é capacidade de tratar objetos criados a partir das classes ContaCorrente e ContaPoupanca como objetos de uma classe Conta.

## Alterações Realizadas

As classes foram modificadas para usar as anotações do Lombok, que ajudam a reduzir a verbosidade do código Java. As anotações utilizadas foram:

- `@Getter`: Gera automaticamente os métodos getter para os campos da classe.
- `@Setter`: Gera automaticamente os métodos setter para os campos da classe.
- `@AllArgsConstructor`: Gera automaticamente um construtor com todos os campos da classe como argumentos.
- `@NoArgsConstructor`: Gera automaticamente um construtor sem argumentos.

Estas anotações foram adicionadas nas classes Banco, Cliente, Conta, ContaCorrente e ContaPoupanca.

## Novas Funcionalidades

Uma nova funcionalidade foi adicionada à classe ContaPoupanca:

- `taxaDeJuros`: Um novo campo que representa a taxa de juros da conta poupança.
- `adicionarJuros()`: Um novo método que adiciona os juros ao saldo da conta, baseado na taxa de juros.

Agora, a ContaPoupanca pode calcular e adicionar juros ao saldo da conta, o que é uma característica comum das contas poupança na vida real.

## Como Usar

Para usar este projeto, você pode criar instâncias das classes Cliente, ContaCorrente e ContaPoupanca, e usar os métodos disponíveis para realizar operações bancárias, como depositar, sacar e transferir dinheiro.

Por exemplo:

```java
Cliente cliente = new Cliente();
cliente.setNome("Seu Nome");

Conta cc = new ContaCorrente(cliente);
Conta poupanca = new ContaPoupanca(cliente, 0.02); // 2% de taxa de juros

cc.depositar(100);
cc.transferir(100, poupanca);

cc.imprimirExtrato();
poupanca.imprimirExtrato();
