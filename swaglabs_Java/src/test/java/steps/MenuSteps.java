package steps;

import static steps.Hooks.driver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.LoginPage;
import pageobjects.MenuPage;

public class MenuSteps {
	
//Login
	@Dado("^que o usuario esteja logado$")
	public void que_o_usuario_esteja_logado() throws Throwable {
		Thread.sleep(2000);
		LoginPage lp = new LoginPage(driver);
		lp.contextoLogin();
	}

//All Items
	@Quando("^o usuario nao estiver na pagina de Produtos$")
	public void o_usuario_nao_estiver_na_pagina_de_Produtos() throws Throwable {
		Thread.sleep(2000);
		MenuPage mp = new MenuPage(driver);
		mp.clicarNaBackpackItem();
	}

	@Quando("^o usuario clicar no menu$")
	public void o_usuario_clicar_no_menu() throws Throwable {
		Thread.sleep(2000);
		MenuPage mp = new MenuPage(driver);
		mp.clicarNoMenu();
	}

	@Quando("^clicar na opcao All Items$")
	public void clicar_na_opcao_All_Items() throws Throwable {
		Thread.sleep(2000);
		MenuPage mp = new MenuPage(driver);
		mp.clicarMenuAllItems();
	}

	@Entao("^o sistema devera mostrar a pagina Produtos e todos itens da loja$")
	public void o_sistema_devera_mostrar_a_pagina_Produtos_e_todos_itens_da_loja() throws Throwable {
		Thread.sleep(2000);
		MenuPage mp = new MenuPage(driver);
		mp.validaTitleProducts();
	}

//About
	@Quando("^clicar na opcao About$")
	public void clicar_na_opcao_About() throws Throwable {
		Thread.sleep(2000);
		MenuPage mp = new MenuPage(driver);
		mp.clicarMenuAbout();
	}

	@Entao("^o sistema devera exibir a pagina principal da saucelabs\\.com$")
	public void o_sistema_devera_exibir_a_pagina_principal_da_saucelabs_com() throws Throwable {
		Thread.sleep(2000);
		MenuPage mp = new MenuPage(driver);
		mp.validaAbout();
	}
	
//Logout
	@Quando("^selecionar a opcao Logout$")
	public void selecionar_a_opcao_Logout() throws Throwable {
		Thread.sleep(2000);
		//MenuPage mp = new MenuPage(driver);
		//mp.clicarMenuLogout();
		
		LoginSteps ls = new LoginSteps();
		ls.clicar_na_opcao_Logout();
	}
	
	@Entao("^o sistema devera mostrar a pagina de Login com campos vazios$")
	public void o_sistema_devera_mostrar_a_pagina_de_Login_com_campos_vazios() throws Throwable {
		Thread.sleep(2000);
		//MenuPage mp = new MenuPage(driver);
		//mp.validaLogout();
		
		LoginSteps ls = new LoginSteps();
		ls.o_sistema_devera_mostrar_a_pagina_de_Login();
	}

//Reset
	@Quando("^o usuario adicionar o item backpack ao carrinho$")
	public void o_usuario_adicionar_o_item_backpack_ao_carrinho() throws Throwable {
		Thread.sleep(2000);
		MenuPage mp = new MenuPage(driver);
		mp.addBackPack();
	}

	@Quando("^clicar na opcao Reset App State$")
	public void clicar_na_opcao_Reset_App_State() throws Throwable {
		Thread.sleep(2000);
		MenuPage mp = new MenuPage(driver);
		mp.clicarMenuReset();
	}

	@Entao("^o sistema devera mostrar o icone do carrinho de compras vazio$")
	public void o_sistema_devera_mostrar_o_icone_do_carrinho_de_compras_vazio() throws Throwable {
		Thread.sleep(2000);
		MenuPage mp = new MenuPage(driver);
		mp.validaCarrinhoNull();
	}
//Close Menu
	@Quando("^clicar no botao fechar Menu$")
	public void clicar_no_botao_fechar_Menu() throws Throwable {
		Thread.sleep(2000);
		MenuPage mp = new MenuPage(driver);
		mp.fecharMenu();
	}
}
