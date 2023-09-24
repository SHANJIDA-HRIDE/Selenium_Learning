package webElementPhase;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Text_Area_Test {

	public static void main(String[] args) {
		//webdriver setup for chrome browser
		WebDriverManager.chromedriver().setup();
		
		//webdriver oject set for chrome browser
		 WebDriver driver = new ChromeDriver();
		
		//url visit
		 driver.get("https://www.nexchar.com/contactus");
		 driver.findElement(By.cssSelector("#Message")).sendKeys("very good testig");
		 
		// driver.findElement(By.xpath("//button[contains(text(),'Send')]")).click();
	}

}
