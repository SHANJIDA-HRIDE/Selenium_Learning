package advanceTopic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Upload_Robot_Class {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		//https://www.filemail.com/share/upload-file
		
			WebDriverManager.chromedriver().setup();
			
			//webdriver object set for chrome browser
			 WebDriver driver = new ChromeDriver();
			
			//url visit
			 driver.get("https://www.filemail.com/share/upload-file");
			 driver.manage().window().maximize();
			 driver.findElement(By.id("addBtn")).click();
			 
			 Robot rb = new Robot();
			 
			 //1. copy the location into the clipboard
			 //put the file path into clipboard
			 StringSelection ss = new StringSelection("C:\\Users\\Dev Tech Guru\\Downloads\\wyss_institute.pdf");
			
			 // Ctel c to clipboard
			 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
			 rb.delay(2000);
			 
			 //2. ctrl+ V press
			 rb.keyPress(KeyEvent.VK_CONTROL);
			 
			 
			 //3. ok button press
			 rb.keyPress(KeyEvent.VK_V);
			 rb.delay(2000);
			 rb.keyPress(KeyEvent.VK_ENTER);
			 
			 driver.findElement(By.id("sendBtn")).click();
			 
			 
			 

	}

}
