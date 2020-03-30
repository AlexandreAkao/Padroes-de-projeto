# :bulb: Strategy

Permitir de maneira simples a variação dos algoritmos utilizados na resolução de um determinado problema.

![UMLpng](https://user-images.githubusercontent.com/40917812/77867416-87666f00-720d-11ea-9fbf-97c82d94632e.png)

## :thinking: Quando usar :grey_question:

Quando você quer usar diferentes variantes de um algoritmo dentro de um objeto e ser capaz de trocar de um algoritmo para outro durante a execução.

Quando você tem muitas classes parecidas que somente diferem na forma que elas executam algum comportamento.

Para isolar a lógica do negócio de uma classe dos detalhes de implementação de algoritmos que podem não ser tão importantes no contexto da lógica.

Quando sua classe tem um operador condicional muito grande que troca entre diferentes variantes do mesmo algoritmo.

## :muscle: Exemplo prático

Em um Sistema operacional temos que gerenciar os processos do sistema, para isso temos o escalonador que é um gerenciador de processos, ele pode organizar de diversas formas dependendo da estratégia que esta implementada.
