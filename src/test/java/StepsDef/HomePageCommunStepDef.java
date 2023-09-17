package StepsDef;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;

import Helper.Config;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SmartphonePage;
import io.cucumber.java.en.*;

public class HomePageCommunStepDef{
	
	
	@Given("acceder au site")
	public void acceder_au_site() {
		Config.confEdge();
		Config.driver = new EdgeDriver();
		Config.maximaseWindow();
		Config.driver.get("https://www.jumia.com.tn/");
		HomePage home = new HomePage();
		home.close_popUp();
		Config.attente(3);
	}

	@Given("cliquer sur le Button SE CONNECTER")
	public void cliquer_sur_le_button_se_connecter() {
	    HomePage home = new HomePage();
	    home.click_SeConnecter();
	    Config.attente(5);
	    
	}

	@When("user entre son username {string}")
	public void user_entre_son_username(String username) {
	    LoginPage login = new LoginPage();
	    login.saisir_login(username);
	    
	}

	@When("user clique sur le Button Continuer")
	public void user_clique_sur_le_button_continuer() {
	   LoginPage login = new LoginPage();
	   login.press_continuer();
	}

	@When("user entre son password {string}")
	public void user_entre_son_password(String password) {
		LoginPage login =  new LoginPage();
		login.saisir_password(password);
	   
	}

	@When("user clique sur le Button Se Connecter")
	public void user_clique_sur_le_button_se_connecter() {
	   LoginPage login = new LoginPage();
	   login.press_connecter();
	   Config.attente(5);
	}

	@Then("user clique sur le submenu du produit")
	public void user_clique_sur_le_submenu_du_produit() {
	   HomePage home = new HomePage();
	   home.click_On_Product_SubMenu("Téléphone & Tablette");
	   Config.attente(10);
	   
	}

	@Then("user clique sur le produit")
	public void user_clique_sur_le_produit() {
	   SmartphonePage smart = new SmartphonePage();
	   /*String script = "window.scrollTo(0,400);";
	   ((JavascriptExecutor) Config.driver).executeScript(script);*/
	   smart.click_On_Product();
	   Config.attente(5);
	}

	@Then("user clique sur le panier pour verifier")
	public void user_clique_sur_le_panier_pour_verifier() throws InterruptedException {
		SmartphonePage smart = new SmartphonePage();
		smart.Click_On_Acheter();
		Config.attente(5);
		   
	}
	


}


