package pageobjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utils.Mapeamento;

public class CarrinhoPage extends Mapeamento{
	
	public CarrinhoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void acessarCarrinho() {
		btnCarrinho.click();
	}
	
	public void continueShopping() {
		btnContinueShopping.click();
	}
//Add items	
	public void addBikeLight() {
		btnAddBikeLight.click();
	}
	
	public void addFleeceJacket() {
		btnAddFleeceJacket.click();
	}
	
	public void addLabsOnesie() {
		btnAddOnesie.click();
	}
	
//remove items
	public void removerBikeLight() {
		btnRemoveBikeLight.click();
	}
	
	public void removerLabsOnesie() {
		btnRemoveLabsOnesie.click();
	}
	
//checkout
	public void clicarCheckout() {
		btnCheckout.click();
	}
	
	public void sendFirstName(String FirstName) {
		sendFirstName.sendKeys(FirstName);
	}
	
	public void sendLastName(String LastName) {
		sendLastName.sendKeys(LastName);
	}
	
	public void sendPostalCode(String PostalCode) {
		sendPostalCode.sendKeys(PostalCode);
	}
	
	public void clicarContinue() {
		btnContinue.click();
	}
	
	public void clicarFinish() {
		btnFinish.click();
	}
	
//BackHome
	public void clicarBackHome() {
		btnBackHome.click();
	}
	
//asserts
	public void validaAddRemove() {
		assertTrue(btnRemoveBackpack.isDisplayed());
		assertTrue(btnRemoveFleeceJacket.isDisplayed());
	}
	
	public void validaItensCarrinho() {
		assertTrue(backpackInCart.isDisplayed());
		assertTrue(FleeceJacketInCart.isDisplayed());
		assertEquals("Total: $86.38", valorTotal.getText());
	}
	
	public void validaCheckout() {
		assertTrue(titleCheckoutComplete.isDisplayed());
		System.out.println(titleCheckoutComplete.getText());
		assertEquals("CHECKOUT: COMPLETE!", titleCheckoutComplete.getText());
		assertTrue(btnBackHome.isDisplayed());
	}
	
	public void validaMsgErroFirstName() {
		assertTrue(msgErroH3Checkout.isDisplayed());
		assertEquals("Error: First Name is required", msgErroH3Checkout.getText());
	}
	
	public void validaMsgErroLastName() {
		assertTrue(msgErroH3Checkout.isDisplayed());
		assertEquals("Error: Last Name is required", msgErroH3Checkout.getText());
	}

	public void validaMsgErroPostalCode() {
		assertTrue(msgErroH3Checkout.isDisplayed());
		assertEquals("Error: Postal Code is required", msgErroH3Checkout.getText());
	}
	
	public void validaPaginaProdutos() {
		assertTrue(spanProducts.isDisplayed());
		assertTrue(containerInventarioProdutos.isDisplayed());
	}
	
}
