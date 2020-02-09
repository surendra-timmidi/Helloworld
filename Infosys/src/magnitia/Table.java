package magnitia;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Table 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automaion softwares\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
	    driver.get("https://www.abhibus.com");
	    Thread.sleep(5000);
	    
	   
	   
	   /* driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD",Keys.ENTER);

	    driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("VIJAYAWADA",Keys.ENTER);
	    driver.findElement(By.xpath("//div[@id='roundTrip']/a")).click();
	    */
	    WebElement element= driver.findElement(By.xpath("//input[@id='source']"));
		element.sendKeys("Hyderabad");
		Thread.sleep(2000);
		element.sendKeys(Keys.ENTER);
		
	
	    element= driver.findElement(By.xpath("//input[@id='destination']"));
	    element.sendKeys("Guntur");    
	    Thread.sleep(2000);
	    element.sendKeys(Keys.ENTER);
	    
	    driver.findElement(By.xpath("//input[@name='journey_date']")).click();
	    driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar'])[1]/tbody/tr[5]/td[1]")).click();
	    Thread.sleep(5000);

	    driver.findElement(By.xpath("//input[@ name='journey_rdate']")).click();
	    driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar'])[2]/tbody/tr[4]/td[1]")).click();

	    driver.findElement(By.xpath("//div[@id='roundTrip']/a")).click();
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("(//span[@class='book ShowBtnHide1'])[2]")).click();
	    
	    driver.findElement(By.xpath("(//span[text()='Select Seat'])[21]")).click();
	    
	    Select s=new Select(driver.findElement(By.xpath("//select[@id='pickup_id1']")));
	    
	    s.selectByIndex(1);


	  
	}

}
