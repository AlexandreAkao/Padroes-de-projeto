# :hammer: Abstract Factory

Este padrão permite a criação de famílias de objetos relacionados ou dependentes por meio de uma única interface e sem que a classe concreta seja especificada.

Encapsular a escolha das classes concretas a serem utilizadas na criação dos objetos de diversas famílias.

![UMLpng](https://user-images.githubusercontent.com/40917812/76691390-1f1e6780-6629-11ea-806e-ecc8b4fe074d.png)

## :thinking: Quando usar :grey_question:

Quando existem dependências inter-relacionadas com lógica de criação não tão simples envolvida.

## :muscle: Exemplo prático

Estabelecimentos comerciais normalmente oferecem aos clientes diversas opções de pagamento. Por exemplo, clientes podem efetuar pagamentos com dinheiro, cheque, cartões de crédito ou débito, entre outros.

Pagamentos com cartões são realizados por meio de uma máquina de cartão, oferecida e instalada por empresas como Cielo e Redecard. Geralmente, essa máquina é capaz de lidar com cartões de diferentes bandeiras (como Visa eMastercard).

Nosso objetivo é programar essas máquinas, isto é, desenvolver uma aplicação capaz de se comunicar comas diferentes bandeiras e registrar pagamentos.

No momento do pagamento, a máquina de cartão deve enviar as informações relativas a transação (como valor e senha) para a bandeira correspondente ao cartão utilizado. Além disso, a máquina deve aguardar uma resposta de confirmação ou recusa do pagamento.
