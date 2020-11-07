# psoft-lab10
Possível implementação de parte do jogo Mario Bros

Nesse projeto foi implementado o Padrão State (na folder refactoredCode) que permite que um objeto altere seu comportamento quando seu estado interno muda.
O código possuía muitos ifs na Classe Mario e isso pode ser resolvido aplicando o método State o qual propõe que seja criado novas classes para todos os estados possíveis de um objeto (Mario) e se extraia todos os comportamentos específicos (Pequeno, Grande, Fogo) dos estados para dentro dessas classes. 

A classe SituacaoManager gerencia os estados tendo o Acoes (Interface) como atributo para ser retornada a acao de acordo com o estado atual. As entidades de Estado estendem a classe abstrata Situacao que implementa a interface Acoes, assim obtemos baixo acoplamento e garantia de que mudaremos de estado.
