package steps;

import static steps.Hooks.driver;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.FiltroPage;

public class FiltroSteps {	
	
	@Quando("^o usuario clicar no menu filtros$")
	public void o_usuario_clicar_no_menu_filtros() throws Throwable {
	    Thread.sleep(2000);
	}
//AZ
	@Quando("^selecionar opcao ordenar por nome de A a Z$")
	public void selecionar_opcao_ordenar_por_nome_de_A_a_Z() throws Throwable {
		Thread.sleep(2000);
		FiltroPage fp = new FiltroPage(driver);
		fp.selectNameAZ();
	}

	@Entao("^o sistema devera exibir os itens listados em ordem alfabetica$")
	public void o_sistema_devera_exibir_os_itens_listados_em_ordem_alfabetica() throws Throwable {
		Thread.sleep(2000);
		FiltroPage fp = new FiltroPage(driver);
		fp.validaNameAaZ();
	}
//ZA
	@Quando("^selecionar opcao ordenar por nome de Z a A$")
	public void selecionar_opcao_ordenar_por_nome_de_Z_a_A() throws Throwable {
		Thread.sleep(2000);
		FiltroPage fp = new FiltroPage(driver);
		fp.selectNameZA();
	}

	@Entao("^o sistema devera exibir os itens listados em alfabetica invertida$")
	public void o_sistema_devera_exibir_os_itens_listados_em_alfabetica_invertida() throws Throwable {
		Thread.sleep(2000);
		FiltroPage fp = new FiltroPage(driver);
		fp.validaNameZaA();
	}
//Low to High
	@Quando("^selecionar opcao ordenar por preco Low to High$")
	public void selecionar_opcao_ordenar_por_preco_Low_to_High() throws Throwable {
		Thread.sleep(2000);
		FiltroPage fp = new FiltroPage(driver);
		fp.selectLowHigh();
	}

	@Entao("^o sistema devera exibir os itens listados do menor preco ao maior$")
	public void o_sistema_devera_exibir_os_itens_listados_do_menor_preco_ao_maior() throws Throwable {
		Thread.sleep(2000);
		FiltroPage fp = new FiltroPage(driver);
		fp.validaLowToHigh();
	}
//High to Low
	@Quando("^selecionar opcao ordenar por preco High to Low$")
	public void selecionar_opcao_ordenar_por_preco_High_to_Low() throws Throwable {
		Thread.sleep(2000);
		FiltroPage fp = new FiltroPage(driver);
		fp.selectHighLow();
	}

	@Entao("^o sistema devera exibir os itens listados do maior preco ao menor$")
	public void o_sistema_devera_exibir_os_itens_listados_do_maior_preco_ao_menor() throws Throwable {
		Thread.sleep(2000);
		FiltroPage fp = new FiltroPage(driver);
		fp.validaHighToLow();
	}
	
}
