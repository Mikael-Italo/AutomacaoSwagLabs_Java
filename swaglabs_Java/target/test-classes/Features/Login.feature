#language: pt
#enconding: UTF-8
@Login
Funcionalidade: Login


  @RealizarLoginComSucesso
  Esquema do Cenario: Realizar Login com Sucesso
    Quando informar o campo Username como "<usuario>"
    E informar o campo Password como "<senha>"
    E clicar no botao Login
    Entao o sistema devera autorizar o login, exibindo a pagina principal do sistema

    Exemplos: 
      | usuario                 | senha        |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |

  @RealizarLoginComUsuarioBloqueado
  Cenario: Realizar Login com usuario bloqueado
    Quando informar o campo Usarname como "locked_out_user"
    E informar o campo Password como "secret_sauce"
    E clicar no botao Login
    Entao o sistema devera exibir uma mensagem de erro avisando que o usuario esta bloqueado

  @RealizarLoginSemDados
  Cenario: Tentar realizar Login com campos Username e Password vazios
    Quando clicar no botao Login
    Entao o sistema devera exibir uma mensagem de erro requisitando o Username

  @RealizarLoginSemSenha
  Cenario: Tentar realizar Login com campo Password vazio
    Quando informar o campo Usarname como "standard_user"
    E clicar no botao Login
    Entao o sistema devera exibir uma mensagem  de erro requisitando o Password

  @RealizarLoginSemUsuario
  Cenario: Tentar realizar Login com campo Username vazio
    Quando informar o campo Password como "secret_sauce"
    E clicar no botao Login
    Entao o sistema devera exibir uma mensagem de erro requisitando o Username

  @FecharMensagemdeErroLogin
  Cenario: Fechar mensagem de erro que aparece quando os campos nao sao preenchidos
    Quando clicar no botao Login
    E o sistema devera exibir uma mensagem de erro requisitando o Username
    E o usuario clicar no botao de fechar mensagem de erro
    Entao o sistema devera exibir os campos limpos sem mensagem de erro

  @RealizarLogoutComSucesso
  Cenario: Realizar Logout com Sucesso
    Quando informar o campo Username como "standard_user"
    E informar o campo Password como "secret_sauce"
    E clicar no botao Login
    E clicar no menu
    E clicar na opcao Logout
    Entao o sistema devera mostrar a pagina de Login
