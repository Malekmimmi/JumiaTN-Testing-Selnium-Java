package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {

	public static WebDriver driver;
	public static Actions actions;
	
	public static void confEdge() {
		System.setProperty("webdriver.edge.driver", "c:/msedgedriver.exe");
	}
	
	public static void maximaseWindow() {
		driver.manage().window().maximize();
	}
	
	public static void attente(long s) {
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
	}
	
	
}
