package pageobjects;

import static org.junit.Assert.assertTrue;
import static steps.Hooks.driver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utils.Mapeamento;

public class SocialPage extends Mapeamento{

	public SocialPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//click in cards	

	public void clicarCardTwitter() {
		cardTwitter.click();
	}
	
	public void clicarCardFacebook() {
		cardFacebook.click(); 
	}
	
	public void clicarCardLinkedin() {
		cardLinkedin.click();
	}
	
//asserts
	public void validaTwitter() {
		List<String> abas = new ArrayList<>(driver.getWindowHandles());
		//mudar o foco do teste para outra guia		
		driver.switchTo().window(abas.get(1));
		//validar se o elemento ta ativo ou nao		
		assertTrue(metaTwitter.isEnabled());
	}
	
	public void validaFacebook() {
		List<String> abas = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(abas.get(1));
		
		assertTrue(metaFacebook.isEnabled());
	}
	
	public void validaLinkedin() {
		List<String> abas = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(abas.get(1));
		
		assertTrue(metaLinkedin.isEnabled());
	}
}
