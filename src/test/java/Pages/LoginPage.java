package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class LoginPage {
	
	
	
	@FindBy (xpath="//*[@id=\"input_identifierValue\"]")
	WebElement login;
	
	@FindBy (xpath="/html/body/div/div[4]/form/div/div[3]/div[2]/button")
	WebElement ContinuerBtn;
	
	@FindBy (xpath="//*[@id=\"passwordForm\"]/div/div[3]/label/input")
	WebElement password;
	
	@FindBy (xpath="//*[@id=\"loginButton\"]")
	WebElement ConnexionBtn;
	
		
	public LoginPage() {
		
		PageFactory.initElements(Config.driver, this);
	}
	
		
	public void saisir_login(String username) {
		login.sendKeys(username);
	}
	
	public void press_continuer() {
		ContinuerBtn.click();
	}
	
	public void saisir_password(String pswd) {
		password.sendKeys(pswd);
	}
	
	public void press_connecter() {
		ConnexionBtn.click();
	}
	

		
}
