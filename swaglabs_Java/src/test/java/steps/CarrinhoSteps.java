package steps;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.CarrinhoPage;
import static steps.Hooks.*;

public class CarrinhoSteps {
	
	CarrinhoPage cp = new CarrinhoPage(driver);
	
//Add and remove of cart	
	@Quando("^o usuario acessar o carrinho de compras$")
	public void o_usuario_acessar_o_carrinho_de_compras() throws Throwable {
	    Thread.sleep(2000);
		cp.acessarCarrinho();
	}

	@Quando("^clicar na opcao Continue Shopping$")
	public void clicar_na_opcao_Continue_Shopping() throws Throwable {
		Thread.sleep(2000);
		cp.continueShopping();
	}

	@Quando("^adicionar o item Bike Light ao carrinho$")
	public void adicionar_o_item_Bike_Light_ao_carrinho() throws Throwable {
		Thread.sleep(2000);
		cp.addBikeLight();
	}

	@Quando("^adicionar o item Fleece Jacket ao carrinho$")
	public void adicionar_o_item_Fleece_Jacket_ao_carrinho() throws Throwable {
		Thread.sleep(2500);
		cp.addFleeceJacket();
	}

	@Quando("^adicionar o item Labs Onesie ao carrinho$")
	public void adicionar_o_item_Labs_Onesie_ao_carrinho() throws Throwable {
		Thread.sleep(2000);
		cp.addLabsOnesie();
	}

	@Quando("^remover o item Bike Light do carrinho$")
	public void remover_o_item_Bike_Light_do_carrinho() throws Throwable {
		Thread.sleep(2000);
		cp.removerBikeLight();
	}

	@Quando("^remover o item Labs Onesie do carrinho$")
	public void remover_o_item_Labs_Onesie_do_carrinho() throws Throwable {
		Thread.sleep(2000);
		cp.removerLabsOnesie();
	}

	@Entao("^deve-se conter no carrinho os itens Backpack e Fleece Jacket no carrinho$")
	public void deve_se_conter_no_carrinho_os_itens_Backpack_e_Fleece_Jacket_no_carrinho() throws Throwable {
		Thread.sleep(2000);
		cp.validaAddRemove();
	}
	
//Checkout
	@Quando("^clicar na opcao Checkout$")
	public void clicar_na_opcao_Checkout() throws Throwable {
		Thread.sleep(2000);
		cp.clicarCheckout();
	}

	@Quando("^inserir o primeiro nome como \"([^\"]*)\"$")
	public void inserir_o_primeiro_nome_como(String arg1) throws Throwable {
		Thread.sleep(2000);
		cp.sendFirstName(arg1);
	}

	@Quando("^inserir o ultimo nome como \"([^\"]*)\"$")
	public void inserir_o_ultimo_nome_como(String arg1) throws Throwable {
		Thread.sleep(2000);
		cp.sendLastName(arg1);
	}

	@Quando("^inserir o codigo postal como \"([^\"]*)\"$")
	public void inserir_o_codigo_postal_como(String arg1) throws Throwable {
		Thread.sleep(2000);
		cp.sendPostalCode(arg1);
	}

	@Quando("^clicar em Continue$")
	public void clicar_em_Continue() throws Throwable {
		Thread.sleep(2000);
		cp.clicarContinue();
	}

	@Quando("^o usuario conferir os itens e Total dos produtos$")
	public void o_usuario_conferir_os_itens_e_Total_dos_produtos() throws Throwable {
		Thread.sleep(3000);
		cp.validaItensCarrinho();
	}

	@Quando("^clicar em Finish$")
	public void clicar_em_Finish() throws Throwable {
		Thread.sleep(2000);
		cp.clicarFinish();
	}

	@Entao("^deve-se exibir a tela de Checkout Completo com o botao de voltar ao inicio$")
	public void deve_se_exibir_a_tela_de_Checkout_Completo_com_o_botao_de_voltar_ao_inicio() throws Throwable {
		Thread.sleep(2000);
		cp.validaCheckout();
	}

//Checkout sem dados	
	@Entao("^deve-se exibir uma mensagem de erro requerindo o First Name$")
	public void deve_se_exibir_uma_mensagem_de_erro_requerindo_o_First_Name() throws Throwable {
		Thread.sleep(2000);
		cp.validaMsgErroFirstName();
	}
//Checkout so com FirstName
	@Entao("^deve-se exibir uma mensagem de erro requerindo o Last Name$")
	public void deve_se_exibir_uma_mensagem_de_erro_requerindo_o_Last_Name() throws Throwable {
		Thread.sleep(2000);
		cp.validaMsgErroLastName();
	}
//Checkout sem Postal Code
	@Entao("^deve-se exibir uma mensagem de erro requerindo o Postal Code$")
	public void deve_se_exibir_uma_mensagem_de_erro_requerindo_o_Postal_Code() throws Throwable {
		Thread.sleep(2000);
		cp.validaMsgErroPostalCode();
	}
//Back Home
	@Quando("^clicar em Back Home$")
	public void clicar_em_Back_Home() throws Throwable {
		Thread.sleep(2000);
		cp.clicarBackHome();
	}
//Pagina inicial
	@Entao("^deve-se mostrar a pagina Produtos e todos itens da loja$")
	public void deve_se_mostrar_a_pagina_Produtos_e_todos_itens_da_loja() throws Throwable {
		Thread.sleep(2000);
		cp.validaPaginaProdutos();
	}
}
