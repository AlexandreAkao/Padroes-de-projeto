# :satellite: Proxy

Controlar as chamadas a um objeto através de outro objeto de mesma interface.

Esse padrão define um intermediário para controlar o acesso a um determinado objeto, podendo adicionar funcionalidades que esse objeto não possui.

![UMLpng](https://user-images.githubusercontent.com/40917812/77858897-bb756c00-71dc-11ea-883a-5d582b5c9e67.png)

## :thinking: Quando usar :grey_question:

**proxy virtual:** Quando você tem um objeto do serviço pesado que gasta recursos do sistema por estar sempre rodando, mesmo quando você precisa dele de tempos em tempos.

**proxy de proteção:** Quando você quer que apenas clientes específicos usem o objeto do serviço.

**proxy remoto:** Quando o objeto do serviço está localizado em um servidor remoto.

**proxy de registro:** Quando você quer manter um histórico de pedidos ao objeto do serviço.

**proxy de cache:** Quando você precisa colocar em cache os resultados de pedidos do cliente e gerenciar o ciclo de vida deste cache, especialmente se os resultados são muito grandes.

Quando você precisa ser capaz de se livrar de um objeto pesado assim que não há mais clientes que o usam.

## :muscle: Exemplo prático

Estamos desenvolvendo uma aplicação bancária que deve registrar todas as operações realizadas pelos objetos que representam as contas do banco. O registro das operações pode ser utilizado posteriormente em uma auditoria.

Para manter o sistema mais coeso, não queremos implementar o registro das operações dentro dos objetos que representam as contas. A ideia é implementar essa lógica em objetos intermediários. Para preservar o modo de utilização das contas, podemos manter a interface nesses objetos intermediários.
