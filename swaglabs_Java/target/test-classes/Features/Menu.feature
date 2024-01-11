#language: pt
#enconding: UTF-8
@Menu
Funcionalidade: Menu

  Contexto: 
    Dado que o usuario esteja logado

  @TodosOsItens
  Cenario: Acessar todos os itens da loja
    Quando o usuario nao estiver na pagina de Produtos
    E clicar no menu
    E clicar na opcao All Items
    Entao o sistema devera mostrar a pagina Produtos e todos itens da loja

  @About
  Cenario: Acessar a pagina saucelabs pelo menu ABOUT
    Quando o usuario clicar no menu
    E clicar na opcao About
    Entao o sistema devera exibir a pagina principal da saucelabs.com

  @Logout
  Cenario: Realizar Logout com sucesso
    Quando o usuario clicar no menu
    E clicar na opcao Logout
    Entao o sistema devera mostrar a pagina de Login

  @Reset
  Cenario: Resetar o estado do site ao inicio
    Quando o usuario adicionar o item backpack ao carrinho
    E clicar no menu
    E clicar na opcao Reset App State
    Entao o sistema devera mostrar o icone do carrinho de compras vazio

  @FecharMenu
  Cenario: Acionar o botao fechar menu
    Quando o usuario clicar no menu
    E clicar no botao fechar Menu
    Entao o sistema devera mostrar a pagina Produtos e todos itens da loja
