package steps;

import static steps.Hooks.driver;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.LoginPage;

public class LoginSteps {

	//Login com Sucesso====================================================
	@Quando("^informar o campo Username como \"([^\"]*)\"$")
	public void informar_o_campo_Username_como(String arg1) throws Throwable {
		Thread.sleep(2000);
		LoginPage login = new LoginPage(driver);
		login.sendUsuario(arg1);
	}

	@Quando("^informar o campo Password como \"([^\"]*)\"$")
	public void informar_o_campo_Password_como(String arg1) throws Throwable {
		Thread.sleep(2000);
		LoginPage login = new LoginPage(driver);
		login.sendSenha(arg1);
	}

	@Quando("^clicar no botao Login$")
	public void clicar_no_botao_Login() throws Throwable {
		Thread.sleep(2000);
		LoginPage login = new LoginPage(driver);
		login.clicarbtnLogin();	    
	}

	@Entao("^o sistema devera autorizar o login, exibindo a pagina principal do sistema$")
	public void o_sistema_devera_autorizar_o_login_exibindo_a_pagina_principal_do_sistema() throws Throwable {
		Thread.sleep(2000);
		LoginPage login = new LoginPage(driver);
		login.validaLoginSucesso();	   
	}
	
	//Login sem inserir os dados======================================================================
	@Entao("^o sistema devera exibir uma mensagem de erro requisitando o Username$")
	public void o_sistema_devera_exibir_uma_mensagem_de_erro_requisitando_o_Username() throws Throwable {
		Thread.sleep(2000);
		LoginPage login = new LoginPage(driver);
		login.validaElementoH3Username();	
	}
	
	//Login sem inserir Senha============================================================================
	@Quando("^informar o campo Usarname como \"([^\"]*)\"$")
	public void informar_o_campo_Usarname_como(String arg1) throws Throwable {
		Thread.sleep(2000);
		LoginPage login = new LoginPage(driver);
		login.sendUsuario(arg1);
	}

	@Entao("^o sistema devera exibir uma mensagem  de erro requisitando o Password$")
	public void o_sistema_devera_exibir_uma_mensagem_de_erro_requisitando_o_Password() throws Throwable {
		Thread.sleep(2000);
		LoginPage login = new LoginPage(driver);
		login.validaElementoH3Password();
	}

	//Fechando mensagem de erro=============================================================================
	@Quando("^o usuario clicar no botao de fechar mensagem de erro$")
	public void o_usuario_clicar_no_botao_de_fechar_mensagem_de_erro() throws Throwable {
		Thread.sleep(2000);
		LoginPage login = new LoginPage(driver);
		login.fecharMsgErro();
	}

	@Entao("^o sistema devera exibir os campos limpos sem mensagem de erro$")
	public void o_sistema_devera_exibir_os_campos_limpos_sem_mensagem_de_erro() throws Throwable {
		Thread.sleep(2000);
		LoginPage login = new LoginPage(driver);
		login.validaMsgFechada();
	}
	
	//Usuario bloqueado===========================================================================================
	@Entao("^o sistema devera exibir uma mensagem de erro avisando que o usuario esta bloqueado$")
	public void o_sistema_devera_exibir_uma_mensagem_de_erro_avisando_que_o_usuario_esta_bloqueado() throws Throwable {
		Thread.sleep(2000);
		LoginPage login = new LoginPage(driver);
		login.validaUserBloqueado();
	}
	
//Logout com sucesso=====================================================================================
	@Quando("^clicar no menu$")
	public void clicar_no_menu() throws Throwable {
		Thread.sleep(2000);
		LoginPage login = new LoginPage(driver);
		login.acessarMenu();
	}

	@Quando("^clicar na opcao Logout$")
	public void clicar_na_opcao_Logout() throws Throwable {
		Thread.sleep(2000);
		LoginPage login = new LoginPage(driver);
		login.clicaLogout();
	}

	@Entao("^o sistema devera mostrar a pagina de Login$")
	public void o_sistema_devera_mostrar_a_pagina_de_Login() throws Throwable {
		Thread.sleep(2000);
		LoginPage login = new LoginPage(driver);
		login.validaLogout();
	}
	
	
	

}
