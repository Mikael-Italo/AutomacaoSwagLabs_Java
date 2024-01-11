#language: pt
#enconding: UTF-8
@Social
Funcionalidade: Redes Sociais

  Contexto: 
    Dado que o usuario esteja logado

  @AcessarTwitter
  Cenario: Acessar com sucesso a pagina do Twitter 
  Quando o usuario clicar no card Twitter
  Entao deve-se acessar a pagina do Twitter da Sauce Labs
  
  @AcessarFacebook
  Cenario: Acessar com sucesso a pagina do Facebook
  Quando o usuario clicar no card Facebook
  Entao deve-se acessar a pagina do Facebook da Sauce Labs
  
  @AcessarLinkedin
  Cenario: Acessar com sucesso o perfil no Linkedin
  Quando o usuario clicar no card do Linkedin
  Entao deve-se acessar o perfil do Linkedin da Sauce Labs