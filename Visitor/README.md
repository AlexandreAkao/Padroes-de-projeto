# :running: Visitor

Permitir atualizações específicas em uma coleção de objetos de acordo com o tipo particular de cada objeto atualizado.

Permite que se crie uma nova operação sem que se mude a classe dos elementos sobre as quais ela opera. É uma maneira de separar um algoritmo da estrutura de um objeto.

![UMLpng](https://user-images.githubusercontent.com/40917812/77870678-6fe0b380-7218-11ea-858f-6ac8bafc7fb4.png)

## :thinking: Quando usar :grey_question:

Quando você precisa fazer uma operação em todos os elementos de uma estrutura de objetos complexa.

Para limpar a lógica de negócio de comportamentos auxiliares.

## :muscle: Exemplo prático

Em um Hospital, existem 3 tipos de profissionais: Médico, Secretária e Enfermeira, e para cada tipo de profissional o hospital define um custo por serviço prestado. O exemplo mostra uma forma de obter o custo total que esse hospital vai ter com todos os seus funcionários.
