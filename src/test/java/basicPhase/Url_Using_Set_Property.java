package basicPhase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Url_Using_Set_Property {

	public static void main(String[] args) {
		//chrome driver setup for chrome browswer
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Course\\Selenium Code\\seleniumCode1\\drivers\\chromedriver.exe");
		//object
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.youtube.com/");


	}

}
