# language: pt


  Funcionalidade: Pesquisar Produto
    Eu como usuário
    Quero Pesquisar um Produto
    Para poder compra-lo.

  Cenario: Pesquisar por Xbox SERIES S
    Dado Que eu vou até o site da Amazon.com
    Quando Clico na Search Bar E pesquiso por "XBOX SERIES S"
    Entao Será me retornado produtos XBOX SERIES S

    Cenario: Adicionar Xbox ao carrinho
      Dado  que eu entro num produto xbox
      Quando clicar no carrinho
      Entao  ele aparecera no carrinho de compras