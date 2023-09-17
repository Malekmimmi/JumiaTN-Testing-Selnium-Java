package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class HomePage {
	
	@FindBy (xpath="//*[@id=\"pop\"]/div/section/button")
	WebElement popUp;
	
	@FindBy (xpath="//*[@id=\"jm\"]/header/section/div[2]/div[1]/label")
	WebElement seconnecter1;
	
	@FindBy (xpath="//*[@id=\"dpdw-login-box\"]/div/div/a")
	WebElement seconnecter2;
	
	@FindBy (xpath="//*[@id=\"jm\"]/main/div/div/div/div/a/span")
	List<WebElement> Product_menus;
	
	/*@FindBy (xpath="//*[@id=\"jm\"]/main/div/div/div/div/div/div/div/div/a")
	List<WebElement> Product_submenus;*/
	
	public HomePage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void close_popUp() {
		popUp.click();
	}
	
	public void click_SeConnecter() {
		seconnecter1.click();
		seconnecter2.click();
	}
	
	

	
	public void click_On_Product_SubMenu(String PdtMenu) {
		
		try {
			for(WebElement menu:Product_menus) {
				if(menu.getText().contains(PdtMenu)) {
					//Config.actions = new Actions(Config.driver);
					
					//Config.actions.moveToElement(menu).perform();
					
					
					menu.click();
					
					/*for(WebElement submenu:Product_submenus) {
						if(submenu.getText().contains(PdtSubMenu)) {
							submenu.click();
							Config.attente(10);
							
						break;
						}
						
					}*/
					break;
					
					
				}
				
				
			}
				
			}catch (Exception e) {
			
		}
		
	}
	

}
