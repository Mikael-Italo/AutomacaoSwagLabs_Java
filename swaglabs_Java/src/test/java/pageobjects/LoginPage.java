package pageobjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utils.Mapeamento;

public class LoginPage extends Mapeamento{

	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void sendUsuario(String usuario) throws Exception {
		username.sendKeys(usuario);
	}
	
	public void sendSenha(String senha) throws Exception {
		password.sendKeys(senha);
	}
	
	public void clicarbtnLogin() throws Exception{
		btnLogin.click();
	}
	
	public void validaLoginSucesso() throws Exception{
		assertTrue(btnMenu.isDisplayed());
	}
	
	public void validaElementoH3Username() throws Exception{
		assertEquals("Epic sadface: Username is required", elementoH3.getText());
	}
	
	public void validaElementoH3Password() throws Exception{
		assertEquals("Epic sadface: Password is required", elementoH3.getText());
	}
	
	public void fecharMsgErro() throws Exception{
		btnFecharMsg.click();
	}
	
	public void validaMsgFechada() throws Exception{
		assertTrue(validaMsgErro.isDisplayed());
	}
	
	public void validaUserBloqueado() {
		assertEquals("Epic sadface: Sorry, this user has been locked out.", elementoH3.getText());
	}
	
	//Logout
	public void acessarMenu() {
		btnMenu.click();
	}
	public void clicaLogout() {
		clicaLogout.click();
	}
	public void validaLogout() {
		assertTrue(btnLogin.isDisplayed());
	}


	public void contextoLogin() throws Exception {
		sendUsuario("standard_user");
		sendSenha("secret_sauce");
		clicarbtnLogin();
	}
	
}