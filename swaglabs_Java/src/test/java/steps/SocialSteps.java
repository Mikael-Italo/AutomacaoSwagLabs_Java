package steps;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.SocialPage;
import static steps.Hooks.*;

public class SocialSteps{
	SocialPage sp = new SocialPage(driver);

	@Quando("^o usuario clicar no card Twitter$")
	public void o_usuario_clicar_no_card_Twitter() throws Throwable {
	    Thread.sleep(2000);
	    sp.clicarCardTwitter();
	}

	@Entao("^deve-se acessar a pagina do Twitter da Sauce Labs$")
	public void deve_se_acessar_a_pagina_do_Twitter_da_Sauce_Labs() throws Throwable {
		Thread.sleep(2000);
	    sp.validaTwitter();
	}

	@Quando("^o usuario clicar no card Facebook$")
	public void o_usuario_clicar_no_card_Facebook() throws Throwable {
		Thread.sleep(2000);
	    sp.clicarCardFacebook();
	}

	@Entao("^deve-se acessar a pagina do Facebook da Sauce Labs$")
	public void deve_se_acessar_a_pagina_do_Facebook_da_Sauce_Labs() throws Throwable {
		Thread.sleep(2000);
	    sp.validaFacebook();
	}

	@Quando("^o usuario clicar no card do Linkedin$")
	public void o_usuario_clicar_no_card_do_Linkedin() throws Throwable {
		Thread.sleep(2000);
	    sp.clicarCardLinkedin();
	}

	@Entao("^deve-se acessar o perfil do Linkedin da Sauce Labs$")
	public void deve_se_acessar_o_perfil_do_Linkedin_da_Sauce_Labs() throws Throwable {
		Thread.sleep(2000);
	    sp.validaLinkedin();
	}
}
