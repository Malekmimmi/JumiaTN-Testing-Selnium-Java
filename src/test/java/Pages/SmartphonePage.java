package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor ;

import Helper.Config;
import junit.framework.Assert;

public class SmartphonePage {
	
	@FindBy (xpath="//*[@id=\"ctlg\"]/div/div[1]/section/div/div/div[3]/article/a/div[1]")
	WebElement smartphones;
	
	@FindBy (xpath="//*[@id=\"add-to-cart\"]/button")
	WebElement jacheteBtn;
	
	@FindBy (xpath="//*[@id=\"add-to-cart\"]/p")
	WebElement Msg;
	
	@FindBy (xpath="//*[@id=\"jm\"]/header/section/div[2]/a")
	WebElement panier;
	
	public SmartphonePage() {
		
		PageFactory.initElements(Config.driver, this);
	}
	
	public void click_On_Product() {
		
				
				smartphones.click();
				Config.attente(5);
				
		
	}
	
	public void Click_On_Acheter() throws InterruptedException {
		
		jacheteBtn.click();
		String msgaffiche=Msg.getText();
		String expectedMsg = "(1 Produit(s) ajouté(s))";
		Assert.assertEquals(expectedMsg, msgaffiche);
		panier.click();
			
	}
	
	}
