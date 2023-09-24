package basicPhase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_Operation {

	public static void main(String[] args) throws InterruptedException {
		
		//webdriver setup for chrome browser
		WebDriverManager.chromedriver().setup();
				
		//webdriver object set for chrome browser
		WebDriver driver = new ChromeDriver();
		//url visit
		// driver.get("https://www.nexchar.com/");
		
		/*page title capture
		System.out.println("Page Source: "+driver.getTitle());
			
		//current url capture
		System.out.println("Current URL: "+driver.getCurrentUrl());
		
		//server end page source capture
		System.out.println("Page Source Code: "+driver.getPageSource());
		
		//deley for 5 sec
		Thread.sleep(5000);
		
		//maximize the window maximize
		driver.manage().window().maximize();
		
		//deley for 5 sec
		Thread.sleep(5000);
				
		// window full window
		driver.manage().window().fullscreen();
		
		//deley for 5 sec
		Thread.sleep(5000);
			
		//maximize the window minimize
		driver.manage().window().minimize();*/
		 
			//deley for2 sec
			/*Thread.sleep(2000);
		 
		 //navigate to another URL
		 driver.navigate().to("https://evaly.com.bd/");
		 
		 //back button automate
		 Thread.sleep(2000);
		 driver.navigate().back();
		
		//forword button automate
		 Thread.sleep(2000);
		 driver.navigate().forward();
		 
		//refresh button automate
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 
		 //open a nw tab
		 driver.switchTo().newWindow(WindowType.TAB).navigate().to("https://www.youtube.com/");
		 
		 //visit a url in a new tab
		// driver.navigate().to("https://www.youtube.com/");
		 
		 //close a single browser
		// Thread.sleep(2000);
		// driver.close();
		 
		 //close the browser
		 //Thread.sleep(2000);
		// driver.quit();
		 */
		
		driver.get("https://www.nexchar.com/");
		
		 
		 
	}
	
	

}
