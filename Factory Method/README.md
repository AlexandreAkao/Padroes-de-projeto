# :factory: Factory Method

Este padrão permite às classes delegar para subclasses decidirem, isso é feito através da criação de objetos que chamam o método fabrica especificado numa interface e implementado por um classe filha ou implementado numa classe abstrata e opcionalmente sobrescrito por classes derivadas.

Encapsular a escolha da classe concreta a ser utilizada na criação de objetos de um determinado
tipo.

<center>
![UMLpng](https://user-images.githubusercontent.com/40917812/77593080-4fd88980-6ed2-11ea-9657-b7d5cdd692b8.png)
</center>

## :thinking: Quando usar :grey_question:

Útil quando há algum processamento genérico em uma classe, mas a sub-classe necessária é dinamicamente decidida em tempo de execução. Ou colocando em outras palavras, quando o cliente não sabe qual sub-classe exatamente precisará.

## :muscle: Exemplo prático

Considere um sistema bancário que precisa enviar mensagens aos seus clientes. Por exemplo,
após a realização de uma compra com cartão de crédito, uma mensagem contendo informações
sobre a compra pode ser enviada ao cliente.

Se esse cliente for uma pessoa física, poderá optar pelo recebimento da mensagem através de
email ou SMS. Por outro lado, se for uma pessoa jurídica, poderá também receber a mensagem através
de JMS (Java Message Service).
