package webElementPhase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Input_box_button_check {

	public static void main(String[] args) throws InterruptedException {
									
		//webdriver setup for chrome browser
				WebDriverManager.chromedriver().setup();
				
				//webdriver oject set for chrome browser
				 WebDriver driver = new ChromeDriver();
				
				//url visit
				 driver.get("https://www.nexchar.com/");
				 
				 //LINK text
					
					driver.findElement(By.linkText("Sign In")).click();
				 
					// //parcial LINK text
					Thread.sleep(2000);
					driver.findElement(By.partialLinkText("I forgot")).click();
					Thread.sleep(2000);
					driver.navigate().back();
					
				 //input box
				 
				 //ID edit username input box using id locator
				WebElement username = driver.findElement(By.id("Email"));
				//Click 
				//Thread.sleep(3000);
				username.click();
				
				//value store
				//Thread.sleep(3000);
				username.sendKeys("gift_shop");
				
				//for existing data remove
				//Thread.sleep(3000);
				//username.clear();
				
				// Name: edit password input box using name locator
				driver.findElement(By.name("Password")).sendKeys("12345");
				
				driver.findElement(By.cssSelector("svg")).click();
				 
				//xpath
				driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
				
				//css seletor
				driver.findElement(By.cssSelector(".btn.btn-primary.w-100")).click();
				
				driver.navigate().back();
				//Classname
				driver.findElement(By.className("navbar-brand-image")).click();
		

	}

}
