# :construction_worker: Builder

Este padrão permite a separação da construção de um objeto complexo da sua representação, de forma que o mesmo processo de construção possa criar diferentes representações.

Separar o processo de construção de um objeto de sua representação e permitir a sua
criação passo-a-passo. Diferentes tipos de objetos podem ser criados comimplementações distintas de
cada passo.

![UMLpng](https://user-images.githubusercontent.com/40917812/77598730-53274180-6ee1-11ea-84e5-3078020748c4.png)

## :thinking: Quando usar :grey_question:

Quando poderia haver diversas variedades de um objeto. A diferença chave para o padrão factory é que o padrão factory é utilizado quando o processo de criação é feito num único passo, enquanto o padrão builder é utilizado quando a criação é um processo que envolvem vários passos.

## :muscle: Exemplo prático

Estabelecimentos de *fast-food* normalmente tem seus lanches com muitas opções parar você modificar, colocando certo queijo, carne, mudando a bebida.

No pedido de um lanche infantil em que pode ter a escolha de um brinque a pessoal também tem a possibilidade de escolher seu brinquedo.

Imagine que você esteja em um fast-food e que tenha pedido um lanche ao atendente. Este, por sua vez, repassa o pedido para a cozinha, onde o lanche é produzido, construa o lanche utilizando o **padrão Builder**.