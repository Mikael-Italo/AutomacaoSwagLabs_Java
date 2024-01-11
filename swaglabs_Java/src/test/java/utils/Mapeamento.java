package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Mapeamento {

	@FindBy (how = How.XPATH, using = "//div[contains(@class, 'inventory_item_name')]")
	protected WebElement selecionarItemCarrinho;
	
	@FindBy (how = How.XPATH, using = "//button[contains(@id, 'continue-shopping')]")
	protected WebElement btnContinueShopping;
	
	@FindBy (how = How.XPATH, using = "//button[contains(@id, 'remove-sauce-labs-bike-light')]")
	protected WebElement btnRemoveBikeLight;
	
	@FindBy (how = How.XPATH, using = "//button[contains(@id, 'remove-sauce-labs-onesie')]")
	protected WebElement btnRemoveLabsOnesie;
	
	@FindBy (how = How.XPATH, using = "//button[contains(@id, 'remove-sauce-labs-backpack')]")
	protected WebElement btnRemoveBackpack;
	
	@FindBy (how = How.XPATH, using = "//button[contains(@id, 'remove-sauce-labs-fleece-jacket')]")
	protected WebElement btnRemoveFleeceJacket;
	
	@FindBy (how = How.XPATH, using = "//button[contains(@id, 'checkout')]")
	protected WebElement btnCheckout;
	
	@FindBy (how = How.XPATH, using = "//input[contains(@id, 'first-name')]")
	protected WebElement sendFirstName;
	
	@FindBy (how = How.XPATH, using = "//input[contains(@id, 'last-name')]")
	protected WebElement sendLastName;
	
	@FindBy (how = How.XPATH, using = "//input[contains(@id, 'postal-code')]")
	protected WebElement sendPostalCode;
	
	@FindBy (how = How.XPATH, using = "//button[contains(@id, 'remove-sauce-labs-bike-light')]")
	protected WebElement removeBikeLight;
	
	@FindBy (how = How.XPATH, using = "//input[contains(@id, 'continue')]")
	protected WebElement btnContinue;
	
	@FindBy (how = How.XPATH, using = "//a[contains(@id, 'item_4_img_link')]")
	protected WebElement backpackItem;
	
	@FindBy (how = How.XPATH, using = "//a[contains(@id, 'inventory_sidebar_link')]")
	protected WebElement linkAllItems;
	
	@FindBy (how = How.XPATH, using = "//a[contains(@id, 'about_sidebar_link')]")
	protected WebElement linkAbout;
	
	@FindBy (how = How.XPATH, using = "//a[contains(@id, 'reset_sidebar_link')]")
	protected WebElement linkReset;
	
	@FindBy (how = How.XPATH, using = "//span[contains(@class, 'title')]")
	protected WebElement titleProdutos;
	
	@FindBy (how = How.XPATH, using = "//meta[contains(@content, 'https://saucelabs.com/')]")
	protected WebElement urlSaucelabs;
	
	@FindBy (how = How.XPATH, using = "//button[contains(@id, 'add-to-cart-sauce-labs-backpack')]")
	protected WebElement btnAddBackpack;
	
	@FindBy (how = How.XPATH, using = "//button[contains(@id, 'add-to-cart-sauce-labs-bike-light')]")
	protected WebElement btnAddBikeLight;
	
	@FindBy (how = How.XPATH, using = "//a[contains(@class, 'shopping_cart_link')]")
	protected WebElement btnCarrinho;
	
	@FindBy (how = How.XPATH, using = "//button[contains(@id, 'react-burger-cross-btn')]")
	protected WebElement btnFecharMenu;
	
	//xPathLouco
	@FindBy (how = How.XPATH, using = "//a[contains(@id, 'item_4_title_link')]/div[contains(@class, 'inventory_item_name')]")
	protected WebElement backpackInCart;
	
	@FindBy (how = How.XPATH, using = "//a[contains(@id, 'item_5_title_link')]/div[contains(@class, 'inventory_item_name')]")
	protected WebElement FleeceJacketInCart;
	
	@FindBy (how = How.XPATH, using = "//div[contains(@class, 'summary_total_label')]")
	protected WebElement valorTotal;
	
	@FindBy (how = How.XPATH, using = "//button[contains(@id, 'finish')]")
	protected WebElement btnFinish;
	
	@FindBy (how = How.XPATH, using = "//span[contains(@class, 'title')]")
	protected WebElement titleCheckoutComplete;
	
	@FindBy (how = How.XPATH, using = "//button[contains(@id, 'back-to-products')]")
	protected WebElement btnBackHome;
	
	@FindBy (how = How.XPATH, using = "//button[contains(@id, 'add-to-cart-sauce-labs-fleece-jacket')]")
	protected WebElement btnAddFleeceJacket;
	
	@FindBy (how = How.XPATH, using = "//input[contains(@id, 'user-name')]")
	protected WebElement username;
	
	@FindBy (how = How.XPATH, using = "//input[contains(@id, 'password')]")
	protected WebElement password;
	
	@FindBy (how = How.XPATH, using = "//input[contains(@id, 'login-button')]")
	protected WebElement btnLogin;
	
	@FindBy (how = How.XPATH, using = "//h3[contains(@data-test, 'error')]")
	protected WebElement elementoH3;
	
	@FindBy (how = How.XPATH, using = "(//button[contains(@class, 'error-button')])[1]")
	protected WebElement btnFecharMsg;
	
	@FindBy (how = How.XPATH, using = "//div[contains(@class, 'error-message-container')]")
	protected WebElement validaMsgErro;
	
	@FindBy (how = How.XPATH, using = "//button[contains(@id, 'react-burger-menu-btn')]")
	protected WebElement btnMenu;
	
	@FindBy (how = How.XPATH, using = "//a[contains(@id, 'logout_sidebar_link')]")
	protected WebElement clicaLogout;
	
	@FindBy (how = How.XPATH, using = "//button[contains(@id, 'add-to-cart-sauce-labs-onesie')]")
	protected WebElement btnAddOnesie;
	
	@FindBy (how = How.XPATH, using = "//select[contains(@class, 'product_sort_container')]")
	protected WebElement selectFiltros;
	
	@FindBy (how = How.XPATH, using = "(//div[contains(@class, 'inventory_item_name')])[1]")
	protected WebElement nameItens;
	
	@FindBy (how = How.XPATH, using = "(//div[contains(@class, 'inventory_item_price')])[1]")
	protected WebElement priceItens;
	
	@FindBy (how = How.XPATH, using = "//h3[contains(@data-test, 'error')]")
	protected WebElement msgErroH3Checkout;
	
	@FindBy (how = How.XPATH, using = "//span[contains(@class, 'title')]")
	protected WebElement spanProducts;
	
	@FindBy (how = How.XPATH, using = "//div[contains(@class, 'inventory_container')]")
	protected WebElement containerInventarioProdutos;
	
	@FindBy (how = How.XPATH, using = "//a[contains(@href, 'https://twitter.com/saucelabs')]")
	protected WebElement cardTwitter;
	
	@FindBy (how = How.XPATH, using = "//a[contains(@href, 'https://www.facebook.com/saucelabs')]")
	protected WebElement cardFacebook;
	
	@FindBy (how = How.XPATH, using = "//a[contains(@href, 'https://www.linkedin.com/company/sauce-labs/')]")
	protected WebElement cardLinkedin;
	
	@FindBy (how = How.XPATH, using = "//meta[contains(@content, 'https://twitter.com/saucelabs')]")
	protected WebElement metaTwitter;
	
	@FindBy (how = How.XPATH, using = "//html[contains(@id, 'facebook')]")
	protected WebElement htmlFacebook;
	
	@FindBy (how = How.XPATH, using = "//meta[contains(@content, 'https://www.facebook.com/saucelabs/')]")
	protected WebElement metaFacebook;
	
	@FindBy (how = How.XPATH, using = "//meta[contains(@content, 'https://www.linkedin.com/signup')]")
	protected WebElement metaLinkedin;
}
