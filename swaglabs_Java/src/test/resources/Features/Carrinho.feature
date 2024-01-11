#language: pt
#enconding: UTF-8
@Carrinho
Funcionalidade: Menu

  Contexto: 
    Dado que o usuario esteja logado

  @AddRemoveItens
  Cenario: Adicionar e remover itens do carrinho
    Quando o usuario adicionar o item backpack ao carrinho
    E o usuario acessar o carrinho de compras
    E clicar na opcao Continue Shopping
    E adicionar o item Bike Light ao carrinho
    E adicionar o item Fleece Jacket ao carrinho
    E adicionar o item Labs Onesie ao carrinho
    E o usuario acessar o carrinho de compras
    E remover o item Bike Light do carrinho
    E remover o item Labs Onesie do carrinho
    Entao deve-se conter no carrinho os itens Backpack e Fleece Jacket no carrinho

  @Checkout
  Cenario: Realizar Checkout com sucesso com os itens selecionados
    Quando o usuario adicionar o item backpack ao carrinho
    E adicionar o item Fleece Jacket ao carrinho
    E o usuario acessar o carrinho de compras
    E clicar na opcao Checkout
    E inserir o primeiro nome como "firstTest"
    E inserir o ultimo nome como "lasTest"
    E inserir o codigo postal como "72890-654"
    E clicar em Continue
    E o usuario conferir os itens e Total dos produtos
    E clicar em Finish
    Entao deve-se exibir a tela de Checkout Completo com o botao de voltar ao inicio

  @CheckoutSemDados
  Cenario: Realizar Checkout sem inserir nenhum dado
    Quando o usuario acessar o carrinho de compras
    E clicar na opcao Checkout
    E clicar em Continue
    Entao deve-se exibir uma mensagem de erro requerindo o First Name

  @CheckoutSomenteComFirstName
  Cenario: Realizar Checkout inserindo somente o First Name
    Quando o usuario acessar o carrinho de compras
    E clicar na opcao Checkout
    E inserir o primeiro nome como "firstTest"
    E clicar em Continue
    Entao deve-se exibir uma mensagem de erro requerindo o Last Name

  @CheckoutSemPostalCode
  Cenario: Realizar Checkout sem inserir o Postal Code
    Quando o usuario acessar o carrinho de compras
    E clicar na opcao Checkout
    E inserir o primeiro nome como "firstTest"
    E inserir o ultimo nome como "lasTest"
    E clicar em Continue
    Entao deve-se exibir uma mensagem de erro requerindo o Postal Code

  @BackHomePosCheckout
  Cenario: Realizar com sucesso o retorno ao Home apos o Checkout
    Quando o usuario acessar o carrinho de compras
    E clicar na opcao Checkout
    E inserir o primeiro nome como "firstTest"
    E inserir o ultimo nome como "lasTest"
    E inserir o codigo postal como "72890-654"
    E clicar em Continue
    E clicar em Finish
    E clicar em Back Home
    Entao deve-se mostrar a pagina Produtos e todos itens da loja
