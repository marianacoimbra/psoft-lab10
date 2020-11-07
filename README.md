# psoft-lab10
Possível implementação de parte do jogo Mario Bros

Nesse projeto foi implementado o Padrão State que permite que um objeto altere seu comportamento quando seu estado interno muda.
O código possuía muitos ifs na Classe Mario e isso pode ser resolvido aplicando o método State o qual propõe que seja criado novas classes para todos os estados possíveis de um objeto (Mario) e se extraia todos os comportamentos específicos (Pequeno, Grande, Fogo) dos estados para dentro dessas classes.
