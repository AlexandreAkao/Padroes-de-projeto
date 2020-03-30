# State

Alterar o comportamento de um determinado objeto de acordo com o estado no qual ele se encontra.

![UMLpng](https://user-images.githubusercontent.com/40917812/77866532-e629e980-7209-11ea-99c8-4bfdbf06e7c8.png)

## :thinking: Quando usar :grey_question:

Quando você tem um objeto que se comporta de maneira diferente dependendo do seu estado atual, quando o número de estados é enorme, e quando o código estado específico muda com frequência.

Quando você tem uma classe populada com condicionais gigantes que alteram como a classe se comporta de acordo com os valores atuais dos campos da classe.

Quando você tem muito código duplicado em muitos estados parecidos e transições de uma máquina de estado baseada em condições.

## :muscle: Exemplo prático

Em um taxi o valor da corrida vária dependendo da bandeira que está a corrida. Logo em diferente estados do taximetro, o preço da corrida vai mudar.
