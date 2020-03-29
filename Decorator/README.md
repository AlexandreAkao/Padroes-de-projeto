# :nail_care: Decorator

Adicionar funcionalidade a umobjeto dinamicamente.

Permite adicionar um comportamento a um objeto já existente em tempo de execução, ou seja, agrega dinamicamente responsabilidades adicionais a um objeto.

![UMLpng](https://user-images.githubusercontent.com/40917812/77840538-19636e80-715f-11ea-9200-fc94a8d20706.png)

## :thinking: Quando usar :grey_question:

Utilize o padrão Decorator quando você precisa ser capaz de projetar comportamentos adicionais para objetos em tempo de execução sem quebrar o código que usa esses objetos.

Utilize o padrão quando é complicado ou impossível estender o comportamento de um objeto usando herança.

## :muscle: Exemplo prático

Em uma pizzaria temos a possibilidade de acrescentar cobertura na pizza, isso faz com que a pizza tenha um acrescimo no seu valor.

Talvez sejam necessários diferentes tipos de coberturas extras como cobertura de queijo, pimentão, abacaxi, morango, e assim por diante. Também se pode imaginar a situação em que o cliente deseja encomendar uma refeição um pouco mais picante, e o restaurante não irá cobrar por esta cobertura extra.
