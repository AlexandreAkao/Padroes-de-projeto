# :link: Chain of Responsibility

A principal função é evitar a dependência entre um objeto receptor e um objeto solicitante.

A intenção deste padrão é evitar o acoplamento do remetente de uma solicitação ao seu receptor, ao dar a mais de um objeto a oportunidade de tratar essa solicitação. Encadear os objetos receptores, passando a solicitação ao longo da cadeia até que um objeto a trate.

![UMLpng](https://user-images.githubusercontent.com/40917812/77864314-34d18680-71fe-11ea-8fa8-64887a484d09.png)

## :thinking: Quando usar :grey_question:

Quando é esperado que seu programa processe diferentes tipos de pedidos em várias maneiras, mas os exatos tipos de pedidos e suas sequências são desconhecidos de antemão.

Quando é essencial executar diversos handlers em uma ordem específica.

Quando o conjunto de handlers e suas encomendas devem mudar no momento de execução.

## :muscle: Exemplo prático

Efetuando o pagamento em um banco, com diversos tipos de banco e cada um com sua implementação de como ocorre o pagamento.
