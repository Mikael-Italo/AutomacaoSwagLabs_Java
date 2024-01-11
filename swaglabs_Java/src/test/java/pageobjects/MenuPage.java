package pageobjects;

import static org.junit.Assert.assertTrue;
import static steps.Hooks.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utils.Mapeamento;


public class MenuPage extends Mapeamento{	
	
	public MenuPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

//Menu
	public void clicarNoMenu() {
		LoginPage lp = new LoginPage(driver);
		lp.acessarMenu();
	}
	
//All Items
	public void clicarNaBackpackItem() {
		backpackItem.click();
	}
	
	public void clicarMenuAllItems() {
		linkAllItems.click();
	}
	
	public void validaTitleProducts() {
		assertTrue(titleProdutos.isDisplayed());
		assertTrue(btnAddBackpack.isDisplayed());
		assertTrue(btnAddBikeLight.isDisplayed());
	}
	
//About
	public void clicarMenuAbout() {
		linkAbout.click();
	}
	
	public void validaAbout() {
		assertTrue(urlSaucelabs.isEnabled());
	}
	
//Logout
	public void clicarMenuLogout() {
		LoginPage lp = new LoginPage(driver);
		lp.clicaLogout();
	}
	
	public void validaLogout() {
		LoginPage lp = new LoginPage(driver);
		lp.validaLogout();
	}
	
//Reset
	public void addBackPack() {
		btnAddBackpack.click();
	}
	
	//atributos internos
	protected static String validaGetBefore, validaGetAfter;
	protected static boolean validaResult;
	
	public void clicarMenuReset() {
		validaGetBefore = btnCarrinho.getText(); //atribuindo valor antes do RESET
		linkReset.click();
	}
	
	public void validaCarrinhoNull() {
		validaGetAfter = btnCarrinho.getText(); //atribuindo valor apos o RESET

		if (Integer.parseInt(validaGetBefore) ==1 && validaGetAfter.isEmpty()) {
			System.out.println("validado");
			validaResult = true;
		}else {
			System.out.println("invalido");
			validaResult = false;
		}
		assertTrue(validaResult);
	}
	
//Fechar menu
	public void fecharMenu() {
		btnFecharMenu.click();
	}
	
}
