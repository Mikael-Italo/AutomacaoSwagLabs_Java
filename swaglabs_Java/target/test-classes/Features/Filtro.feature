#language: pt
#enconding: UTF-8
@Filtro
Funcionalidade: Filtros

  Contexto: 
    Dado que o usuario esteja logado

  @ListagemAaZ
  Cenario: Listar itens de A a Z
    Quando o usuario clicar no menu filtros
    E selecionar opcao ordenar por nome de A a Z
    Entao o sistema devera exibir os itens listados em ordem alfabetica

  @ListagemZaA
  Cenario: Listar itens de Z a A
    Quando o usuario clicar no menu filtros
    E selecionar opcao ordenar por nome de Z a A
    Entao o sistema devera exibir os itens listados em alfabetica invertida

  @PrecoCrescente
  Cenario: Listar itens do menor preco ao maior
    Quando o usuario clicar no menu filtros
    E selecionar opcao ordenar por preco Low to High
    Entao o sistema devera exibir os itens listados do menor preco ao maior

  @PrecoDescrecente
  Cenario: Listar itens do maior preco ao menor
    Quando o usuario clicar no menu filtros
    E selecionar opcao ordenar por preco High to Low
    Entao o sistema devera exibir os itens listados do maior preco ao menor
