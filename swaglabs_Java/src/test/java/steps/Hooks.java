package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static utils.Utils.*;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.Scenario;

public class Hooks {

	public static WebDriver driver;
	
	@Before
	public void iniciarDriver() {
		 System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.get("https://www.saucedemo.com/");
	}
	
	
	@After
	public void fecharDriver(Scenario cenario) {
		gerarScreenShot(cenario);
		driver.quit();
	}
	
	
	
	
	
}
