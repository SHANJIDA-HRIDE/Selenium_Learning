package advanceTopic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		
		//webdriver oject set for chrome browser
		 WebDriver driver = new ChromeDriver();
		
		//url visit
		 driver.get("https://www.nexchar.com/contactus");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("FullName")).sendKeys("Shanjida Hride");
		 driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
		 
		 Select dropdownbox =new Select(driver.findElement(By.id("Query")));
		 	Thread.sleep(2000);
		 	dropdownbox.selectByVisibleText("Report a bug");
		 	driver.findElement(By.cssSelector("#Message")).sendKeys("very good testig");
		 	
		 	/* WebElement captchaImage = driver.findElement(By.id("dntCaptchaImg"));
		        String captchaImageUrl = captchaImage.getAttribute("src");
		        String captchaSolution = solveCaptcha(captchaImageUrl);

		        // Fill the CAPTCHA input field
		        WebElement captchaInput = driver.findElement(By.id("dntCaptchaImg-input"));
		        captchaInput.sendKeys(captchaSolution);*/
		 	
		 	driver.findElement(By.xpath("//button[contains(text(),'Send')]")).click();
		        
		 //robot class
		 	Robot rb = new Robot();
		 	//delay for  3 sec
		 	rb.delay(3000);
		 	//Tab press
		 	rb.keyPress(KeyEvent.VK_TAB);
		 	
		 	//enter button press
		 	rb.delay(2000);
		 	rb.keyPress(KeyEvent.VK_ENTER);

	}


}
