package utils;

import static steps.Hooks.driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;


public class Utils {

	
	
	public static void esperarElemento(WebElement elemento) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(elemento));
	}
	
	public static void selecionar(WebElement element, String texto) {
		Select sl = new Select(element);
		sl.selectByValue(texto);
	}
	
	public static void gerarScreenShot(Scenario cenario) {
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		cenario.embed(screenshot, "image/png");
	}
}
