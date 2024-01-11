package pageobjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utils.Mapeamento;
import static utils.Utils.*;

public class FiltroPage extends Mapeamento{

	public FiltroPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
			


//select
	public void selectNameAZ() {
		selecionar(selectFiltros, "az");
	}
	public void selectNameZA() {
		selecionar(selectFiltros, "za");
	}
	public void selectLowHigh() {
		selecionar(selectFiltros, "lohi");
	}
	public void selectHighLow() {
		selecionar(selectFiltros, "hilo");
	}
	
//validacao
	public void validaNameAaZ() {
		assertEquals("Sauce Labs Backpack", nameItens.getText());
	}
	public void validaNameZaA() {
		assertEquals("Test.allTheThings() T-Shirt (Red)", nameItens.getText());
	}
	
	public void validaLowToHigh() {
		assertEquals("$7.99", priceItens.getText());
	}
	public void validaHighToLow() {
		assertEquals("$49.99", priceItens.getText());
	}

}
