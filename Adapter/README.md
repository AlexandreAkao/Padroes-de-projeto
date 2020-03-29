# :electric_plug: Adapter

Permitir que um objeto seja substituído por outro que, apesar de realizar a mesma tarefa, possui uma interface diferente.

O padrão Adapter permite que você envolva um objeto incompatível em um adaptador para torná-lo compatível com outra classe.

De forma exemplificável por um adaptadores de cabos, o padrão Adapter converte a interface de uma classe para outra interface que o cliente espera encontrar.

![UMLpng](https://user-images.githubusercontent.com/40917812/77838904-9803e000-714e-11ea-9f71-b7013bfd272c.png)

## :thinking: Quando usar :grey_question:

Use quando quer usar uma classe já existente, mas a interface não é compatível com o resto do seu código.

Muitas vezes uma classe que poderia ser reaproveitada não é reutilizada justamente pelo fato de sua interface não corresponder à interface específica de um domínio requerida por uma aplicação.

É frequentemente usado para fazer com que as classes existentes trabalhem com outras sem modificar seu código.

## :muscle: Exemplo prático

O mundo tem uma gama de padrões de tomadas diferentes de acordo com cada região e quando você vai de um lugar para outro que tem padrões diferente, a solução é você utilizar um adaptador de tomada.

Implemente um adaptador que irá permitir você usar o plug americano na tomada de padrão brasileiro.
