package magnitia;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test2_orangehrm {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Automaion softwares\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		
		
		/*driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input [@name='txtUsername']")).sendKeys("Admin");;
		driver.findElement(By.xpath("//input [@name='txtPassword']")).sendKeys("admin123");;
		driver.findElement(By.xpath("//input [@name='Submit']")).click();
		Thread.sleep(5000);
	


	    WebElement E=(WebElement) driver.findElements(By.xpath("//*[text()='Admin']"));
	    Actions a=new Actions(driver);
	    a.moveToElement(E).perform();
	   // driver.find*/
		
	    
	    
	      
	
       
	
		
	}

}
