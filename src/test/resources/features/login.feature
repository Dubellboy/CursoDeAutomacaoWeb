#language:pt

Funcionalidade: Login

  Contexto:
    Dado que a modal esteja sendo exibida

  Cenario: Fechar modal ao clicar fora da mesma
    Quando for realizado o clique fora da modal
    Entao a janela deve ser fechada

  Cenario: Fechar modal ao clicar ao clicar no icone fechar
    Quando for realizado um clique no icone de fechar modal
    Entao a janela deve ser fechada


  Cenario: Link create New Account
    Quando for realizado o clique em create new account
    Entao a página create account deve ser exibida

      #Agrupamento de cenários

  Esquema do Cenario: Realizar login <identificacao>
    Quando os campos de login forem preenchidos com os valores
      | usuario  | <usuario>  |
      | senha    | <senha>    |
      | remember | <remember> |
    Quando for realizado o clique no botao sign in
    Entao deve ser possível logar no sistema
    Exemplos:
      | identificacao           | usuario | senha | remember |
      | com campos obrigatorios | chronos | senha | false    |
      | todos os campos         | chronos | senha | true     |

  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login forem preenchidos com os valores
      | usuario  | <usuario>  |
      | senha    | <senha>    |
      | remember | <remember> |
    Quando for realizado o clique no botao sign in
    Entao o sisitema devera exibir uma mensagem de erro
    Exemplos:
      | identificacao    | usuario  | senha    | remember |
      | usuario invalido | invalido | senha    | false    |
      | senha invalida   | chronos  | invalida | false    |

  Esquema do Cenario: realizar login com <identificacao>
    Quando os campos de login forem preenchidos com os valores
      | usuario  |            |
      | senha    | <senha>    |
      | remember | <remember> |
    Entao o botao sign in deve permanecer desabilitado
    Exemplos:
      | identificacao     | usuario | senha | remember |
      | valores em branco |         | senha | false    |
      | senha em branco   | chronos |       | false    |


