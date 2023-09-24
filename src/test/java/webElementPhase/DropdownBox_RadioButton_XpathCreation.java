package webElementPhase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.org.apache.bcel.internal.generic.Select;
import org.openqa.selenium.support.ui.Select;



import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownBox_RadioButton_XpathCreation {

	public static void main(String[] args) throws InterruptedException {
		//webdriver setup for chrome browser
				WebDriverManager.chromedriver().setup();
				
				//webdriver oject set for chrome browser
				 WebDriver driver = new ChromeDriver();
				
			/*	//url visit
				 driver.get("https://www.nexchar.com/signup");
				 
				 //dropdown testing
				 //select class object & store the dropdown button data into it
				//Select dropdownbox = new Select(driver.findElement(By.id("CategoryId")));
				 
				 Select dropdownbox =new Select(driver.findElement(By.id("CategoryId")));
				 
				 //way1
				 	Thread.sleep(1000);
				 	dropdownbox.selectByVisibleText("Fashion and clothing retail");
				 	
				 //way2
				 	Thread.sleep(1000);
				 	dropdownbox.selectByValue("4");
				 	
				 //way3
				 	Thread.sleep(1000);
				 	dropdownbox.selectByIndex(7);
				 	*/
				 	
				 	//radio button
				 		driver.get("https://demo.guru99.com/test/radio.html");
				 		driver.findElement(By.id("vfb-7-1")).click();				 	
				 	
				 		
				 		//Xpath creation
				 		//Xpath=//tagname[@attribute='value']
				 		//input[@id='username']
				 		//input[@type='checkbox']
				 		
				 		//find elements by id
			
				 		
				 		List<WebElement>checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
				 		
				 		//for each loop for selecting all the check box
				 		for (WebElement cb : checkboxes) {
							
				 			cb.click();
						}
				 		
				 	
				 		
				 		

			       
	}

}
