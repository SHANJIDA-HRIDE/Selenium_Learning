package basicPhase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url_Visit_using_Webdrivermanager {
	public static void main(String[] args){
		
		
		//webdriver setup for chrome browser
		WebDriverManager.chromedriver().setup();
		
		//webdriver oject set for chrome browser
		 WebDriver driver = new ChromeDriver();
		
		//url visit
		 driver.get("https://www.youtube.com/");
		 
		// Close the WebDriver
	        //driver.quit();
		
		
	}
	

}
